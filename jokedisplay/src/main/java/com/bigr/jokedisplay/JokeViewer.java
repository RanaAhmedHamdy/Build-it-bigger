package com.bigr.jokedisplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeViewer extends AppCompatActivity {

    private String joke;
    private TextView jokeTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_viewer);

        jokeTv = (TextView) findViewById(R.id.joke_viewer_tv);
        joke = getIntent().getExtras().getString("joke");

        jokeTv.setText(joke);
    }
}
