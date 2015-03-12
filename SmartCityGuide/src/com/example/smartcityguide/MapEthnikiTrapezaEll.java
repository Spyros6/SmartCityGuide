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

public class MapEthnikiTrapezaEll extends  Activity {

private final LatLng LOCATION_ETHNIKI_TRAPEZA_ELL = new LatLng(37.8925489 ,23.758495);
	
	private GoogleMap mapethnikiell;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_ethniki_trapeza_ell);
	
		mapethnikiell = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapethnikiell.addMarker(new MarkerOptions().position(LOCATION_ETHNIKI_TRAPEZA_ELL).title("Leoforos Iasonidou 71 kai Plapouta , Elliniko - 16777"));

	}
	
	public void onClick_EthnikiTrapezaEll(View v) {
		mapethnikiell.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_ETHNIKI_TRAPEZA_ELL, 16);
		mapethnikiell.animateCamera(update);
		
	}
	
}