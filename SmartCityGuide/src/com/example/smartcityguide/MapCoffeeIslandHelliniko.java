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

public class MapCoffeeIslandHelliniko extends Activity {

private final LatLng LOCATION_COFFEE_ISLAND = new LatLng(37.8921871, 23.7498599);
	
	private GoogleMap mapcoffeeisland;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_coffee_island_helliniko);
	 
		mapcoffeeisland  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapcoffeeisland.addMarker(new MarkerOptions().position(LOCATION_COFFEE_ISLAND).title("Leoforos Iasonidou 7, Elliniko - 16777"));
		
	}

	public void onClick_CoffeeIsland(View v) {
		mapcoffeeisland.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_COFFEE_ISLAND , 16);
		mapcoffeeisland.animateCamera(update);
		
	}
	
}
