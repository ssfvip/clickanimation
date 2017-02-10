package com.example.ssf.clickanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MyImageView joke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        joke = (MyImageView) findViewById(R.id.c_joke);
        joke.setOnClickIntent(new MyImageView.OnViewClickListener() {
            @Override
            public void onViewClick(MyImageView view) {
                Toast.makeText(MainActivity.this, "you click joke", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
