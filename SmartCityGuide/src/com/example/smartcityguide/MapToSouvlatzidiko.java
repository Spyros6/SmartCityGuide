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

public class MapToSouvlatzidiko extends  Activity {

private final LatLng LOCATION_TO_SOUVLATZIDIKO = new LatLng(37.8921652 ,23.7502916);
	
	private GoogleMap mapsouvlatzidiko;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_to_souvlatzidiko);

		mapsouvlatzidiko = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapsouvlatzidiko.addMarker(new MarkerOptions().position(LOCATION_TO_SOUVLATZIDIKO ).title("Leoforos Iasonidou 11, Elliniko  - 16777"));

		}

				public void onClick_ToSouvlatzidiko(View v) {
					mapsouvlatzidiko.setMapType(GoogleMap.MAP_TYPE_NORMAL);
						CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_TO_SOUVLATZIDIKO , 16);
						mapsouvlatzidiko.animateCamera(update);
				}

		}


