package com.example.composetester

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.random.Random


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ColorBoxMax()
        }
    }
}

//@Composable
//fun ColorBox () {
//    val colorState = remember {
//        mutableStateOf(Color.Yellow)
//    }
//
// It is necessary to remember the current state of the layout ( Box ) because
// at the time of recomposition, the state might be lost and the state is set back to initial value
// which is Color.Yellow
//
//    Box(modifier = Modifier
//        .background(colorState.value)
//        .clickable {
//            colorState.value = Color(
//                Random.nextFloat(),
//                Random.nextFloat(),
//                Random.nextFloat(),
//                1f
//                // alpha value represents the opacity/transparency
//            )
//        }
//        .fillMaxSize()
//    )
//}

@Composable
fun ColorBoxMax() {

    val colorState = remember {
        mutableStateOf(Color.Yellow)
    }

    // It is necessary to remember the current state of the layout ( Box ) because
    // at the time of recomposition, the state might be lost and the state is set back to initial value
    // which is Color.Yellow

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorState.value),
        contentAlignment = Alignment.Center
    ) {
        Box(modifier = Modifier
            .clickable {
                colorState.value = Color(
                    Random.nextFloat(), Random.nextFloat(), Random.nextFloat(), 0.75f
                )
            }
            .background(Color.Gray, shape = RoundedCornerShape(20))
            .padding(15.dp)) {
            Text(text = "Click", color = Color.White, fontSize = 20.sp)
        }

    }
}
