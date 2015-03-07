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

public class MapBP extends Activity {

private final LatLng LOCATION_BP = new LatLng(37.9003796, 23.746378);
	
	private GoogleMap mapbp;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_bp);

	
		mapbp  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapbp.addMarker(new MarkerOptions().position(LOCATION_BP).title("Leoforos Vouliagmenis 64, Elliniko - 16777"));
	}
	public void onClick_BP(View v) {
		mapbp.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_BP, 16);
		mapbp.animateCamera(update);
		
	}

}


	

