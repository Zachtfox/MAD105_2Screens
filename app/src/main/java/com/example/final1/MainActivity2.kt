package com.example.final1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity2 : AppCompatActivity() {

    var strengthScore = 0
    var dexScore = 0
    var conScore = 0
    var intelScore = 0
    var wisScore = 0
    var chrScore = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val strength: EditText = findViewById(R.id.idStrengthIn)
        val dex: EditText = findViewById(R.id.idDexIn)
        val con: EditText = findViewById(R.id.idConIn)
        val intel: EditText = findViewById(R.id.idItelIn)
        val wis: EditText = findViewById(R.id.idWisIn)
        val chr: EditText = findViewById(R.id.idChrIn)

        val strengthOut: TextView = findViewById(R.id.idStrengthOut)
        val dexOut: TextView = findViewById(R.id.idDexOut)
        val conOut: TextView = findViewById(R.id.idConOut)
        val intelOut: TextView = findViewById(R.id.idIntelOut)
        val wisOut: TextView = findViewById(R.id.idWisOut)
        val chrOut: TextView = findViewById(R.id.idChrOut)

        strengthScore = strength.text.toString().toInt()
        dexScore = dex.text.toString().toInt()
        conScore = con.text.toString().toInt()
        intelScore = intel.text.toString().toInt()
        wisScore = wis.text.toString().toInt()
        chrScore = chr.text.toString().toInt()

        strengthOut.text = "$strengthScore"
        dexOut.text = "$dexScore"
        conOut.text = "$conScore"
        intelOut.text = "$intelScore"
        wisOut.text = "$wisScore"
        chrOut.text = "$chrScore"



    }
}