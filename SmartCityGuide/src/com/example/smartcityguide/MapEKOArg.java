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


public class MapEKOArg extends Activity {

private final LatLng LOCATION_EKO_ARG = new LatLng(37.911899, 23.75449);
	
	private GoogleMap mapeko;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_ekoarg);
	
		mapeko  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapeko.addMarker(new MarkerOptions().position(LOCATION_EKO_ARG).title("Argyroupoleos 61, Argyroupoli - 16451"));
	
	}
	public void onClick_EKO(View v) {
		mapeko.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_EKO_ARG, 16);
		mapeko.animateCamera(update);
		
	}
	
}
