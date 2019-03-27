package br.com.paulosalvatore.oceana4260319

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.longToast
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = intent.getStringExtra("TEXT")
        tvMain.text = text

//        Toast.makeText(this, "Received Text: $text", Toast.LENGTH_LONG).show()
        longToast("Received Text: $text")

        btSend.setOnClickListener {
            updateName()
        }

        etName.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                updateName()
            }
        })
    }

    fun updateName() {
        if (etName.text.isNotEmpty()) {
            tvMain.text = etName.text.toString()
        } else {
            etName.error = "Type your name"
        }
    }
}
