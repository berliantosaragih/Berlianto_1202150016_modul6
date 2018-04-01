package com.example.linggom.berianto_1202150016_modul6;

import android.app.Application;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Linggom on 01/04/2018.
 */

public class FireApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        if(!FirebaseApp.getApps(this).isEmpty())
        {
            FirebaseDatabase.getInstance().setPersistenceEnabled(true);
        }
    }
}
