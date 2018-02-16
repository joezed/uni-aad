package com.ntu.groupf.sdsastrokeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import java.util.Date;
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

    private int sideCoordinateA;
    private int sideCoordinateB;
    private int topCoordinateA;
    private int topCoordinateB;
    private int counter = 1;
    private int score = 0;
    final private int NUMBER_OF_ROUNDABOUTS = 28;
    private Long startTime;
    private Long elapsedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square_matrices_compass);

        startTime = System.currentTimeMillis();
        elapsedTime = 0L;

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
            scoreCalc(1,1);
        } else if (view == img_space2 && img_space2.getContentDescription() != "clicked") {
            setMatrixImage(img_space2);
            scoreCalc(1,2);
        } else if (view == img_space3 && img_space3.getContentDescription() != "clicked") {
            setMatrixImage(img_space3);
            scoreCalc(1,3);
        } else if (view == img_space4 && img_space4.getContentDescription() != "clicked") {
            setMatrixImage(img_space4);
            scoreCalc(1,4);
        } else if (view == img_space5 && img_space5.getContentDescription() != "clicked") {
            setMatrixImage(img_space5);
            scoreCalc(2,1);
        } else if (view == img_space6 && img_space6.getContentDescription() != "clicked") {
            setMatrixImage(img_space6);
            scoreCalc(2,2);
        } else if (view == img_space7 && img_space7.getContentDescription() != "clicked") {
            setMatrixImage(img_space7);
            scoreCalc(2,3);
        } else if (view == img_space8 && img_space8.getContentDescription() != "clicked") {
            setMatrixImage(img_space8);
            scoreCalc(2,4);
        } else if (view == img_space9 && img_space9.getContentDescription() != "clicked") {
            setMatrixImage(img_space9);
            scoreCalc(3,1);
        } else if (view == img_space10 && img_space10.getContentDescription() != "clicked") {
            setMatrixImage(img_space10);
            scoreCalc(3,2);
        } else if (view == img_space11 && img_space11.getContentDescription() != "clicked") {
            setMatrixImage(img_space11);
            scoreCalc(3,3);
        } else if (view == img_space12 && img_space12.getContentDescription() != "clicked") {
            setMatrixImage(img_space12);
            scoreCalc(3,4);
        } else if (view == img_space13 && img_space13.getContentDescription() != "clicked") {
            setMatrixImage(img_space13);
            scoreCalc(4,1);
        } else if (view == img_space14 && img_space14.getContentDescription() != "clicked") {
            setMatrixImage(img_space14);
            scoreCalc(4,2);
        } else if (view == img_space15 && img_space15.getContentDescription() != "clicked") {
            setMatrixImage(img_space15);
            scoreCalc(4,3);
        } else if (view == img_space16 && img_space16.getContentDescription() != "clicked") {
            setMatrixImage(img_space16);
            scoreCalc(4,4);
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
                sideCoordinateA = 1;
                sideCoordinateB = 0;
                topCoordinateA = 1;
                topCoordinateB = 0;
                break;
            case 2:
                currentRoundabout = R.drawable.roundabout2;
                sideCoordinateA = 1;
                sideCoordinateB = 0;
                topCoordinateA = 2;
                topCoordinateB = 0;
                break;
            case 3:
                currentRoundabout = R.drawable.roundabout3;
                sideCoordinateA = 1;
                sideCoordinateB = 0;
                topCoordinateA = 3;
                topCoordinateB = 0;
                break;
            case 4:
                currentRoundabout = R.drawable.roundabout4;
                sideCoordinateA = 1;
                sideCoordinateB = 0;
                topCoordinateA = 4;
                topCoordinateB = 0;
                break;
            case 5:
                currentRoundabout = R.drawable.roundabout5;
                sideCoordinateA = 2;
                sideCoordinateB = 0;
                topCoordinateA = 1;
                topCoordinateB = 0;
                break;
            case 6:
                currentRoundabout = R.drawable.roundabout6;
                sideCoordinateA = 2;
                sideCoordinateB = 0;
                topCoordinateA = 2;
                topCoordinateB = 0;
                break;
            case 7:
                currentRoundabout = R.drawable.roundabout7;
                sideCoordinateA = 2;
                sideCoordinateB = 0;
                topCoordinateA = 3;
                topCoordinateB = 0;
                break;
            case 8:
                currentRoundabout = R.drawable.roundabout8;
                sideCoordinateA = 2;
                sideCoordinateB = 0;
                topCoordinateA = 4;
                topCoordinateB = 0;
                break;
            case 9:
                currentRoundabout = R.drawable.roundabout9;
                sideCoordinateA = 3;
                sideCoordinateB = 0;
                topCoordinateA = 1;
                topCoordinateB = 0;
                break;
            case 10:
                currentRoundabout = R.drawable.roundabout10;
                sideCoordinateA = 3;
                sideCoordinateB = 0;
                topCoordinateA = 2;
                topCoordinateB = 0;
                break;
            case 11:
                currentRoundabout = R.drawable.roundabout11;
                sideCoordinateA = 3;
                sideCoordinateB = 0;
                topCoordinateA = 3;
                topCoordinateB = 0;
                break;
            case 12:
                currentRoundabout = R.drawable.roundabout12;
                sideCoordinateA = 3;
                sideCoordinateB = 0;
                topCoordinateA = 4;
                topCoordinateB = 0;
                break;
            case 13:
                currentRoundabout = R.drawable.roundabout13;
                sideCoordinateA = 4;
                sideCoordinateB = 0;
                topCoordinateA = 1;
                topCoordinateB = 0;
                break;
            case 14:
                currentRoundabout = R.drawable.roundabout14;
                sideCoordinateA = 4;
                sideCoordinateB = 0;
                topCoordinateA = 2;
                topCoordinateB = 0;
                break;
            case 15:
                currentRoundabout = R.drawable.roundabout15;
                sideCoordinateA = 4;
                sideCoordinateB = 0;
                topCoordinateA = 3;
                topCoordinateB = 0;
                break;
            case 16:
                currentRoundabout = R.drawable.roundabout16;
                sideCoordinateA = 4;
                sideCoordinateB = 0;
                topCoordinateA = 4;
                topCoordinateB = 0;
                break;
            case 17:
                currentRoundabout = R.drawable.roundabout17;
                sideCoordinateA = 0;
                sideCoordinateB = 0;
                topCoordinateA = 2;
                topCoordinateB = 4;
                break;
            case 18:
                currentRoundabout = R.drawable.roundabout18;
                sideCoordinateA = 0;
                sideCoordinateB = 0;
                topCoordinateA = 1;
                topCoordinateB = 4;
                break;
            case 19:
                currentRoundabout = R.drawable.roundabout19;
                sideCoordinateA = 0;
                sideCoordinateB = 0;
                topCoordinateA = 3;
                topCoordinateB = 4;
                break;
            case 20:
                currentRoundabout = R.drawable.roundabout20;
                sideCoordinateA = 2;
                sideCoordinateB = 3;
                topCoordinateA = 0;
                topCoordinateB = 0;
                break;
            case 21:
                currentRoundabout = R.drawable.roundabout21;
                sideCoordinateA = 3;
                sideCoordinateB = 4;
                topCoordinateA = 0;
                topCoordinateB = 0;
                break;
            case 22:
                currentRoundabout = R.drawable.roundabout22;
                sideCoordinateA = 1;
                sideCoordinateB = 3;
                topCoordinateA = 0;
                topCoordinateB = 0;
                break;
            case 23:
                currentRoundabout = R.drawable.roundabout23;
                sideCoordinateA = 0;
                sideCoordinateB = 0;
                topCoordinateA = 1;
                topCoordinateB = 2;
                break;
            case 24:
                currentRoundabout = R.drawable.roundabout24;
                sideCoordinateA = 0;
                sideCoordinateB = 0;
                topCoordinateA = 2;
                topCoordinateB = 3;
                break;
            case 25:
                currentRoundabout = R.drawable.roundabout25;
                sideCoordinateA = 2;
                sideCoordinateB = 4;
                topCoordinateA = 0;
                topCoordinateB = 0;
                break;
            case 26:
                currentRoundabout = R.drawable.roundabout26;
                sideCoordinateA = 1;
                sideCoordinateB = 4;
                topCoordinateA = 0;
                topCoordinateB = 0;
                break;
            case 27:
                currentRoundabout = R.drawable.roundabout27;
                sideCoordinateA = 0;
                sideCoordinateB = 0;
                topCoordinateA = 1;
                topCoordinateB = 3;
                break;
            case 28:
                currentRoundabout = R.drawable.roundabout28;
                sideCoordinateA = 1;
                sideCoordinateB = 2;
                topCoordinateA = 0;
                topCoordinateB = 0;
                break;
        }
        return currentRoundabout;
    }

    public void scoreCalc(int sideCoordinate, int topCoordinate) {
        elapsedTime = (new Date()).getTime() - startTime;
        if (elapsedTime < (5 * 60 * 1000)) {
            if (sideCoordinateA == sideCoordinate || sideCoordinateB == sideCoordinate) {
                score++;
            }
            if (topCoordinateA == topCoordinate || topCoordinateB == topCoordinate) {
                score++;
            }
        }
    }

    public void endGame() {
        Toast.makeText(SquareMatricesCompassActivity.this, "Score: " + Integer.toString(score),
                Toast.LENGTH_SHORT).show();
    }
}
