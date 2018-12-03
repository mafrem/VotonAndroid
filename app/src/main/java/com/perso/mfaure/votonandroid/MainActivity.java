package com.perso.mfaure.votonandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.perso.mfaure.votonandroid.createEditProp.FragmentForm;
import com.perso.mfaure.votonandroid.structure.Proposition;
import com.perso.mfaure.votonandroid.structure.Vote;

import java.util.ArrayList;
import java.util.List;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Vote> laListe = populate();

        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMessage(view, FragmentForm.class);
            }
        });

    }

    public ArrayList<Vote> populate(){
        Proposition p1 = new Proposition("La prop1", "Introduction", "Details", new ArrayList<Integer>());
        Proposition p2 = new Proposition("La prop2", "Introduction", "Details", new ArrayList<Integer>());
        Proposition p3 = new Proposition("La prop3", "Introduction", "Details", new ArrayList<Integer>());
        Proposition p4 = new Proposition("La prop4", "Introduction", "Details", new ArrayList<Integer>());

        List<Proposition> lesPropositions1 = new ArrayList<Proposition>();
        lesPropositions1.add(p1);
        lesPropositions1.add(p2);
        lesPropositions1.add(p3);
        lesPropositions1.add(p4);
        List<Proposition> lesPropositions2 = new ArrayList<Proposition>();
        lesPropositions1.add(p1);
        lesPropositions1.add(p3);

        Vote vote1 = new Vote(lesPropositions1, "", "Vote1", "resumé du vote",new ArrayList<String>());
        Vote vote2 = new Vote(lesPropositions2, "", "Vote2", "resumé du vote 2",new ArrayList<String>());


        List<Vote> laListe = new ArrayList<Vote>();
        laListe.add(vote1);
        laListe.add(vote2);
        return (ArrayList<Vote>)laListe;


    }


    public void sendMessage(View view, Class classe) {
        Intent intent = new Intent(this, classe);
        intent.putExtra(EXTRA_MESSAGE, "Valeur recuperable de l'autre cote");
        startActivity(intent);
        //this.finish();

    }


}
