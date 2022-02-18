package com.example.challenge_01


import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        imageAvatar.setOnClickListener(this)
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

    }

    override fun onClick(View: View) {
        val id = View.id;
        when {
            id === R.id.button1 -> {
                val imageUri = "https://github.com/kenjimaeda54.png"
                Picasso.with(this).load(imageUri).resize(200,200 ).into(imageAvatar);
            }
            id === R.id.button2 -> {
                val imageUri = "https://github.com/facebook.png"
                Picasso.with(this).load(imageUri).resize(200,200 ).into(imageAvatar);
            }
            else -> {
                val imageUri = "https://github.com/google.png"
                Picasso.with(this).load(imageUri).resize(200,200 ).into(imageAvatar);
            }
        }
    }
}


