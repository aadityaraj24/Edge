package com.harsh.starringharsh.EDGE;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class TeamMember extends Activity {

    Button call, whatsapp;
    TextView nameM, postM;
    ImageView iv;
    Master master;
    String name, post;
    long num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_team_member);
        master = new Master();
        iv = (ImageView) findViewById((R.id.ivTeamMember));
        call = (Button) findViewById(R.id.bTeamCall);
        whatsapp = (Button) findViewById(R.id.bTeamWA);
        nameM = (TextView) findViewById(R.id.tvMemberName);
        postM = (TextView) findViewById(R.id.tvMemberPost);
        Intent intent = getIntent();
        if(intent != null)
        {
            name = intent.getStringExtra("name");
        }
        num = master.teamNum.get(name);
        post = master.teamPost.get(name);
        nameM.setText(name);
        postM.setText(post);
        iv.setImageResource(master.teamImg.get(name));


    }

    public void closeDialogue(View view) {
        finish();
    }
}
