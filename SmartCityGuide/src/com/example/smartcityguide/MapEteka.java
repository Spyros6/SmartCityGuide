package com.example.smartcityguide;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MapEteka extends ActionBarActivity {

private final LatLng LOCATION_ETEKA = new LatLng(37.8923981,23.7604051);
	
	private GoogleMap mapeteka;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_eteka);
	
		mapeteka  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapeteka.addMarker(new MarkerOptions().position(LOCATION_ETEKA).title("Leoforos Iasonidou 80, Elliniko - 16777"));
	}

	public void onClick_Eteka(View v) {
		mapeteka.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_ETEKA, 16);
		mapeteka.animateCamera(update);
		
	}
}
