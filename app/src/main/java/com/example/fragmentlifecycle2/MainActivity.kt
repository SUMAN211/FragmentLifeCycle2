package com.example.fragmentlifecycle2

import android.animation.Animator
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class MainActivity : Fragment() {
            override fun onAttach(context: Context) {
                Toast.makeText(mainActivity, resources.getString(R.string.onattach_fragment), Toast.LENGTH_LONG).show()

                super.onAttach(context)


            }

            override fun onCreate(savedInstanceState: Bundle?) {
                Toast.makeText(mainActivity, resources.getString(R.string.oncreate_fragment), Toast.LENGTH_LONG).show()
                super.onCreate(savedInstanceState)
            }

            override fun onCreateView(
                inflater: LayoutInflater,
                container: ViewGroup?, savedInstanceState: Bundle?

            ): View? {
                Toast.makeText(mainActivity, resources.getString(R.string.oncreate_view_fragment), Toast.LENGTH_LONG).show()
                return super.onCreateView(inflater, container, savedInstanceState)
            }

            override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
                Toast.makeText(mainActivity, resources.getString(R.string.on_view_create_fragment), Toast.LENGTH_LONG).show()
                binding.tvFrag.setOnClickListener {
                    var bundle = Bundle()
                    bundle.putString("Test", "testing")
                    findNavController().navigate(R.id.action_firstFragment_to_secondFragment, bundle)
                }
                super.onViewCreated(view, savedInstanceState)
            }

            override fun onStart() {
                Toast.makeText(mainActivity, resources.getString(R.string.onstart_fragment), Toast.LENGTH_LONG
                ).show()

                super.onStart()
            }

            override fun onResume() {
                Toast.makeText(mainActivity, resources.getString(R.string.onresume_fragment), Toast.LENGTH_LONG
                ).show()
                super.onResume()
            }

            override fun onPause() {
                Toast.makeText(mainActivity, resources.getString(R.string.onpause_fragment), Toast.LENGTH_LONG).show()
                super.onPause()
            }

            override fun onStop() {
                Toast.makeText(mainActivity, resources.getString(R.string.onstop_fragment), Toast.LENGTH_LONG).show()
                super.onStop()
            }

            override fun onDestroy() {
                Toast.makeText(mainActivity, resources.getString(R.string.ondestroy_view_fragment), Toast.LENGTH_LONG
                ).show()
                super.onDestroy()
            }

            override fun onDetach() {
                Toast.makeText(mainActivity, resources.getString(R.string.ondetach_fragment), Toast.LENGTH_LONG).show()
                super.onDetach()
            }

        }


    }
}
