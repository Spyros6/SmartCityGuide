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

public class MapProSportRacing extends Activity {

private final LatLng LOCATION_PRO_SPORT_RACING = new LatLng(37.91348 ,23.75476);
	
	private GoogleMap mapprosportracing;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_pro_sport_racing);

		mapprosportracing = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapprosportracing.addMarker(new MarkerOptions().position(LOCATION_PRO_SPORT_RACING).title("Argyroupoleos 86, Argyroupoli - 16451"));

}

       public void onClick_ProSportRacing(View v) {
    	
    	   mapprosportracing.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	       CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_PRO_SPORT_RACING , 16);
	       mapprosportracing.animateCamera(update);
	}

}
