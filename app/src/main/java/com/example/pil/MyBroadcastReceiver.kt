package com.example.pil


import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyBroadcastReceiver: BroadcastReceiver(){
    override fun onReceive(context: Context?, intent: Intent?) {
//        val extra = intent?.getStringExtra("My Favorite Color")
        //Toast.makeText(context,intent?.action,Toast.LENGTH_SHORT).show()
//        Toast.makeText(context,extra, Toast.LENGTH_LONG).show()
//        Toast.makeText(applicationContext,"this is toast message",Toast.LENGTH_SHORT).show()
        Toast.makeText(context,"this is toast message",Toast.LENGTH_LONG).show()
//        TestIt("Heel erg grappig")
    }
}