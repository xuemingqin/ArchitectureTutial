package com.example.callback;

import java.util.Date;

public class InfoService {
    private OnInfoFetchCallback callback;
    public InfoService(OnInfoFetchCallback callback){
        this.callback = callback;
    }
    public void getInfo(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                callback.onSuccess("结果是："+ new Date());
                callback.failure();
            }
        });
        thread.start();
    }
}
