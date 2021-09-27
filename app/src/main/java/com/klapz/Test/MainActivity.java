package com.klapz.Test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.klapz.mylibrary.KlapzButton;
import com.klapz.mylibrary.api.KlapzConfig;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //++++++++++++++++++++++++++++++++
        KlapzConfig klapzconfig = new KlapzConfig();
        //SendBox /Production
        klapzconfig.Start("XXXXX",this,"SendBox");


        JSONObject klapzobject = new JSONObject();
        try {
            klapzobject.put("title", "Klapz this content");
            klapzobject.put("klapz", 2);
            klapzobject.put("createrID", "createrID");
            klapzobject.put("Url", "https://stackoverflow.com/questions/40573380/textview-not-updating");
            //Direct //Default
            klapzobject.put("Mode", "Default");
        } catch (JSONException e) {
            e.printStackTrace();
        }
      //++++++++++++++++++++++++++++++++


    //++++++++++++++++++++++++++++++++
        klapzconfig.Config(klapzobject,this);
        // If user logout Pl call thi function
        klapzconfig.Close(this);
    //++++++++++++++++++++++++++++++++




    //++++++++++++++++++++++++++++++++
        //Custom Events
        KlapzButton klapzButton = new KlapzButton(this);
        klapzButton.ShowKlap();
    //++++++++++++++++++++++++++++++++



    }
}