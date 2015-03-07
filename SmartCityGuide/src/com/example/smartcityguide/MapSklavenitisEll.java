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

public class MapSklavenitisEll extends Activity {

private final LatLng LOCATION_SKLAVENITISELL = new LatLng(37.892395, 23.7543915);
	
	private GoogleMap mapsklavenitisell;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_sklavenitis_ell);

		mapsklavenitisell  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapsklavenitisell.addMarker(new MarkerOptions().position(LOCATION_SKLAVENITISELL).title("Leoforos Iasonidou 51, Elliniko - 16777"));

	}

	public void onClick_SklavenitisEll(View v) {
		mapsklavenitisell.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_SKLAVENITISELL , 16);
		mapsklavenitisell.animateCamera(update);
		
	}
	
}
