package com.example.cuuk.zappy;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    List<String> data;
    Context contex;

    public class ViewHolder extends RecyclerView.ViewHolder {

        Button data;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            data = itemView.findViewById(R.id.button);

        }
    }

    public RecyclerAdapter(List<String> data, Context context){

        this.data = data;
        this.contex = context;

    }

    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.button_lsyout, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerAdapter.ViewHolder viewHolder, int i) {

        viewHolder.data.setText(data.get(i));

        viewHolder.data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(contex, R.raw.cacat);
                mp.start();
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
