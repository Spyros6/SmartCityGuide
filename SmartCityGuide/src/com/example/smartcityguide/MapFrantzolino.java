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

public class MapFrantzolino extends Activity {

private final LatLng LOCATION_FRATZOLINO = new LatLng(37.8921176 ,23.7510313);
	
	private GoogleMap mapfratzolino;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_frantzolino);

		mapfratzolino = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapfratzolino.addMarker(new MarkerOptions().position(LOCATION_FRATZOLINO   ).title("Leoforos Iasonidou 18, Elliniko  - 16777"));

		}

				public void onClick_Fratzolino(View v) {
					mapfratzolino.setMapType(GoogleMap.MAP_TYPE_NORMAL);
					CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_FRATZOLINO , 16);
					mapfratzolino.animateCamera(update);
				}

		}



