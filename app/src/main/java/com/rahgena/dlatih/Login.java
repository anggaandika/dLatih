package com.rahgena.dlatih;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;


public class Login extends AppCompatActivity {
    private Button daftar;
    public static Login ma;
    RelativeLayout rellay1;
    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            rellay1.setVisibility(View.VISIBLE);


        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        daftar = (Button) findViewById(R.id.btndaftar);
        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        rellay1 = (RelativeLayout) findViewById(R.id.rellay1);


        handler.postDelayed(runnable,2000); //2000 waktu timeout
    }
    public  void openActivity2(){
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }
}