package ru.startandroid.likeanddislike;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    TextView textLike;
    TextView textDislike;

    int numLike, numDislike;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textLike = (TextView)findViewById(R.id.textLike);
        textDislike = (TextView)findViewById(R.id.textDislike);

        numLike = 0;
        numDislike = 0;
    }
    public void onClickLike(View v){
        Toast.makeText(this, R.string.like, Toast.LENGTH_SHORT).show();
        numLike = numLike + 1;
        textLike.setText(Integer.toString(numLike));
    }
    public void onClickDislike(View v){
        Toast.makeText(this, R.string.dislike, Toast.LENGTH_SHORT).show();
        numDislike = numDislike + 1;
        textDislike.setText(Integer.toString(numDislike));
    }
}
