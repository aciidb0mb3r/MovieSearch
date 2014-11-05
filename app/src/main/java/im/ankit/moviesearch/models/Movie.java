package im.ankit.moviesearch.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aciid on 05/11/14.
 */


public class Movie {
    public String title;
    public String year;
    @SerializedName("mpaa_rating")
    public String mpaaRating;
    public int runtime;
    @SerializedName("release_dates")
    public ReleaseDates releaseDates;
    public String synopsis;
    public Posters posters;
    @SerializedName("abridged_cast")
    public List<Cast> cast = new ArrayList<Cast>();
    public Ratings ratings;
}