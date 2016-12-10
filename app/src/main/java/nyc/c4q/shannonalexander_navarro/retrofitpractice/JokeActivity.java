package nyc.c4q.shannonalexander_navarro.retrofitpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import nyc.c4q.shannonalexander_navarro.retrofitpractice.models.Joke;

public class JokeActivity extends AppCompatActivity {

    TextView largeJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        largeJoke = (TextView) findViewById(R.id.largeJokeTV);
        Intent intent = getIntent();
        Joke joke = (Joke) intent.getSerializableExtra(JokeViewHolder.TAG);
        largeJoke.setText(joke.getValue());
    }
}
