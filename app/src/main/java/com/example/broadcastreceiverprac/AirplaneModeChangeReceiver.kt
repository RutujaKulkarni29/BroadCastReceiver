package com.example.broadcastreceiverprac

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneModeChangeReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val isAirplaneModeOn = intent?.getBooleanExtra("state", false)
        if (isAirplaneModeOn == true) {
            Toast.makeText(context, "Airplane Mode On", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(context, "Airplane Mode Off", Toast.LENGTH_SHORT).show()
        }
    }
}