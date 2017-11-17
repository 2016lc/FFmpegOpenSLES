package com.test.ffmpegopensles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private MusicPlay musicPlay = new MusicPlay();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void play(View view){
        musicPlay.play();
    }

    public void stop(View view){
        musicPlay.stop();
    }


}
