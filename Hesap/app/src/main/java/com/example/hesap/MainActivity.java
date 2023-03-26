package com.example.hesap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button_c,button_open, button_close, button_bolme;
    Button button_yedi, button_sekiz, button_dokuz, button_carpma;
    Button button_dort, button_bes, button_alti, button_cikarma;
    Button button_bir, button_iki, button_uc, button_toplama;
    Button button_AC, button_sifir, button_nokta, button_esit;

    TextView result, solution;

    boolean bolme, carpma, toplama, cikarma;

    float valuBir, valuIki;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result=findViewById(R.id.result);
        solution=findViewById(R.id.solution);

        button_c=(Button) findViewById(R.id.button_c);
        button_open=(Button) findViewById(R.id.button_open);
        button_close=(Button) findViewById(R.id.button_close);
        button_bolme=(Button) findViewById(R.id.button_bolme);
        button_yedi=(Button) findViewById(R.id.button_yedi);
        button_sekiz=(Button) findViewById(R.id.button_sekiz);
        button_dokuz=(Button) findViewById(R.id.button_dokuz);
        button_carpma=(Button) findViewById(R.id.button_carpma);
        button_dort=(Button) findViewById(R.id.button_dort);
        button_bes=(Button) findViewById(R.id.button_bes);
        button_alti=(Button) findViewById(R.id.button_alti);
        button_cikarma=(Button) findViewById(R.id.button_cikarma);
        button_bir=(Button) findViewById(R.id.button_bir);
        button_iki=(Button) findViewById(R.id.button_iki);
        button_uc=(Button) findViewById(R.id.button_uc);
        button_toplama=(Button) findViewById(R.id.button_toplama);
        button_AC=(Button) findViewById(R.id.button_AC);
        button_sifir=(Button) findViewById(R.id.button_sifir);
        button_nokta=(Button) findViewById(R.id.button_nokta);
        button_esit=(Button) findViewById(R.id.button_esit);

        button_bir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"1");
                solution.setText(result.getText());
            }
        });
        button_iki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"2");
                solution.setText(result.getText());
            }
        });
        button_uc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"3");
                solution.setText(result.getText());
            }
        });
        button_dort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"4");
                solution.setText(result.getText());
            }
        });
        button_bes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"5");
                solution.setText(result.getText());
            }
        });
        button_alti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"6");
                solution.setText(result.getText());
            }
        });
        button_yedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"7");
                solution.setText(result.getText());
            }
        });
        button_sekiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"8");
                solution.setText(result.getText());
            }
        });
        button_dokuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"9");
                solution.setText(result.getText());
            }
        });
        button_sifir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "0");
                solution.setText(result.getText());
            }
        });
        button_nokta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+".");
                solution.setText(result.getText());
            }
        });
        button_AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("");
            }
        });
        button_toplama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result == null) {
                    result.setText("");
                } else {
                    valuBir = Float.parseFloat(result.getText() + "");
                    toplama = true;
                    result.setText(null);
                }
            }

        } );
        button_cikarma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valuBir = Float.parseFloat(result.getText() + "");
                cikarma = true;
                result.setText(null);
            }


        } );
        button_carpma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valuBir = Float.parseFloat(result.getText() + "");
                carpma = true;
                result.setText(null);
            }


        } );
        button_bolme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valuBir = Float.parseFloat(result.getText() + "");
                bolme = true;
                result.setText(null);
            }


        } );

        button_esit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valuIki=Float.parseFloat(result.getText()+"");
                if(toplama==true){
                    result.setText(valuBir+valuIki+"");
                    solution.setText(valuBir+"-"+valuIki);
                    toplama=false;
                }
                if(cikarma==true){
                    result.setText(valuBir-valuIki+"");
                    solution.setText(valuBir+"-"+valuIki);
                    cikarma=false;
                }
                if(bolme==true) {
                    result.setText(valuBir / valuIki + "");
                    solution.setText(valuBir + "/" + valuIki);
                    bolme = false;
                }
                if(carpma==true) {
                    result.setText(valuBir * valuIki + "");
                    solution.setText(valuBir + "*" + valuIki);
                    carpma = false;
                }

            }
        });



    }
}