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

public class MapSpiliotopoulou extends Activity {

private final LatLng LOCATION_SPILIOTOPOULOU = new LatLng(37.8930402,23.7554133);
	
	private GoogleMap mapspiliotopoulou;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_spiliotopoulou);

		mapspiliotopoulou  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapspiliotopoulou.addMarker(new MarkerOptions().position(LOCATION_SPILIOTOPOULOU).title("Chrisanthou Trapezounos 28, Elliniko - 16777"));

	}
	
	public void onClick_Spiliotopoulou(View v) {
		mapspiliotopoulou.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_SPILIOTOPOULOU, 16);
		mapspiliotopoulou.animateCamera(update);
		
	}
}

