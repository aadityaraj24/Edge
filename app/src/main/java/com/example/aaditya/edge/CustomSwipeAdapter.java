package com.example.aaditya.edge;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * Created by Aaditya on 30-12-2016.
 */

public class CustomSwipeAdapter extends PagerAdapter {

  private int[] image_resources={R.drawable.pic1,R.drawable.background,R.drawable.poster1};
 private Context ctx;
    private LayoutInflater layoutInflater;
    public CustomSwipeAdapter(Context c)
    {
        ctx=c;
    }

  @Override
    public int getCount() {
        return image_resources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
    return (view==object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater=(LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView=layoutInflater.inflate(R.layout.activity_fun_events,container,false);
        ImageView imageView=(ImageView)itemView.findViewById(R.id.swip_image_view);
       imageView.setImageResource(image_resources[position]);
        container.addView(itemView);
        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
       //container.removeView((LinearLayout)object);
    }
}
