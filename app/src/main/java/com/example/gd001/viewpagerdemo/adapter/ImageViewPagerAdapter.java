package com.example.gd001.viewpagerdemo.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by 王笔锋 on 2017/7/25.
 * Description:该类是用来盛放不同ImageView图片的adapter
 */

public class ImageViewPagerAdapter extends PagerAdapter {
    private List<ImageView> viewList;

    public ImageViewPagerAdapter(List<ImageView> viewList) {
        this.viewList = viewList;
    }

    @Override
    public int getCount() {
        return viewList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(viewList.get(position));
        return viewList.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
//        super.destroyItem(container, position, object);//这一段放开就会出现页面崩溃的情况
        container.removeView(viewList.get(position));
    }
}
