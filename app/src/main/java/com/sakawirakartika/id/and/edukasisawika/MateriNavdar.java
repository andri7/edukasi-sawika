package com.sakawirakartika.id.and.edukasisawika;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebView;

/**
 * Created by cvglobalsolusindo on 4/11/2016.
 */
public class MateriNavdar extends Activity {

    WebView webviewmateri;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_isi_materi);
        webviewmateri = (WebView) findViewById(R.id.webview_materi);
        webviewmateri.loadUrl("file:///android_assets/materi_krida_navdar");

    }
}
