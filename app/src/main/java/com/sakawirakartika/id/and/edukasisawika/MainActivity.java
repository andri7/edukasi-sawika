package com.sakawirakartika.id.and.edukasisawika;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn_materi = (Button) findViewById(R.id.button_materi);
        Button btn_kuis = (Button) findViewById(R.id.button_kuis);
        Button btn_video_pemb = (Button) findViewById(R.id.button_videopemb);
        Button btn_bantuan = (Button) findViewById(R.id.button_bantuan);
        Button btn_tentang = (Button) findViewById(R.id.button_tentang);
        Button btn_signout = (Button) findViewById(R.id.button_signout);


        btn_materi.setOnClickListener(new View.OnClickListener() {
            @Override
                         public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(getApplicationContext(), IsiMateriActivity.class));
            }
        });

        btn_kuis.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(getApplicationContext(), KuisActivity.class));
            }
        });

        btn_video_pemb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(getApplicationContext(), IsiMateriActivity.class));
            }
        });

        btn_bantuan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(getApplicationContext(), BantuanActivity.class));
            }
        });

        btn_tentang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(getApplicationContext(), TentangActivity.class));
            }
        });

        btn_signout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
            }
        });


    }

    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Keluar?")
                .setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        MainActivity.this.finish();
                    }
                })
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();

    }

}
