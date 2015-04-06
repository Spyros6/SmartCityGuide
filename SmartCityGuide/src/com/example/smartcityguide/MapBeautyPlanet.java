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

public class MapBeautyPlanet extends Activity {

private final LatLng LOCATION_BEAUTY_PLANET = new LatLng(37.9057042,23.75188);
	
	private GoogleMap mapbeautyplanet;
		
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_beauty_planet);

		mapbeautyplanet = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapbeautyplanet.addMarker(new MarkerOptions().position(LOCATION_BEAUTY_PLANET).title("Ethnarchou Makariou 100, Argyroupoli - 16452"));
	}

	public void onClick_BeautyPlanet(View v) {
		mapbeautyplanet.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_BEAUTY_PLANET , 16);
		mapbeautyplanet.animateCamera(update);
		
	}
	
}
