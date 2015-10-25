package com.oboenikui.googlenoweraser;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class OpenSettingActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS",Uri.parse("package:com.oboenikui.googlenoweraser" ));
        startActivity(intent);
        finish();
    }
}
