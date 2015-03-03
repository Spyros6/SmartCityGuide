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

public class MapSorhdon extends Activity {

private final LatLng LOCATION_SORHDON = new LatLng(37.8926287, 23.7563952);
	
	private GoogleMap mapsorhdon;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_sorhdon);
	
		mapsorhdon  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapsorhdon.addMarker(new MarkerOptions().position(LOCATION_SORHDON).title("Dimitriou Ipsilantou 8, Helliniko - 16777"));
		
	}

	public void onClick_Sorhdon(View v) {
		mapsorhdon.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_SORHDON , 16);
		mapsorhdon.animateCamera(update);
		
	}
	
}

	

