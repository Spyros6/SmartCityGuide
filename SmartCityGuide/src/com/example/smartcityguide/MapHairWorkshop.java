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

public class MapHairWorkshop extends Activity {

private final LatLng LOCATION_HAIR_WORKSHOP = new LatLng(37.91014,23.746386);
	
	private GoogleMap maphairworkshop;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_hair_workshop);

		maphairworkshop = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		maphairworkshop.addMarker(new MarkerOptions().position(LOCATION_HAIR_WORKSHOP).title("Marinou Geroulanou 17-19, Argyroupoli - 16452"));
	}

	public void onClick_HairWorkShop(View v) {
		maphairworkshop.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_HAIR_WORKSHOP , 16);
		maphairworkshop.animateCamera(update);
		
	}
	
}
