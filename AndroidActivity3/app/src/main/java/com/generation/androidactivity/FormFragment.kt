package com.generation.androidactivity

import android.app.DatePickerDialog
import android.os.Binder
import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.RemoteViews
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.navigation.fragment.findNavController
import com.generation.androidactivity.databinding.CardLayoutBinding
import com.generation.androidactivity.databinding.FragmentFormBinding
import com.generation.androidactivity.fragment.DatePickerFragment
import com.generation.androidactivity.fragment.TimerPickerListener
import com.generation.androidactivity.model.Categoria
import com.generation.androidactivity.model.Tarefa
import java.time.LocalDate

class FormFragment : Fragment(),TimerPickerListener {

    private lateinit var binding: FragmentFormBinding
    private val mainViewModel: MainViewModel by activityViewModels()
    private var categoriaSelecinada = 0L

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentFormBinding.inflate(layoutInflater, container,false)

        mainViewModel.listCategoria()

        mainViewModel.dataSelecionada.value = LocalDate.now()

        mainViewModel.myCategoriaResponse.observe(viewLifecycleOwner){
             response -> Log.d("Requisicao", it.body().toString())
            spinnerCategoria(response.body())
        }

        mainViewModel.dataSelecionada.observe(viewLifecycleOwner){
            selectedDate -> binding.editDate.setText(selectedDate.toString())
        }

        binding.buttonSalvar.setOnClickListener {
            inserirBanco()
        }

        binding.edtData.setOnClickListenner {
            DatePickerFragment(this)
                .show(parentFragmentManager, "DatePicker")

        }

        return binding.root
    }

        private fun spinnerCategoria(listCategoria: List<Categoria>?) {

            if(listCategoria != null) {
                binding.spinnerCategoria.adapter=
                    ArrayAdapter(
                        requireContext(),
                        androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
                        listCategoria
                    )
                binding.spinnerCategoria.onItemSelectedListener =
                    object : AdapterView.OnItemSelectedListener{
                        override fun onItemSelected(p0: AdapterView<*>?, p1:  View?,
                            p2: Int,
                            p3: Long) {
                          val selected = binding.spinnerCategoria.selectedItem as Categoria

                            categoriaSelecinada = selected.id
                        }
                    }

            }

        }

    private fun validarCampos(nome: String, descricao: String, responsavel: String): Boolean{

        return !(
                nome == "" || nome.length <3 || nome, length > 20) ||
        (descricao == || descricao.length <5 || descricao.length >200) ||
        (responsavel =="" || responsavel.length <3 || responsavel.length > 20)
                )
    }

    private fun inserirBanco(){
        val nome =  binding.editNome.text.toString()
        val desc =  binding.editDescricao.text.toString()
        val resp =  binding.editResponsavel.text.toString()
        val data =  binding.editData.text.toString()
        val status =  binding.switchaAtivoCard.isChecked
        val categoria = Categoria(categoriaSelecinada,null, null)

        if (validarCampos(nome, desc, resp)) {
            val tarefa = Tarefa(nome, desc, resp, data, status, categoria)
            mainViewModel.addTarefa(Tarefa)
            Toast.makeText(context, "Tarefa Criada !" Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.action_formFragment_to_blankFragment)

        }else{
            Toast.makeText(context,"Verificar Campo",Toast.LENGTH_LONG).show()
        }

    }

    override fun OnDateSelected(date: LocalDate){
        mainViewModel.dataSelecionada.value = date

    }
}