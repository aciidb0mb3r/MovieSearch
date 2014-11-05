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

public class BasicDetailsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View android = inflater.inflate(R.layout.fragment_basicdetails, container, false);
        ((TextView)android.findViewById(R.id.textView)).setText("BasicDetailsFragment");
        return android;
    }
}
