package com.example.jetpackcompose_helloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcompose_helloworld.ui.theme.JetpackCompose_HelloWorldTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //Text(text = "Este es mi primer programa en Kotlin y Android Studio")
            MaterialTheme(){
                Column() {
                    PersonalData(name = "Alejandro Sebastian Huamán Ruiz")
                    //PreviewPersonalData()
                }
            }
        }
    }
}

@Composable
private fun PersonalData(name:String){
    MaterialTheme (){
        Column() {
            Text(text = "Mi nombre es $name")
            Text(text = "Seccion WX71")
            Text(text= "Viernes 01/04...")
        }
    }
    //Si no colocas un formato en orden te saldra los text en el mismo lugar
    //Text(text = "Mi nombre es $name")
    //Text(text = "Seccion Wx71")
    //Text(text= "Viernes 01/04...")
}

@Preview(showBackground = true)
@Composable
fun PreviewPersonalData(){
    PersonalData(name= "App. Moviles")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    Text(text = "Mi primer programa en Kotlin",style = MaterialTheme.typography.h4)
}

//Esto se comiteara en github