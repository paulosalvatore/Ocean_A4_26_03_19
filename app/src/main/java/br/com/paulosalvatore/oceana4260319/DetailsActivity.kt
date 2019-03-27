package br.com.paulosalvatore.oceana4260319

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_details.*
import kotlinx.android.synthetic.main.content_details.*
import org.jetbrains.anko.startActivity

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                    .setAction("Action", null).show()

            val text = etText.text.toString()

//            val intent = Intent(this, MainActivity::class.java)
//            intent.putExtra("TEXT", text)
//            startActivity(intent)

            startActivity<MainActivity>("TEXT" to text)
        }
    }

}
