package product.app.com.testapp.Adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import product.app.com.testapp.Fragments.FirstPersonFragment
import product.app.com.testapp.Fragments.SecondPersonFragment



class MyResultAdapter(fm: FragmentManager, val firstPersonCount: Int,val secondPersonCount:Int) : FragmentPagerAdapter(fm) {




    override fun getItem(position: Int): Fragment {
        if(firstPersonCount > 0 && secondPersonCount > 0){
            return when (position) {
                0 -> FirstPersonFragment()
                else -> {
                    SecondPersonFragment()
                }
            }
        }else if(firstPersonCount > 0){
            return when (position) {
                0 -> FirstPersonFragment()
                else -> {
                    SecondPersonFragment()
                }
            }
        }else{
            return when (position) {
                0 -> SecondPersonFragment()
                else -> {
                    FirstPersonFragment()
                }
            }
        }
    }

    override fun getCount(): Int {
        if(firstPersonCount > 0 && secondPersonCount > 0){
            return 2
        }else{
            return 1
        }


    }

    override fun getPageTitle(position: Int): CharSequence {
        if(firstPersonCount > 0 && secondPersonCount > 0){
            return when (position){
                0 -> "First "+"("+ firstPersonCount.toString() + ")"
                else -> {
                    "Second "+"("+ secondPersonCount.toString() + ")"
                }
            }
        }else if(firstPersonCount > 0){
            return when (position){
                0 -> "First "+"("+ firstPersonCount.toString() + ")"
                else -> {
                    "Second "+"("+ secondPersonCount.toString() + ")"
                }
            }
        }else{
            return when (position){
                0 -> "First "+"("+ secondPersonCount.toString() + ")"
                else -> {
                    "Second "+"("+ firstPersonCount.toString() + ")"
                }
            }
        }
    }

}