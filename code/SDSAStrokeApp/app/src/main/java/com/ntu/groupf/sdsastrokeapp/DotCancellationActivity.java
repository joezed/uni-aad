package com.ntu.groupf.sdsastrokeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Date;
import java.util.Timer;

public class DotCancellationActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_dcsubmit;
    private ImageView clustera1;
    private ImageView clustera2;
    private ImageView clustera3;
    private ImageView clustera4;
    private ImageView clustera5;
    private ImageView clustera6;
    private ImageView clustera7;
    private ImageView clustera8;
    private ImageView clustera9;
    private ImageView clustera10;
    private ImageView clustera11;
    private ImageView clustera12;
    private ImageView clustera13;
    private ImageView clustera14;
    private ImageView clusterb1;
    private ImageView clusterb2;
    private ImageView clusterb3;
    private ImageView clusterb4;
    private ImageView clusterb5;
    private ImageView clusterb6;
    private ImageView clusterb7;
    private ImageView clusterb8;
    private ImageView clusterb9;
    private ImageView clusterb10;
    private ImageView clusterb11;
    private ImageView clusterb12;
    private ImageView clusterb13;
    private ImageView clusterb14;
    private ImageView clusterc1;
    private ImageView clusterc2;
    private ImageView clusterc3;
    private ImageView clusterc4;
    private ImageView clusterc5;
    private ImageView clusterc6;
    private ImageView clusterc7;
    private ImageView clusterc8;
    private ImageView clusterc9;
    private ImageView clusterc10;
    private ImageView clusterc11;
    private ImageView clusterc12;
    private ImageView clusterc13;
    private ImageView clusterc14;
    private ImageView clusterd1;
    private ImageView clusterd2;
    private ImageView clusterd3;
    private ImageView clusterd4;
    private ImageView clusterd5;
    private ImageView clusterd6;
    private ImageView clusterd7;
    private ImageView clusterd8;
    private ImageView clusterd9;
    private ImageView clusterd10;
    private ImageView clusterd11;
    private ImageView clusterd12;
    private ImageView clusterd13;
    private ImageView clusterd14;
    private ImageView clustere1;
    private ImageView clustere2;
    private ImageView clustere3;
    private ImageView clustere4;
    private ImageView clustere5;
    private ImageView clustere6;
    private ImageView clustere7;
    private ImageView clustere8;
    private ImageView clustere9;
    private ImageView clustere10;
    private ImageView clustere11;
    private ImageView clustere12;
    private ImageView clustere13;
    private ImageView clustere14;
    private ImageView clusterf1;
    private ImageView clusterf2;
    private ImageView clusterf3;
    private ImageView clusterf4;
    private ImageView clusterf5;
    private ImageView clusterf6;
    private ImageView clusterf7;
    private ImageView clusterf8;
    private ImageView clusterf9;
    private ImageView clusterf10;
    private ImageView clusterf11;
    private ImageView clusterf12;
    private ImageView clusterf13;
    private ImageView clusterf14;
    private ImageView clusterg1;
    private ImageView clusterg2;
    private ImageView clusterg3;
    private ImageView clusterg4;
    private ImageView clusterg5;
    private ImageView clusterg6;
    private ImageView clusterg7;
    private ImageView clusterg8;
    private ImageView clusterg9;
    private ImageView clusterg10;
    private ImageView clusterg11;
    private ImageView clusterg12;
    private ImageView clusterg13;
    private ImageView clusterg14;

    private int falsePositives = 0;
    private long timeTaken = 0;
    final private int NUMBER_OF_FOUR_CLUSTERS = 47;
    private Long startTime;
    private Long elapsedTime;

    public void setIncorrect(ImageView image) {
        elapsedTime = (new Date()).getTime() - startTime;
        if (image.getContentDescription() != "clicked" && elapsedTime < (15 * 60 * 1000)) {
            falsePositives++;
            image.setContentDescription("clicked");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dot_cancellation);

        startTime = System.currentTimeMillis();
        elapsedTime = 0L;

        btn_dcsubmit = (Button) findViewById(R.id.btn_dcsubmit);
        clustera1 = (ImageView) findViewById(R.id.img_clustera1);
        clustera2 = (ImageView) findViewById(R.id.img_clustera2);
        clustera3 = (ImageView) findViewById(R.id.img_clustera3);
        clustera4 = (ImageView) findViewById(R.id.img_clustera4);
        clustera5 = (ImageView) findViewById(R.id.img_clustera5);
        clustera6 = (ImageView) findViewById(R.id.img_clustera6);
        clustera7 = (ImageView) findViewById(R.id.img_clustera7);
        clustera8 = (ImageView) findViewById(R.id.img_clustera8);
        clustera9 = (ImageView) findViewById(R.id.img_clustera9);
        clustera10 = (ImageView) findViewById(R.id.img_clustera10);
        clustera11 = (ImageView) findViewById(R.id.img_clustera11);
        clustera12 = (ImageView) findViewById(R.id.img_clustera12);
        clustera13 = (ImageView) findViewById(R.id.img_clustera13);
        clustera14 = (ImageView) findViewById(R.id.img_clustera14);
        clusterb1 = (ImageView) findViewById(R.id.img_clusterb1);
        clusterb2 = (ImageView) findViewById(R.id.img_clusterb2);
        clusterb3 = (ImageView) findViewById(R.id.img_clusterb3);
        clusterb4 = (ImageView) findViewById(R.id.img_clusterb4);
        clusterb5 = (ImageView) findViewById(R.id.img_clusterb5);
        clusterb6 = (ImageView) findViewById(R.id.img_clusterb6);
        clusterb7 = (ImageView) findViewById(R.id.img_clusterb7);
        clusterb8 = (ImageView) findViewById(R.id.img_clusterb8);
        clusterb9 = (ImageView) findViewById(R.id.img_clusterb9);
        clusterb10 = (ImageView) findViewById(R.id.img_clusterb10);
        clusterb11 = (ImageView) findViewById(R.id.img_clusterb11);
        clusterb12 = (ImageView) findViewById(R.id.img_clusterb12);
        clusterb13 = (ImageView) findViewById(R.id.img_clusterb13);
        clusterb14 = (ImageView) findViewById(R.id.img_clusterb14);
        clusterc1 = (ImageView) findViewById(R.id.img_clusterc1);
        clusterc2 = (ImageView) findViewById(R.id.img_clusterc2);
        clusterc3 = (ImageView) findViewById(R.id.img_clusterc3);
        clusterc4 = (ImageView) findViewById(R.id.img_clusterc4);
        clusterc5 = (ImageView) findViewById(R.id.img_clusterc5);
        clusterc6 = (ImageView) findViewById(R.id.img_clusterc6);
        clusterc7 = (ImageView) findViewById(R.id.img_clusterc7);
        clusterc8 = (ImageView) findViewById(R.id.img_clusterc8);
        clusterc9 = (ImageView) findViewById(R.id.img_clusterc9);
        clusterc10 = (ImageView) findViewById(R.id.img_clusterc10);
        clusterc11 = (ImageView) findViewById(R.id.img_clusterc11);
        clusterc12 = (ImageView) findViewById(R.id.img_clusterc12);
        clusterc13 = (ImageView) findViewById(R.id.img_clusterc13);
        clusterc14 = (ImageView) findViewById(R.id.img_clusterc14);
        clusterd1 = (ImageView) findViewById(R.id.img_clusterd1);
        clusterd2 = (ImageView) findViewById(R.id.img_clusterd2);
        clusterd3 = (ImageView) findViewById(R.id.img_clusterd3);
        clusterd4 = (ImageView) findViewById(R.id.img_clusterd4);
        clusterd5 = (ImageView) findViewById(R.id.img_clusterd5);
        clusterd6 = (ImageView) findViewById(R.id.img_clusterd6);
        clusterd7 = (ImageView) findViewById(R.id.img_clusterd7);
        clusterd8 = (ImageView) findViewById(R.id.img_clusterd8);
        clusterd9 = (ImageView) findViewById(R.id.img_clusterd9);
        clusterd10 = (ImageView) findViewById(R.id.img_clusterd10);
        clusterd11 = (ImageView) findViewById(R.id.img_clusterd11);
        clusterd12 = (ImageView) findViewById(R.id.img_clusterd12);
        clusterd13 = (ImageView) findViewById(R.id.img_clusterd13);
        clusterd14 = (ImageView) findViewById(R.id.img_clusterd14);
        clustere1 = (ImageView) findViewById(R.id.img_clustere1);
        clustere2 = (ImageView) findViewById(R.id.img_clustere2);
        clustere3 = (ImageView) findViewById(R.id.img_clustere3);
        clustere4 = (ImageView) findViewById(R.id.img_clustere4);
        clustere5 = (ImageView) findViewById(R.id.img_clustere5);
        clustere6 = (ImageView) findViewById(R.id.img_clustere6);
        clustere7 = (ImageView) findViewById(R.id.img_clustere7);
        clustere8 = (ImageView) findViewById(R.id.img_clustere8);
        clustere9 = (ImageView) findViewById(R.id.img_clustere9);
        clustere10 = (ImageView) findViewById(R.id.img_clustere10);
        clustere11 = (ImageView) findViewById(R.id.img_clustere11);
        clustere12 = (ImageView) findViewById(R.id.img_clustere12);
        clustere13 = (ImageView) findViewById(R.id.img_clustere13);
        clustere14 = (ImageView) findViewById(R.id.img_clustere14);
        clusterf1 = (ImageView) findViewById(R.id.img_clusterf1);
        clusterf2 = (ImageView) findViewById(R.id.img_clusterf2);
        clusterf3 = (ImageView) findViewById(R.id.img_clusterf3);
        clusterf4 = (ImageView) findViewById(R.id.img_clusterf4);
        clusterf5 = (ImageView) findViewById(R.id.img_clusterf5);
        clusterf6 = (ImageView) findViewById(R.id.img_clusterf6);
        clusterf7 = (ImageView) findViewById(R.id.img_clusterf7);
        clusterf8 = (ImageView) findViewById(R.id.img_clusterf8);
        clusterf9 = (ImageView) findViewById(R.id.img_clusterf9);
        clusterf10 = (ImageView) findViewById(R.id.img_clusterf10);
        clusterf11 = (ImageView) findViewById(R.id.img_clusterf11);
        clusterf12 = (ImageView) findViewById(R.id.img_clusterf12);
        clusterf13 = (ImageView) findViewById(R.id.img_clusterf13);
        clusterf14 = (ImageView) findViewById(R.id.img_clusterf14);
        clusterg1 = (ImageView) findViewById(R.id.img_clusterg1);
        clusterg2 = (ImageView) findViewById(R.id.img_clusterg2);
        clusterg3 = (ImageView) findViewById(R.id.img_clusterg3);
        clusterg4 = (ImageView) findViewById(R.id.img_clusterg4);
        clusterg5 = (ImageView) findViewById(R.id.img_clusterg5);
        clusterg6 = (ImageView) findViewById(R.id.img_clusterg6);
        clusterg7 = (ImageView) findViewById(R.id.img_clusterg7);
        clusterg8 = (ImageView) findViewById(R.id.img_clusterg8);
        clusterg9 = (ImageView) findViewById(R.id.img_clusterg9);
        clusterg10 = (ImageView) findViewById(R.id.img_clusterg10);
        clusterg11 = (ImageView) findViewById(R.id.img_clusterg11);
        clusterg12 = (ImageView) findViewById(R.id.img_clusterg12);
        clusterg13 = (ImageView) findViewById(R.id.img_clusterg13);
        clusterg14 = (ImageView) findViewById(R.id.img_clusterg14);

        btn_dcsubmit.setOnClickListener(this);
        clustera1.setOnClickListener(this);
        clustera2.setOnClickListener(this);
        clustera3.setOnClickListener(this);
        clustera4.setOnClickListener(this);
        clustera5.setOnClickListener(this);
        clustera6.setOnClickListener(this);
        clustera7.setOnClickListener(this);
        clustera8.setOnClickListener(this);
        clustera9.setOnClickListener(this);
        clustera10.setOnClickListener(this);
        clustera11.setOnClickListener(this);
        clustera12.setOnClickListener(this);
        clustera13.setOnClickListener(this);
        clustera14.setOnClickListener(this);
        clusterb1.setOnClickListener(this);
        clusterb2.setOnClickListener(this);
        clusterb3.setOnClickListener(this);
        clusterb4.setOnClickListener(this);
        clusterb5.setOnClickListener(this);
        clusterb6.setOnClickListener(this);
        clusterb7.setOnClickListener(this);
        clusterb8.setOnClickListener(this);
        clusterb9.setOnClickListener(this);
        clusterb10.setOnClickListener(this);
        clusterb11.setOnClickListener(this);
        clusterb12.setOnClickListener(this);
        clusterb13.setOnClickListener(this);
        clusterb14.setOnClickListener(this);
        clusterc1.setOnClickListener(this);
        clusterc2.setOnClickListener(this);
        clusterc3.setOnClickListener(this);
        clusterc4.setOnClickListener(this);
        clusterc5.setOnClickListener(this);
        clusterc6.setOnClickListener(this);
        clusterc7.setOnClickListener(this);
        clusterc8.setOnClickListener(this);
        clusterc9.setOnClickListener(this);
        clusterc10.setOnClickListener(this);
        clusterc11.setOnClickListener(this);
        clusterc12.setOnClickListener(this);
        clusterc13.setOnClickListener(this);
        clusterc14.setOnClickListener(this);
        clusterd1.setOnClickListener(this);
        clusterd2.setOnClickListener(this);
        clusterd3.setOnClickListener(this);
        clusterd4.setOnClickListener(this);
        clusterd5.setOnClickListener(this);
        clusterd6.setOnClickListener(this);
        clusterd7.setOnClickListener(this);
        clusterd8.setOnClickListener(this);
        clusterd9.setOnClickListener(this);
        clusterd10.setOnClickListener(this);
        clusterd11.setOnClickListener(this);
        clusterd12.setOnClickListener(this);
        clusterd13.setOnClickListener(this);
        clusterd14.setOnClickListener(this);
        clustere1.setOnClickListener(this);
        clustere2.setOnClickListener(this);
        clustere3.setOnClickListener(this);
        clustere4.setOnClickListener(this);
        clustere5.setOnClickListener(this);
        clustere6.setOnClickListener(this);
        clustere7.setOnClickListener(this);
        clustere8.setOnClickListener(this);
        clustere9.setOnClickListener(this);
        clustere10.setOnClickListener(this);
        clustere11.setOnClickListener(this);
        clustere12.setOnClickListener(this);
        clustere13.setOnClickListener(this);
        clustere14.setOnClickListener(this);
        clusterf1.setOnClickListener(this);
        clusterf2.setOnClickListener(this);
        clusterf3.setOnClickListener(this);
        clusterf4.setOnClickListener(this);
        clusterf5.setOnClickListener(this);
        clusterf6.setOnClickListener(this);
        clusterf7.setOnClickListener(this);
        clusterf8.setOnClickListener(this);
        clusterf9.setOnClickListener(this);
        clusterf10.setOnClickListener(this);
        clusterf11.setOnClickListener(this);
        clusterf12.setOnClickListener(this);
        clusterf13.setOnClickListener(this);
        clusterf14.setOnClickListener(this);
        clusterg1.setOnClickListener(this);
        clusterg2.setOnClickListener(this);
        clusterg3.setOnClickListener(this);
        clusterg4.setOnClickListener(this);
        clusterg5.setOnClickListener(this);
        clusterg6.setOnClickListener(this);
        clusterg7.setOnClickListener(this);
        clusterg8.setOnClickListener(this);
        clusterg9.setOnClickListener(this);
        clusterg10.setOnClickListener(this);
        clusterg11.setOnClickListener(this);
        clusterg12.setOnClickListener(this);
        clusterg13.setOnClickListener(this);
        clusterg14.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        timeTaken = (((new Date()).getTime() - startTime) / 1000);
        double timeInSecs = Math.floor(timeTaken);
        if (timeInSecs > 900) {
            timeTaken = 900;
        }
        switch (view.getId()) {
            case R.id.btn_dcsubmit:
                Toast.makeText(DotCancellationActivity.this, "False positives: " +
                                Integer.toString(falsePositives) + " Time taken: " + Long.toString(timeTaken),
                        Toast.LENGTH_SHORT).show();
                finish();
                startActivity(new Intent(DotCancellationActivity.this, SquareMatricesDirectionsIntroActivity.class));
                break;
            case R.id.img_clustera1:
                clustera1.setImageResource(R.drawable.fourdots1clicked);
                break;

            case R.id.img_clustera2:
                clustera2.setImageResource(R.drawable.threedots1clicked);
                setIncorrect(clustera2);
                break;

            case R.id.img_clustera3:
                clustera3.setImageResource(R.drawable.fourdots3clicked);
                break;

            case R.id.img_clustera4:
                clustera4.setImageResource(R.drawable.fivedots3clicked);
                setIncorrect(clustera4);
                break;

            case R.id.img_clustera5:
                clustera5.setImageResource(R.drawable.fourdots2clicked);
                break;

            case R.id.img_clustera6:
                clustera6.setImageResource(R.drawable.threedots2clicked);
                setIncorrect(clustera6);
                break;

            case R.id.img_clustera7:
                clustera7.setImageResource(R.drawable.fivedots2clicked);
                setIncorrect(clustera7);
                break;

            case R.id.img_clustera8:
                clustera8.setImageResource(R.drawable.fourdots3clicked);
                break;

            case R.id.img_clustera9:
                clustera9.setImageResource(R.drawable.threedots3clicked);
                setIncorrect(clustera9);
                break;

            case R.id.img_clustera10:

                clustera10.setImageResource(R.drawable.fourdots4clicked);
                break;

            case R.id.img_clustera11:
                clustera11.setImageResource(R.drawable.fourdots1clicked);
                break;

            case R.id.img_clustera12:
                clustera12.setImageResource(R.drawable.fivedots1clicked);
                setIncorrect(clustera12);
                break;

            case R.id.img_clustera13:
                clustera13.setImageResource(R.drawable.fourdots2clicked);
                break;

            case R.id.img_clustera14:
                clustera14.setImageResource(R.drawable.threedots4clicked);
                setIncorrect(clustera14);
                break;

            case R.id.img_clusterb1:
                clusterb1.setImageResource(R.drawable.fourdots3clicked);
                break;

            case R.id.img_clusterb2:
                clusterb2.setImageResource(R.drawable.fivedots4clicked);
                setIncorrect(clusterb2);
                break;

            case R.id.img_clusterb3:
                clusterb3.setImageResource(R.drawable.fourdots4clicked);
                break;

            case R.id.img_clusterb4:
                clusterb4.setImageResource(R.drawable.fourdots1clicked);
                break;

            case R.id.img_clusterb5:
                clusterb5.setImageResource(R.drawable.threedots3clicked);
                setIncorrect(clusterb5);
                break;

            case R.id.img_clusterb6:
                clusterb6.setImageResource(R.drawable.threedots1clicked);
                setIncorrect(clusterb6);
                break;

            case R.id.img_clusterb7:
                clusterb7.setImageResource(R.drawable.fivedots4clicked);
                setIncorrect(clusterb7);
                break;

            case R.id.img_clusterb8:
                clusterb8.setImageResource(R.drawable.fourdots2clicked);
                break;

            case R.id.img_clusterb9:
                clusterb9.setImageResource(R.drawable.threedots3clicked);
                setIncorrect(clusterb9);
                break;

            case R.id.img_clusterb10:
                clusterb10.setImageResource(R.drawable.fourdots3clicked);
                break;

            case R.id.img_clusterb11:
                clusterb11.setImageResource(R.drawable.threedots2clicked);
                setIncorrect(clusterb11);
                break;

            case R.id.img_clusterb12:
                clusterb12.setImageResource(R.drawable.fourdots2clicked);
                break;

            case R.id.img_clusterb13:
                clusterb13.setImageResource(R.drawable.fivedots2clicked);
                setIncorrect(clusterb13);
                break;

            case R.id.img_clusterb14:
                clusterb14.setImageResource(R.drawable.threedots1clicked);
                setIncorrect(clusterb14);
                break;

            case R.id.img_clusterc1:
                clusterc1.setImageResource(R.drawable.fivedots1clicked);
                setIncorrect(clusterc1);
                break;

            case R.id.img_clusterc2:
                clusterc2.setImageResource(R.drawable.fourdots1clicked);
                break;

            case R.id.img_clusterc3:
                clusterc3.setImageResource(R.drawable.threedots1clicked);
                setIncorrect(clusterc3);
                break;

            case R.id.img_clusterc4:
                clusterc4.setImageResource(R.drawable.fivedots3clicked);
                setIncorrect(clusterc4);
                break;

            case R.id.img_clusterc5:
                clusterc5.setImageResource(R.drawable.fourdots4clicked);
                break;

            case R.id.img_clusterc6:
                clusterc6.setImageResource(R.drawable.fivedots2clicked);
                setIncorrect(clusterc6);
                break;

            case R.id.img_clusterc7:
                clusterc7.setImageResource(R.drawable.fourdots3clicked);
                break;

            case R.id.img_clusterc8:
                clusterc8.setImageResource(R.drawable.threedots1clicked);
                setIncorrect(clusterc8);
                break;

            case R.id.img_clusterc9:
                clusterc9.setImageResource(R.drawable.threedots2clicked);
                setIncorrect(clusterc9);
                break;

            case R.id.img_clusterc10:
                clusterc10.setImageResource(R.drawable.fivedots1clicked);
                setIncorrect(clusterc10);
                break;

            case R.id.img_clusterc11:
                clusterc11.setImageResource(R.drawable.fourdots3clicked);
                break;

            case R.id.img_clusterc12:
                clusterc12.setImageResource(R.drawable.fivedots3clicked);
                setIncorrect(clusterc12);
                break;

            case R.id.img_clusterc13:
                clusterc13.setImageResource(R.drawable.fourdots1clicked);
                break;

            case R.id.img_clusterc14:
                clusterc14.setImageResource(R.drawable.fourdots2clicked);
                break;

            case R.id.img_clusterd1:
                clusterd1.setImageResource(R.drawable.threedots3clicked);
                setIncorrect(clusterd1);
                break;

            case R.id.img_clusterd2:
                clusterd2.setImageResource(R.drawable.fourdots3clicked);
                break;

            case R.id.img_clusterd3:
                clusterd3.setImageResource(R.drawable.fivedots4clicked);
                setIncorrect(clusterd3);
                break;

            case R.id.img_clusterd4:
                clusterd4.setImageResource(R.drawable.fourdots1clicked);
                break;

            case R.id.img_clusterd5:
                clusterd5.setImageResource(R.drawable.fivedots3clicked);
                setIncorrect(clusterd5);
                break;

            case R.id.img_clusterd6:
                clusterd6.setImageResource(R.drawable.fourdots2clicked);
                break;

            case R.id.img_clusterd7:
                clusterd7.setImageResource(R.drawable.fourdots4clicked);
                break;

            case R.id.img_clusterd8:
                clusterd8.setImageResource(R.drawable.fivedots2clicked);
                setIncorrect(clusterd8);
                break;

            case R.id.img_clusterd9:
                clusterd9.setImageResource(R.drawable.fivedots1clicked);
                setIncorrect(clusterd9);
                break;

            case R.id.img_clusterd10:
                clusterd10.setImageResource(R.drawable.fourdots1clicked);
                break;

            case R.id.img_clusterd11:
                clusterd11.setImageResource(R.drawable.fivedots3clicked);
                setIncorrect(clusterd11);
                break;

            case R.id.img_clusterd12:
                clusterd12.setImageResource(R.drawable.threedots4clicked);
                setIncorrect(clusterd12);
                break;

            case R.id.img_clusterd13:
                clusterd13.setImageResource(R.drawable.threedots1clicked);
                setIncorrect(clusterd13);
                break;

            case R.id.img_clusterd14:
                clusterd14.setImageResource(R.drawable.fourdots3clicked);
                break;

            case R.id.img_clustere1:
                clustere1.setImageResource(R.drawable.fourdots2clicked);
                break;

            case R.id.img_clustere2:
                clustere2.setImageResource(R.drawable.fivedots1clicked);
                setIncorrect(clustere2);
                break;

            case R.id.img_clustere3:
                clustere3.setImageResource(R.drawable.fourdots3clicked);
                break;

            case R.id.img_clustere4:
                clustere4.setImageResource(R.drawable.fivedots4clicked);
                setIncorrect(clustere4);
                break;

            case R.id.img_clustere5:
                clustere5.setImageResource(R.drawable.fourdots1clicked);
                break;

            case R.id.img_clustere6:
                clustere6.setImageResource(R.drawable.threedots3clicked);
                setIncorrect(clustere6);
                break;

            case R.id.img_clustere7:
                clustere7.setImageResource(R.drawable.fourdots2clicked);
                break;

            case R.id.img_clustere8:
                clustere8.setImageResource(R.drawable.fivedots2clicked);
                setIncorrect(clustere8);
                break;

            case R.id.img_clustere9:
                clustere9.setImageResource(R.drawable.threedots1clicked);
                setIncorrect(clustere9);
                break;

            case R.id.img_clustere10:
                clustere10.setImageResource(R.drawable.fourdots3clicked);
                break;

            case R.id.img_clustere11:
                clustere11.setImageResource(R.drawable.fourdots1clicked);
                break;

            case R.id.img_clustere12:
                clustere12.setImageResource(R.drawable.fivedots2clicked);
                setIncorrect(clustere12);
                break;

            case R.id.img_clustere13:
                clustere13.setImageResource(R.drawable.fourdots4clicked);
                break;

            case R.id.img_clustere14:
                clustere14.setImageResource(R.drawable.fivedots1clicked);
                setIncorrect(clustere14);
                break;

            case R.id.img_clusterf1:
                clusterf1.setImageResource(R.drawable.fourdots2clicked);
                break;

            case R.id.img_clusterf2:
                clusterf2.setImageResource(R.drawable.threedots4clicked);
                setIncorrect(clusterf2);
                break;

            case R.id.img_clusterf3:
                clusterf3.setImageResource(R.drawable.fourdots3clicked);
                break;

            case R.id.img_clusterf4:
                clusterf4.setImageResource(R.drawable.fourdots1clicked);
                break;

            case R.id.img_clusterf5:
                clusterf5.setImageResource(R.drawable.fivedots3clicked);
                setIncorrect(clusterf5);
                break;

            case R.id.img_clusterf6:
                clusterf6.setImageResource(R.drawable.fourdots4clicked);
                break;

            case R.id.img_clusterf7:
                clusterf7.setImageResource(R.drawable.fourdots2clicked);
                break;

            case R.id.img_clusterf8:
                clusterf8.setImageResource(R.drawable.threedots3clicked);
                setIncorrect(clusterf8);
                break;

            case R.id.img_clusterf9:
                clusterf9.setImageResource(R.drawable.threedots1clicked);
                setIncorrect(clusterf9);
                break;

            case R.id.img_clusterf10:
                clusterf10.setImageResource(R.drawable.fourdots3clicked);
                break;

            case R.id.img_clusterf11:
                clusterf11.setImageResource(R.drawable.fivedots4clicked);
                setIncorrect(clusterf11);
                break;

            case R.id.img_clusterf12:
                clusterf12.setImageResource(R.drawable.fourdots1clicked);
                break;

            case R.id.img_clusterf13:
                clusterf13.setImageResource(R.drawable.fourdots2clicked);
                break;

            case R.id.img_clusterf14:
                clusterf14.setImageResource(R.drawable.fivedots1clicked);
                setIncorrect(clusterf14);
                break;

            case R.id.img_clusterg1:
                clusterg1.setImageResource(R.drawable.threedots1clicked);
                setIncorrect(clusterg1);
                break;

            case R.id.img_clusterg2:
                clusterg2.setImageResource(R.drawable.fourdots3clicked);
                break;

            case R.id.img_clusterg3:
                clusterg3.setImageResource(R.drawable.fivedots2clicked);
                setIncorrect(clusterg3);
                break;

            case R.id.img_clusterg4:
                clusterg4.setImageResource(R.drawable.threedots3clicked);
                setIncorrect(clusterg4);
                break;

            case R.id.img_clusterg5:
                clusterg5.setImageResource(R.drawable.fourdots1clicked);
                break;

            case R.id.img_clusterg6:
                clusterg6.setImageResource(R.drawable.fivedots4clicked);
                setIncorrect(clusterg6);
                break;

            case R.id.img_clusterg7:
                clusterg7.setImageResource(R.drawable.fourdots4clicked);
                break;

            case R.id.img_clusterg8:
                clusterg8.setImageResource(R.drawable.fivedots3clicked);
                setIncorrect(clusterg8);
                break;

            case R.id.img_clusterg9:
                clusterg9.setImageResource(R.drawable.fourdots2clicked);
                break;

            case R.id.img_clusterg10:
                clusterg10.setImageResource(R.drawable.fivedots2clicked);
                setIncorrect(clusterg10);
                break;

            case R.id.img_clusterg11:
                clusterg11.setImageResource(R.drawable.fourdots3clicked);
                break;

            case R.id.img_clusterg12:
                clusterg12.setImageResource(R.drawable.threedots2clicked);
                setIncorrect(clusterg12);
                break;

            case R.id.img_clusterg13:
                clusterg13.setImageResource(R.drawable.fourdots4clicked);
                break;

            case R.id.img_clusterg14:
                clusterg14.setImageResource(R.drawable.fourdots1clicked);
                break;
        }
    }
}
