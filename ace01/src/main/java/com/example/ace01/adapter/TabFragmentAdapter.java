package com.example.ace01.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by ace on 2017/5/23 0023.
 */

public class TabFragmentAdapter extends FragmentStatePagerAdapter {

    private FragmentManager fragmentManager;
    private ArrayList<Fragment> fragmentList = new ArrayList<>();
    private ArrayList<String> titles = new ArrayList<>();

    public TabFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    public TabFragmentAdapter(FragmentManager fm, ArrayList<Fragment> frglist, ArrayList<String> titlelist) {
        super(fm);
        this.fragmentManager = fm;
        this.fragmentList = frglist;
        this.titles = titlelist;
    }

    @Override
    public Fragment getItem(int position) {
        if (fragmentList != null && position < fragmentList.size()) {
            return fragmentList.get(position);
        }
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList == null ? 0 : fragmentList.size();
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
//        container.removeView((View) object);
    }

}
