package com.example.project0

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project0.ui.theme.Project0Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Project0Theme {
                Column(modifier = Modifier.fillMaxSize().padding(end = 16.dp), horizontalAlignment = Alignment.Start, verticalArrangement = Arrangement.SpaceEvenly) {
                    Text("My", fontSize = 48.sp)
                    Text("name", fontSize = 48.sp)
                    Text("is", fontSize = 48.sp)
                    Text("Matthew", fontSize = 48.sp)
                    Text("McAlarney", fontSize = 48.sp)
                }

            }
        }
    }
}

