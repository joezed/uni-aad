package com.ntu.groupf.sdsastrokeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import java.util.HashMap;
import java.util.Map;

public class SquareMatricesCompassActivity extends AppCompatActivity implements View.OnClickListener{

    private ViewFlipper vf_roundabouts;
    private ImageView img_bin;
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

    private Map<Integer, Integer> answers = new HashMap<>();
    private int counter = 1;
    private int score = 0;
    private int roundaboutID;
    final private int NUMBER_OF_ROUNDABOUTS = 28;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square_matrices_compass);

        //fill map with null answers
        for (int i = 1; i <= NUMBER_OF_ROUNDABOUTS; i++) {
            answers.put(i, 0);
        }

        vf_roundabouts = (ViewFlipper) findViewById(R.id.vf_roundabouts);
        img_bin = (ImageView) findViewById(R.id.img_bin);
        img_space1 = (ImageView) findViewById(R.id.img_space1);
        img_space2 = (ImageView) findViewById(R.id.img_space2);
        img_space3 = (ImageView) findViewById(R.id.img_space3);
        img_space4 = (ImageView) findViewById(R.id.img_space4);
        img_space5 = (ImageView) findViewById(R.id.img_space5);
        img_space6 = (ImageView) findViewById(R.id.img_space6);
        img_space7 = (ImageView) findViewById(R.id.img_space7);
        img_space8 = (ImageView) findViewById(R.id.img_space8);
        img_space9 = (ImageView) findViewById(R.id.img_space9);
        img_space10 = (ImageView) findViewById(R.id.img_space10);
        img_space11 = (ImageView) findViewById(R.id.img_space11);
        img_space12 = (ImageView) findViewById(R.id.img_space12);
        img_space13 = (ImageView) findViewById(R.id.img_space13);
        img_space14 = (ImageView) findViewById(R.id.img_space14);
        img_space15 = (ImageView) findViewById(R.id.img_space15);
        img_space16 = (ImageView) findViewById(R.id.img_space16);

        img_bin.setOnClickListener(this);
        img_space1.setOnClickListener(this);
        img_space2.setOnClickListener(this);
        img_space3.setOnClickListener(this);
        img_space4.setOnClickListener(this);
        img_space5.setOnClickListener(this);
        img_space6.setOnClickListener(this);
        img_space7.setOnClickListener(this);
        img_space8.setOnClickListener(this);
        img_space9.setOnClickListener(this);
        img_space10.setOnClickListener(this);
        img_space11.setOnClickListener(this);
        img_space12.setOnClickListener(this);
        img_space13.setOnClickListener(this);
        img_space14.setOnClickListener(this);
        img_space15.setOnClickListener(this);
        img_space16.setOnClickListener(this);

        vf_roundabouts.setDisplayedChild(1);
    }

    @Override
    public void onClick(View view) {
        if (view == img_space1 && img_space1.getContentDescription() != "clicked") {
            setMatrixImage(img_space1);
            answers.put(1, roundaboutID);
        } else if (view == img_space2 && img_space2.getContentDescription() != "clicked") {
            setMatrixImage(img_space2);
            answers.put(2, roundaboutID);
        } else if (view == img_space3 && img_space3.getContentDescription() != "clicked") {
            setMatrixImage(img_space3);
            answers.put(3, roundaboutID);
        } else if (view == img_space4 && img_space4.getContentDescription() != "clicked") {
            setMatrixImage(img_space4);
            answers.put(4, roundaboutID);
        } else if (view == img_space5 && img_space5.getContentDescription() != "clicked") {
            setMatrixImage(img_space5);
            answers.put(5, roundaboutID);
        } else if (view == img_space6 && img_space6.getContentDescription() != "clicked") {
            setMatrixImage(img_space6);
            answers.put(6, roundaboutID);
        } else if (view == img_space7 && img_space7.getContentDescription() != "clicked") {
            setMatrixImage(img_space7);
            answers.put(7, roundaboutID);
        } else if (view == img_space8 && img_space8.getContentDescription() != "clicked") {
            setMatrixImage(img_space8);
            answers.put(8, roundaboutID);
        } else if (view == img_space9 && img_space9.getContentDescription() != "clicked") {
            setMatrixImage(img_space9);
            answers.put(9, roundaboutID);
        } else if (view == img_space10 && img_space10.getContentDescription() != "clicked") {
            setMatrixImage(img_space10);
            answers.put(10, roundaboutID);
        } else if (view == img_space11 && img_space11.getContentDescription() != "clicked") {
            setMatrixImage(img_space11);
            answers.put(11, roundaboutID);
        } else if (view == img_space12 && img_space12.getContentDescription() != "clicked") {
            setMatrixImage(img_space12);
            answers.put(12, roundaboutID);
        } else if (view == img_space13 && img_space13.getContentDescription() != "clicked") {
            setMatrixImage(img_space13);
            answers.put(13, roundaboutID);
        } else if (view == img_space14 && img_space14.getContentDescription() != "clicked") {
            setMatrixImage(img_space14);
            answers.put(14, roundaboutID);
        } else if (view == img_space15 && img_space15.getContentDescription() != "clicked") {
            setMatrixImage(img_space15);
            answers.put(15, roundaboutID);
        } else if (view == img_space16 && img_space16.getContentDescription() != "clicked") {
            setMatrixImage(img_space16);
            answers.put(16, roundaboutID);
        } else if (view == img_bin) {
            counter++;
            if (counter <= NUMBER_OF_ROUNDABOUTS) {
                vf_roundabouts.showNext();
            } else {
                endGame();
            }
        }
    }

    public void setMatrixImage(ImageView image) {
        int imageResource = getImage();
        image.setImageResource(imageResource);
        image.setContentDescription("clicked");
        roundaboutID = vf_roundabouts.getDisplayedChild();
        counter++;
        if (counter <= NUMBER_OF_ROUNDABOUTS) {
            vf_roundabouts.showNext();
        } else {
            endGame();
        }
    }

    public int getImage() {
        int current = vf_roundabouts.getDisplayedChild();
        int currentRoundabout = 0;
        switch (current) {
            case 1:
                currentRoundabout = R.drawable.roundabout1;
                break;
            case 2:
                currentRoundabout = R.drawable.roundabout2;
                break;
            case 3:
                currentRoundabout = R.drawable.roundabout3;
                break;
            case 4:
                currentRoundabout = R.drawable.roundabout4;
                break;
            case 5:
                currentRoundabout = R.drawable.roundabout5;
                break;
            case 6:
                currentRoundabout = R.drawable.roundabout6;
                break;
            case 7:
                currentRoundabout = R.drawable.roundabout7;
                break;
            case 8:
                currentRoundabout = R.drawable.roundabout8;
                break;
            case 9:
                currentRoundabout = R.drawable.roundabout9;
                break;
            case 10:
                currentRoundabout = R.drawable.roundabout10;
                break;
            case 11:
                currentRoundabout = R.drawable.roundabout11;
                break;
            case 12:
                currentRoundabout = R.drawable.roundabout12;
                break;
            case 13:
                currentRoundabout = R.drawable.roundabout13;
                break;
            case 14:
                currentRoundabout = R.drawable.roundabout14;
                break;
            case 15:
                currentRoundabout = R.drawable.roundabout15;
                break;
            case 16:
                currentRoundabout = R.drawable.roundabout16;
                break;
            case 17:
                currentRoundabout = R.drawable.roundabout17;
                break;
            case 18:
                currentRoundabout = R.drawable.roundabout18;
                break;
            case 19:
                currentRoundabout = R.drawable.roundabout19;
                break;
            case 20:
                currentRoundabout = R.drawable.roundabout20;
                break;
            case 21:
                currentRoundabout = R.drawable.roundabout21;
                break;
            case 22:
                currentRoundabout = R.drawable.roundabout22;
                break;
            case 23:
                currentRoundabout = R.drawable.roundabout23;
                break;
            case 24:
                currentRoundabout = R.drawable.roundabout24;
                break;
            case 25:
                currentRoundabout = R.drawable.roundabout25;
                break;
            case 26:
                currentRoundabout = R.drawable.roundabout26;
                break;
            case 27:
                currentRoundabout = R.drawable.roundabout27;
                break;
            case 28:
                currentRoundabout = R.drawable.roundabout28;
                break;
        }
        return currentRoundabout;
    }

    public void endGame() {
        score = 0;
        for (int i = 1; i <= answers.size(); i++) {
            if (i == answers.get(i)) {
                score += 1;
            }
        }
        Toast.makeText(SquareMatricesCompassActivity.this, "Score: " + Integer.toString(score),
                Toast.LENGTH_SHORT).show();
    }
}
