package com.aaperteam.playalphabet;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //Add member variable
    private SoundPool mSoundPool;
    private int alphabetA;
    private int alphabetB;
    private int alphabetC;
    private int alphabetD;
    private int alphabetE;
    private int alphabetF;
    private int alphabetG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Create a new SoundPool
        mSoundPool = new SoundPool(7, AudioManager.STREAM_MUSIC,0);

        // TODO: Load and get the IDs to identify the sounds
        alphabetA = mSoundPool.load(getApplicationContext(),R.raw.sound1_a,0);
        alphabetB = mSoundPool.load(getApplicationContext(),R.raw.sound2_b,0);
        alphabetC = mSoundPool.load(getApplicationContext(),R.raw.sound3_c,0);
        alphabetD = mSoundPool.load(getApplicationContext(),R.raw.sound4_d,0);
        alphabetE = mSoundPool.load(getApplicationContext(),R.raw.sound5_e,0);
        alphabetF = mSoundPool.load(getApplicationContext(),R.raw.sound6_f,0);
        alphabetG = mSoundPool.load(getApplicationContext(),R.raw.sound7_g,0);


    }

    // TODO: Add the play methods triggered by the buttons
    public void playA(View view){
        mSoundPool.play(alphabetA,1.0f,1.0f,0,0,1.0f);
    }
    public void playB(View view){
        mSoundPool.play(alphabetB,1.0f,1.0f,0,0,1.0f);
    }
    public void playC(View view){
        mSoundPool.play(alphabetC,1.0f,1.0f,0,0,1.0f);
    }
    public void playD(View view){
        mSoundPool.play(alphabetD,1.0f,1.0f,0,0,1.0f);
    }
    public void playE(View view){
        mSoundPool.play(alphabetE,1.0f,1.0f,0,0,1.0f);

    }
    public void playF(View view){
        mSoundPool.play(alphabetF,1.0f,1.0f,0,0,1.0f);

    }
    public void playG(View view){
        mSoundPool.play(alphabetG,1.0f,1.0f,0,0,1.0f);

    }
}
