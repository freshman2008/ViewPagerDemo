package com.example.gd001.viewpagerdemo.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.gd001.viewpagerdemo.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        Intent intent ;
        switch (view.getId()) {
            case R.id.viewViewPagerButton:
                intent = new Intent(MainActivity.this, SimpleViewActivity.class);
                startActivity(intent);
                break;
            case R.id.fragmentViewPagerButton:
//                intent = new Intent(MainActivity.this, FragmentViewPagerActivity.class);
//                startActivity(intent);
                break;
            case R.id.imageViewDotViewPager:
//                intent = new Intent(MainActivity.this, ImageViewDotViewPagerActivity.class);
//                startActivity(intent);
                break;

            default:
                break;
        }
    }
}
