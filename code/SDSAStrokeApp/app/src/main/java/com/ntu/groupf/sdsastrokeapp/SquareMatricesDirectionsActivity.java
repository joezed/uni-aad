package com.ntu.groupf.sdsastrokeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import java.util.Date;

public class SquareMatricesDirectionsActivity extends AppCompatActivity implements View.OnClickListener{

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

    private int lorryCoordinate;
    private int carCoordinate;
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

        startTime = System.currentTimeMillis();
        elapsedTime = 0L;

        vf_carlorries = (ViewFlipper) findViewById(R.id.vf_carlorries);
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

        vf_carlorries.setDisplayedChild(1);
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
        }
    }

    public void setMatrixImage(ImageView image) {
        int imageResource = getImage();
        image.setImageResource(imageResource);
        image.setContentDescription("clicked");
        counter++;
        if (counter <= NUMBER_OF_CARDS) {
            vf_carlorries.showNext();
        } else {
            endGame();
        }
    }

    public int getImage() {
        int current = vf_carlorries.getDisplayedChild();
        int currentCard = 0;
        switch (current) {
            case 1:
                currentCard = R.drawable.carlorry1;
                lorryCoordinate = 1;
                carCoordinate = 1;
                break;
            case 2:
                currentCard = R.drawable.carlorry2;
                lorryCoordinate = 1;
                carCoordinate = 2;
                break;
            case 3:
                currentCard = R.drawable.carlorry3;
                lorryCoordinate = 1;
                carCoordinate = 3;
                break;
            case 4:
                currentCard = R.drawable.carlorry4;
                lorryCoordinate = 1;
                carCoordinate = 4;
                break;
            case 5:
                currentCard = R.drawable.carlorry5;
                lorryCoordinate = 2;
                carCoordinate = 1;
                break;
            case 6:
                currentCard = R.drawable.carlorry6;
                lorryCoordinate = 2;
                carCoordinate = 2;
                break;
            case 7:
                currentCard = R.drawable.carlorry7;
                lorryCoordinate = 2;
                carCoordinate = 3;
                break;
            case 8:
                currentCard = R.drawable.carlorry8;
                lorryCoordinate = 2;
                carCoordinate = 4;
                break;
            case 9:
                currentCard = R.drawable.carlorry9;
                lorryCoordinate = 3;
                carCoordinate = 1;
                break;
            case 10:
                currentCard = R.drawable.carlorry10;
                lorryCoordinate = 3;
                carCoordinate = 2;
                break;
            case 11:
                currentCard = R.drawable.carlorry11;
                lorryCoordinate = 3;
                carCoordinate = 3;
                break;
            case 12:
                currentCard = R.drawable.carlorry12;
                lorryCoordinate = 3;
                carCoordinate = 4;
                break;
            case 13:
                currentCard = R.drawable.carlorry13;
                lorryCoordinate = 4;
                carCoordinate = 1;
                break;
            case 14:
                currentCard = R.drawable.carlorry14;
                lorryCoordinate = 4;
                carCoordinate = 2;
                break;
            case 15:
                currentCard = R.drawable.carlorry15;
                lorryCoordinate = 4;
                carCoordinate = 3;
                break;
            case 16:
                currentCard = R.drawable.carlorry16;
                lorryCoordinate = 4;
                carCoordinate = 4;
                break;
        }
        return currentCard;
    }

    public void scoreCalc(int sideCoordinate, int topCoordinate) {
        elapsedTime = (new Date()).getTime() - startTime;
        if (elapsedTime < (5 * 60 * 1000)) {
            if (lorryCoordinate == sideCoordinate) {
                score++;
            }
            if (carCoordinate == topCoordinate) {
                score++;
            }
        }
    }

    public void endGame() {
        Toast.makeText(SquareMatricesDirectionsActivity.this, "Score: " + Integer.toString(score),
                Toast.LENGTH_SHORT).show();
    }
}
