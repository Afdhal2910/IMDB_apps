package com.example.amoi.imdb.test.presenter;

import com.example.amoi.imdb.test.service.ImdbService;
import com.example.amoi.imdb.test.service.event.OnMovieEvent;
import com.example.amoi.imdb.test.view.callback.MovieView;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import io.realm.Realm;

/**
 * Created by amoi on 27/11/2017.
 */

public class MoviePresenterImpl implements BasePresenter{

    private MovieView mMovieView;
    private EventBus mEventBus;
    private Realm mRealm;

    public MoviePresenterImpl(MovieView mMovie) {
        this.mMovieView = mMovie;
    }

    @Override
    public void onCreate() {
        // init event bus
        mEventBus = EventBus.getDefault();
        mEventBus.register(this);
        mRealm = Realm.getDefaultInstance();
    }

    @Override
    public void onDestroy() {
    if (mEventBus != null){
        mEventBus.unregister(this);
        mEventBus =null;
        }

    if (mRealm != null){
        mRealm.close();
        }

    }

    public void searchInViaMovie(final String movie_et, final String year_et) {
       ImdbService.getInstance().getMovie(movie_et,year_et);
    }

    @Subscribe
    public void onEvent(final OnMovieEvent event) {
        if (event.isSuccess()) {
            mMovieView.onGetMovieSuccessful(event.getMovie());

        }else {
            mMovieView.onGetMovieFailure();
        }
    }
}
