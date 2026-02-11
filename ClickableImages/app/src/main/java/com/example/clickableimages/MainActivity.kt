package com.example.clickableimages

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.clickableimages.ui.theme.ClickableImagesTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ClickableImagesTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    ScreenContent()
                }
            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenContent() {
    val brightPurple = Color(0xFF6F00FF)

    Scaffold(
        topBar = {
            TopAppBar(
                title={Text("Project1Screen2")},
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor=brightPurple,
                    titleContentColor=Color.White,
                )
            )
        }
    ) {
            padding -> InteractiveView(modifier = Modifier.padding(paddingValues=padding))
    }
}

@Composable
fun InteractiveView(modifier: Modifier) {
    var clickCount1 by remember {mutableStateOf(0)}


    Column(modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.spacedBy(105.dp),
    horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.height(16.dp))
        Row() {
            Image(
                painter = painterResource(R.drawable.axonn),
                contentDescription = "Axonn",
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(width = 135.dp, height = 130.dp).
                clickable{clickCount1++}
            )
        }
    }
}