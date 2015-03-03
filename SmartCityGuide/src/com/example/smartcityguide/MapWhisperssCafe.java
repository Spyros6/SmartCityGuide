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

public class MapWhisperssCafe extends Activity {


private final LatLng LOCATION_WHISPERS = new LatLng(37.8929202, 23.7543893);
	
	private GoogleMap mapwhispers;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_whisperss_cafe);
	
		mapwhispers  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapwhispers.addMarker(new MarkerOptions().position(LOCATION_WHISPERS).title("Athanasiou Diakou 26, Helliniko - 16777"));
	
	}

	public void onClick_Whispers(View v) {
		mapwhispers.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_WHISPERS , 16);
		mapwhispers.animateCamera(update);
		
	}
	
}
	

	

