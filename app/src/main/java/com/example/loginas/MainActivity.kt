package com.example.loginas

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import com.example.loginas.ui.theme.LoginASTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginScreen()
        }
    }
}

@Composable
fun LoginScreen(){
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(painter = painterResource(id = R.drawable.loginsvg), contentDescription = "Login Image",
            modifier = Modifier.size(200.dp))
        Text(text = "Welcome Back", fontSize = 28.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier =   Modifier.height(4.dp))

        Text(text = "Login to your account")

        Spacer(modifier =   Modifier.height(16.dp))
        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "Email Address")
        })

        Spacer(modifier =   Modifier.height(16.dp))
        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "Password")
        })

        Spacer(modifier =   Modifier.height(16.dp))
        Button(onClick = {}) {
            Text(text = "Login")
        }

        Spacer(modifier =   Modifier.height(32.dp))
        Text(text = "Forgot Password?", modifier = Modifier.clickable {

        })

        Spacer(modifier =   Modifier.height(32.dp))
        Text(text = "Or sign in with")

        Row (
            modifier = Modifier.fillMaxWidth().padding(48.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Image(painter = painterResource(id = R.drawable.facebook),
                contentDescription = "Facebook",
                modifier = Modifier.size(68.dp).clickable {
                    //Facebook Clicked
                }
            )

            Image(painter = painterResource(id = R.drawable.google),
                contentDescription = "Google",
                modifier = Modifier.size(68.dp).clickable {
                    //Google Clicked
                }
            )
        }
    }
}
