package hu.intellicode.displayjokelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        TextView jokeTextView = findViewById(R.id.tv_joke_display);

        Intent intent = getIntent();
        String joke = intent.getStringExtra("joke");
        jokeTextView.setText(joke);
    }
}
