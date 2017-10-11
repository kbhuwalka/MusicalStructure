package com.dev.kunal.musicalstructure;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_main, container, false);

        Song[] songs = {
                new Song(getString(R.string.come_on_eileen), getString(R.string.dexys)),
                new Song(getString(R.string.stacys_mom), getString(R.string.fountains)),
                new Song(getString(R.string.anyway_you_want_it), getString(R.string.journey)),
                new Song(getString(R.string.cosmic_angel), getString(R.string.grizfolk)),
                new Song(getString(R.string.five_years_time), getString(R.string.noah)),
                new Song(getString(R.string.georgia), getString(R.string.vance_joy))
        };


        if(rootView instanceof RecyclerView){
            RecyclerView recyclerView = (RecyclerView) rootView;
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            recyclerView.setAdapter(new LibraryListAdapter(songs));
        }

        return rootView;
    }
}
