package com.ntu.groupf.sdsastrokeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class SquareMatricesDirectionsActivity extends AppCompatActivity {

    private ViewFlipper vf_carlorries;
    private ImageView img_space1;
    private ImageView img_space2;
    private ImageView img_space3;
    private ImageView img_space4;
    private ImageView img_space5;
    private ImageView img_space6;
    private ImageView img_space7;
    private ImageView img_space8;
    private ImageView img_space9;
    private ImageView img_space10;
    private ImageView img_space11;
    private ImageView img_space12;
    private ImageView img_space13;
    private ImageView img_space14;
    private ImageView img_space15;
    private ImageView img_space16;

    private int counter = 1;
    private int score = 0;
    private int cardID;
    final private int NUMBER_OF_CARDS = 16;
    private Long startTime;
    private Long elapsedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square_matrices_directions);
    }
}
