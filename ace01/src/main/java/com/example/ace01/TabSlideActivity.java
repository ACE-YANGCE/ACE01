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

public class TabSlideActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener{

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

        for (int i = 0; i < mFragList.size()-2; i++) {
            mTitleList.add("测试" + (i + 1));
            mTitleIconList.add("");
        }

        mTitleList.add("测试长一点的标题");
        mTitleIconList.add("");
        mTitleList.add("测试8");
        mTitleIconList.add("");

        mAdapter = new TabFragmentAdapter(getSupportFragmentManager(), mFragList, mTitleList);
        mViewPager.setAdapter(mAdapter);
        mTabSlideLayout.setViewPager(mViewPager, 0, mTitleIconList);
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
