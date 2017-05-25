package com.example.ace01.fragment;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.ace01.R;

/**
 * Created by ace on 2017/5/23 0023.
 */

public class DemoFragment extends LazyLoadFragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String TAG = "";
    private String mParam1;
    private String mParam2;

    ImageView mImageView;

    public static DemoFragment newInstance(String param1, String param2) {
        DemoFragment fragment = new DemoFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    protected int setContentView() {
        return R.layout.fragment_demo;
    }

    @Override
    protected void lazyLoad() {
        loadData();
    }

    public void loadData() {
        mImageView = (ImageView) findViewById(R.id.fragment_iv);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        if (mParam1.equals("0")) {
            TAG = "0";
            mImageView.setImageResource(R.mipmap.icon_demo1);
        } else if (mParam1.equals("1")) {
            TAG = "1";
            mImageView.setImageResource(R.mipmap.icon_demo2);
        } else if (mParam1.equals("2")) {
            TAG = "2";
            mImageView.setImageResource(R.mipmap.icon_demo3);
        } else if (mParam1.equals("3")) {
            TAG = "3";
            mImageView.setImageResource(R.mipmap.icon_demo4);
        } else if (mParam1.equals("4")) {
            TAG = "4";
            mImageView.setImageResource(R.mipmap.icon_demo5);
        } else if (mParam1.equals("5")) {
            TAG = "5";
            mImageView.setImageResource(R.mipmap.icon_demo6);
        } else if (mParam1.equals("6")) {
            TAG = "6";
            mImageView.setImageResource(R.mipmap.icon_demo7);
        } else if (mParam1.equals("7")) {
            TAG = "7";
            mImageView.setImageResource(R.mipmap.icon_demo8);
        } else {
            TAG = "else";
            mImageView.setImageResource(R.mipmap.ic_launcher);
        }
    }
}
