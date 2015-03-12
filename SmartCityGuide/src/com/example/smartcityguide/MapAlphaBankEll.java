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


public class MapAlphaBankEll extends Activity {

private final LatLng LOCATION_ALPHA_BANK_ELL = new LatLng(37.892289 ,23.754287);
	
	private GoogleMap mapalphabankell;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_alpha_bank_ell);
	
		mapalphabankell = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapalphabankell.addMarker(new MarkerOptions().position(LOCATION_ALPHA_BANK_ELL ).title("Leoforos Iasonidou 46, Elliniko - 16777"));

	}
	
	public void onClick_AlphaEll(View v) {
		mapalphabankell.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_ALPHA_BANK_ELL , 16);
		mapalphabankell.animateCamera(update);
		
	}
	
}
