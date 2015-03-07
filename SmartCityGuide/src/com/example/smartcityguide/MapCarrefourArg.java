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

public class MapCarrefourArg extends Activity {

private final LatLng LOCATION_CARREFOUR_ARG = new LatLng(37.899314,23.757044);
	
	private GoogleMap mapcarrefourarg;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_carrefour_arg);
	
		mapcarrefourarg  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapcarrefourarg.addMarker(new MarkerOptions().position(LOCATION_CARREFOUR_ARG).title("Leoforos Kyprou 185, Argyroupoli - 16452"));
	}

	public void onClick_CarrefourArg(View v) {
		mapcarrefourarg.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_CARREFOUR_ARG , 16);
		mapcarrefourarg.animateCamera(update);
		
	}
	
}
