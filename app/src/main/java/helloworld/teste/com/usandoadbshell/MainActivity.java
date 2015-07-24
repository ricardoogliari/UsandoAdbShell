package helloworld.teste.com.usandoadbshell;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        Log.e("ADBSHELL", "vaibaixarvolume");
        if (getIntent().getBooleanExtra("rechamou", false)){
            Runtime runtime = Runtime.getRuntime();
            try {
                Log.e("ADBSHELL", "inputkeys");
                //runtime.exec("am start -a android.intent.action.CALL -d tel://12345678"); //NOT
                //runtime.exec("reboot");
                runtime.exec("input keyevent 25");
                runtime.exec("input keyevent 25");
                runtime.exec("input keyevent 25");
                runtime.exec("input keyevent 25");
                runtime.exec("input keyevent 25");
                runtime.exec("input keyevent 25");
                runtime.exec("input keyevent 25");
                runtime.exec("input keyevent 25");
                runtime.exec("input keyevent 25");
                runtime.exec("input keyevent 25");
                runtime.exec("input keyevent 25");
                runtime.exec("input keyevent 25");
                runtime.exec("input keyevent 25");
                runtime.exec("input keyevent 25");
                runtime.exec("input keyevent 25");
                runtime.exec("input keyevent 25");
            } catch (IOException e) {
                Log.e("ADBSHELL", "erro: " + e.getMessage());
            }
        } else {
            Intent intent = new Intent(this, AbaixaVolume.class);
            startService(intent);
        }


        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                fecha();
            }
        };
        timer.schedule(task, 4000);
    }

    public void fecha(){
        finish();
    }
}
