package im.ankit.moviesearch;

import android.net.Uri;
import android.util.Log;

import java.io.IOException;
import java.util.Collections;

import retrofit.client.Client;
import retrofit.client.Request;
import retrofit.client.Response;
import retrofit.mime.TypedByteArray;

/**
 * Created by aciid on 05/11/14.
 */
public class MockClient implements Client {
    @Override
    public Response execute(Request request) throws IOException {
        Uri uri = Uri.parse(request.getUrl());

        Log.d("MOCK SERVER", "fetching uri: " + uri.getPath().toString());

        String responseString = "";

        if(uri.getQueryParameter("q").equals("iron man")) {
            responseString = "{\"total\":1,\"movies\":[{\"id\":\"770800493\",\"title\":\"Iron Man 2\",\"year\":2010,\"mpaa_rating\":\"PG-13\",\"runtime\":124,\"critics_consensus\":\"\",\"release_dates\":{\"theater\":\"2010-05-07\",\"dvd\":\"2010-09-28\"},\"ratings\":{\"critics_rating\":\"Certified Fresh\",\"critics_score\":73,\"audience_rating\":\"Upright\",\"audience_score\":73},\"synopsis\":\"Robert Downey Jr. returns as Tony Stark, the wealthy playboy whose exploits as Iron Man are now public knowledge after his admission at the close of the first film. In the follow-up, Stark is pitted against his Russian arch nemesis, Whiplash (Mickey Rourke), and corporate rival Justin Hammer (Sam Rockwell). Also making their Marvel debuts are Scarlett Johansson as the sexy Russian spy Black Widow, and Don Cheadle, who takes over the role of Colonel James Rhodes from Terrence Howard.\",\"posters\":{\"thumbnail\":\"http://content7.flixster.com/movie/11/12/20/11122085_tmb.jpg\",\"profile\":\"http://content7.flixster.com/movie/11/12/20/11122085_tmb.jpg\",\"detailed\":\"http://content7.flixster.com/movie/11/12/20/11122085_tmb.jpg\",\"original\":\"http://content7.flixster.com/movie/11/12/20/11122085_tmb.jpg\"},\"abridged_cast\":[{\"name\":\"Robert Downey Jr.\",\"id\":\"162654529\",\"characters\":[\"Tony Stark\"]},{\"name\":\"Gwyneth Paltrow\",\"id\":\"162653966\",\"characters\":[\"Virginia 'Pepper' Potts\"]},{\"name\":\"Don Cheadle\",\"id\":\"162652206\",\"characters\":[\"Colonel James 'Rhodey' Rhodes\"]},{\"name\":\"Mickey Rourke\",\"id\":\"162652508\",\"characters\":[\"Ivan Vanko/Whiplash\"]},{\"name\":\"Sam Rockwell\",\"id\":\"162652298\",\"characters\":[\"Justin Hammer\"]}],\"alternate_ids\":{\"imdb\":\"1228705\"},\"links\":{\"self\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/770800493.json\",\"alternate\":\"http://www.rottentomatoes.com/m/iron_man_2/\",\"cast\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/770800493/cast.json\",\"reviews\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/770800493/reviews.json\",\"similar\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/770800493/similar.json\"}}],\"links\":{\"self\":\"http://api.rottentomatoes.com/api/public/v1.0/movies.json?q=Iron+Man+2&page_limit=1&page=1\"},\"link_template\":\"http://api.rottentomatoes.com/api/public/v1.0/movies.json?q={search-term}&page_limit={results-per-page}&page={page-number}\"}";
        } else {
            responseString = "OTHER JSON RESPONSE STRING";
        }

        return new Response(request.getUrl(), 200, "nothing", Collections.EMPTY_LIST, new TypedByteArray("application/json", responseString.getBytes()));
    }
}
