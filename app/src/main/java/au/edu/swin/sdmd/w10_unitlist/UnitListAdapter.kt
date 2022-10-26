package au.edu.swin.sdmd.w10_unitlist

import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UnitListAdapter(private val mUnitList: List<MyUnit>):
    RecyclerView.Adapter<UnitListAdapter.UnitViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): UnitListAdapter.UnitViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater
            .inflate(R.layout.layout_row, parent, false) as View
        return UnitViewHolder(view)
    }

    override fun getItemCount() = mUnitList.size

    override fun onBindViewHolder(holder: UnitListAdapter.UnitViewHolder, position: Int) {
        val current: MyUnit = mUnitList.get(position)
        holder.bind(current)
    }

    inner class UnitViewHolder(private val v: View) : RecyclerView.ViewHolder(v) {
        val unitItemView: TextView = v.findViewById(R.id.unit_title)
        val imageView: ImageView = v.findViewById(R.id.unit_image)

        fun bind(item: MyUnit) {
            unitItemView.text = item.unit

            // TODO() Change your scenario by uncommenting these lines
            //imageView.setImageBitmap(item.drawIcon()) // ensure item.icon in MyUnit is null
            imageView.setImageBitmap(item.icon) // ensure item.icon in MyUnit = drawIcon()
            //imageView.setImageBitmap(
            //    BitmapFactory.decodeResource(
            //        itemView.context.resources, R.drawable.trencher)
            //) // ensure item.icon in MyUnit is null
        }

    }


}