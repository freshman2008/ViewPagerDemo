package com.example.gd001.viewpagerdemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;

import com.example.gd001.viewpagerdemo.R;
import com.example.gd001.viewpagerdemo.adapter.SimpleViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gd001 on 17-8-2.
 */

public class SimpleViewActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simpleview_viewpager);
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewPager);
        LayoutInflater layoutInflater = LayoutInflater.from(SimpleViewActivity.this);
        View tab1 = layoutInflater.inflate(R.layout.tab1, null);
        View tab2 = layoutInflater.inflate(R.layout.tab2, null);
        View tab3 = layoutInflater.inflate(R.layout.tab3, null);
        View tab4 = layoutInflater.inflate(R.layout.tab4, null);
        PagerTabStrip pagerTabStrip = (PagerTabStrip)findViewById(R.id.pagerTabStrip);
        //取消tab下面的长横线
        pagerTabStrip.setDrawFullUnderline(false);
        //设置tab的背景色
        pagerTabStrip.setBackgroundResource(R.color.red);
        //设置当前tab页签的下划线颜色
        pagerTabStrip.setTabIndicatorColorResource(R.color.darkBlue);
//        pagerTabStrip.setTextSpacing(400);
        List<View> viewList = new ArrayList<>();
        viewList.add(tab1);
        viewList.add(tab2);
        viewList.add(tab3);
        viewList.add(tab4);
        List<String> titileList = new ArrayList<>();
        titileList.add("Music");
        titileList.add("Movie");
        titileList.add("News");
        titileList.add("Video");
        SimpleViewPagerAdapter startPagePagerAdapter = new SimpleViewPagerAdapter(viewList, titileList);
        viewPager.setAdapter(startPagePagerAdapter);
    }
}
