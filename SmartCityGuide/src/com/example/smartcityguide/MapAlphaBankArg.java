package com.example.smartcityguide;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MapAlphaBankArg extends  Activity {

private final LatLng LOCATION_ALPHA_BANK_ARG = new LatLng(37.9058336 ,23.7507461);
	
	private GoogleMap mapalphabankarg;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_alpha_bank_arg);
		
		mapalphabankarg = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapalphabankarg.addMarker(new MarkerOptions().position(LOCATION_ALPHA_BANK_ARG).title("Efstathiadi 1, Argyroupoli - 16452"));

	}
	
	public void onClick_AlphaArg(View v) {
		mapalphabankarg.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_ALPHA_BANK_ARG, 16);
		mapalphabankarg.animateCamera(update);
		
	}
	
}
