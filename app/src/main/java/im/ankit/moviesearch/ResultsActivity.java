package im.ankit.moviesearch;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.Log;

import im.ankit.moviesearch.models.Movie;
import im.ankit.moviesearch.models.Movies;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class ResultsActivity extends FragmentActivity{
    ViewPager Tab;
    TabPagerAdapter TabAdapter;
    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        TabAdapter = new TabPagerAdapter(getSupportFragmentManager());
        Tab = (ViewPager)findViewById(R.id.pager);
        Tab.setOnPageChangeListener(
                new ViewPager.SimpleOnPageChangeListener() {
                    @Override
                    public void onPageSelected(int position) {
                        actionBar = getActionBar();
                        actionBar.setSelectedNavigationItem(position);                    }
                });
        Tab.setAdapter(TabAdapter);
        actionBar = getActionBar();
        //Enable Tabs on Action Bar
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        ActionBar.TabListener tabListener = new ActionBar.TabListener(){
            @Override
            public void onTabReselected(android.app.ActionBar.Tab tab,
                                        FragmentTransaction ft) {
                // TODO Auto-generated method stub
            }
            @Override
            public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
                Tab.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(android.app.ActionBar.Tab tab,
                                        FragmentTransaction ft) {
                // TODO Auto-generated method stub
            }};
        //Add New Tab
        actionBar.addTab(actionBar.newTab().setText("Details").setTabListener(tabListener));
        actionBar.addTab(actionBar.newTab().setText("Actors").setTabListener(tabListener));


        RestClient client = new RestClient();

        Callback callback = new Callback() {
            @Override
            public void success(Object o, Response response) {
                 Movies m = (Movies)o;
                 Movie movie = m.movies.get(0);

                 Log.d("PIKA", movie.cast.get(0).name + " " + movie.posters.thumbnail + " " + movie.title + " ok");
            }

            @Override
            public void failure(RetrofitError retrofitError) {
                Log.d("PIKA","fail" + retrofitError.getMessage());
            }
        };

        client.getApiService().getMovieContent("iron man",callback);
    }

}
