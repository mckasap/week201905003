package org.kasapbasi.week201905003;

import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        final Handler handle = new Handler();
//        Runnable run = new Runnable() {
//            @Override
//            public void run() {
//
//                Log.i("TEKRARLI"," Bir saniye geçti ");
//                handle.postDelayed(this,1000);
//            }
//        };
//        handle.post(run);


        CountDownTimer countDownTimer = new CountDownTimer(6000, 1000) {

            @Override
            public void onTick(long l) {

            Log.i("Counter",Integer.toString( (int)l/1000));
            }

            @Override
            public void onFinish() {

                MediaPlayer mp=MediaPlayer.create(getApplicationContext(),R.raw.horn);
                mp.start();


            }
        };
    countDownTimer.start();

    }
}
