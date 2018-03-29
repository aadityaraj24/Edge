package com.harsh.starringharsh.EDGE;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;

public class Sponsors extends AppCompatActivity {

    ScrollView sv;
    Master master;
    String names[], linkadd, imglink[], type[];
    int l, p=0, i;
    LinearLayout ll;
    ProgressDialog progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponsors);

        master = new Master();
        linkadd = master.sponsorslink;
        //0B9ir1SJLpxDEUHktS1d1Y240a1U

        new BackFetch().execute();
        /*new Thread(new Sponsors.Task()).start();
        while(p==0)
        {

        }

        l = names.length;
        ll = (LinearLayout) findViewById(R.id.llSponsors);
        TextView tv[] = new TextView[l];
        for(i=0; i<l; i++)
        {
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);
            tv[i] = new TextView(this);
            tv[i].setText(names[i]);
            tv[i].setId(i);
            final int id_ = tv[i].getId();
            ll.addView(tv[i], params);
        }*/

    }

    /*class Task implements Runnable
    {

        @Override
        public void run() {
            try {
                URL url = new URL(linkadd);
                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
                String str;
                i=0;
                names = new String[20];
                while ((str = br.readLine()) != null) {
                    names[i++] = str;
                }
                br.close();
                p=1;
            } catch (Exception e) {
                System.out.println("Failed");
                names = master.sponsors;
                p=1;
                e.printStackTrace();
            }
        }
    }*/

    class BackFetch extends AsyncTask<Void, Void, Void>
    {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progress.setIndeterminate(false);
            progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progress.setCancelable(true);
            progress.setMessage("Fetching Information...");
            progress.show();
            System.out.println("PRE");
        }

        @Override
        protected Void doInBackground(Void... voids) {
            try {
                URL url = new URL(linkadd);
                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
                String str, newDet="";
                names = new String[100];
                type = new String[100];
                imglink = new String[100];
                int c=0;
                while ((str = br.readLine()) != null) {
                    names[c] = str;
                    type[c] = br.readLine();
                    imglink[c] = br.readLine();
                }
                br.close();
            } catch (Exception e) {
                System.out.println("Failed");
                //det = sharedPreferences.getString(name, master.eventDetails.get(name));
                names = master.sponsors;
                for(int i=0; i<names.length; i++)
                {
                    type[i] = master.sponType.get(names[i]);
                    imglink[i] = master.sponImg.get(names[i]);
                }
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            System.out.println("POST");
            super.onPostExecute(aVoid);
            progress.dismiss();

        }
    }

    class SponAdapter extends BaseAdapter
    {

        SponAdapter(Context context)
        {

        }
        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            return null;
        }
    }

}
