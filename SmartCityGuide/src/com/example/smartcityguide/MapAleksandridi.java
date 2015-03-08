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

public class MapAleksandridi extends Activity {

private final LatLng LOCATION_ALEKSANDRIDI = new LatLng(37.914057,23.749969);
	
	private GoogleMap mapaleksandridi;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_aleksandridi);
	
		mapaleksandridi  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapaleksandridi.addMarker(new MarkerOptions().position(LOCATION_ALEKSANDRIDI).title("Georgiou Papandreou 30, Argyroupoli - 16451"));
	}
	public void onClick_Aleksandridi(View v) {
		mapaleksandridi.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_ALEKSANDRIDI, 16);
		mapaleksandridi.animateCamera(update);
		
	}

}

	

