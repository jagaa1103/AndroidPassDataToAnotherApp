package com.phigolf.testapp2;

import android.app.Activity;
import android.os.Bundle;


public class UserDataReceiver {
    Activity _activity = null;
    public UserDataReceiver(Activity activity){
        _activity = activity;
    }
    public String getUserData(){
        Bundle b = _activity.getIntent().getExtras();
        if(b!=null) {
            String phigolf_uid = b.getString("Phigolf_UID");
            return phigolf_uid;
        }else {
            return null;
        }
    }
}
