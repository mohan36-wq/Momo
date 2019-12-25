package com.example.momo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class FlamesCalculator extends AppCompatActivity {

    ImageView iv_f, iv_l, iv_a, iv_m, iv_e, iv_s;
    Button bt_calculator, bt_back;
    EditText edCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flames_calculator);

        iv_f = findViewById(R.id.imageView_f);
        iv_l = findViewById(R.id.imageView_l);
        iv_a = findViewById(R.id.imageView_a);
        iv_m = findViewById(R.id.imageView_m);
        iv_e = findViewById(R.id.imageView_e);
        iv_s = findViewById(R.id.imageView_s);

        bt_calculator = findViewById(R.id.button_calculate);
        bt_back = findViewById(R.id.button);
        edCount = findViewById(R.id.editText3);

        bt_calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int count = 0;

                count = Integer.parseInt(edCount.getText().toString());

                switch (count) {
                        case 0:
                            Toast.makeText(FlamesCalculator.this, "Not Compatible", Toast.LENGTH_SHORT).show();
                        break;
                            case 1:
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                iv_f.setVisibility(View.INVISIBLE);
                            }
                        }, 1000);

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                iv_l.setVisibility(View.INVISIBLE);
                            }
                        }, 3000);

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                iv_a.setVisibility(View.INVISIBLE);
                            }
                        }, 5000);

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                iv_m.setVisibility(View.INVISIBLE);
                            }
                        }, 7000);

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                iv_e.setVisibility(View.INVISIBLE);
                            }
                        }, 9000);
                        break;

                        case 2:
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                iv_l.setVisibility(View.INVISIBLE);
                            }
                        }, 1000);

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                iv_m.setVisibility(View.INVISIBLE);
                            }
                        }, 3000);

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                iv_s.setVisibility(View.INVISIBLE);
                            }
                        }, 5000);

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                iv_a.setVisibility(View.INVISIBLE);
                            }
                        }, 7000);

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                iv_f.setVisibility(View.INVISIBLE);
                            }
                        }, 9000);
                        break;

                        case 3:
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                iv_a.setVisibility(View.INVISIBLE);
                            }
                        }, 1000);

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                iv_s.setVisibility(View.INVISIBLE);
                            }
                        }, 3000);

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                iv_m.setVisibility(View.INVISIBLE);
                            }
                        }, 5000);

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                iv_l.setVisibility(View.INVISIBLE);
                            }
                        }, 7000);

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                iv_e.setVisibility(View.INVISIBLE);
                            }
                        }, 9000);
                        break;

                        case 4:
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    iv_m.setVisibility(View.INVISIBLE);
                                }
                            }, 1000);

                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    iv_l.setVisibility(View.INVISIBLE);
                                }
                            }, 3000);

                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    iv_f.setVisibility(View.INVISIBLE);
                                }
                            }, 5000);

                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    iv_a.setVisibility(View.INVISIBLE);
                                }
                            }, 7000);

                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    iv_s.setVisibility(View.INVISIBLE);
                                }
                            }, 9000);
                        break;

                        case 5:
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    iv_e.setVisibility(View.INVISIBLE);
                                }
                            }, 1000);

                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    iv_m.setVisibility(View.INVISIBLE);
                                }
                            }, 3000);

                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    iv_s.setVisibility(View.INVISIBLE);
                                }
                            }, 5000);

                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    iv_l.setVisibility(View.INVISIBLE);
                                }
                            }, 7000);

                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    iv_f.setVisibility(View.INVISIBLE);
                                }
                            }, 9000);
                            break;
                        case 6:
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                iv_s.setVisibility(View.INVISIBLE);
                            }
                        }, 1000);

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                iv_f.setVisibility(View.INVISIBLE);
                            }
                        }, 3000);

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                iv_a.setVisibility(View.INVISIBLE);
                            }
                        }, 5000);

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                iv_l.setVisibility(View.INVISIBLE);
                            }
                        }, 7000);

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                iv_e.setVisibility(View.INVISIBLE);
                            }
                        }, 9000);
                        break;
                    case 7:
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                iv_f.setVisibility(View.INVISIBLE);
                            }
                        }, 1000);

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                iv_a.setVisibility(View.INVISIBLE);
                            }
                        }, 3000);

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                iv_s.setVisibility(View.INVISIBLE);
                            }
                        }, 5000);

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                iv_l.setVisibility(View.INVISIBLE);
                            }
                        }, 7000);

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                iv_m.setVisibility(View.INVISIBLE);
                            }
                        }, 9000);
                        break;
                }
            }

            });

        bt_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FlamesCalculator.this, FlamesActivity.class));
            }
        });


    }
}
