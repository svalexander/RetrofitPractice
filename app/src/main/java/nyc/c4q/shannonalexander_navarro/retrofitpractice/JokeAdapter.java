package nyc.c4q.shannonalexander_navarro.retrofitpractice;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.shannonalexander_navarro.retrofitpractice.models.Joke;

/**
 * Created by shannonalexander-navarro on 12/9/16.
 */

public class JokeAdapter extends RecyclerView.Adapter {

    private List<Joke> randomJokes = new ArrayList<>();
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return randomJokes.size();
    }
}
