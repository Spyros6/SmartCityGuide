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

public class MapPeiraiwsEll extends Activity {

private final LatLng LOCATION_TRAPEZA_PEIRAIWS_ELL = new LatLng(37.8924133 ,23.7539555);
	
	private GoogleMap mappeiraiwsell;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_peiraiws_ell);
		
		mappeiraiwsell = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mappeiraiwsell.addMarker(new MarkerOptions().position(LOCATION_TRAPEZA_PEIRAIWS_ELL).title("Leoforos Iasonidou 45, Elliniko - 16777"));

	}
	
	public void onClick_PeiraiwsEll(View v) {
		mappeiraiwsell.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_TRAPEZA_PEIRAIWS_ELL, 16);
		mappeiraiwsell.animateCamera(update);
		
	}
	
}
	