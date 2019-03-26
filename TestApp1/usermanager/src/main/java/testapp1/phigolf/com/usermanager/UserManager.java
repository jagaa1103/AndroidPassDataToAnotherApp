package testapp1.phigolf.com.usermanager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

public class UserManager {
    public UserManager(){
        Log.d("UserManager", "@>> UserManager created");
    }

    public static void sendUserData(Activity activity){
        try{
            Log.d("UserManager", "@>> prepare user data");
            Context context = activity.getApplicationContext();
            PackageManager packageManager = context.getPackageManager();
            PackageInfo info = packageManager.getPackageInfo("com.phigolf.testapp2", 0);
            Intent intent = packageManager.getLaunchIntentForPackage("com.phigolf.testapp2");
            intent.putExtra("Phigolf_UID", "123456789");
            Log.d("UserManager", "@>> starting activity");
            context.startActivity(intent);
            Log.d("UserManager", "@>> started activity");
        }catch (PackageManager.NameNotFoundException e){
            Log.e("TestApp1", "App is not found");
        }
    }
}
