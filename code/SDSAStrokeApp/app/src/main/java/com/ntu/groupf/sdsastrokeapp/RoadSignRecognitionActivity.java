package com.ntu.groupf.sdsastrokeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class RoadSignRecognitionActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewFlipper vf_scenes;
    private Button btn_next;
    private Button btn_prev;
    private Button btn_rsrsubmit;
    private ImageView img_selected;
    private ImageView img_sign1;
    private ImageView img_sign2;
    private ImageView img_sign3;
    private ImageView img_sign4;
    private ImageView img_sign5;
    private ImageView img_sign6;
    private ImageView img_sign7;
    private ImageView img_sign8;
    private ImageView img_sign9;
    private ImageView img_sign10;
    private ImageView img_sign11;
    private ImageView img_sign12;
    private ImageView img_sign13;
    private ImageView img_sign14;

    private Map<Integer, Integer> answers = new HashMap<>();
    private int sceneID = 1;
    private int signID = 0;
    private int score = 0;

    final private int NUMBER_OF_SCENES = 12;

    private Long startTime;
    private Long elapsedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_road_sign_recognition);

        startTime = System.currentTimeMillis();
        elapsedTime = 0L;

        //fill map with null answers
        for (int i = 1; i <= NUMBER_OF_SCENES; i++) {
            answers.put(i, 0);
        }

        vf_scenes = (ViewFlipper) findViewById(R.id.vf_scenes);
        btn_next = (Button) findViewById(R.id.btn_next);
        btn_prev = (Button) findViewById(R.id.btn_prev);
        btn_rsrsubmit = (Button) findViewById(R.id.btn_rsrsubmit);
        img_selected = (ImageView) findViewById(R.id.img_selected);
        img_sign1 = (ImageView) findViewById(R.id.img_sign1);
        img_sign2 = (ImageView) findViewById(R.id.img_sign2);
        img_sign3 = (ImageView) findViewById(R.id.img_sign3);
        img_sign4 = (ImageView) findViewById(R.id.img_sign4);
        img_sign5 = (ImageView) findViewById(R.id.img_sign5);
        img_sign6 = (ImageView) findViewById(R.id.img_sign6);
        img_sign7 = (ImageView) findViewById(R.id.img_sign7);
        img_sign8 = (ImageView) findViewById(R.id.img_sign8);
        img_sign9 = (ImageView) findViewById(R.id.img_sign9);
        img_sign10 = (ImageView) findViewById(R.id.img_sign10);
        img_sign11 = (ImageView) findViewById(R.id.img_sign11);
        img_sign12 = (ImageView) findViewById(R.id.img_sign12);
        img_sign13 = (ImageView) findViewById(R.id.img_sign13);
        img_sign14 = (ImageView) findViewById(R.id.img_sign14);

        btn_next.setOnClickListener(this);
        btn_prev.setOnClickListener(this);
        btn_rsrsubmit.setOnClickListener(this);
        img_selected.setOnClickListener(this);
        img_sign1.setOnClickListener(this);
        img_sign2.setOnClickListener(this);
        img_sign3.setOnClickListener(this);
        img_sign4.setOnClickListener(this);
        img_sign5.setOnClickListener(this);
        img_sign6.setOnClickListener(this);
        img_sign7.setOnClickListener(this);
        img_sign8.setOnClickListener(this);
        img_sign9.setOnClickListener(this);
        img_sign10.setOnClickListener(this);
        img_sign11.setOnClickListener(this);
        img_sign12.setOnClickListener(this);
        img_sign13.setOnClickListener(this);
        img_sign14.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == btn_next) {
            vf_scenes.showNext();
            elapsedTime = (new Date()).getTime() - startTime;
            if (elapsedTime < (3* 60 * 1000)) {
                answers.put(sceneID, signID);
            }
            sceneID++;
            if (sceneID > NUMBER_OF_SCENES) {
                sceneID = 1;
            }
            putAnswer(answers.get(sceneID));
        } else if(view == btn_prev) {
            vf_scenes.showPrevious();
            if (elapsedTime < (3 * 60 * 1000)) {
                answers.put(sceneID, signID);
            }
            sceneID--;
            if (sceneID < 1) {
                sceneID = NUMBER_OF_SCENES;
            }
            putAnswer(answers.get(sceneID));
        } else if (view == btn_rsrsubmit) {
            answers.put(sceneID, signID);
            score = 0;
            for (int i = 1; i <= answers.size(); i++) {
                if (i == answers.get(i)) {
                    score += 1;
                }
            }
            Toast.makeText(RoadSignRecognitionActivity.this, "Score: " + Integer.toString(score),
                    Toast.LENGTH_SHORT).show();
            finish();
            startActivity(new Intent(RoadSignRecognitionActivity.this, TrailMakingTestIntroActivity.class));
        }  else {
            signClick(view);
        }
    }

    public void signClick(View view) {
        if (view == img_sign1) {
            img_selected.setImageResource(R.drawable.sign1);
            signID = 1;
        } else if (view == img_sign2) {
            img_selected.setImageResource(R.drawable.sign2);
            signID = 2;
        } else if (view == img_sign3) {
            img_selected.setImageResource(R.drawable.sign3);
            signID = 3;
        } else if (view == img_sign4) {
            img_selected.setImageResource(R.drawable.sign4);
            signID = 4;
        } else if (view == img_sign5) {
            img_selected.setImageResource(R.drawable.sign5);
            signID = 5;
        } else if (view == img_sign6) {
            img_selected.setImageResource(R.drawable.sign6);
            signID = 6;
        } else if (view == img_sign7) {
            img_selected.setImageResource(R.drawable.sign7);
            signID = 7;
        } else if (view == img_sign8) {
            img_selected.setImageResource(R.drawable.sign8);
            signID = 8;
        } else if (view == img_sign9) {
            img_selected.setImageResource(R.drawable.sign9);
            signID = 9;
        } else if (view == img_sign10) {
            img_selected.setImageResource(R.drawable.sign10);
            signID = 10;
        } else if (view == img_sign11) {
            img_selected.setImageResource(R.drawable.sign11);
            signID = 11;
        } else if (view == img_sign12) {
            img_selected.setImageResource(R.drawable.sign12);
            signID = 12;
        } else if (view == img_sign13) {
            img_selected.setImageResource(R.drawable.sign13);
            signID = 13;
        } else if (view == img_sign14) {
            img_selected.setImageResource(R.drawable.sign14);
            signID = 14;
        }
    }

    public void putAnswer(int next) {
        if (next == 0) {
            img_selected.setImageResource(R.drawable.sign_blank);
            signID = 0;
        } else if (next == 1) {
            img_selected.setImageResource(R.drawable.sign1);
            signID = 1;
        } else if (next == 2) {
            img_selected.setImageResource(R.drawable.sign2);
            signID = 2;
        } else if (next == 3) {
            img_selected.setImageResource(R.drawable.sign3);
            signID = 3;
        } else if (next == 4) {
            img_selected.setImageResource(R.drawable.sign4);
            signID = 4;
        } else if (next == 5) {
            img_selected.setImageResource(R.drawable.sign5);
            signID = 5;
        } else if (next == 6) {
            img_selected.setImageResource(R.drawable.sign6);
            signID = 6;
        } else if (next == 7) {
            img_selected.setImageResource(R.drawable.sign7);
            signID = 7;
        } else if (next == 8) {
            img_selected.setImageResource(R.drawable.sign8);
            signID = 8;
        } else if (next == 9) {
            img_selected.setImageResource(R.drawable.sign9);
            signID = 9;
        } else if (next == 10) {
            img_selected.setImageResource(R.drawable.sign10);
            signID = 10;
        } else if (next == 11) {
            img_selected.setImageResource(R.drawable.sign11);
            signID = 11;
        } else if (next == 12) {
            img_selected.setImageResource(R.drawable.sign12);
            signID = 12;
        } else if (next == 13) {
            img_selected.setImageResource(R.drawable.sign13);
            signID = 13;
        } else if (next == 14) {
            img_selected.setImageResource(R.drawable.sign14);
            signID = 14;
        }
    }
}
