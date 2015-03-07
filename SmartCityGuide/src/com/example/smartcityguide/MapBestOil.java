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

public class MapBestOil extends Activity {

private final LatLng LOCATION_BEST_OIL = new LatLng(37.9093558, 23.739305);
	
	private GoogleMap mapbestoil;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_best_oil);
		mapbestoil  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapbestoil.addMarker(new MarkerOptions().position(LOCATION_BEST_OIL).title("Leoforos Alimou 86, Argyroupoli - 16452"));
	}

	public void onClick_BestOil(View v) {
		mapbestoil.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_BEST_OIL, 16);
		mapbestoil.animateCamera(update);
		
	}
	
	
}
