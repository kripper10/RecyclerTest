package product.app.com.testapp.RecyclerAdapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import product.app.com.testapp.Model.FirstPersonData
import product.app.com.testapp.Model.SecondPersonData
import product.app.com.testapp.R


/**
 * Created by Chris on 20/02/2019.
 */
class FirstPersonRecycleAdapter(val context: Context, val firstPerson: List<FirstPersonData>, val itemClick: (Int)-> Unit):
        BaseRecyclerViewAdapter<FirstPersonData,FirstPersonRecycleAdapter.Holder>(){
    override fun onBindViewHolder(holder: Holder?, position: Int) {
        holder?.bindLocationData(getData(position), context)
    }





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent?.context)
                .inflate(R.layout.fragment_first_person_card, parent, false)
        return Holder(view, itemClick)
    }






        inner class Holder(itemView: View?, val itemClick: (Int) -> Unit) : RecyclerView.ViewHolder(itemView) {

            val name = itemView?.findViewById<TextView>(R.id.Name)
            val dob = itemView?.findViewById<TextView>(R.id.DOB)
            val address = itemView?.findViewById<TextView>(R.id.Address)


            fun bindLocationData(person: FirstPersonData, context: Context){
                name?.text = person.name
                dob?.text = person.dob
                address?.text = person.address

                itemView.setOnClickListener { itemClick(position) }

            }
        }

}

