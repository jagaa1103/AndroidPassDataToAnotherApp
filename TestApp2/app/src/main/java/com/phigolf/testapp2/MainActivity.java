package com.phigolf.testapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.ReceivedMessage);

        Bundle b = getIntent().getExtras();
        if(b!=null){
            String myString = b.getString("Phigolf_UID");
            Log.d("TestApp2", "=========== TestApp2 =============" + myString);
            textView.setText(myString);
        }
    }
}
