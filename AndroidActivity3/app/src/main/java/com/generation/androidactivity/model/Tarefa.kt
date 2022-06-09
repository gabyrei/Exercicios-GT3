package com.generation.androidactivity.model

 data class Tarefa(
     var id: Long,
    var nome: String,
    var descriçao: String,
    var responsavel: String,
    var data : String,
    var status: Boolean
    var categroria: Categoria
              ) {
}