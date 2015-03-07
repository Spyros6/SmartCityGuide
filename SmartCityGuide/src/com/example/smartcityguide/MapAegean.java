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

public class MapAegean extends Activity {

private final LatLng LOCATION_AEGEAN = new LatLng(37.906952, 23.753184);
	
	private GoogleMap mapaegean;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_aegean);

		mapaegean  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapaegean.addMarker(new MarkerOptions().position(LOCATION_AEGEAN).title("Leoforos Kyprou 92, Argyroupoli - 16452"));
	}

	public void onClick_Aegean(View v) {
		mapaegean.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_AEGEAN, 16);
		mapaegean.animateCamera(update);
		
	}
	
	
}
