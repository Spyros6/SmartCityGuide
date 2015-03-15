package com.example.smartcityguide;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MapMpiftekiSofias extends ActionBarActivity {

private final LatLng LOCATION_TO_MPIFTEKI_THS_SOFIAS = new LatLng(37.908613 ,23.747979);
	
	private GoogleMap mapmpiftekisofias;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_mpifteki_sofias);

		mapmpiftekisofias = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapmpiftekisofias.addMarker(new MarkerOptions().position(LOCATION_TO_MPIFTEKI_THS_SOFIAS).title("Marinou Geroulanou 42, Argyroupoli - 16452"));

}

       public void onClick_MpiftekiSofias(View v) {
    	   mapmpiftekisofias.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	       CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_TO_MPIFTEKI_THS_SOFIAS , 16);
	       mapmpiftekisofias.animateCamera(update);
	}

}
