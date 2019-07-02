package com.coolreecedev.spendthrift


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "food"
private const val ARG_PARAM2 = "spent"

/**
 * A simple [Fragment] subclass.
 *
 */
class DetailFragment : Fragment() {

    private var param1: String? = null
    private var param2: Float? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getFloat(ARG_PARAM2, 0.0f)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_detail, container, false)

        val nameAndPrice = "$param1 $param2"

        val nameText = view.findViewById<TextView>(R.id.name_text)

        nameText.text = nameAndPrice

        return view
    }


}
