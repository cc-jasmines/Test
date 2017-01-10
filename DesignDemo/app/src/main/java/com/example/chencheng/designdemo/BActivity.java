package com.example.chencheng.designdemo;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by chencheng on 16/12/27.
 */
public class BActivity extends AppCompatActivity{

    private NavigationView navigationView;

    private Toolbar toolbar;
    private CollapsingToolbarLayout toolbarLayout;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        Window window = getWindow();
        // Translucent status bar
        window.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,
                WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        toolbar= ((Toolbar) findViewById(R.id.toolbar));
        toolbarLayout= ((CollapsingToolbarLayout) findViewById(R.id.ct_layout));
        imageView= ((ImageView) findViewById(R.id.iv));

        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        toolbarLayout.setTitle("测试一下行不行");
        /**NavigationView的使用*/
        navigationView= ((NavigationView) findViewById(R.id.ng_view));
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.navigation_item_home:
                        Toast.makeText(BActivity.this,"home",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.navigation_item_blog:
                        Toast.makeText(BActivity.this,"blog",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.navigation_item_about:
                        Toast.makeText(BActivity.this,"about",Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
                item.setChecked(true);
                return false;
            }
        });

    }
}
