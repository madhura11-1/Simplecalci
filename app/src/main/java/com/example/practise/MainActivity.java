package com.example.practise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, badd, bsub, bmul, bdiv, bclr;
    private TextView t1,t2,t3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = findViewById(R.id.textView);
        t2 = findViewById(R.id.textView1);
        t3 = findViewById(R.id.textView2);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        badd = findViewById(R.id.badd);
        bsub = findViewById(R.id.bsub);
        bmul = findViewById(R.id.bmul);
        bdiv = findViewById(R.id.bdiv);
        bclr = findViewById(R.id.clr);



        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        t1.append("1");
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        t1.append("2");
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        t1.append("3");
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        t1.append("4");
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        t1.append("5");
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        t1.append("6");
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        t1.append("7");
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        t1.append("8");
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        t1.append("9");
                    }
                });
                bclr.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(t1.getText().toString().isEmpty())
                            Toast.makeText(MainActivity.this, "Chomuji Number toh dalo", Toast.LENGTH_LONG).show();
                        else
                        {String s1 = t1.getText().toString();
                            s1=(s1.substring(0, s1.length() - 1));
                            t1.setText(s1);}


                    }
                });
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        t2.append("1");
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        t2.append("2");
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        t2.append("3");
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        t2.append("4");
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        t2.append("5");
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        t2.append("6");
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        t2.append("7");
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        t2.append("8");
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        t2.append("9");
                    }
                });
                bclr.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        if(t2.getText().toString().isEmpty())
                            Toast.makeText(MainActivity.this, "Chomuji Number to dalo ", Toast.LENGTH_LONG).show();
                        else
                        { String s2 = t2.getText().toString();
                            s2 = s2.substring(0,s2.length()-1);
                            t2.setText(s2);}

                    }
                });
            }
        });

        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = t1.getText().toString();

                String s2 = t2.getText().toString();
                if(s1.isEmpty() || s2.isEmpty())
                    Toast.makeText(MainActivity.this, "Chomuji Number to dalo", Toast.LENGTH_LONG).show();
                else
                { int result = Integer.parseInt(s1)+Integer.parseInt(s2);
                String s = Integer.toString(result);
                t3.setText(s);}

            }
        });

        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = t1.getText().toString();
                String s2 = t2.getText().toString();
                if(s1.isEmpty() || s2.isEmpty())
                    Toast.makeText(MainActivity.this, "Chomuji Number to dalo", Toast.LENGTH_LONG).show();

                else
                {int result = Integer.parseInt(s1)-Integer.parseInt(s2);
                String s = Integer.toString(result);
                t3.setText(s);}
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = t1.getText().toString();
                String s2 = t2.getText().toString();
                if(s1.isEmpty() || s2.isEmpty())
                    Toast.makeText(MainActivity.this, "Chomuji Number to dalo", Toast.LENGTH_LONG).show();
                else
                {int result = Integer.parseInt(s1)*Integer.parseInt(s2);
                String s = Integer.toString(result);
                t3.setText(s);}
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = t1.getText().toString();
                String s2 = t2.getText().toString();
                if(s1.isEmpty() || s2.isEmpty())
                    Toast.makeText(MainActivity.this, "Chomuji Number to dalo", Toast.LENGTH_LONG).show();
                else
                {
                int result = Integer.parseInt(s1)/Integer.parseInt(s2);
                String s = Integer.toString(result);
                t3.setText(s);}
            }
        });


    }

}
