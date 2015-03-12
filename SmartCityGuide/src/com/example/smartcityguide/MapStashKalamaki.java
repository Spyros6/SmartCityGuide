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

public class MapStashKalamaki extends Activity {

private final LatLng LOCATION_STASH_KALAMAKI = new LatLng(37.9081254 ,23.7483039);
	
	private GoogleMap mapstashkalamaki;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_stash_kalamaki);
		
		mapstashkalamaki = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapstashkalamaki.addMarker(new MarkerOptions().position(LOCATION_STASH_KALAMAKI).title("Marinou Geroulanou 54, Argyroupoli  - 16452"));

	}
	
	public void onClick_StashKalamaki(View v) {
		mapstashkalamaki.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_STASH_KALAMAKI, 16);
		mapstashkalamaki.animateCamera(update);
		
	}
	
}
	