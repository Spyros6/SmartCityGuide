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

public class MapDouzeni extends Activity {

private final LatLng LOCATION_DOUZENI = new LatLng(37.892284,23.754063);
	
	private GoogleMap mapdouzeni;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_douzeni);
	
	
		mapdouzeni  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapdouzeni.addMarker(new MarkerOptions().position(LOCATION_DOUZENI).title("Leoforos Iasonidou 47, Elliniko - 16777"));

	}
	
	public void onClick_Douzeni(View v) {
		mapdouzeni.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_DOUZENI, 16);
		mapdouzeni.animateCamera(update);
		
	}
}

