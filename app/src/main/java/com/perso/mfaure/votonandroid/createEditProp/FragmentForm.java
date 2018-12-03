package com.perso.mfaure.votonandroid.createEditProp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.perso.mfaure.votonandroid.R;
import com.perso.mfaure.votonandroid.structure.Vote;

import java.util.List;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class FragmentForm extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_create_edit_vote);

        Button b = (Button) findViewById(R.id.button_FormCreateEditVote1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMessage(view, FragmentListProp.class);
            }
        });

    }


    public void sendMessage(View view, Class classe) {
        Intent intent = new Intent(this, classe);
        intent.putExtra(EXTRA_MESSAGE, "Valeur recuperable de l'autre cote");
        startActivity(intent);
        //this.finish();

    }




}
