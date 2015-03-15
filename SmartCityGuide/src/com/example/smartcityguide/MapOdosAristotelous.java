package com.example.smartcityguide;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MapOdosAristotelous extends Activity {

private final LatLng LOCATION_ODOS_ARISTOTELOUS = new LatLng(37.8984576 ,23.7482643);
	
	private GoogleMap mapodosaristotelous;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_odos_aristotelous);


		mapodosaristotelous = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapodosaristotelous.addMarker(new MarkerOptions().position(LOCATION_ODOS_ARISTOTELOUS).title("Aristotelous 15 kai Tyxhs, Elliniko - 16777"));

}

       public void onClick_OdosAristotelous(View v) {
    	
    	   mapodosaristotelous.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	       CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_ODOS_ARISTOTELOUS , 16);
	       mapodosaristotelous.animateCamera(update);
	}

}

  