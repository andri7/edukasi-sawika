package com.sakawirakartika.id.and.edukasisawika;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebView;

/**
 * Created by cvglobalsolusindo on 4/9/2016.
 */
public class IsiMateriActivity  extends Activity {
    WebView webwiew_isi_materi;

    public void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_isi_materi);

    }
}
