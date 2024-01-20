package com.example.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.ui.theme.WeatherAPPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAPPTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Home()
                }
            }
        }
    }
}

@Composable
fun Home(){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Adityo Arya Putra",
            fontSize = 30.sp)
        Spacer(modifier = Modifier.padding(5.dp))

        BoxHeader()

        Spacer(modifier = Modifier.padding(20.dp))

        Lokasi()

        Spacer(modifier = Modifier.padding(30.dp))

        InfoCuaca()
    }
}

@Composable
fun BoxHeader(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(20.dp))
        .background(Color.LightGray))
    {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(id = R.drawable.background),
                contentDescription = "",
                modifier = Modifier.size(250.dp))
            Text(
                text = "Rain",
                fontSize = 25.sp,
                modifier = Modifier.padding(10.dp)
            )

        }
    }
}


@Composable
fun Lokasi(){
    Text(
        text = "58°C",
        fontSize = 64.sp,
        fontWeight = FontWeight.Bold
    )
    Row(){
        Image(
            painter = painterResource(id = R.drawable.baseline_location_on_24),
            contentDescription = "", modifier = Modifier.size(40.dp)
        )
        Spacer(modifier = Modifier.padding(5.dp))
        Text(text = "Yogyakarta", fontSize = 40.sp)

    }
    Spacer(modifier = Modifier.padding(5.dp))
    Text(text = "Kasihan, Kabupaten Bantul,\n Daerah Istimewa Yogyakarta",
        textAlign = TextAlign.Center,
        color = Color.Gray)
}

@Composable
fun InfoCuaca() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(20.dp))
            .background(Color.LightGray)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally, // Mengatur ke Alignment.Center
                    verticalArrangement = Arrangement.Top
                ) {
                    Text(
                        text = "Humidity",
                        fontSize = 18.sp,
                    )
                    Text(
                        text = "98%",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally, // Mengatur ke Alignment.Center
                    verticalArrangement = Arrangement.Top
                ) {
                    Text(
                        text = "UV/Index",
                        fontSize = 18.sp,
                    )
                    Text(
                        text = "9/10",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally, // Mengatur ke Alignment.Center
                    verticalArrangement = Arrangement.Bottom
                ) {
                    Text(
                        text = "Sunrise",
                        fontSize = 18.sp,
                    )
                    Text(
                        text = "05.00 AM",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally, // Mengatur ke Alignment Center
                    verticalArrangement = Arrangement.Bottom
                ) {
                    Text(
                        text = "Sunset",
                        fontSize = 18.sp,
                    )
                    Text(
                        text = "05.50 PM",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}




@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WeatherAPPTheme {
        Home()
    }
}