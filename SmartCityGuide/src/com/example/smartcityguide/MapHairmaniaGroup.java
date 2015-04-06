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

public class MapHairmaniaGroup extends Activity {

private final LatLng LOCATION_HAIRMANIA_BIKY_GROUP = new LatLng(37.909232,23.751856);
	
	private GoogleMap maphairmania;
		
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_hairmania_group);

		maphairmania = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		maphairmania.addMarker(new MarkerOptions().position(LOCATION_HAIRMANIA_BIKY_GROUP).title("Leoforos Kyprou  81, Argyroupoli - 16451"));
	}

	public void onClick_HairMania(View v) {
		maphairmania.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_HAIRMANIA_BIKY_GROUP , 16);
		maphairmania.animateCamera(update);
		
	}
	
}
