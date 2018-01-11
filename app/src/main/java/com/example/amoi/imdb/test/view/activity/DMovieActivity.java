package com.example.amoi.imdb.test.view.activity;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.widget.TextView;
import com.example.amoi.imdb.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DMovieActivity extends Activity {

    private TextView mTitleTv;
    private TextView mYearTv;
    private TextView mDirectorTv;
    private TextView mLengthTv;
    private TextView mRatingTv;
    private TextView mDescriptionTv;
    private TextView mStoryLineTv;
    private Image mPoster;

    private String mTitle;
    private String mYear;
    private String mDirector;
    private String mLength;
    private String mRating;
    private String mDescription;
    private String mStoryLine;

    public DMovieActivity() {
        // Required empty public constructor
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dmovie);

        mTitle = getIntent().getStringExtra("params_title");
        Log.d("QQQ", "BBBB ---> " + mTitle);

        mYear = getIntent().getStringExtra("params_year");
        mDirector = getIntent().getStringExtra("params_director");
        mLength = getIntent().getStringExtra("params_length");
        mRating = getIntent().getStringExtra("params_rating");
        mDescription = getIntent().getStringExtra("params_description");
        mStoryLine = getIntent().getStringExtra("params_storyline");


        mTitleTv = (TextView) findViewById(R.id.title_tv);
        mYearTv = (TextView) findViewById(R.id.year_tv);
        mDirectorTv = (TextView) findViewById(R.id.director_tv);
        mRatingTv = (TextView) findViewById(R.id.rating_tv);
        mDescriptionTv = (TextView) findViewById(R.id.description_tv);
        mLengthTv = (TextView) findViewById(R.id.length_tv);
        mStoryLineTv = (TextView) findViewById(R.id.stroyline_tv);

        populateView();
    }

    private void populateView() {
        mTitleTv.setText(mTitle);
        Log.d("QQQ", "ccc ---> " + mTitle);

        mYearTv.setText(mYear);
        mDirectorTv.setText(mDirector);
        mLengthTv.setText(mLength + " minutes");
        mRatingTv.setText(mRating);
        mDescriptionTv.setText(mDescription);
        mStoryLineTv.setText(mStoryLine);

    }
}
