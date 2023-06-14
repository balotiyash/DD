package com.balotiyash.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.balotiyash.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Profile()
                }
            }
        }
    }
}

@Composable
fun Profile(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.ves_logo_c1)
    Column(
//        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(color = Color(0xFFFFF4F4))
            .padding(top = 172.dp)
    ) {
        Image(
            painter = image,
            contentDescription = null,
//            contentScale = ContentScale.Crop
            modifier = Modifier
                .size(200.dp)
        )
        Text(
            text = "Yash Balotiya",
            fontSize = 50.sp,
            color = Color.DarkGray,
            modifier = Modifier
                .padding(top = 4.dp, bottom = 8.dp)
        )
        Text(
            text = "Computer Engineer",
            color = Color.Magenta
        )
    }
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .padding(start = 72.dp, bottom = 28.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(8.dp)
        ) {
            val callImage = painterResource(R.drawable.call_fill0_wght400_grad0_opsz48)
            Image(
                painter = callImage,
                contentDescription = null
            )
            Text(
                text = "+91 9920780823",
                modifier = Modifier
                    .padding(start = 20.dp)
            )
        }
        Row(
            modifier = Modifier
                .padding(8.dp)
        ) {
            val shareImage = painterResource(R.drawable.share_fill0_wght400_grad0_opsz48)
            Image(
                painter = shareImage,
                contentDescription = null
            )
            Text(
                text = "@bella_ciao_adios",
                modifier = Modifier
                    .padding(start = 20.dp)
            )
        }
        Row(
            modifier = Modifier
                .padding(8.dp)
        ) {
            val mailImage = painterResource(R.drawable.mail_fill0_wght400_grad0_opsz48)
            Image(
                painter = mailImage,
                contentDescription = null
            )
            Text(
                text = "balotiyash@gmail.com",
                modifier = Modifier
                    .padding(start = 20.dp)
            )
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        Profile()
    }
}