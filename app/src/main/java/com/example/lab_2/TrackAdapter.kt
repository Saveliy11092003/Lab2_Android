package com.example.lab_2

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lab_2.databinding.TrackItemBinding

class TrackAdapter(): RecyclerView.Adapter<TrackAdapter.TrackHolder>() {
    val trackList = listOf(Track(R.drawable.forest, "Music1", "Author1"),
        Track(R.drawable.forest, "Music2", "Author2"), Track(R.drawable.forest, "Music3", "Author3"),
        Track(R.drawable.forest, "Music4", "Author4"), Track(R.drawable.forest, "Music5", "Author5"),
        Track(R.drawable.forest, "Music6", "Author6"), Track(R.drawable.forest, "Music7", "Author7"),
        Track(R.drawable.forest, "Music8", "Author8"), Track(R.drawable.forest, "Music9", "Author9"), Track(R.drawable.forest, "Music5", "Author5"),
        Track(R.drawable.forest, "Music10", "Author10"), Track(R.drawable.forest, "Music11", "Author11"),
        Track(R.drawable.forest, "Music12", "Author12")
        )

    class TrackHolder(item: View): RecyclerView.ViewHolder(item) {
        val binding = TrackItemBinding.bind(item)
        fun bind(track: Track) {
            binding.im.setImageResource(track.imageId)
            binding.tvAuthor.text = track.author
            binding.tvName.text = track.name
            Log.d("TrackAdapter", "View was filled with author - " + track.author +
                ", name of music - " + track.name + ", imageId - " + track.imageId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrackHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.track_item, parent, false)
        Log.d("TrackAdapter", "View was inflated")
        return TrackHolder(view)
    }

    override fun getItemCount(): Int {
        return trackList.size
    }

    override fun onBindViewHolder(holder: TrackHolder, position: Int) {
        holder.bind(trackList[position])
    }

}