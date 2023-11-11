package com.example.hedgehogs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


class DetailFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
        val img = view?.findViewById<ImageView>(R.id.imageView)
    }
    // обновление текстового поля
    fun setSelectedItem(selectedItem: String?) {
        val views = view?.findViewById<TextView>(R.id.textView)
        val img = view?.findViewById<ImageView>(R.id.imageView)
        when(selectedItem){
            "Енисейский соболь"-> {views?.setText(R.string.eni)
                                img?.setImageResource(R.drawable.eni)
            }
            "Баргузинский соболь"-> {views?.setText(R.string.bal)
                img?.setImageResource(R.drawable.bal)
            }
            "Алтайский соболь"-> {views?.setText(R.string.alti)
                img?.setImageResource(R.drawable.a)
            }
        }
    }
}
