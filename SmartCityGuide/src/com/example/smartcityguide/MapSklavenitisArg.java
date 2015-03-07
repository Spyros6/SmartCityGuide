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

public class MapSklavenitisArg extends Activity {

private final LatLng LOCATION_SKLAVENITIS_ARG = new LatLng(37.913198,23.7440063);
	
	private GoogleMap mapsklavenitisarg;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_sklavenitis_arg);

		mapsklavenitisarg  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapsklavenitisarg.addMarker(new MarkerOptions().position(LOCATION_SKLAVENITIS_ARG).title("Leontos 4 kai Eleutherias, Argyroupoli - 16452"));
	}

	public void onClick_SklavenitisArg(View v) {
		mapsklavenitisarg.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_SKLAVENITIS_ARG , 16);
		mapsklavenitisarg.animateCamera(update);
		
	}
	
}
