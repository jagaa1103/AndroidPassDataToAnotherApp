package testapp1.phigolf.com.testapp1;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    String message = "123456789";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sendButton = (Button) findViewById(R.id.sendButton);
        sendButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent("com.phigolf.testapp2.MainActivity");
                i.putExtra("Phigolf_UID", message);
                PackageManager packageManager = getPackageManager();
                try{
                    PackageInfo info = packageManager.getPackageInfo("com.phigolf.testapp2", 0);
                    Intent intent = packageManager.getLaunchIntentForPackage("com.phigolf.testapp2");
                    intent.putExtra("Phigolf_UID", "123456789");
                    startActivity(intent);
                }catch (PackageManager.NameNotFoundException e){
                    Log.e("TestApp1", "App is not found");
                }
//                startActivity(getPackageManager().getLaunchIntentForPackage("com.phigolf.testapp2"));
            }
        });
    }

}
