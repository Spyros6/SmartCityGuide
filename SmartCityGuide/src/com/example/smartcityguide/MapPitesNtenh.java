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

public class MapPitesNtenh extends  Activity {

private final LatLng LOCATION_NTENHS = new LatLng(37.9051494 ,23.7503324);
	
	private GoogleMap mapntenhs;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_pites_ntenh);
		mapntenhs = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapntenhs.addMarker(new MarkerOptions().position(LOCATION_NTENHS).title("Marinou Geroulanou 81, Argyroupoli  - 16452"));

	}
	
	public void onClick_Ntenhs(View v) {
		mapntenhs.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_NTENHS, 16);
		mapntenhs.animateCamera(update);
		
	}
	
}
	