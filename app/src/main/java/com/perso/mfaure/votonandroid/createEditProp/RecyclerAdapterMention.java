package com.perso.mfaure.votonandroid.createEditProp;

import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;

import com.perso.mfaure.votonandroid.R;

import java.util.ArrayList;
import java.util.Arrays;


public class RecyclerAdapterMention extends RecyclerView.Adapter<RecyclerAdapterMention.ViewHolder> {

    public ArrayList titles = new ArrayList<String>(Arrays.asList(
            "Chapter One",
            "Chapter Two",
            "Chapter Three",
            "Chapter Four",
            "Chapter Five",
            "Chapter Six",
            "Chapter Seven"
    ));




    class ViewHolder extends RecyclerView.ViewHolder{

        public RadioButton itemRadio;
        public Button itemColor;

        public ViewHolder(View itemView) {
            super(itemView);
            itemRadio = (RadioButton)itemView.findViewById(R.id.radioButtonMention);
            itemColor = (Button) itemView.findViewById(R.id.circleColorMention);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    int position = getAdapterPosition();

                    Snackbar.make(v, "Click detected on item " + position,
                            Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();



                }
            });
        }
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.form_mentions_mention, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.itemRadio.setText((String)titles.get(i));
        viewHolder.itemColor.setBackgroundDrawable(viewHolder.itemView.getResources().getDrawable(viewHolder.itemView.getResources().getIdentifier("circle_shape_"+(i+1),"drawable","com.perso.mfaure.votonandroid")));

    }

    @Override
    public int getItemCount() {
        return titles.size();
    }
}