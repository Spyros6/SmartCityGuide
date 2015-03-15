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

public class MapPowerTeam extends  Activity {

private final LatLng LOCATION_POWER_TEAM = new LatLng(37.9111631 ,23.7444979);
	
	private GoogleMap mappowerteam;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_power_team);

		mappowerteam = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mappowerteam.addMarker(new MarkerOptions().position(LOCATION_POWER_TEAM).title("Fidiou 12 , Argyroupoli - 16452"));

}

       public void onClick_PowerTeam(View v) {
    	
    	   mappowerteam.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	       CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_POWER_TEAM , 16);
	       mappowerteam.animateCamera(update);
	}

}

  

		  