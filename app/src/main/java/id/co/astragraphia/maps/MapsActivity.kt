package id.co.astragraphia.maps

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
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
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add multiple  marker
        val myLoc = LatLng(0.0,0.0)
        val comp1 = LatLng(-6.1863996, 106.8352456)
        val comp2 = LatLng(-6.1949282, 106.8019104)
        val comp3 = LatLng(-6.1742801, 106.8229252)
        val comp4 = LatLng(-6.1742801, 106.8229252)
        val comp5 = LatLng(-6.1483223, 106.7790306)
        val comp6 = LatLng(-6.1383603, 106.8243332)
        val comp7 = LatLng(-6.1408498, 106.8241101)
        val comp8 = LatLng(-6.1316531, 106.81242)
        mMap.addMarker(MarkerOptions().position(comp1).title("Galaxy Computery"))
        mMap.addMarker(MarkerOptions().position(comp2).title("Service Printer Jakarta"))
        mMap.addMarker(MarkerOptions().position(comp3).title("Veneta System Pusat Isi Ulang Tinta Printer"))
        mMap.addMarker(MarkerOptions().position(comp4).title("SigmaComp 002"))
        mMap.addMarker(MarkerOptions().position(comp5).title("Transcia Pusat Isi Ulang Tinta"))
        mMap.addMarker(MarkerOptions().position(comp6).title("Scm Prints"))
        mMap.addMarker(MarkerOptions().position(comp7).title("MultiPrints Toko Printer"))
        mMap.addMarker(MarkerOptions().position(comp8).title("Toko Tinta Printer Online"))

        mMap.moveCamera(CameraUpdateFactory.newLatLng(myLoc))
    }
}
