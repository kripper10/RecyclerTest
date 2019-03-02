package product.app.com.testapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentTransaction
import product.app.com.testapp.DataService.FirstPersonDataService
import product.app.com.testapp.DataService.SecondPersonDataService
import product.app.com.testapp.Fragments.SearchFragment

class MainActivity : AppCompatActivity() {


    lateinit var searchFragment: SearchFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        searchFragment = SearchFragment()


        supportFragmentManager.
                beginTransaction().
                replace(R.id.fragment_search, searchFragment, "searchFragment")
                .addToBackStack(searchFragment.toString())
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .commit()


    }


    fun updateFirstPersonSet(value: Int){

        searchFragment.setResults(FirstPersonDataService.firstPersons[value].count(),
                SecondPersonDataService.secondPersons[value].count())

    }
}
