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

public class MapRevoilArg extends  Activity {

private final LatLng LOCATION_REVOIL_ARG = new LatLng(37.910913, 23.7505295);
	
	private GoogleMap maprevoilarg;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_revoil_arg);
	
		maprevoilarg  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		maprevoilarg.addMarker(new MarkerOptions().position(LOCATION_REVOIL_ARG).title("Leoforos Kyprou 57, Argyroupoli - 16452"));
	}

	public void onClick_RevoilArg(View v) {
		maprevoilarg.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_REVOIL_ARG, 16);
		maprevoilarg.animateCamera(update);
		
	}
	

}
