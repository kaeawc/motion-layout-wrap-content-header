package io.kaeawc.motionlayoutwrapheader

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class WidgetAdapter : RecyclerView.Adapter<WidgetViewHolder>() {

    override fun getItemViewType(position: Int): Int {
        return R.layout.widget_item
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WidgetViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(viewType, parent, false)
        return WidgetViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: WidgetViewHolder, position: Int) {
        // no need to bind anything
    }
}
