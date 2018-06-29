package hu.intellicode.displayjokelibrary;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    static private String EXTRA_JOKE = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        TextView jokeTextView = findViewById(R.id.tv_joke_display);

        Intent intent = getIntent();
        String joke = intent.getStringExtra("joke");
        jokeTextView.setText(joke);
    }

    //Intent creating method placed into the lib itself, so EndpointsAsynctask.java can call it
    //without knowing the key --> special thanks for this advice to my reviewer :)
    public static Intent newIntent(Context context, String joke) {
        Intent intent = new Intent(context, DisplayJokeActivity.class);
        intent.putExtra(EXTRA_JOKE, joke);
        return intent;
    }
}
