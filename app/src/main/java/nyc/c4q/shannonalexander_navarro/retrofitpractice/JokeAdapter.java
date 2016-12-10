package nyc.c4q.shannonalexander_navarro.retrofitpractice;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.shannonalexander_navarro.retrofitpractice.models.Joke;

/**
 * Created by shannonalexander-navarro on 12/9/16.
 */

public class JokeAdapter extends RecyclerView.Adapter {

    private List<Joke> randomJokes = new ArrayList<>();

    public JokeAdapter(List<Joke> randomJokes) {
        this.randomJokes = randomJokes;
    }

    public JokeAdapter() {

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.joke_holder, parent, false);
        return new JokeViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        JokeViewHolder viewHolder = (JokeViewHolder) holder;

        Joke aJoke = randomJokes.get(position);
        viewHolder.bind(aJoke);
    }

    @Override
    public int getItemCount() {
        return randomJokes.size();
    }
}
