package com.indogusmas.dialogfragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_show.setOnClickListener {
            val transaction = supportFragmentManager.beginTransaction()
            val previous = supportFragmentManager.findFragmentByTag(DialogFragment.TAG)
            if (previous != null){
                transaction.remove(previous)
            }
            val dialogFragment = DialogFragment.newInstance("indo", "Ganteng")
            dialogFragment.show(transaction,DialogFragment.TAG)

        }

    }

}
