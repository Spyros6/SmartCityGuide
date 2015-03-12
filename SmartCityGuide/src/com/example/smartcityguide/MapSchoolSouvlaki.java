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

public class MapSchoolSouvlaki extends Activity {

private final LatLng LOCATION_SCHOOL_SOUVLAKI = new LatLng(37.892145 ,23.7489793);
	
	private GoogleMap mapschoolsouvlaki;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_school_souvlaki);
	
		mapschoolsouvlaki = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapschoolsouvlaki.addMarker(new MarkerOptions().position(LOCATION_SCHOOL_SOUVLAKI  ).title("Leoforos Iasonidou 4, Elliniko  - 16777"));

		}

				public void onClick_SchoolSouvlaki(View v) {
					mapschoolsouvlaki.setMapType(GoogleMap.MAP_TYPE_NORMAL);
					CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_SCHOOL_SOUVLAKI  , 16);
					mapschoolsouvlaki.animateCamera(update);
				}

		}


