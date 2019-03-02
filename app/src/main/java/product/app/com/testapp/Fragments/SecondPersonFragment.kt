package product.app.com.testapp.Fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_second_person.*
import product.app.com.testapp.DataService.SecondPersonDataService

import product.app.com.testapp.R
import product.app.com.testapp.RecyclerAdapter.SecondPersonRecycleAdapter


/**
 * A simple [Fragment] subclass.
 */
class SecondPersonFragment : Fragment() {

    lateinit var secondPersonAdapter: SecondPersonRecycleAdapter


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_second_person, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        secondPersonAdapter = SecondPersonRecycleAdapter(context.applicationContext, SecondPersonDataService.secondPersons[0]){

        }
        secondPersonRecycler.adapter = secondPersonAdapter
        val layoutManager = LinearLayoutManager(context)
        secondPersonRecycler.layoutManager = layoutManager
        secondPersonAdapter.addItems(SecondPersonDataService.secondPersons[0])
        //testing for this



    }


}// Required empty public constructor
