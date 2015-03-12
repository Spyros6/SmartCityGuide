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

public class MapEthnikiTrapezaArg extends Activity {

private final LatLng LOCATION_ETHNIKI_TRAPEZA_ARG = new LatLng(37.9098285 ,23.7515665);
	
	private GoogleMap mapethnikiarg;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_ethniki_trapeza_arg);
	
		mapethnikiarg = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapethnikiarg.addMarker(new MarkerOptions().position(LOCATION_ETHNIKI_TRAPEZA_ARG).title("Kyprion Agoniston 4 kai Filikis Etaireias , Argyroupoli - 16451"));

	}
	
	public void onClick_EthnikiTrapezaArg(View v) {
		mapethnikiarg.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_ETHNIKI_TRAPEZA_ARG, 16);
		mapethnikiarg.animateCamera(update);
		
	}
	
}