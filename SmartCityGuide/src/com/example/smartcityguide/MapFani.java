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

public class MapFani extends Activity {

private final LatLng LOCATION_FANI = new LatLng(37.8895138,23.7533002);
	
	private GoogleMap mapfani;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_fani);

		mapfani = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapfani.addMarker(new MarkerOptions().position(LOCATION_FANI).title("Rizountos kai Thrakis 16A, Elliniko - 16777"));
	}

	public void onClick_Fani(View v) {
		mapfani.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_FANI  , 16);
		mapfani.animateCamera(update);
		
	}
	
}

