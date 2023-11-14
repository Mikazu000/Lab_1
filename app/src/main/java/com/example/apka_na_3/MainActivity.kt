package com.example.apka_na_3


import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.DefaultShadowColor
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    private var showSecondScreen by mutableStateOf(false)
    private var showThirdScreen by mutableStateOf(false)
    private var showFourthScreen by mutableStateOf(false)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val context = LocalContext.current

            Buttons(onOrangeClick = {
                Toast.makeText(context, "Wybrany Charmander", Toast.LENGTH_SHORT).show()
                showSecondScreen = true
            }, onGreenClick = {
                Toast.makeText(context, "Wybrany Bulbasaur", Toast.LENGTH_SHORT).show()
                showThirdScreen = true
            }, onLightBlueClick = {
                Toast.makeText(context, "Wybrany Squirtle", Toast.LENGTH_SHORT).show()
                showFourthScreen = true
            })

            if (showSecondScreen) {
                SecondScreen()
            } else if (showThirdScreen) {
                ThirdScreen()
            } else if (showFourthScreen) {
                FourthScreen()
            }
        }
    }

    @Composable
    fun Buttons(onOrangeClick: () -> Unit, onGreenClick: () -> Unit, onLightBlueClick: () -> Unit) {
        Row(
            modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = onOrangeClick,
                colors = ButtonDefaults.buttonColors(
                    Color.Transparent,
                    contentColor = Color.Black

                )

            ) {
                Text(text = " Charmander ")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = onGreenClick,
                colors = ButtonDefaults.buttonColors(
                    Color.Transparent,
                    contentColor = Color.Black
                )
            ) {
                Text(text = " Bulbasaur ")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = onLightBlueClick,
                colors = ButtonDefaults.buttonColors(
                    Color.Transparent,
                    contentColor = Color.Black
                )
            ) {
                Text(text = " Squirtle ")
            }
        }
    }

    @Composable
    fun SecondScreen() {
        val context = LocalContext.current
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFFEEA853)

        ) {
            Image(painter = painterResource(id = R.drawable.charmander), contentDescription = "")
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Buttons(onOrangeClick = {
                    Toast.makeText(context, "Wybrany Charmander", Toast.LENGTH_SHORT).show()
                    showThirdScreen = true
                    showSecondScreen = false
                }, onGreenClick = {
                    Toast.makeText(context, "Wybrany Bulbasaur", Toast.LENGTH_SHORT).show()
                    showThirdScreen = true
                    showSecondScreen = false
                }, onLightBlueClick = {
                    Toast.makeText(context, "Wybrany Squirtle", Toast.LENGTH_SHORT).show()
                    showFourthScreen = true
                    showSecondScreen = false
                })
            }
        }
    }

    @Composable
    fun ThirdScreen() {
        val context = LocalContext.current

        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFF32E2A4)
        ) {
            Image(painter = painterResource(id = R.drawable.bulbasaur), contentDescription = "")
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Buttons(onOrangeClick = {
                    Toast.makeText(context, "Wybrany Charmander", Toast.LENGTH_SHORT).show()
                    showSecondScreen = true
                    showThirdScreen = false
                }, onGreenClick = {
                    Toast.makeText(context, "Wybrany Bulbasaur", Toast.LENGTH_SHORT).show()
                    showSecondScreen = true
                    showThirdScreen = false
                }, onLightBlueClick = {
                    Toast.makeText(context, "Wybrany Squirtle", Toast.LENGTH_SHORT).show()
                    showFourthScreen = true
                    showThirdScreen = false
                })
            }
        }
    }

    @Composable
    fun FourthScreen() {
        val context = LocalContext.current

        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFF1AD8D8)
        ) {
            Image(painter = painterResource(id = R.drawable.squirtle), contentDescription = "")
            Column(
                modifier = Modifier.fillMaxSize(),
                // horizontalAlignment = Alignment.CenterVertically,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Buttons(onOrangeClick = {
                    Toast.makeText(context, "Wybrany Charmander", Toast.LENGTH_SHORT).show()
                    showSecondScreen = true
                    showFourthScreen = false
                }, onGreenClick = {
                    Toast.makeText(context, "Wybrany Bulbasaur", Toast.LENGTH_SHORT).show()
                    showThirdScreen = true
                    showFourthScreen = false
                }, onLightBlueClick = {
                    Toast.makeText(context, "Wybrany Squirtle", Toast.LENGTH_SHORT).show()
                })
                Spacer(modifier = Modifier.height(16.dp))
                Text(text = "Screen Pink", color = Color.Black)
            }
        }
    }
}