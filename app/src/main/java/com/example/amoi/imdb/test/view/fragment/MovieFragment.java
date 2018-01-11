package com.example.amoi.imdb.test.view.fragment;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.amoi.imdb.R;
import com.example.amoi.imdb.test.model.Status;
import com.example.amoi.imdb.test.presenter.MoviePresenterImpl;
import com.example.amoi.imdb.test.view.activity.DMovieActivity;
import com.example.amoi.imdb.test.view.callback.MovieView;

import io.realm.RealmList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MovieFragment extends Fragment implements MovieView {

    private MoviePresenterImpl mPresenter;
    private EditText mMovieEt;
    private EditText mYearEt;
    private Button mSearchBtn;
    private TextView mTitleTv;

    public MovieFragment() {
        // Required empty public constructor
    }

    @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_movie, container, false);
            // make changes to view and its children here

        mPresenter = new MoviePresenterImpl(this);
        mPresenter.onCreate();

        mMovieEt = (EditText) view.findViewById(R.id.movie_et);
        mYearEt = (EditText) view.findViewById(R.id.year_et);
        mSearchBtn = (Button) view.findViewById(R.id.search_btn);

        mSearchBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //search button
                mPresenter.searchInViaMovie (mMovieEt.getText().toString(),
                                             mYearEt.getText().toString());

            }
        });

        return view;
    }

    @Override
    public void onGetMovieSuccessful(RealmList<Status> movie) {
        Status status = movie.get(0);

        Intent intent = new Intent(getActivity(), DMovieActivity.class);
        Log.d("QQQ", "AAAA ---> " + status.getTitle());
        Log.d("QQQ", "AAAA ---> " + status.getYear());
        Log.d("QQQ", "AAAA ---> " + status.getGenre());

        intent.putExtra("params_title", status.getTitle());
        intent.putExtra("params_year", status.getYear());
        intent.putExtra("params_director", status.getDirector());
        intent.putExtra("params_length", status.getLength());
        intent.putExtra("params_rating", status.getRating());
        intent.putExtra("params_description", status.getDescription());
        intent.putExtra("params_storyline",status.getStoryline());

        startActivity(intent);
    }

    @Override
    public void onGetMovieFailure() {
        // don't care
    }
}
