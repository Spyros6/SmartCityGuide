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

public class MapHairDesignStudio extends Activity {

private final LatLng LOCATION_HAIR_DESIGN_STUDIO = new LatLng(37.9052349,23.7509713);
	
	private GoogleMap maphairdesignstudio;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_hair_design_studio);
	
		maphairdesignstudio = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		maphairdesignstudio.addMarker(new MarkerOptions().position(LOCATION_HAIR_DESIGN_STUDIO).title("Eustathiadi 8, Argyroupoli - 16452"));
	}

	public void onClick_HairDesignStudio(View v) {
		maphairdesignstudio.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_HAIR_DESIGN_STUDIO , 16);
		maphairdesignstudio.animateCamera(update);
		
	}
	
}
