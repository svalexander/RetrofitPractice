package nyc.c4q.shannonalexander_navarro.retrofitpractice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
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

public class JokeFragment extends Fragment {

    RecyclerView jokeRV;
    JokeAdapter jokeAdapter;
    List<Joke> randomJoke = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.joke_fragment, container, false);

        return root;
    }

}
