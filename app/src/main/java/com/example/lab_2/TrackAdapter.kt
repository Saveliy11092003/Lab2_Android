package com.example.lab_2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lab_2.databinding.TrackItemBinding

class TrackAdapter(): RecyclerView.Adapter<TrackAdapter.TrackHolder>() {
    val trackList = listOf(Track(R.drawable.forest, "t"),
        Track(R.drawable.forest, "w"), Track(R.drawable.forest, "t"),
        Track(R.drawable.forest, "w"), Track(R.drawable.forest, "t"),
        Track(R.drawable.forest, "w"), Track(R.drawable.forest, "t"),
        Track(R.drawable.forest, "w")
        )

    class TrackHolder(item: View): RecyclerView.ViewHolder(item) {
        val binding = TrackItemBinding.bind(item)
        fun bind(track: Track) {
            binding.im.setImageResource(track.imageId)
            binding.tvTitle.text = track.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrackHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.track_item, parent, false)
        return TrackHolder(view)
    }

    override fun getItemCount(): Int {
        return trackList.size
    }

    override fun onBindViewHolder(holder: TrackHolder, position: Int) {
        holder.bind(trackList[0])
    }

    fun addTrack(track: Track) {
      //  trackList.add(track)
        notifyDataSetChanged()
    }

}