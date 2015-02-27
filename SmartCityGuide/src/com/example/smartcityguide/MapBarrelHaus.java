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

public class MapBarrelHaus extends Activity {

private final LatLng LOCATION_BARREL_HAUS = new LatLng(37.9022268, 23.7510431);
	
	private GoogleMap mapbarrelhaus;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_barrel_haus);
	
		mapbarrelhaus  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapbarrelhaus.addMarker(new MarkerOptions().position(LOCATION_BARREL_HAUS).title("Eleutheriou Venizelou 36, Argyroupoli - 16452"));
		
	}

	public void onClick_BarrelHaus(View v) {
		mapbarrelhaus.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_BARREL_HAUS , 16);
		mapbarrelhaus.animateCamera(update);
		
	}

	
}
