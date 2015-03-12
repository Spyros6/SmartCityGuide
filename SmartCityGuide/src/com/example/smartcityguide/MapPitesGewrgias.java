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

public class MapPitesGewrgias extends Activity {

private final LatLng LOCATION_PITES_GEWRGIAS = new LatLng(37.9073159 ,23.7490881);
	
	private GoogleMap mappitesgewrgias;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_pites_gewrgias);
	
    mappitesgewrgias = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
    mappitesgewrgias.addMarker(new MarkerOptions().position(LOCATION_PITES_GEWRGIAS ).title("Marinou Geroulanou 53, Argyroupoli  - 16452"));

}

		public void onClick_PitesGewrgias(View v) {
			  mappitesgewrgias.setMapType(GoogleMap.MAP_TYPE_NORMAL);
				CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_PITES_GEWRGIAS , 16);
				mappitesgewrgias.animateCamera(update);
		}

}


