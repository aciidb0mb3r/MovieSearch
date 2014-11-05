package im.ankit.moviesearch;

import im.ankit.moviesearch.models.Movie;
import im.ankit.moviesearch.models.Movies;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by aciid on 05/11/14.
 */
public interface ApiService {

    @GET("/api/public/v1.0/movies.json?apikey=57xm7dztbrnz6wzzjbq3p883&page_limit=1")
    public void getMovieContent(@Query("q") String searchTerm, Callback<Movies> callback);
}

