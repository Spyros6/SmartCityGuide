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

public class MapFabrica extends Activity {

private final LatLng LOCATION_FABRICA = new LatLng(37.9049185, 23.7503209);
	
	private GoogleMap mapfabrica;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_fabrica);
	
		mapfabrica  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapfabrica.addMarker(new MarkerOptions().position(LOCATION_FABRICA).title("Marinou Geroulanou 74, Argyroupoli - 16452"));
		
	}

	public void onClick_Fabrica(View v) {
		mapfabrica.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_FABRICA , 16);
		mapfabrica.animateCamera(update);
		
	}
	
}
