package nyc.c4q.shannonalexander_navarro.retrofitpractice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.shannonalexander_navarro.retrofitpractice.models.Joke;
import nyc.c4q.shannonalexander_navarro.retrofitpractice.network.JokeService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by shannonalexander-navarro on 12/9/16.
 */

public class JokeFragment extends Fragment {

    TextView jokeView;
    RecyclerView jokeRV;
    JokeAdapter jokeAdapter;
    List<Joke> randomJoke = new ArrayList<>();
    private static final String CHUCK_URL = "https://api.chucknorris.io/";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.joke_fragment, container, false);

        jokeView = (TextView) root.findViewById(R.id.jokeTV);
        jokeRV = (RecyclerView) root.findViewById((R.id.rv));
        jokeRV.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));


        fetchJoke();
        return root;
    }

    private void fetchJoke() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(CHUCK_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JokeService service = retrofit.create(JokeService.class);

        Call<Joke> call = service.getRandomJoke();

        call.enqueue(new Callback<Joke>() { //needs to be enqueue so the call is asynchronous and will not block the main thread
            @Override
            public void onResponse(Call<Joke> call, Response<Joke> response) {

                Joke joke = response.body();
                randomJoke.add(joke);
                jokeAdapter = new JokeAdapter(randomJoke);
                jokeRV.setAdapter(jokeAdapter);

            }

            @Override
            public void onFailure(Call<Joke> call, Throwable t) {
                Log.e("Failure", "failed");
            }
        });

    }

}
