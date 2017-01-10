package com.example.chencheng.designdemo;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by chencheng on 16/12/27.
 */
public class AActivity extends AppCompatActivity{

    private EditText etName;
    private EditText etPassWord;
    private FloatingActionButton button;
    private CoordinatorLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        /**TextInputLayout的使用 */
        etName= ((EditText) findViewById(R.id.et_name));
        etName= ((EditText) findViewById(R.id.et_name));

        /**FloatingActionButton的使用*/
        button= ((FloatingActionButton) findViewById(R.id.btn_float));
        layout= ((CoordinatorLayout) findViewById(R.id.cdLayout));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(layout,"FloatingActionButton",Snackbar.LENGTH_LONG).show();
            }
        });
    }
}
