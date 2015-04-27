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

public class MapHairLab extends Activity {


private final LatLng LOCATION_HAIRLAB = new LatLng(37.8928312,23.7563058);
	
	private GoogleMap maphairlab;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_hair_lab);

		maphairlab = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		maphairlab.addMarker(new MarkerOptions().position(LOCATION_HAIRLAB).title("Dimitriou Ipsilantou  6, Elliniko - 16777"));
	}

	public void onClick_HairLab(View v) {
		maphairlab.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_HAIRLAB , 16);
		maphairlab.animateCamera(update);
		
	}
	
}
