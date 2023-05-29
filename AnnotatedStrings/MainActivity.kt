package com.example.composetester

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val fontFamily = FontFamily(
    Font(R.font.lexend_bold, FontWeight.Bold),
    Font(R.font.lexend_extrabold, FontWeight.ExtraBold),
    Font(R.font.lexend_light, FontWeight.Light)
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Example()
        }
    }
}

@Composable
fun Example() {
    Box(
        modifier = Modifier
            .background(Color.Gray)
            .border(3.dp, Color.Black, RectangleShape)
            .padding(10.dp)
    )
    {
        Text(
            text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        color = Color.Green,
                        fontSize = 50.sp,
                        fontStyle = FontStyle.Italic
                    )
                ) {
                    append("J")
                }
                append("etpack ")
                withStyle(
                    style = SpanStyle(
                        color = Color.Green,
                        fontSize = 50.sp,
                        fontStyle = FontStyle.Italic
                    )
                ) {
                    append("C")
                }
                append("ompose")

            },
            color = Color(0xFFFFA500),
            fontSize = 30.sp,
            fontFamily = fontFamily,
            fontWeight = FontWeight.ExtraBold,
            textDecoration = TextDecoration.Underline
        )
    }
}


