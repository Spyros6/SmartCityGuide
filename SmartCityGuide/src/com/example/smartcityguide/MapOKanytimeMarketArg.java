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

public class MapOKanytimeMarketArg extends Activity {

private final LatLng LOCATION_OK_ANYTIMEMARKET_ARG = new LatLng(37.9057359, 23.7498617);
	
	private GoogleMap mapokanytimemarket;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_okanytime_market_arg);
	
		mapokanytimemarket  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapokanytimemarket.addMarker(new MarkerOptions().position(LOCATION_OK_ANYTIMEMARKET_ARG).title("Aleksioupoleos 34 kai Xrusostomou Smurnhs, Argyroupoli - 16452"));
	}

	public void onClick_OKAnytime(View v) {
		mapokanytimemarket.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_OK_ANYTIMEMARKET_ARG , 16);
		mapokanytimemarket.animateCamera(update);
		
	}
	
}
