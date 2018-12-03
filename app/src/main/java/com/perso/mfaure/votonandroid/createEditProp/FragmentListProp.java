package com.perso.mfaure.votonandroid.createEditProp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.perso.mfaure.votonandroid.R;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class FragmentListProp extends AppCompatActivity  {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerAdapterProp adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_list_prop_vote);

       // setSupportActionBar(myToolbar);

        final FloatingActionButton button = (FloatingActionButton) findViewById(R.id.buttonPlusCard);


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new RecyclerAdapterProp();
        recyclerView.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                adapter.addElement();
                recyclerView.scrollToPosition(adapter.titles.size() - 1);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_done, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_menu_done:
                Intent intent = new Intent(this, FragmentMentions.class);
                intent.putExtra(EXTRA_MESSAGE, "Valeur recuperable de l'autre cote");
                startActivity(intent);                break;

        }
        return super.onOptionsItemSelected(item);
    }
}