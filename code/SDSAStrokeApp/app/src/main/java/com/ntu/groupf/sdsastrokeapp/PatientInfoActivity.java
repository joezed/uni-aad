package com.ntu.groupf.sdsastrokeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class PatientInfoActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn_pisubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_info);

        Spinner nationalitySelect = (Spinner) findViewById(R.id.spn_nationality);
        ArrayAdapter<CharSequence> adapter =  ArrayAdapter.createFromResource(this,
                R.array.nationality_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        nationalitySelect.setAdapter(adapter);

        btn_pisubmit = (Button) findViewById(R.id.btn_pisubmit);
        btn_pisubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == btn_pisubmit) {
            finish();
            startActivity(new Intent(PatientInfoActivity.this, AppIntroActivity.class));
        }
    }
}
