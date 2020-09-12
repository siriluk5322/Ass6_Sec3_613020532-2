package com.example.ass6_sec3_613020532_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_three.view.*
import kotlinx.android.synthetic.main.fragment_two.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ThreeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ThreeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_three,container,false)
        view.btnClickFragThree.setOnClickListener(){
            var fragment = ThreeFragment()
            replaceFragment(fragment)
        }
        return view
    }

    fun replaceFragment(someFragment: Fragment){
        var  transaction = fragmentManager!!.beginTransaction()
        transaction.replace(R.id.frameLayout,OneFragment())
        transaction.addToBackStack(null)
        transaction.commit()
    }
}