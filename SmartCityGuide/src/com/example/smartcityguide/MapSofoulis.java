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

public class MapSofoulis extends Activity {

private final LatLng LOCATION_SOFOULIS= new LatLng(37.895083 ,23.752884);
	
	private GoogleMap mapsofoulis;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_sofoulis);

		mapsofoulis = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapsofoulis.addMarker(new MarkerOptions().position(LOCATION_SOFOULIS ).title("Tripoleos 62, Elliniko  - 16777"));

}

       public void onClick_Sofoulis(View v) {
    	   mapsofoulis.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	       CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_SOFOULIS , 16);
	       mapsofoulis.animateCamera(update);
	}

}
