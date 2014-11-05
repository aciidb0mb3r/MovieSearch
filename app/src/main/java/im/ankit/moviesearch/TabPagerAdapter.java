package im.ankit.moviesearch;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by aciid on 05/11/14.
 */

public class TabPagerAdapter extends FragmentStatePagerAdapter {
    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                //Fragement for BasicDetailsFragment Tab
                return new BasicDetailsFragment();
            case 1:
                //Fragment for ActorListFragment Tab
                return new ActorListFragment();
        }
        return null;
    }
    @Override
    public int getCount() {
        return 2; //No of Tabs
    }
}
