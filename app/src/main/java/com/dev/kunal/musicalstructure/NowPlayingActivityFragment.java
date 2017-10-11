package com.dev.kunal.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * A placeholder fragment containing a simple view.
 */
public class NowPlayingActivityFragment extends Fragment {
    boolean isPlaying = false;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_now_playing, container, false);

        Button libraryButton = rootView.findViewById(R.id.libraryButton);
        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), MainActivity.class));
            }
        });

        final ImageButton playButton = rootView.findViewById(R.id.playButton);

        playButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                isPlaying = !isPlaying;
                if(isPlaying)
                    playButton.setImageResource(R.drawable.ic_pause_black_24dp);
                 else
                    playButton.setImageResource(R.drawable.ic_play_arrow_black_24dp);

            }
        });

        return rootView;
    }
}
