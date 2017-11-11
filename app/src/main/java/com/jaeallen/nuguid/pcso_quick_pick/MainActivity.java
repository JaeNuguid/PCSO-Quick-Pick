package com.jaeallen.nuguid.pcso_quick_pick;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    public void developer(View v){
        goToUrl ( "http://superuser.com/");
    }
    public void a(View v){

    }
    public void b(View v){

    }
    public void c(View v){

    }
    public void d(View v){

    }
    public void e(View v){

    }
    public void about(View v){

    }

    public void rate(View v){
        goToUrl ( "http://null/");
    }
    public void results(View v){
        goToUrl ( "http://www.pcso-lottoresults.com");
    }


    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}
