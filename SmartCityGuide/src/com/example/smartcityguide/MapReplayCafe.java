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

public class MapReplayCafe extends Activity {

private final LatLng LOCATION_REPLAY = new LatLng(37.892355, 23.7523957);
	
	private GoogleMap mapreplaycafe;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_replay_cafe);
	
		mapreplaycafe  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapreplaycafe.addMarker(new MarkerOptions().position(LOCATION_REPLAY).title("Leoforos Iasonidou 35, Helliniko - 16777"));
	
	}

	public void onClick_Replay(View v) {
		mapreplaycafe.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_REPLAY , 16);
		mapreplaycafe.animateCamera(update);
		
	}
	
}


