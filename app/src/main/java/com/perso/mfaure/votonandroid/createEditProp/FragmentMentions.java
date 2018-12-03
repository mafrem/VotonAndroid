package com.perso.mfaure.votonandroid.createEditProp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.perso.mfaure.votonandroid.R;

public class FragmentMentions extends Activity {


    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerAdapterMention adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_mentions);

        LinearLayout mention = (LinearLayout)findViewById(R.id.layoutMention);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new RecyclerAdapterMention();
        recyclerView.setAdapter(adapter);
    }
}