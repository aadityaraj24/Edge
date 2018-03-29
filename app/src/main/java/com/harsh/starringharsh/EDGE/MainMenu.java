package com.harsh.starringharsh.EDGE;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Button events = (Button) findViewById(R.id.bEvents);
        Button megaevents = (Button) findViewById(R.id.bMegaEvents);
        Button funevents = (Button) findViewById(R.id.bFunEvents);
        Button sponsors = (Button) findViewById(R.id.bSponsors);
        Button team = (Button) findViewById(R.id.bTeam);
        Button aboutus = (Button) findViewById(R.id.bAboutUs);

        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, MainActivity.class);
                startActivity(intent);
            }
        });

        sponsors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, Sponsors.class);
                startActivity(intent);
            }
        });

        team.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, Team.class);
                startActivity(intent);
            }
        });


    }
}
