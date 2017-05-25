package com.example.ace01;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import com.example.ace01.adapter.TabFragmentAdapter;
import com.example.ace01.fragment.DemoFragment;
import com.example.ace01.utils.TabSlideLayout;

import java.util.ArrayList;

/**
 * Created by ace on 2017/5/23 0023.
 */

public class TabImgSlideActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener{

    private TabSlideLayout mTabSlideLayout;
    private ViewPager mViewPager;
    private ArrayList<Fragment> mFragList = new ArrayList<>();
    private ArrayList<String> mTitleList = new ArrayList<>();
    private ArrayList<String> mTitleIconList = new ArrayList<>();
    private TabFragmentAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_tab_slide);

        mTabSlideLayout = (TabSlideLayout) this.findViewById(R.id.tsl);
        mViewPager = (ViewPager) this.findViewById(R.id.vp);

        Fragment mFragOne = DemoFragment.newInstance("1", null);
        Fragment mFragTwo = DemoFragment.newInstance("2", null);
        Fragment mFragThree = DemoFragment.newInstance("3", null);
        Fragment mFragFour = DemoFragment.newInstance("4", null);
        Fragment mFragFive = DemoFragment.newInstance("5", null);
        Fragment mFragSix = DemoFragment.newInstance("6", null);
        Fragment mFragSeven = DemoFragment.newInstance("7", null);
        Fragment mFragEight = DemoFragment.newInstance("0", null);

        mFragList.add(mFragOne);
        mFragList.add(mFragTwo);
        mFragList.add(mFragThree);
        mFragList.add(mFragFour);
        mFragList.add(mFragFive);
        mFragList.add(mFragSix);
        mFragList.add(mFragSeven);
        mFragList.add(mFragEight);

        for (int i = 0; i < mFragList.size(); i++) {
            mTitleList.add("");
        }

        mTitleIconList.add("http://img.newaircloud.com/xkycs/pic/201705/05/95229c76-9c4b-464c-b1e4-890c6a1f7fbe.png");
        mTitleIconList.add("");
        mTitleIconList.add("http://img.newaircloud.com/xkycs/pic/201607/12/4b8fd43e-46f2-4a0f-81fd-6d70f4db56d9.png");
        mTitleIconList.add("");
        mTitleIconList.add("");
        mTitleIconList.add("http://img.newaircloud.com/xkycs/pic/201608/30/efbb8089-0e0a-42ec-8e43-3cb3364d70e3.png");
        mTitleIconList.add("");
        mTitleIconList.add("http://img.newaircloud.com/xkycs/pic/201607/12/27e59964-fc4f-4687-bb44-71a6f1d701dc.png");

        mAdapter = new TabFragmentAdapter(getSupportFragmentManager(), mFragList, mTitleList);
        mViewPager.setAdapter(mAdapter);
        mTabSlideLayout.setViewPager(mViewPager, 1, mTitleIconList);
        mViewPager.addOnPageChangeListener(this);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
