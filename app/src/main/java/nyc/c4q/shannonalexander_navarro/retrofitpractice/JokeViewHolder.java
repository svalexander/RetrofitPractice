package nyc.c4q.shannonalexander_navarro.retrofitpractice;

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

    public JokeViewHolder(View itemView) {
        super(itemView);

        randomJokeUrl = (TextView) itemView.findViewById(R.id.urlTV);
        randomJokeTV = (TextView) itemView.findViewById(R.id.jokeTV);
    }

    public void bind(final Joke joke) {
        randomJokeUrl.setText(joke.getUrl());
        randomJokeTV.setText(joke.getValue());
    }


}
