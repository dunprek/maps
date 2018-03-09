package id.co.astragraphia.maps

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.OrientationEventListener
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.R.attr.data
import android.location.Location


/**
 * Created by GideonST on 3/9/2018.
 */
class MapAdapter(val locationList: ArrayList<City>) : RecyclerView.Adapter<MapAdapter.MapViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MapAdapter.MapViewHolder {
        val v = LayoutInflater.from(parent!!.context).inflate(R.layout.list_city, parent, false)
        return MapViewHolder(v)
    }

    override fun getItemCount(): Int {
        return locationList.size
    }

    override fun onBindViewHolder(holder: MapAdapter.MapViewHolder, position: Int) {
        holder.bindItems(locationList[position])
        val loc1 = Location("")
        loc1.setLatitude(locationList[position].latitude)
        loc1.setLongitude(locationList[position].longitude)
    }

    class MapViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(city: City) {

            val tvName = itemView.findViewById(R.id.tv_city_name)as TextView
            val tvDistance = itemView.findViewById(R.id.tv_city_distance)as TextView
            tvName.text=city.cityName
        }
    }

}