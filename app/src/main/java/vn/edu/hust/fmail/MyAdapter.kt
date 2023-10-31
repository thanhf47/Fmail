package vn.edu.hust.fmail

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import android.os.Parcel
import android.os.Parcelable
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import java.nio.InvalidMarkException
import kotlin.random.Random as Random

class MyAdapter(private val itemList: ArrayList<Item>) : BaseAdapter() {
    override fun getCount(): Int {
        return itemList.size
    }

    override fun getItem(p0: Int): Any {
        return itemList[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    @SuppressLint("NewApi")
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var viewHolder: MyViewHolder
        var itemView: View
        if (p1 == null) {
            itemView = LayoutInflater.from(p2?.context).inflate(R.layout.item_listview, p2, false)
            viewHolder = MyViewHolder()
            viewHolder.imageIcon = itemView.findViewById(R.id.image_view)
            viewHolder.sender = itemView.findViewById(R.id.sender)
            viewHolder.time = itemView.findViewById(R.id.time)
            viewHolder.message = itemView.findViewById(R.id.message)
            viewHolder.checkBox = itemView.findViewById(R.id.checkbox)

            itemView.tag = viewHolder
        }
        else {
            itemView = p1
            viewHolder = itemView.tag as MyViewHolder
        }

        viewHolder.sender.text = itemList[p0].sender
        viewHolder.time.text = itemList[p0].time
        viewHolder.message.text = itemList[p0].message

        val firstLetter = itemList[p0].sender[0]

        val color = itemList[p0].color
        val shape = GradientDrawable()
        shape.shape = GradientDrawable.OVAL
        shape.setColor(color)
        viewHolder.imageIcon.background = shape
        viewHolder.imageIcon.text = firstLetter.toString()
        viewHolder.checkBox.isChecked = itemList[p0].checkBox
        if (itemList[p0].checkBox) viewHolder.checkBox.setButtonDrawable(android.R.drawable.star_on)
        else viewHolder.checkBox.setButtonDrawable(android.R.drawable.star_off)
        viewHolder.checkBox.setOnClickListener{
            itemList[p0].checkBox = (it as CheckBox).isChecked
            if (itemList[p0].checkBox) viewHolder.checkBox.setButtonDrawable(android.R.drawable.star_on)
            else viewHolder.checkBox.setButtonDrawable(android.R.drawable.star_off)
        }
        return itemView
    }
    class MyViewHolder {
        lateinit var imageIcon: Button
        lateinit var sender: TextView
        lateinit var time: TextView
        lateinit var message: TextView
        lateinit var checkBox: CheckBox
    }
}