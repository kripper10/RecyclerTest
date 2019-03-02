package product.app.com.testapp.RecyclerAdapter

import android.support.v7.widget.RecyclerView

/**
 * Created by Chris on 01/03/2019.
 */
abstract class BaseRecyclerViewAdapter<T, VH: RecyclerView.ViewHolder>(
        items: List<T> = listOf()
) : RecyclerView.Adapter<VH>() {

    private var data = items.toMutableList()

    override fun getItemCount(): Int = data.size

    fun addItems(items: List<T>){
        data.addAll(items)
        notifyItemRangeInserted(data.size - items.size, items.size)
    }

    fun clear(){
        data = mutableListOf()
        notifyDataSetChanged()
    }

    fun setData(items: List<T>){
        data = items.toMutableList()
        notifyDataSetChanged()
    }

    fun getData(position: Int) = data[position]
}