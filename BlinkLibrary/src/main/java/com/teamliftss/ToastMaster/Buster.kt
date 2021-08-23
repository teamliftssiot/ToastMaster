package com.teamliftss.ToastMaster

import android.content.Context
import android.widget.Toast

object Buster {


    fun bust(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }

}