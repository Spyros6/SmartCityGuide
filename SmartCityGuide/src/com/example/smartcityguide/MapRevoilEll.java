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

public class MapRevoilEll extends  Activity {


private final LatLng LOCATION_REVOIL_ELL = new LatLng(37.8958144, 23.7471298);
	
	private GoogleMap maprevoilell;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_revoil_ell);

		maprevoilell  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		maprevoilell.addMarker(new MarkerOptions().position(LOCATION_REVOIL_ELL).title("Leoforos Vouliagmenis kai Ethnarxou Makariou 1, Elliniko - 16777"));
	}

	public void onClick_RevoilEll(View v) {
		maprevoilell.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_REVOIL_ELL, 16);
		maprevoilell.animateCamera(update);
		
	}
	
}
