package helloworld.teste.com.usandoadbshell;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class AbaixaVolume extends Service {

    private Timer timer;
    private TimerTask tTask;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        if (timer == null){
            timer = new Timer();
            tTask = new TimerTask() {
                @Override
                public void run() {
                    Log.e("ADBSHELL", "chama a tela");
                    Intent intent = new Intent(AbaixaVolume.this, MainActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    intent.putExtra("rechamou", true);
                    startActivity(intent);
                }
            };

            Log.e("ADBSHELL", "entrou no onstartcommand");
            timer.schedule(tTask, 1000, 10000);
        }

        return super.onStartCommand(intent, flags, startId);
    }
}
