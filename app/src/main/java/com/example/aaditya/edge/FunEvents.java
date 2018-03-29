package com.example.aaditya.edge;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class FunEvents extends Activity {

    //Activity context;
   // AnimatorSet set;
   // ImageView imgView;
   // int imgResources[]={R.drawable.pic1, R.drawable.background};
   // int index=0;
   // ImageButton arrowleft;
   // ImageButton arrowright;
ViewPager viewPager;
    CustomSwipeAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpager);
        viewPager=(ViewPager)findViewById(R.id.viewPager);
        adapter=new CustomSwipeAdapter(this);
        viewPager.setAdapter(adapter);
        /*arrowleft=(ImageButton)findViewById(R.id.arrowleft);
        imgView=(ImageView)findViewById(R.id.slide_1);
        set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.animator.slide_show);
        set.setTarget(imgView);

        set.addListener(new AnimatorListenerAdapter(){
            public void onAnimationEnd(Animator animator){
                //repeat animation
                arrowleft.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {

                        index++;
                        imgView.setImageResource(imgResources[index]);
                    }
                });
                if(index<imgResources.length)
                {
                    imgView.setImageResource(imgResources[index]);
                    index++;
                    set.start();
                }
                else
                {
                    index=0;

                    set.start();
                }

            }


        });
        set.start();*/

    }




}