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

public class MapVidalis extends  Activity {

private final LatLng LOCATION_VIDALIS_MARKET = new LatLng(37.9021282, 23.755557);
	
	private GoogleMap mapvidalis;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_vidalis);

		mapvidalis  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapvidalis.addMarker(new MarkerOptions().position(LOCATION_VIDALIS_MARKET).title("Leoforos Kyprou 156 kai Konstantinoupoleos, Argyroupoli - 16452"));
	}

	public void onClick_Vidalis(View v) {
		mapvidalis.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_VIDALIS_MARKET, 16);
		mapvidalis.animateCamera(update);
		
	}
	
}
