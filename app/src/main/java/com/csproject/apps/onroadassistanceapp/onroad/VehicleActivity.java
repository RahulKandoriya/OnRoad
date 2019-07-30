package com.csproject.apps.onroadassistanceapp.onroad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class VehicleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle);

    }

    public void select(View view){
        startActivity(new Intent(VehicleActivity.this, MainActivity.class));
        finish();
    }
}
