package com.ntu.groupf.sdsastrokeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class TrailMakingTestActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView img_node1;
    private ImageView img_node2;
    private ImageView img_node3;
    private ImageView img_node4;
    private ImageView img_node5;
    private ImageView img_node6;
    private ImageView img_node7;
    private ImageView img_node8;
    private ImageView img_node9;
    private ImageView img_node10;
    private ImageView img_node11;
    private ImageView img_node12;
    private ImageView img_node13;
    private ImageView img_node14;
    private ImageView img_node15;
    private ImageView img_node16;
    private ImageView img_node17;
    private ImageView img_node18;
    private ImageView img_node19;
    private ImageView img_node20;
    private ImageView img_node21;
    private ImageView img_node22;
    private ImageView img_node23;
    private ImageView img_node24;

    private int counter = 1;
    private int errors = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trail_making_test);

        img_node1 = (ImageView) findViewById(R.id.img_node1);
        img_node2 = (ImageView) findViewById(R.id.img_node2);
        img_node3 = (ImageView) findViewById(R.id.img_node3);
        img_node4 = (ImageView) findViewById(R.id.img_node4);
        img_node5 = (ImageView) findViewById(R.id.img_node5);
        img_node6 = (ImageView) findViewById(R.id.img_node6);
        img_node7 = (ImageView) findViewById(R.id.img_node7);
        img_node8 = (ImageView) findViewById(R.id.img_node8);
        img_node9 = (ImageView) findViewById(R.id.img_node9);
        img_node10 = (ImageView) findViewById(R.id.img_node10);
        img_node11 = (ImageView) findViewById(R.id.img_node11);
        img_node12 = (ImageView) findViewById(R.id.img_node12);
        img_node13 = (ImageView) findViewById(R.id.img_node13);
        img_node14 = (ImageView) findViewById(R.id.img_node14);
        img_node15 = (ImageView) findViewById(R.id.img_node15);
        img_node16 = (ImageView) findViewById(R.id.img_node16);
        img_node17 = (ImageView) findViewById(R.id.img_node17);
        img_node18 = (ImageView) findViewById(R.id.img_node18);
        img_node19 = (ImageView) findViewById(R.id.img_node19);
        img_node20 = (ImageView) findViewById(R.id.img_node20);
        img_node21 = (ImageView) findViewById(R.id.img_node21);
        img_node22 = (ImageView) findViewById(R.id.img_node22);
        img_node23 = (ImageView) findViewById(R.id.img_node23);
        img_node24 = (ImageView) findViewById(R.id.img_node24);

        img_node1.setOnClickListener(this);
        img_node2.setOnClickListener(this);
        img_node3.setOnClickListener(this);
        img_node4.setOnClickListener(this);
        img_node5.setOnClickListener(this);
        img_node6.setOnClickListener(this);
        img_node7.setOnClickListener(this);
        img_node8.setOnClickListener(this);
        img_node9.setOnClickListener(this);
        img_node10.setOnClickListener(this);
        img_node11.setOnClickListener(this);
        img_node12.setOnClickListener(this);
        img_node13.setOnClickListener(this);
        img_node14.setOnClickListener(this);
        img_node15.setOnClickListener(this);
        img_node16.setOnClickListener(this);
        img_node17.setOnClickListener(this);
        img_node18.setOnClickListener(this);
        img_node19.setOnClickListener(this);
        img_node20.setOnClickListener(this);
        img_node21.setOnClickListener(this);
        img_node22.setOnClickListener(this);
        img_node23.setOnClickListener(this);
        img_node24.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view == img_node1) {
            if (counter == 1) {
                counter++;
                img_node1.setImageResource(R.drawable.node_blank);
            } else {
                if (counter < 1) {
                    errors++;
                }
            }
        }

        if (view == img_node2) {
            if (counter == 2) {
                counter++;
                img_node2.setImageResource(R.drawable.node_blank);
            } else {
                if (counter < 2) {
                    errors++;
                }
            }
        }

        if (view == img_node3) {
            if (counter == 3) {
                counter++;
                img_node3.setImageResource(R.drawable.node_blank);
            } else {
                if (counter < 3) {
                    errors++;
                }
            }
        }

        if (view == img_node4) {
            if (counter == 4) {
                counter++;
                img_node4.setImageResource(R.drawable.node_blank);
            } else {
                if (counter < 4) {
                    errors++;
                }
            }
        }

        if (view == img_node5) {
            if (counter == 5) {
                counter++;
                img_node5.setImageResource(R.drawable.node_blank);
            } else {
                if (counter < 5) {
                    errors++;
                }
            }
        }

        if (view == img_node6) {
            if (counter == 6) {
                counter++;
                img_node6.setImageResource(R.drawable.node_blank);
            } else {
                if (counter < 6) {
                    errors++;
                }
            }
        }

        if (view == img_node7) {
            if (counter == 7) {
                counter++;
                img_node7.setImageResource(R.drawable.node_blank);
            } else {
                if (counter < 7) {
                    errors++;
                }
            }
        }

        if (view == img_node8) {
            if (counter == 8) {
                counter++;
                img_node8.setImageResource(R.drawable.node_blank);
            } else {
                if (counter < 8) {
                    errors++;
                }
            }
        }

        if (view == img_node9) {
            if (counter == 9) {
                counter++;
                img_node9.setImageResource(R.drawable.node_blank);
            } else {
                if (counter < 9) {
                    errors++;
                }
            }
        }

        if (view == img_node10) {
            if (counter == 10) {
                counter++;
                img_node10.setImageResource(R.drawable.node_blank);
            } else {
                if (counter < 10) {
                    errors++;
                }
            }
        }

        if (view == img_node11) {
            if (counter == 11) {
                counter++;
                img_node11.setImageResource(R.drawable.node_blank);
            } else {
                if (counter < 11) {
                    errors++;
                }
            }
        }

        if (view == img_node12) {
            if (counter == 12) {
                counter++;
                img_node12.setImageResource(R.drawable.node_blank);
            } else {
                if (counter < 12) {
                    errors++;
                }
            }
        }

        if (view == img_node13) {
            if (counter == 13) {
                counter++;
                img_node13.setImageResource(R.drawable.node_blank);
            } else {
                if (counter < 13) {
                    errors++;
                }
            }
        }

        if (view == img_node14) {
            if (counter == 14) {
                counter++;
                img_node14.setImageResource(R.drawable.node_blank);
            } else {
                if (counter < 14) {
                    errors++;
                }
            }
        }

        if (view == img_node15) {
            if (counter == 15) {
                counter++;
                img_node15.setImageResource(R.drawable.node_blank);
            } else {
                if (counter < 15) {
                    errors++;
                }
            }
        }

        if (view == img_node16) {
            if (counter == 16) {
                counter++;
                img_node16.setImageResource(R.drawable.node_blank);
            } else {
                if (counter < 16) {
                    errors++;
                }
            }
        }

        if (view == img_node17) {
            if (counter == 17) {
                counter++;
                img_node17.setImageResource(R.drawable.node_blank);
            } else {
                if (counter < 17) {
                    errors++;
                }
            }
        }

        if (view == img_node18) {
            if (counter == 18) {
                counter++;
                img_node18.setImageResource(R.drawable.node_blank);
            } else {
                if (counter < 18) {
                    errors++;
                }
            }
        }

        if (view == img_node19) {
            if (counter == 19) {
                counter++;
                img_node19.setImageResource(R.drawable.node_blank);
            } else {
                if (counter < 19) {
                    errors++;
                }
            }
        }

        if (view == img_node20) {
            if (counter == 20) {
                counter++;
                img_node20.setImageResource(R.drawable.node_blank);
            } else {
                if (counter < 20) {
                    errors++;
                }
            }
        }

        if (view == img_node21) {
            if (counter == 21) {
                counter++;
                img_node21.setImageResource(R.drawable.node_blank);
            } else {
                if (counter < 21) {
                    errors++;
                }
            }
        }

        if (view == img_node22) {
            if (counter == 22) {
                counter++;
                img_node22.setImageResource(R.drawable.node_blank);
            } else {
                if (counter < 22) {
                    errors++;
                }
            }
        }

        if (view == img_node23) {
            if (counter == 23) {
                counter++;
                img_node23.setImageResource(R.drawable.node_blank);
            } else {
                if (counter < 23) {
                    errors++;
                }
            }
        }

        if (view == img_node24) {
            if (counter == 24) {
                counter++;
                img_node24.setImageResource(R.drawable.node_blank);
                Toast.makeText(TrailMakingTestActivity.this, "Errors: " + Integer.toString(errors),
                        Toast.LENGTH_SHORT).show();
                finish();
                startActivity(new Intent(TrailMakingTestActivity.this, RoadSignRecognitionActivity.class));
            } else {
                if (counter < 24) {
                    errors++;
                }
            }
        }
    }
}
