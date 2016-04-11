package com.sakawirakartika.id.and.edukasisawika;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by cvglobalsolusindo on 4/11/2016.
 */
public class ListViewVideo extends Activity {

    ListView list_video;
    String[] videoedukasi;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_materi);
        list_video = (ListView) findViewById(R.id.list_materi);

        //Array holding our data
        String[] videoedukasi = {"1. Arti Lambang", "2. Krida Survival", "3. Krida Pioneer"};

        //adapter which will convert each data item into view item.
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_view_row, R.id.listText, videoedukasi);
        //place each view-item inside listview by setting adapter for our listview
        list_video.setAdapter(adapter);
        list_video.setOnClickListener((View.OnClickListener) this);

    }


    public  void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
        if (videoedukasi [arg2] == "1. Arti Lambang") {
            startActivity(new Intent(this, MateriLambangswk.class));
        } else if (videoedukasi [arg2] == "2. Krida Survival") {
            startActivity(new Intent (this, MateriKridaSurvival.class));
        } else if (videoedukasi [arg2] == "3. Krida Pioneering") {
            startActivity(new Intent(this, MateriKridaPioneering.class));
        }
    }

}
