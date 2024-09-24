package com.example.designlayouttest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.designlayouttest.ui.theme.AppTheme

//import com.example.designlayouttest.ui.

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun Greeting(
    modifier: Modifier = Modifier,
    name: String = "Sin valor"
) {
    Column{
        Text(
            text = "Hello! $name!",
            color = Color.Red,
            fontSize = 12.sp,
            modifier = modifier
                .padding(10.dp)
        )
        Goodbye()
        Logo()
    }
}

@Composable
fun Goodbye(){
    Text("Chao Mundo ! ")
}


@Composable
fun Logo(){
    val image = painterResource(R.drawable.logo_rocket)
    Image(
        painter =  image,
        contentDescription = null
    )
}