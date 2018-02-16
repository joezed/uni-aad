package com.ntu.groupf.sdsastrokeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        TextView txt_passValue = (TextView) findViewById(R.id.txt_passValue);
        TextView txt_failValue = (TextView) findViewById(R.id.txt_failValue);
        TextView txt_resultValue = (TextView) findViewById(R.id.txt_resultValue);

        Intent i = getIntent();
        TestData currentTest = (TestData) i.getSerializableExtra("currentTest");

        currentTest.setPassScore((currentTest.getDcTimeTaken() * 0.012) + (currentTest.getDcErrors() *
                0.216) + (currentTest.getSmcScore() * 0.409) + (currentTest.getRsrScore() * 1.168) - 13.79);

        currentTest.setFailScore((currentTest.getDcTimeTaken() * 0.017) + (currentTest.getDcErrors() *
                0.035) + (currentTest.getSmcScore() * 0.185) + (currentTest.getRsrScore() * 0.813) - 10.042);

        if (currentTest.getPassScore() > currentTest.getFailScore()) {
            currentTest.hasPassed = true;
        } else {
            currentTest.hasPassed = false;
        }

        txt_passValue.setText(Double.toString(currentTest.getPassScore()));
        txt_failValue.setText(Double.toString(currentTest.getFailScore()));
        if (currentTest.hasPassed()) {
            txt_resultValue.setText("Pass");
        } else {
            txt_resultValue.setText("Fail");
        }

    }
}
