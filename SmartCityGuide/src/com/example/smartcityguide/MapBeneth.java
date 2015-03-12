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

public class MapBeneth extends  Activity {

private final LatLng LOCATION_BENETH= new LatLng(37.907712 ,23.75411);
	
	private GoogleMap mapbeneth;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_beneth);

		mapbeneth = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapbeneth.addMarker(new MarkerOptions().position(LOCATION_BENETH ).title("Argyroupolews 9, Argyroupoli  - 16451"));

}

       public void onClick_Beneth(View v) {
    	   mapbeneth.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	         CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_BENETH , 16);
	         mapbeneth.animateCamera(update);
	}

}

