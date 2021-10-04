package com.klapz.Test;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import com.klapz.mylibrary.api.KlapzConfig;
import com.klapz.mylibrary.KlapzButton;


import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
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
            klapzobject.put("expressionPlaceholder", "Tell us, what do you love about this book summary");
            klapzobject.put("PreferKlapz", "10,20,30");

            klapzobject.put("ThankText", "Thanks for Klapping.");
            klapzobject.put("ContentType", "summary");
            //Direct //Default
            klapzobject.put("Mode", "Default");
        } catch (JSONException e) {
            e.printStackTrace();
        }
      //++++++++++++++++++++++++++++++++


    //++++++++++++++++++++++++++++++++
        klapzconfig.Config(klapzobject,this);
        // If user logout Pl call thi function
//        klapzconfig.Close(this);
    //++++++++++++++++++++++++++++++++




    //++++++++++++++++++++++++++++++++
        //Custom Events
        KlapzButton klapzButton = new KlapzButton(this);
        klapzButton.ShowKlap();
    //++++++++++++++++++++++++++++++++



    }
}