package com.example.chencheng.designdemo;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;

    private ViewPager viewPager;

    private TextView textView;

    private List<Fragment> fragments;
    private CardPagerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initViewPager();
    }

    private void initView() {
        tabLayout= ((TabLayout) findViewById(R.id.tab_view));
        viewPager= ((ViewPager) findViewById(R.id.vp_view));
        textView= ((TextView) findViewById(R.id.tv_view));

        tabLayout.addTab(tabLayout.newTab().setText("A"));
        tabLayout.addTab(tabLayout.newTab().setText("B"));
        tabLayout.addTab(tabLayout.newTab().setText("C"));

        tabLayout.setOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPager));
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        //Snackbar的用法
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"click",Snackbar.LENGTH_LONG).setAction("ACTION", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       // Toast.makeText(MainActivity.this,"click",Toast.LENGTH_LONG).show();
                       Intent intent= new Intent(MainActivity.this,BActivity.class);
                        startActivity(intent);
                    }
                }).setActionTextColor(Color.RED).show();
            }
        });
    }

    private void initViewPager() {

        fragments=new ArrayList<>();
        for (int i=0;i<tabLayout.getTabCount();i++){
            CardFragment cardFragment=new CardFragment();
            fragments.add(cardFragment);
        }
        adapter=new CardPagerAdapter(getSupportFragmentManager(),fragments);
        viewPager.setAdapter(adapter);

    }
}
