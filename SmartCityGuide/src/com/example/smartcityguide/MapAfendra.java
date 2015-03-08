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

public class MapAfendra extends Activity {

private final LatLng LOCATION_AFENDRA = new LatLng(37.9162403,23.7515754);
	
	private GoogleMap mapafendra;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_afendra);
		mapafendra  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapafendra.addMarker(new MarkerOptions().position(LOCATION_AFENDRA).title("Thiras 102, Argyroupoli - 16451"));

	}
	
	public void onClick_Afendra(View v) {
		mapafendra.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_AFENDRA, 16);
		mapafendra.animateCamera(update);
		
	}
}
