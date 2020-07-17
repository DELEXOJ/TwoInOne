package com.example.threeinone;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class GameActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9;
    Button newGame,saveGame,Levels;
    Boolean isUsed;
    int counter=0;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        intilizeMethods();
        isUsed=false;
        mp= MediaPlayer.create(this,R.raw.animalsongs);
        textView1.setOnClickListener(this);
        textView2.setOnClickListener(this);
        textView3.setOnClickListener(this);
        textView4.setOnClickListener(this);
        textView5.setOnClickListener(this);
        textView6.setOnClickListener(this);
        textView7.setOnClickListener(this);
        textView8.setOnClickListener(this);
        textView9.setOnClickListener(this);
        newGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
            }
        });
        saveGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomGenerator = new Random();
                final int randomInt = randomGenerator.nextInt(7) + 1;
                if (mp!=null&&mp.isPlaying()){
                    mp.stop();
                    mp.reset();
                }else {
                    mp=MediaPlayer.create(getApplicationContext(),R.raw.animalsongs);
                }
                switch (randomInt){
                    case 1:
                        stopPlaying();
                        if (mp!=null&&mp.isPlaying()){
                            mp.stop();
                            mp.reset();
                        }else {
                            mp=MediaPlayer.create(getApplicationContext(),R.raw.animalsongs);
                        }
                        mp.start();
                        break;
                    case 2:
                        stopPlaying();
                        if (mp!=null&&mp.isPlaying()){
                            mp.stop();
                            mp.reset();
                        }else {
                            mp=MediaPlayer.create(getApplicationContext(),R.raw.boatrace);
                        }
                        mp.start();
                        break;
                    case 3:
                        stopPlaying();
                        if (mp!=null&&mp.isPlaying()){
                            mp.stop();
                            mp.reset();
                        }else {
                            mp=MediaPlayer.create(getApplicationContext(),R.raw.colurfulsongs);
                        }
                        mp.start();
                        break;
                    case 4:
                        stopPlaying();
                        if (mp!=null&&mp.isPlaying()){
                            mp.stop();
                            mp.reset();
                        }else {
                            mp=MediaPlayer.create(getApplicationContext(),R.raw.disney);
                        }
                        mp.start();
                        break;
                    case 5:
                        stopPlaying();
                        if (mp!=null&&mp.isPlaying()){
                            mp.stop();
                            mp.reset();
                        }else {
                            mp=MediaPlayer.create(getApplicationContext(),R.raw.fruitysongs);
                        }
                        mp.start();
                        break;
                    case 6:
                        stopPlaying();
                        if (mp!=null&&mp.isPlaying()){
                            mp.stop();
                            mp.reset();
                        }else {
                            mp=MediaPlayer.create(getApplicationContext(),R.raw.popularsongs);
                        }
                        mp.start();
                        break;
                    case 7:
                        stopPlaying();
                        if (mp!=null&&mp.isPlaying()){
                            mp.stop();
                            mp.reset();
                        }else {
                            mp=MediaPlayer.create(getApplicationContext(),R.raw.songaboutshapes);
                        }
                        mp.start();
                        break;
                }
            }
        });
        Levels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.release();
                mp=null;
            }
        });
    }
    private void intilizeMethods() {
        textView1=(TextView)findViewById(R.id.textView);
        textView2=(TextView)findViewById(R.id.textView2);
        textView3=(TextView)findViewById(R.id.textView3);
        textView4=(TextView)findViewById(R.id.textView4);
        textView5=(TextView)findViewById(R.id.textView5);
        textView6=(TextView)findViewById(R.id.textView6);
        textView7=(TextView)findViewById(R.id.textView7);
        textView8=(TextView)findViewById(R.id.textView8);
        textView9=(TextView)findViewById(R.id.textView9);
        newGame=(Button)findViewById(R.id.newgame);
        saveGame=(Button)findViewById(R.id.SaveGames);
        Levels=(Button)findViewById(R.id.Levels);
    }
    public  void onClick(View view){
        switch (view.getId()) {
            case R.id.textView:
                if (textView1.getText().toString().isEmpty()){
                    if (isUsed.equals(false)) {
                        textView1.setText("X");  counter++;
                        isUsed=true;
                        checkForWinner();
                    }
                    else {
                        textView1.setText("O");
                        isUsed=false;  counter++;
                        checkForWinner();
                    }

                }else if (textView1.getText().toString().equals("X")||textView1.getText().toString().equals("O")){
                    Toast.makeText(GameActivity.this,"Button clicked on is used already ",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.textView2:
                if (textView2.getText().toString().isEmpty()){
                    if (isUsed.equals(false)) {
                        textView2.setText("X");
                        isUsed=true;  counter++;
                        checkForWinner();
                    }
                    else {
                        textView2.setText("O");counter++;
                        isUsed=false;
                        checkForWinner();
                    }

                }else if (textView2.getText().toString().equals("X")||textView2.getText().toString().equals("O")) {
                    Toast.makeText(GameActivity.this,"Button clicked on is used already ",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.textView3:
                if (textView3.getText().toString().isEmpty()){
                    if (isUsed.equals(false)) {
                        textView3.setText("X");
                        isUsed=true;  counter++;
                        checkForWinner();
                    }
                    else {
                        textView3.setText("O");
                        isUsed=false;  counter++;
                        checkForWinner();
                    }

                }else if (textView3.getText().toString().equals("X")||textView3.getText().toString().equals("O")){
                    Toast.makeText(GameActivity.this,"Button clicked on is used already ",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.textView4:
                if (textView4.getText().toString().isEmpty()){
                    if (isUsed.equals(false)) {
                        textView4.setText("X");  counter++;
                        isUsed=true;
                        checkForWinner();
                    }
                    else {
                        textView4.setText("O");
                        isUsed=false; counter++;
                        checkForWinner();
                    }

                }else if (textView4.getText().toString().equals("X")||textView4.getText().toString().equals("O")){
                    Toast.makeText(GameActivity.this,"Button clicked on is used already ",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.textView5:
                if (textView5.getText().toString().isEmpty()){
                    if (isUsed.equals(false)) {
                        textView5.setText("X");
                        isUsed=true;  counter++;
                        checkForWinner();
                    }
                    else {
                        textView5.setText("O");
                        isUsed=false; counter++;
                        checkForWinner();
                    }

                }else if (textView5.getText().toString().equals("X")||textView5.getText().toString().equals("O")) {
                    Toast.makeText(GameActivity.this,"Button clicked on is used already ",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.textView6:
                if (textView6.getText().toString().isEmpty()){
                    if (isUsed.equals(false)) {  counter++;
                        textView6.setText("X");
                        isUsed=true;
                        checkForWinner();
                    }
                    else {
                        textView6.setText("O");
                        isUsed=false;  counter++;
                        checkForWinner();
                    }

                }else if (textView6.getText().toString().equals("X")||textView6.getText().toString().equals("O")){
                    Toast.makeText(GameActivity.this,"Button clicked on is used already ",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.textView7:
                if (textView7.getText().toString().isEmpty()){
                    if (isUsed.equals(false)) {
                        textView7.setText("X");  counter++;
                        isUsed=true;
                        checkForWinner();
                    }
                    else {
                        textView7.setText("O");
                        isUsed=false;  counter++;
                        checkForWinner();
                    }

                }else if (textView7.getText().toString().equals("X")||textView7.getText().toString().equals("O")){
                    Toast.makeText(GameActivity.this,"Button clicked on is used already ",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.textView8:
                if (textView8.getText().toString().isEmpty()){
                    if (isUsed.equals(false)) {
                        textView8.setText("X");
                        isUsed=true;  counter++;
                        checkForWinner();
                    }
                    else {
                        textView8.setText("O");
                        isUsed=false;  counter++;
                        checkForWinner();
                    }

                }else if (textView8.getText().toString().equals("X")||textView8.getText().toString().equals("O")){
                    Toast.makeText(GameActivity.this,"Button clicked on is used already ",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.textView9:
                if (textView9.getText().toString().isEmpty()){
                    if (isUsed.equals(false)) {
                        textView9.setText("X");
                        isUsed=true;counter++;
                        checkForWinner();
                    }
                    else {
                        textView9.setText("O");
                        isUsed=false;counter++;
                        checkForWinner();
                    }

                }else if (textView9.getText().toString().equals("X")||textView9.getText().toString().equals("O")){
                    Toast.makeText(GameActivity.this,"Button clicked on is used already ",Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    private void checkForWinner() {
        if (counter==9){
            Toast.makeText(GameActivity.this,"This game is a draw",Toast.LENGTH_SHORT).show();
            clear();
        }else {
            if (textView1.getText().toString().equals("X")&&textView4.getText().toString().equals("X")&&textView7.getText().toString().equals("X")){
                Toast.makeText(GameActivity.this,"PLAYER X WINS",Toast.LENGTH_SHORT).show();
                clear();
            }
            else  if (textView1.getText().toString().equals("O")&&textView4.getText().toString().equals("O")&&textView7.getText().toString().equals("O")){
                Toast.makeText(GameActivity.this,"PLAYER O WINS",Toast.LENGTH_SHORT).show();
                clear();
            }
            else if (textView3.getText().toString().equals("X")&&textView5.getText().toString().equals("X")&&textView7.getText().toString().equals("X")){
                Toast.makeText(GameActivity.this,"PLAYER X WINS",Toast.LENGTH_SHORT).show();
                clear();
            }
            else if (textView3.getText().toString().equals("O")&&textView5.getText().toString().equals("O")&&textView7.getText().toString().equals("O")){
                Toast.makeText(GameActivity.this,"PLAYER O WINS",Toast.LENGTH_SHORT).show();
                clear();
            }
            else if (textView3.getText().toString().equals("X")&&textView6.getText().toString().equals("X")&&textView9.getText().toString().equals("X")){
                Toast.makeText(GameActivity.this,"PLAYER X WINS",Toast.LENGTH_SHORT).show();
                clear();
            }
            else if (textView3.getText().toString().equals("O")&&textView6.getText().toString().equals("O")&&textView9.getText().toString().equals("O")){
                Toast.makeText(GameActivity.this,"PLAYER O WINS",Toast.LENGTH_SHORT).show();
                clear();
            }
            else if (textView2.getText().toString().equals("X")&&textView5.getText().toString().equals("X")&&textView8.getText().toString().equals("X")){
                Toast.makeText(GameActivity.this,"PLAYER X WINS",Toast.LENGTH_SHORT).show();
                clear();
            }
            else if (textView2.getText().toString().equals("O")&&textView5.getText().toString().equals("O")&&textView8.getText().toString().equals("O")){
                Toast.makeText(GameActivity.this,"PLAYER O WINS",Toast.LENGTH_SHORT).show();
                clear();
            }
            else if (textView1.getText().toString().equals("X")&&textView2.getText().toString().equals("X")&&textView3.getText().toString().equals("X")){
                Toast.makeText(GameActivity.this,"PLAYER X WINS",Toast.LENGTH_SHORT).show();
                clear();
            }
            else if (textView1.getText().toString().equals("O")&&textView2.getText().toString().equals("O")&&textView3.getText().toString().equals("O")){
                Toast.makeText(GameActivity.this,"PLAYER O WINS",Toast.LENGTH_SHORT).show();
                clear();
            }
            else if (textView6.getText().toString().equals("X")&&textView5.getText().toString().equals("X")&&textView4.getText().toString().equals("X")){
                Toast.makeText(GameActivity.this,"PLAYER X WINS",Toast.LENGTH_SHORT).show();
                clear();
            }
            else if (textView6.getText().toString().equals("X")&&textView5.getText().toString().equals("O")&&textView4.getText().toString().equals("O")){
                Toast.makeText(GameActivity.this,"PLAYER O WINS",Toast.LENGTH_SHORT).show();
                clear();
            }
            else if (textView9.getText().toString().equals("X")&&textView8.getText().toString().equals("X")&&textView7.getText().toString().equals("X")){
                Toast.makeText(GameActivity.this,"PLAYER X WINS",Toast.LENGTH_SHORT).show();
                clear();
            }
            else if (textView9.getText().toString().equals("O")&&textView8.getText().toString().equals("O")&&textView7.getText().toString().equals("O")){
                Toast.makeText(GameActivity.this,"PLAYER O WINS",Toast.LENGTH_SHORT).show();
                clear();
            }
            else if (textView1.getText().toString().equals("X")&&textView5.getText().toString().equals("X")&&textView9.getText().toString().equals("X")){
                Toast.makeText(GameActivity.this,"PLAYER X WINS",Toast.LENGTH_SHORT).show();
                clear();
            }
            else if (textView1.getText().toString().equals("O")&&textView5.getText().toString().equals("O")&&textView9.getText().toString().equals("O")){
                Toast.makeText(GameActivity.this,"PLAYER O WINS",Toast.LENGTH_SHORT).show();
                clear();
            }}
    }
    private void clear(){
        textView1.setText("");
        textView2.setText("");
        textView3.setText("");
        textView4.setText("");
        textView5.setText("");
        textView6.setText("");
        textView7.setText("");
        textView8.setText("");
        textView9.setText("");
        isUsed=false;
        counter=0;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("roundCount",counter);
        outState.putBoolean("player1Turn", isUsed);
        outState.putString("text1",textView1.getText().toString());
        outState.putString("text2",textView2.getText().toString());
        outState.putString("text3",textView3.getText().toString());
        outState.putString("text4",textView4.getText().toString());
        outState.putString("text5",textView5.getText().toString());
        outState.putString("text6",textView6.getText().toString());
        outState.putString("text7",textView7.getText().toString());
        outState.putString("text8",textView8.getText().toString());
        outState.putString("text9",textView9.getText().toString());

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        counter = savedInstanceState.getInt("roundCount");
        isUsed = savedInstanceState.getBoolean("player1Turn");
        textView1.setText(savedInstanceState.getString("text1"));
        textView2.setText(savedInstanceState.getString("text2"));
        textView3.setText(savedInstanceState.getString("text3"));
        textView4.setText(savedInstanceState.getString("text4"));
        textView5.setText(savedInstanceState.getString("text5"));
        textView6.setText(savedInstanceState.getString("text6"));
        textView7.setText(savedInstanceState.getString("text7"));
        textView8.setText(savedInstanceState.getString("text8"));
        textView9.setText(savedInstanceState.getString("text9"));
    }
    private void stopPlaying() {
        mp.release();
        mp=null;
    }
}