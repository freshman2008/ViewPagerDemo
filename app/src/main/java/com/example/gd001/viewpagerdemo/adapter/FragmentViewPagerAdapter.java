package com.example.gd001.viewpagerdemo.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by 王笔锋 on 2017/7/27.
 * Description: 添加Fragment的 Adapter
 */

public class FragmentViewPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> list;

    /**
     * 默认的构造函数
     * @param fm 该参数时默认有的
     * @param list 该参数是自己添加的
     */
    public FragmentViewPagerAdapter(FragmentManager fm, List<Fragment> list) {
        super(fm);
        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
