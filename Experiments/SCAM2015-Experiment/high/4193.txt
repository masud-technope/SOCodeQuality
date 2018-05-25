package com.example.kamilh.pierwsza;

import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by KamilH on 2015-02-19.
 */
class Region extends AsyncTask<Double, Void, String> {
    private MainActivity activity;

    public Region (MainActivity activity){
        this.activity = activity;
    }

    @Override
    public String doInBackground(Double... params) {
        URL url = null;
        BufferedReader in = null;
        try {
            url = new URL("https://maps.googleapis.com/maps/api/geocode/json?latlng="+params[0]+","+params[1]);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        try {
            if (url != null) {
                in = new BufferedReader(new InputStreamReader(url.openStream()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String line = null;
        String x = null;
        for (int i = 0; i<31; i++){
            if (in != null) {
                try {
                    line = in.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return line;
    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);
        activity.getRegion(result);
    }
}