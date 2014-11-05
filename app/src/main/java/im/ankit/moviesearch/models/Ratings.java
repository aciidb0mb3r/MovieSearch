package im.ankit.moviesearch.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by aciid on 05/11/14.
 */
public class Ratings {
    @SerializedName("critics_rating")
    public String criticsRating;
    @SerializedName("critics_score")
    public Integer criticsScore;
    @SerializedName("audience_rating")
    public String audienceRating;
    @SerializedName("audience_score")
    public Integer audienceScore;
}
