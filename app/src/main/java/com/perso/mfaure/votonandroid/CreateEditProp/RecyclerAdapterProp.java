package com.perso.mfaure.votonandroid.CreateEditProp;

import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.perso.mfaure.votonandroid.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class RecyclerAdapterProp extends RecyclerView.Adapter<RecyclerAdapterProp.ViewHolder> {

    public ArrayList titles = new ArrayList<String>(Arrays.asList(
            "Chapter One",
            "Chapter Two",
            "Chapter Three",
            "Chapter Four",
            "Chapter Five",
            "Chapter Six",
            "Chapter Seven",
            "Chapter Eight"
    ));

    public List<String> details = new ArrayList<>(Arrays.asList(
            "Item one details",
            "Item two details", "Item three details",
            "Item four details", "Item file details",
            "Item six details", "Item seven details",
            "Item eight details"

    ));


    public void addElement (){
        titles.add("Nouvel element");
        details.add("Details");
       // images.add(R.drawable.card_image);
        this.notifyItemInserted(getItemCount() - 1);
        }

    class ViewHolder extends RecyclerView.ViewHolder{

        public TextView itemTitle;
        public TextView itemDetail;

        public ViewHolder(View itemView) {
            super(itemView);
            itemTitle = (TextView)itemView.findViewById(R.id.item_title);
            itemDetail = (TextView)itemView.findViewById(R.id.item_detail);

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
                .inflate(R.layout.form_list_prop_vote_card, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.itemTitle.setText((String)titles.get(i));
        viewHolder.itemDetail.setText((String)details.get(i));
    }

    @Override
    public int getItemCount() {
        return titles.size();
    }
}