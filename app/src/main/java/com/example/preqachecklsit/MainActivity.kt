package com.example.preqachecklsit

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.preqachecklsit.databinding.ActivityMainBinding
import com.example.preqachecklsit.ui.theme.PreQaChecklsitTheme
import com.google.firebase.database.DatabaseReference

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var database : DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

 /*       setContent {
            PreQaChecklsitTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
  */
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.R.id.click_me.setOnClickListenter

        val clickme = findViewById<Button>(R.id.click_me)

        clickme.setOnClickListener {
            //Toast.makeText(this, "Button Clicked",Toast.LENGTH_SHORT).show()
        }
    }
}


/*
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PreQaChecklsitTheme {
        Greeting("Android")
    }
}
 */