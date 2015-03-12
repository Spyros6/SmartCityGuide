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

public class MapGoodys extends Activity {

private final LatLng LOCATION_GOODYS = new LatLng(37.9059675 ,23.7494701);
	
	private GoogleMap mapgoodys;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_goodys);
		
		mapgoodys = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		 mapgoodys.addMarker(new MarkerOptions().position(LOCATION_GOODYS ).title("Alexioupoleos 32, Argyroupoli  - 16452"));

	}
	
	public void onClick_Goodys(View v) {
		 mapgoodys.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_GOODYS , 16);
		 mapgoodys.animateCamera(update);
		
	}
	
}
	