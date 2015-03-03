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

public class MapMparallou extends Activity {

private final LatLng LOCATION_MPARALLOU = new LatLng(37.9022912, 23.7502246);
	
	private GoogleMap mapmparallou;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_mparallou);

		mapmparallou  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapmparallou.addMarker(new MarkerOptions().position(LOCATION_MPARALLOU).title("Marinou Geroulanou 115, Argyroupoli - 16452"));
	
	}

	public void onClick_Mparallou(View v) {
		mapmparallou.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_MPARALLOU , 16);
		mapmparallou.animateCamera(update);
		
	}
	
}
