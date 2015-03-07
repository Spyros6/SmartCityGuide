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

public class MapGalaxias extends Activity {

private final LatLng LOCATION_GALAXIAS = new LatLng(37.911587, 23.750073);
	
	private GoogleMap mapgalaxias;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_galaxias);
	
		mapgalaxias  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapgalaxias.addMarker(new MarkerOptions().position(LOCATION_GALAXIAS).title("Digeni Akrita 2 kai Kyprou, Argyroupoli - 16452"));
	}

	public void onClick_Galaxias(View v) {
		mapgalaxias.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_GALAXIAS, 16);
		mapgalaxias.animateCamera(update);
		
	}
}
