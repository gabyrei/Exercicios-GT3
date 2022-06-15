package com.generation.androidactivity

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.generation.androidactivity.adapter.TarefaAdapter
import javax.net.ssl.SSLSessionBindingEvent

private


 */
class BlankFragment : Fragment() {

    private lateinit var binding: FragmentListBinding
    private val mainViewModel: MainViewModel by activityViewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = BlankFragment(layoutInflater, container, false)

        mainViewModel.listTarefa()

        //Configuraçao do RecyclerView
        val adapter = TarefaAdapter()
        binding.recylerTarefa.layoutManager = LinearLayoutManager(context)
        binding.recylerTarefa.adapter = adapter
        binding.recylerTarefa.setHasFixedSize(true)

        binding.floatingAdd.setOnClickListener {
            findNavController().navigate(R.id.action_formFragment_to_blankFragment)
        }

        mainViewModel.myTarefaResponse.observe(viewLifecycleOwner){
            response -> if(response !=null){
                adapter.setList(response.body()!!)
        }
        }

        return  binding.root
    }


}

