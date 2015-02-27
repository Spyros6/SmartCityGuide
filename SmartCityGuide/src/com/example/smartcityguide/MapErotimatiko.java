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

public class MapErotimatiko extends Activity {

private final LatLng LOCATION_EROTIMATIKO = new LatLng(37.9052648, 23.7503382);
	
	private GoogleMap maperotimatiko;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_erotimatiko);
	
		maperotimatiko  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		maperotimatiko.addMarker(new MarkerOptions().position(LOCATION_EROTIMATIKO).title("Marinou Geroulanou 72, Argyroupoli - 16452"));
		
	}

	public void onClick_Erotimatiko(View v) {
		maperotimatiko.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_EROTIMATIKO , 16);
		maperotimatiko.animateCamera(update);
		
	}
		
		


}
