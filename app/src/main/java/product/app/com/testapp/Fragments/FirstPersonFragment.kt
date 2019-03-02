package product.app.com.testapp.Fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_first_person.*
import product.app.com.testapp.DataService.FirstPersonDataService
import product.app.com.testapp.DataService.SecondPersonDataService

import product.app.com.testapp.R
import product.app.com.testapp.RecyclerAdapter.FirstPersonRecycleAdapter


/**
 * A simple [Fragment] subclass.
 */
class FirstPersonFragment : Fragment() {

    lateinit var firstPersonRecycleAdapter: FirstPersonRecycleAdapter
    var indexer = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        indexer = arguments!!.getInt("indexValue")


    }
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
            return inflater?.inflate(R.layout.fragment_first_person, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        firstPersonRecycleAdapter = FirstPersonRecycleAdapter(context.applicationContext, FirstPersonDataService.firstPersons[indexer]){

        }
        firstPersonRecycler.adapter = firstPersonRecycleAdapter
        val layoutManager = LinearLayoutManager(context)
        firstPersonRecycler.layoutManager = layoutManager

        //

    }

    fun updateValues(){

    }

    companion object {

        fun newInstance(indexSelected: Int): FirstPersonFragment{
            val args = Bundle()
            args.putInt("indexValue", indexSelected)
            val fragment = FirstPersonFragment()
            fragment.arguments = args
            return fragment

        }
    }


}// Required empty public constructor
