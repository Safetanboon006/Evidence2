// video 15 nothing to do
// commit
// video 21 teach how to fix gradle
// video 23 teach read Log
// video 25 teach log activty
package com.example.buttonclick

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

private const val TAG="MainActivity"
private const val TEXT_CONTENTS="TextContent"


class MainActivity : AppCompatActivity() {

    private var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
       Log.d(TAG,"onCreate:called")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userInput = findViewById<EditText>(R.id.editText)
        val button = findViewById<Button>(R.id.button)
        textView = findViewById<TextView>(R.id.textView)
        textView?.text=""
        textView?.movementMethod=ScrollingMovementMethod()
        userInput.setText("")

        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG,"onCreate:called")
                textView?.append(userInput.text)
                textView?.append("\n")
       //         userInput.text.clear()
                userInput.setText("")
            }
        })
    }
    override fun onStart(){
        Log.d(TAG,"onStart:called")
        super.onStart()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.d(TAG,"onRestoreInstanceState:called")
        super.onRestoreInstanceState(savedInstanceState)
    //    val savedString=savedInstanceState?.getString(TEXT_CONTENTS,"")
     //   textView?.text=savedString
        textView?.text=savedInstanceState?.getString(TEXT_CONTENTS,"")
    }

    override fun onResume() {
        Log.d(TAG,"onResume:called")
        super.onResume()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.d(TAG,"onSaveInstanceState:called")
        super.onSaveInstanceState(outState)
        outState?.putString(TEXT_CONTENTS,textView?.text.toString())
    }

    override fun onStop() {
        Log.d(TAG,"onStop:called")
        super.onStop()
    }

    override fun onRestart() {
        Log.d(TAG,"onRestart:called")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.d(TAG,"onDestroy:called")
        super.onDestroy()
    }
}
