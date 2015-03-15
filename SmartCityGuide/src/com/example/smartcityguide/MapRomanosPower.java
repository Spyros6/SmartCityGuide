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

public class MapRomanosPower extends Activity {

private final LatLng LOCATION_ROMANOS_POWER = new LatLng(37.894981 ,23.748112);
	
	private GoogleMap mapromanospower;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_romanos_power);

		mapromanospower = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapromanospower.addMarker(new MarkerOptions().position(LOCATION_ROMANOS_POWER).title("Chaldeias 69, Elliniko - 16777"));

}

       public void onClick_RomanosPower(View v) {
    	
    	   mapromanospower.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	       CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_ROMANOS_POWER , 16);
	       mapromanospower.animateCamera(update);
	}

}
