package product.app.com.testapp.Fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_search.view.*
import product.app.com.testapp.Adapter.MyResultAdapter
import product.app.com.testapp.MainActivity
import product.app.com.testapp.R


/**
 * A simple [Fragment] subclass.
 */
class SearchFragment : Fragment() {

    lateinit var searchView: View


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        searchView = inflater!!.inflate(R.layout.fragment_search, container, false)


        searchView.btnOne.setOnClickListener{
            (activity as MainActivity).updateFirstPersonSet(0)
        }

        searchView.btnTwo.setOnClickListener {
            (activity as MainActivity).updateFirstPersonSet(1)
        }

        return searchView

    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }


    fun setResults(firstpersonCount: Int, secondPersonCount: Int){
        searchView.personResultsVP.adapter = MyResultAdapter(childFragmentManager, firstpersonCount, secondPersonCount)
        searchView.tabs_main.setupWithViewPager(searchView.personResultsVP)
    }


}// Required empty public constructor
