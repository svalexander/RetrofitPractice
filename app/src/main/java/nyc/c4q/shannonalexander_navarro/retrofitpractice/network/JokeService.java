package nyc.c4q.shannonalexander_navarro.retrofitpractice.network;

import nyc.c4q.shannonalexander_navarro.retrofitpractice.models.Joke;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by shannonalexander-navarro on 12/9/16.
 */

public interface JokeService {
    @GET("jokes/random")
    Call<Joke> getRandomJoke();

}
