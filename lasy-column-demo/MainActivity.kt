package com.example.composetester

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumnDemo()
        }
    }
}

//@Composable
//fun LazyColumnDemo () {
//
//    val scrollState = rememberScrollState()
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .verticalScroll(scrollState),
//        horizontalAlignment = Alignment.CenterHorizontally
//    )
//    {
//        for(i in 1..50) {
//            Text(text = "Index $i", style = TextStyle(
//                color = Color.Black,
//                fontWeight = FontWeight.Bold,
//                fontSize = 25.sp
//            ),
//            modifier = Modifier.padding(15.dp))
//        }
//    }
//}

@Composable
fun LazyColumnDemo() {
    LazyColumn (modifier = Modifier.fillMaxSize())
    {
        items(50) {
            Text(text = "Index $it", style = TextStyle(
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp
            ),
            modifier = Modifier.padding(15.dp))
        }
    }

}

//@Composable
//fun ItemIndexDemo () {
//    LazyColumn() {
//        itemsIndexed(
//            listOf("Hey", "there", "you", "stupid", "whore")
//        ) {
//            index, string ->
//            Text(text = string)
//        }
//    }
//}


//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    ComposeTesterTheme {
//        LazyColumnDemo()
//    }
//}