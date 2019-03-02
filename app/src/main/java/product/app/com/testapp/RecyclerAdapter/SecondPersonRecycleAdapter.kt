package product.app.com.testapp.RecyclerAdapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import product.app.com.testapp.Model.SecondPersonData
import product.app.com.testapp.R


/**
 * Created by Chris on 20/02/2019.
 */
class SecondPersonRecycleAdapter(val context: Context, val secondPerson: List<SecondPersonData>, val itemClick: (Int)-> Unit):
        BaseRecyclerViewAdapter<SecondPersonData,SecondPersonRecycleAdapter.Holder>(){
    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bindLocationData(getData(position), context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent?.context)
                .inflate(R.layout.fragment_second_person_card, parent, false)
        return Holder(view, itemClick)
    }

        inner class Holder(itemView: View?, val itemClick: (Int) -> Unit) : RecyclerView.ViewHolder(itemView) {

            val firstName = itemView?.findViewById<TextView>(R.id.firstName)
            val surName = itemView?.findViewById<TextView>(R.id.surname)
            val dob = itemView?.findViewById<TextView>(R.id.DOB)
            val gender = itemView?.findViewById<TextView>(R.id.Gender)
            val pob = itemView?.findViewById<TextView>(R.id.POB)

            fun bindLocationData(person: SecondPersonData, context: Context){

                Log.d("frank", person.firstName)
                firstName?.text = person.firstName
                surName?.text = person.surName
                dob?.text = person.dob
                gender?.text = person.gender
                pob?.text = person.pob

                itemView.setOnClickListener { itemClick(position) }

            }
        }

}

