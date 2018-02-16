package com.ntu.groupf.sdsastrokeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SquareMatricesCompassIntroActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn_begin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square_matrices_compass_intro);
        btn_begin = (Button) findViewById(R.id.btn_begin);
        btn_begin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == btn_begin) {
            Intent i = getIntent();
            TestData currentTest = (TestData) i.getSerializableExtra("currentTest");
            i = new Intent(SquareMatricesCompassIntroActivity.this, SquareMatricesCompassActivity.class);
            i.putExtra("currentTest", currentTest);
            finish();
            startActivity(i);
        }
    }
}
