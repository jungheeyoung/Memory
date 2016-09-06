package com.example.android.navigationdrawer;

import android.app.Activity;
import android.app.Notification;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

/**
 * Created by appcreator05 on 2016. 9. 6..
 */
public class SplashActivity extends Activity {
    public void onCreatet(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Handler handler = new Handler(){
            public void handleMessage(Message msg){
                finish();
            }
        };
    handler.sendEmptyMessageDelayed(0,3000);
    }
}
