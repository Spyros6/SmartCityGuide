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

public class MapLefteris extends  Activity {

private final LatLng LOCATION_LEFTERIS = new LatLng(37.90594 ,23.7520619);
	
	private GoogleMap maplefteris;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_lefteris);

		maplefteris = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		maplefteris.addMarker(new MarkerOptions().position(LOCATION_LEFTERIS).title("Alexioupoleos 56, Argyroupoli  - 16452"));

	}
	
	public void onClick_Lefteris(View v) {
		maplefteris.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_LEFTERIS, 16);
		maplefteris.animateCamera(update);
		
	}
	
}
	