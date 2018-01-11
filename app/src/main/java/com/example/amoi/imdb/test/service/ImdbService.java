package com.example.amoi.imdb.test.service;

import android.util.Log;

import com.example.amoi.imdb.BuildConfig;
import com.example.amoi.imdb.test.model.RealmString;
import com.example.amoi.imdb.test.model.Status;
import com.example.amoi.imdb.test.service.event.OnMovieEvent;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import org.greenrobot.eventbus.EventBus;

import java.io.IOException;

import io.realm.RealmList;
import io.realm.RealmObject;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
/**
 * Created by amoi on 22/11/2017.
 */


public class ImdbService {
    private static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";

    private static ImdbService sInstance = null;
    private static OkHttpClient.Builder mHttpClient = new OkHttpClient.Builder();
    private static ImdbServiceInterface mService = null;

    private static Retrofit mRetrofit = null;
    private EventBus mEventBus = EventBus.getDefault();

    public ImdbService() {
        // Enforce Singleton
    }

    public static synchronized ImdbService getInstance() {
        if (sInstance == null) {
            synchronized ((ImdbService.class)) {
                if (sInstance == null) {
                    sInstance = new ImdbService();
                }
            }
        }

       mService = createService(ImdbServiceInterface.class, null);
        return sInstance;
    }


    private static Gson mGson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .setDateFormat(DATE_FORMAT)
            .setExclusionStrategies(new ExclusionStrategy() {
                @Override
                public boolean shouldSkipField(FieldAttributes f) {
                    return f.getDeclaringClass().equals(RealmObject.class);
                }

                @Override
                public boolean shouldSkipClass(Class<?> clazz) {
                    return false;
                }
            })
            .registerTypeAdapter(new TypeToken<RealmList<RealmString>>() {
            }.getType(), new RealmStringDeserializer())
            .create();

    private static Retrofit.Builder mBuilder = new Retrofit.Builder()
            .baseUrl(BuildConfig.HOST)
            .addConverterFactory(GsonConverterFactory.create(mGson));



    public static <S> S createService(Class<S> serviceClass, final String authToken) {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(BuildConfig.DEBUG ? HttpLoggingInterceptor.Level.BODY : HttpLoggingInterceptor.Level.NONE);

        Interceptor interceptor = new Interceptor() {
            @Override
            public okhttp3.Response intercept(Chain chain) throws IOException {
                Request newRequest;
                if (authToken != null) {
                    newRequest = chain.request().newBuilder()
                            .header("Authorization", authToken)
                            .header("Accept", "application/json")
                            .header("Content-Type", "application/json")
                            .build();
                } else {
                    newRequest = chain.request().newBuilder()
                            .header("Accept", "application/json")
                            .header("Content-Type", "application/json")
                            .build();
                }

                return chain.proceed(newRequest);
            }
        };

        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.interceptors().add(interceptor);
        builder.interceptors().add(logging);
        OkHttpClient client = builder.build();

        mRetrofit = new Retrofit.Builder()
                .baseUrl(BuildConfig.HOST)
                .addConverterFactory(GsonConverterFactory.create(mGson))
                .client(client)
                .build();


        return mRetrofit.create(serviceClass);
    }

    public Retrofit getRetrofit() {
        return mRetrofit;
    }


//// sent and retrieve data Movie
    public void getMovie (final String title, final String year) {

        Call<RealmList<Status>> call = mService.getMovie(title, year);
        call.enqueue(new Callback<RealmList<Status>>() {
            @Override
            public void onResponse(Call<RealmList<Status>> call, Response<RealmList<Status>> response) {
                if (response.isSuccessful()) {
                    // pass data to presenter thru event bus
                    OnMovieEvent event = new OnMovieEvent();
                    event.setResponse(response);
                    event.setMovie(response.body());
                    mEventBus.post(event);
                    Log.d("QQQ", "success");
                } else {
                    Log.d("QQQ", "failed");
                }
            }

            @Override
            public void onFailure(Call<RealmList<Status>> call, Throwable t) {

            }
        });
    }


////// sent and retrieve data Song

}
