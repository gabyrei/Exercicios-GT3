package com.generation.androidactivity.adapter

import android.os.Parcel
import android.os.Parcelable
import android.widget.TextView
import androidx.lifecycle.viewmodel.savedstate.R
import androidx.recyclerview.widget.RecyclerView
import javax.net.ssl.SSLSessionBindingEvent

class TarefaAdapter() : RecyclerView.Adapter<TarefaAdapter.TarefaViewHolder>(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    class TarefaViewHolder (val binding: CardLeyoutBinding): RecyclerView.ViewHolder(binding.root)

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<TarefaAdapter> {
        override fun createFromParcel(parcel: Parcel): TarefaAdapter {
            return TarefaAdapter(parcel)
        }

        override fun newArray(size: Int): Array<TarefaAdapter?> {
            return arrayOfNulls(size)
        }
    }


}