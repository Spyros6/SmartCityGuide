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

public class MapToXryso extends Activity {

private final LatLng LOCATION_TO_XRYSO = new LatLng(37.8923759 ,23.7565003);
	
	private GoogleMap maptoxryso;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_to_xryso);

		maptoxryso = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		maptoxryso.addMarker(new MarkerOptions().position(LOCATION_TO_XRYSO   ).title("Leoforos Iasonidou 55, Elliniko  - 16777"));

		}

				public void onClick_ToXryso(View v) {
					maptoxryso.setMapType(GoogleMap.MAP_TYPE_NORMAL);
					CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_TO_XRYSO , 16);
					maptoxryso.animateCamera(update);
				}

		}



