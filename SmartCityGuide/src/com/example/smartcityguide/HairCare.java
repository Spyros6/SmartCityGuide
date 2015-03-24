package com.example.smartcityguide;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HairCare extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hair_care);
	

	 Button btnArguroupolis2 = (Button)findViewById(R.id.btnArgyroupolis2);
     btnArguroupolis2.setOnClickListener(new OnClickListener() {

    @Override
    public void onClick(View v) {
    Intent intent = new Intent(HairCare.this, ArgyroupolisHairCare.class);
    startActivity(intent);
    }
    });
     
     Button btnHelliniko2 = (Button)findViewById(R.id.btnHelliniko2);
     btnHelliniko2.setOnClickListener(new OnClickListener() {

    @Override
    public void onClick(View v) {
    Intent intent = new Intent(HairCare.this, HellinikoHairCare.class);
    startActivity(intent);
    }
    });
}

}
