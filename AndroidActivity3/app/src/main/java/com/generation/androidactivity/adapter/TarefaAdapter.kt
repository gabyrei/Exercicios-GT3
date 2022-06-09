package com.generation.androidactivity.adapter

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.lifecycle.viewmodel.savedstate.R
import androidx.recyclerview.widget.RecyclerView
import com.generation.androidactivity.databinding.CardLayoutBinding
import com.generation.androidactivity.model.Tarefa
import java.text.FieldPosition
import javax.net.ssl.SSLSessionBindingEvent

 class TarefaAdapter() : RecyclerView.Adapter<TarefaAdapter.TarefaViewHolder>() {
    private var listTarefa = emptyList<Tarefa>()
    }

    class TarefaViewHolder (val binding: CardLeyoutBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewtype: Int): TarefaViewHolder{
        return TarefaViewHolder(CardLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        ))
    }


        override fun onBindViewHolder(holder: TarefaViewHolder, position: Int){
            val tarefa = lisTarefa[position]

            holder.binding.textNome.text = tarefa.nome
            holder.binding.textDiscricao text =  tarefa.discricao
            holder.binding.textResponsavel tex =  tarefa. responsavel
            holder.binding.textDate  text = tarefa.date
            holder.binding.switchAtivo.isChecked = tarefa. status
            holder.binding.textCategoria.text = tarefa.Categoria


}
         override fun getItemCout(): Int {
             return listTarefa.size
         }

          fun setList(list: List<Tarefa>) {
              listTarefa = list
              notifyDateSetChanged()
          }