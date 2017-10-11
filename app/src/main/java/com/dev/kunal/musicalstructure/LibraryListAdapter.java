package com.dev.kunal.musicalstructure;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Kunal on 10/12/2017.
 */

public class LibraryListAdapter extends RecyclerView.Adapter<LibraryListAdapter.ViewHolder>{

    private Song songs[];

    LibraryListAdapter(Song[] songs){
        this.songs = songs;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.library_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.title.setText(songs[position].name);
        holder.artist.setText(songs[position].artist);

        final Context context = holder.mView.getContext();
        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, NowPlayingActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        if(songs != null)
            return songs.length;
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        View mView;
        TextView title;
        TextView artist;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            title = view.findViewById(R.id.title);
            artist = view.findViewById(R.id.artist);
        }
    }
}
