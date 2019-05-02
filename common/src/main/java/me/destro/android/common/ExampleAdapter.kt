package me.destro.android.common

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import me.destro.android.common.databinding.ItemSamplePreviewBinding
import android.view.LayoutInflater


class ExampleAdapter : RecyclerView.Adapter<ExampleAdapter.ViewHolder>() {
    var exampleItems: List<ExampleItem>? = null

    private var listener: ((ExampleItem) -> Unit)? = null

    fun setOnItemClickedListener(listener: ((ExampleItem) -> Unit)) {
        this.listener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val contactView = inflater.inflate(R.layout.item_sample_preview, parent, false)

        return ViewHolder(contactView)
    }

    override fun getItemCount(): Int = exampleItems?.size ?: 0

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(exampleItems?.get(position) ?: return, listener)
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {

        private val binding : ItemSamplePreviewBinding = DataBindingUtil.bind(view)!!

        private var title: TextView = binding.title
        private var description: TextView = binding.description

        fun bindView(item: ExampleItem, listener: ((ExampleItem) -> Unit)?) {
            itemView.setOnClickListener {
                if (listener != null)
                    listener(item)
            }
            title.text = item.title
            description.text = item.description
        }

    }
}