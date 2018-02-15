package com.ntu.groupf.sdsastrokeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AppIntroActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn_begin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_app);
        btn_begin = (Button) findViewById(R.id.btn_begin);
        btn_begin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == btn_begin) {
            finish();
            startActivity(new Intent(AppIntroActivity.this, TrailMakingTestActivity.class));
        }
    }
}
