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

public class MapTaLitharitsia extends  Activity {

private final LatLng LOCATION_TA_LITHARITSIA = new LatLng(37.8914978 ,23.7606681);
	
	private GoogleMap maplitharitsia;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_ta_litharitsia);

		maplitharitsia = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		maplitharitsia.addMarker(new MarkerOptions().position(LOCATION_TA_LITHARITSIA).title("Dimitriou Gounari 42, Elliniko - 16777"));

}

       public void onClick_Litharitsia(View v) {
    	
    	   maplitharitsia.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	       CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_TA_LITHARITSIA , 16);
	       maplitharitsia.animateCamera(update);
	}

}

  