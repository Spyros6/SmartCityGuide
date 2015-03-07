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

public class MapVasilopoulosEll extends Activity {

	
private final LatLng LOCATION_VASILOPOULOSELL = new LatLng(37.8905201, 23.7480927);
	
	private GoogleMap mapvasilopoulosell;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_vasilopoulos_ell);
	
		mapvasilopoulosell  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapvasilopoulosell.addMarker(new MarkerOptions().position(LOCATION_VASILOPOULOSELL).title("Leoforos Vouliagmenis 43-45, Elliniko - 16777"));
	}

	public void onClick_VasilopoulosEll(View v) {
		mapvasilopoulosell.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_VASILOPOULOSELL , 16);
		mapvasilopoulosell.animateCamera(update);
		
	}
}
