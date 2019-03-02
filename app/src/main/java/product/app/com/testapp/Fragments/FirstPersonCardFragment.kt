package product.app.com.testapp.Fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import product.app.com.testapp.R


/**
 * A simple [Fragment] subclass.
 */
class FirstPersonCardFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_first_person_card, container, false)
    }


}// Required empty public constructor
