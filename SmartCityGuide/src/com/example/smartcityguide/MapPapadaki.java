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

public class MapPapadaki extends ActionBarActivity {

private final LatLng LOCATION_PAPADAKI = new LatLng(37.9078291,23.7560158);
	
	private GoogleMap mappapadaki;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_papadaki);
		
		mappapadaki  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mappapadaki.addMarker(new MarkerOptions().position(LOCATION_PAPADAKI).title("Eptanhsou 28, Argyroupoli - 16451"));

	}
	
	public void onClick_Papadaki(View v) {
		mappapadaki.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_PAPADAKI, 16);
		mappapadaki.animateCamera(update);
		
	}
}

