package im.ankit.moviesearch;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by aciid on 05/11/14.
 */

public class ActorListFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View ios = inflater.inflate(R.layout.fragment_actors, container, false);
        ((TextView)ios.findViewById(R.id.textView)).setText("ActorListFragment");
        return ios;
    }
}
