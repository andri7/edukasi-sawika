package com.sakawirakartika.id.and.edukasisawika;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View.OnClickListener;

/**
 * Created by cvglobalsolusindo on 4/9/2016.
 */


public class ListViewMateri extends Activity  {
    ListView list_materi;
    String[] materi;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_materi);
        list_materi = (ListView) findViewById(R.id.list_materi);

        //Array holding our data
        String[] materi = {"1. Arti Lambang", "2. Krida Survival", "3. Krida Pioneer", "4. Krida Mountainering", "5. Krida Navigasi Darat",
        "6. Krida Penanggulangan bencana alam"};

        //adapter which will convert each data item into view item.
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_view_row, R.id.listText, materi);
        //place each view-item inside listview by setting adapter for our listview
        list_materi.setAdapter(adapter);
        list_materi.setOnClickListener((OnClickListener) this);

    }


    public  void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
        if (materi [arg2] == "1. Arti Lambang") {
            startActivity(new Intent(this, MateriLambangswk.class));
        } else if (materi [arg2] == "2. Krida Survival") {
            startActivity(new Intent (this, MateriKridaSurvival.class));
        } else if (materi [arg2] == "3. Krida Pioneering") {
            startActivity(new Intent(this, MateriKridaPioneering.class));
        } else if (materi [arg2] == "4. Krida Mountainering") {
            startActivity(new Intent(this, MateriKridaPioneering.class));
        } else if (materi [arg2] == "5. Krida Navigasi Darat") {
            startActivity(new Intent(this, MateriNavdar.class));
        } else if (materi [arg2] == "6. Krida Penanggulangan bencana alam") {
            startActivity(new Intent(this, MateriPenangBencanaAlam.class));
        }
    }


}
