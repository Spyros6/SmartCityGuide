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

public class MapInvictusGas extends Activity {

private final LatLng LOCATION_INVICTUS_GAS = new LatLng(37.894005, 23.747382);
	
	private GoogleMap mapinvictus;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_invictus_gas);
	
		mapinvictus  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapinvictus.addMarker(new MarkerOptions().position(LOCATION_INVICTUS_GAS).title("Leoforos Vouliagmenis 64, Elliniko - 16777"));
	}
	public void onClick_Invictus(View v) {
		mapinvictus.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_INVICTUS_GAS, 16);
		mapinvictus.animateCamera(update);
		
	}

}