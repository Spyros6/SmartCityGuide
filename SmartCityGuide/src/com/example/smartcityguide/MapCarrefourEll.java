package com.example.smartcityguide;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MapCarrefourEll extends Activity {

private final LatLng LOCATION_CARREFOURELL = new LatLng(37.8990166, 23.7501996);
	
	private GoogleMap mapcarrefourell;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_carrefour_ell);
	
		mapcarrefourell  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapcarrefourell.addMarker(new MarkerOptions().position(LOCATION_CARREFOURELL).title("Marinou Geroulanou 132, Elliniko - 16777"));
	
	}

	public void onClick_CarrefourEll(View v) {
		mapcarrefourell.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_CARREFOURELL , 16);
		mapcarrefourell.animateCamera(update);
		
	}
	
}
