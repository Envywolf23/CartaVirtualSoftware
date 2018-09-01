package jp.restaurantes;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng itagui = new LatLng(6.1788929,-75.6011088);
        LatLng bello = new LatLng(6.3170124,-75.5683825);
        LatLng sabaneta = new LatLng(6.153694,-75.6150007);
        LatLng envigado = new LatLng(6.1765123,-75.5885262);
        LatLng medellin = new LatLng(6.2465719,-75.5915086);

        mMap.addMarker(new MarkerOptions().position(itagui).title("Sede Itagui"));
        mMap.addMarker(new MarkerOptions().position(bello).title("Sede Bello"));
        mMap.addMarker(new MarkerOptions().position(sabaneta).title("Sede Sabaneta"));
        mMap.addMarker(new MarkerOptions().position(envigado).title("Sede Envigado"));
        mMap.addMarker(new MarkerOptions().position(medellin).title("Sede Medellin"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(itagui,11));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(bello,11));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sabaneta,11));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(envigado,11));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(medellin,11));

        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
    }
}