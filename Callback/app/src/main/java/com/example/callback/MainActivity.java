package com.example.callback;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements OnInfoFetchCallback {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void  fetchInfo(View view){
        InfoService service = new InfoService(this);
        service.getInfo();
    }

    @Override
    public void onSuccess(String info) {
        Log.i(TAG,info);
    }

    @Override
    public void failure() {
       Log.i(TAG,"获取信息失败");
    }
}
