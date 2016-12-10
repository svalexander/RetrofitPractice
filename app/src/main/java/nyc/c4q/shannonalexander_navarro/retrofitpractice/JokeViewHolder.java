package nyc.c4q.shannonalexander_navarro.retrofitpractice;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nyc.c4q.shannonalexander_navarro.retrofitpractice.models.Joke;

/**
 * Created by shannonalexander-navarro on 12/9/16.
 */

public class JokeViewHolder extends RecyclerView.ViewHolder {

    private TextView randomJokeUrl;
    private TextView randomJokeTV;
    public static final String TAG = "Joke";

    public JokeViewHolder(View itemView) {
        super(itemView);

        randomJokeUrl = (TextView) itemView.findViewById(R.id.urlTV);
        randomJokeTV = (TextView) itemView.findViewById(R.id.jokeTV);
    }

    public void bind(final Joke joke) {
        randomJokeUrl.setText(joke.getUrl());
        randomJokeTV.setText(joke.getValue());

        final Context context = randomJokeTV.getContext();
        itemView.setOnClickListener(new View.OnClickListener() { //onClick must be in the bind method in order to bind the data and be able to send it to another activity
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, JokeActivity.class);
                intent.putExtra(TAG, joke);
                context.startActivity(intent);
            }
        });
    }


}
