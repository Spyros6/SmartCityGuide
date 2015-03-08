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

public class MapKaravasileiadi extends Activity {

	private final LatLng LOCATION_KARAVASEILIADI = new LatLng(37.894383,23.748239);
	
	private GoogleMap mapkaravaseiliadi;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_karavasileiadi);
	
		mapkaravaseiliadi  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapkaravaseiliadi.addMarker(new MarkerOptions().position(LOCATION_KARAVASEILIADI).title("Chaldeias 68, Elliniko - 16777"));

	}
	
	public void onClick_Karavasiliadi(View v) {
		mapkaravaseiliadi.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_KARAVASEILIADI, 16);
		mapkaravaseiliadi.animateCamera(update);
		
	}
}

