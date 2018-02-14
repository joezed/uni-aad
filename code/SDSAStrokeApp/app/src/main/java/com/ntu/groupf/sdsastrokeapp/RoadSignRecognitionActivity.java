package com.ntu.groupf.sdsastrokeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import java.util.HashMap;
import java.util.Map;

public class RoadSignRecognitionActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewFlipper vf_scenes;
    private Button btn_next;
    private Button btn_prev;
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
    private int signID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_road_sign_recognition);

        //fill map with null answers
        for (int i = 1; i <= 12; i++) {
            answers.put(i, 0);
        }

        vf_scenes = (ViewFlipper) findViewById(R.id.vf_scenes);
        btn_next = (Button) findViewById(R.id.btn_next);
        btn_prev = (Button) findViewById(R.id.btn_prev);
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


    //FIX MAGIC NUMBERS
    @Override
    public void onClick(View view) {
        if(view == btn_next) {
            vf_scenes.showNext();
            answers.put(sceneID, signID);
            sceneID += 1;
            if (sceneID > 12) {
                sceneID = 1;
            }
        } else if(view == btn_prev) {
            vf_scenes.showPrevious();
            answers.put(sceneID, signID);
            sceneID -= 1;
            if (sceneID < 1) {
                sceneID = 12;
            }
        } else {
            setPreview(view);
        }
    }

    public void setPreview(View view) {
        if (view == img_sign1) {
            img_selected.setImageResource(R.drawable.sign1);
            sceneID = 1;
            signID = 1;
        } else if (view == img_sign2) {
            img_selected.setImageResource(R.drawable.sign2);
            sceneID = 2;
            signID = 2;
        } else if (view == img_sign3) {
            img_selected.setImageResource(R.drawable.sign3);
            sceneID = 3;
            signID = 3;
        } else if (view == img_sign4) {
            img_selected.setImageResource(R.drawable.sign4);
            sceneID = 4;
            signID = 4;
        } else if (view == img_sign5) {
            img_selected.setImageResource(R.drawable.sign5);
            sceneID = 5;
            signID = 5;
        } else if (view == img_sign6) {
            img_selected.setImageResource(R.drawable.sign6);
            sceneID = 6;
            signID = 6;
        } else if (view == img_sign7) {
            img_selected.setImageResource(R.drawable.sign7);
            sceneID = 7;
            signID = 7;
        } else if (view == img_sign8) {
            img_selected.setImageResource(R.drawable.sign8);
            sceneID = 8;
            signID = 8;
        } else if (view == img_sign9) {
            img_selected.setImageResource(R.drawable.sign9);
            sceneID = 9;
            signID = 9;
        } else if (view == img_sign10) {
            img_selected.setImageResource(R.drawable.sign10);
            sceneID = 10;
            signID = 10;
        } else if (view == img_sign11) {
            img_selected.setImageResource(R.drawable.sign11);
            sceneID = 11;
            signID = 11;
        } else if (view == img_sign12) {
            img_selected.setImageResource(R.drawable.sign12);
            sceneID = 12;
            signID = 12;
        } else if (view == img_sign13) {
            img_selected.setImageResource(R.drawable.sign13);
            sceneID = 13;
            signID = 13;
        } else if (view == img_sign14) {
            img_selected.setImageResource(R.drawable.sign14);
            sceneID = 14;
            signID = 14;
        }
    }
}
