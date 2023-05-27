package com.example.composetester

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetester.ui.theme.ComposeTesterTheme
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImageCard(painter = painterResource(R.drawable.kermit), contentDescription = "Kermit playing in the snow", title = "Kermit playing in the snow")
            // Example()
        }
    }
}

@Composable
fun ImageCard(
    painter: Painter,
    contentDescription: String,
    title: String
)
{
    Column (modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
    )
    {
        Row(modifier = Modifier.fillMaxWidth()) {
            Card(
                shape = RoundedCornerShape(10.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 20.dp),
                modifier = Modifier
                    .padding(12.dp)
                    .size(200.dp, 200.dp)
                    .weight(1f)
            ) {
                Box(modifier = Modifier.fillMaxSize()) {
                    Image(
                        painter = painter,
                        contentDescription = contentDescription,
                        contentScale = ContentScale.Crop
                    )

                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                Brush.verticalGradient(
                                    colors = listOf(Color.Transparent, Color.Black),
                                    startY = 300f
                                )
                            )
                    )

                    Box(
                        modifier = Modifier
                            .padding(12.dp)
                            .align(Alignment.BottomStart)
                    ) {
                        Text(
                            text = title,
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 17.sp
                        )
                    }
                }
            }

            Card(
                shape = RoundedCornerShape(10.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 20.dp),
                modifier = Modifier
                    .padding(start = 0.dp, top = 12.dp, end = 12.dp, bottom = 12.dp)
                    .size(200.dp, 200.dp)
                    .weight(1f)
            ) {
                Box(modifier = Modifier.fillMaxSize()) {
                    Image(
                        painter = painter,
                        contentDescription = contentDescription,
                        contentScale = ContentScale.Crop
                    )

                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                Brush.verticalGradient(
                                    colors = listOf(Color.Transparent, Color.Black),
                                    startY = 300f
                                )
                            )
                    )

                    Box(
                        modifier = Modifier
                            .padding(12.dp)
                            .align(Alignment.BottomStart)
                    ) {
                        Text(
                            text = title,
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 17.sp
                        )
                    }
                }
            }
        }

        Row(modifier = Modifier.fillMaxWidth()) {
            Card(
                shape = RoundedCornerShape(10.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 20.dp),
                modifier = Modifier
                    .padding(12.dp)
                    .size(200.dp, 200.dp)
                    .weight(1f)
            ) {
                Box(modifier = Modifier.fillMaxSize()) {
                    Image(
                        painter = painter,
                        contentDescription = contentDescription,
                        contentScale = ContentScale.Crop
                    )

                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                Brush.verticalGradient(
                                    colors = listOf(Color.Transparent, Color.Black),
                                    startY = 300f
                                )
                            )
                    )

                    Box(
                        modifier = Modifier
                            .padding(12.dp)
                            .align(Alignment.BottomStart)
                    ) {
                        Text(
                            text = title,
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 17.sp
                        )
                    }
                }
            }

            Card(
                shape = RoundedCornerShape(10.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 20.dp),
                modifier = Modifier
                    .padding(start = 0.dp, top = 12.dp, end = 12.dp, bottom = 12.dp)
                    .size(200.dp, 200.dp)
                    .weight(1f)
            ) {
                Box(modifier = Modifier.fillMaxSize()) {
                    Image(
                        painter = painter,
                        contentDescription = contentDescription,
                        contentScale = ContentScale.Crop
                    )

                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                Brush.verticalGradient(
                                    colors = listOf(Color.Transparent, Color.Black),
                                    startY = 300f
                                )
                            )
                    )

                    Box(
                        modifier = Modifier
                            .padding(12.dp)
                            .align(Alignment.BottomStart)
                    ) {
                        Text(
                            text = title,
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 17.sp
                        )
                    }
                }
            }
        }

        Row(modifier = Modifier.fillMaxWidth()) {
            Card(
                shape = RoundedCornerShape(10.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 20.dp),
                modifier = Modifier
                    .padding(12.dp)
                    .size(200.dp, 200.dp)
                    .weight(1f)
            ) {
                Box(modifier = Modifier.fillMaxSize()) {
                    Image(
                        painter = painter,
                        contentDescription = contentDescription,
                        contentScale = ContentScale.Crop
                    )

                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                Brush.verticalGradient(
                                    colors = listOf(Color.Transparent, Color.Black),
                                    startY = 300f
                                )
                            )
                    )

                    Box(
                        modifier = Modifier
                            .padding(12.dp)
                            .align(Alignment.BottomStart)
                    ) {
                        Text(
                            text = title,
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 17.sp
                        )
                    }
                }
            }

            Card(
                shape = RoundedCornerShape(10.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 20.dp),
                modifier = Modifier
                    .padding(start = 0.dp, top = 12.dp, end = 12.dp, bottom = 12.dp)
                    .size(200.dp, 200.dp)
                    .weight(1f)
            ) {
                Box(modifier = Modifier.fillMaxSize()) {
                    Image(
                        painter = painter,
                        contentDescription = contentDescription,
                        contentScale = ContentScale.Crop
                    )

                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                Brush.verticalGradient(
                                    colors = listOf(Color.Transparent, Color.Black),
                                    startY = 300f
                                )
                            )
                    )

                    Box(
                        modifier = Modifier
                            .padding(12.dp)
                            .align(Alignment.BottomStart)
                    ) {
                        Text(
                            text = title,
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 17.sp
                        )
                    }
                }
            }
        }

        Row(modifier = Modifier.fillMaxWidth()) {
            Card(
                shape = RoundedCornerShape(10.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 20.dp),
                modifier = Modifier
                    .padding(12.dp)
                    .size(200.dp, 200.dp)
                    .weight(1f)
            ) {
                Box(modifier = Modifier.fillMaxSize()) {
                    Image(
                        painter = painter,
                        contentDescription = contentDescription,
                        contentScale = ContentScale.Crop
                    )

                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                Brush.verticalGradient(
                                    colors = listOf(Color.Transparent, Color.Black),
                                    startY = 300f
                                )
                            )
                    )

                    Box(
                        modifier = Modifier
                            .padding(12.dp)
                            .align(Alignment.BottomStart)
                    ) {
                        Text(
                            text = title,
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 17.sp
                        )
                    }
                }
            }

            Card(
                shape = RoundedCornerShape(10.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 20.dp),
                modifier = Modifier
                    .padding(start = 0.dp, top = 12.dp, end = 12.dp, bottom = 12.dp)
                    .size(200.dp, 200.dp)
                    .weight(1f)
            ) {
                Box(modifier = Modifier.fillMaxSize()) {
                    Image(
                        painter = painter,
                        contentDescription = contentDescription,
                        contentScale = ContentScale.Crop
                    )

                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                Brush.verticalGradient(
                                    colors = listOf(Color.Transparent, Color.Black),
                                    startY = 300f
                                )
                            )
                    )

                    Box(
                        modifier = Modifier
                            .padding(12.dp)
                            .align(Alignment.BottomStart)
                    ) {
                        Text(
                            text = title,
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 17.sp
                        )
                    }
                }
            }
        }
    }
}


//@Composable
//fun Example () {
//    Column(modifier = Modifier.fillMaxSize()) {
//        Box(
//            modifier = Modifier
//                .weight(1f)
//                .background(Color.Red)
//        ) {
//            Text(text = "display-1")
//        }
//
//        Box(
//            modifier = Modifier
//                .weight(2f)
//                .background(Color.Green)
//        ) {
//            Text(text = "display-2")
//        }
//
//        Box(
//            modifier = Modifier
//                .weight(3f)
//                .background(Color.Blue)
//        ) {
//            Text(text = "display-3")
//        }
//    }
//}

//@Composable
//fun Example () {
//    Box(modifier = Modifier.size(100.dp).background(Color.Blue), contentAlignment = Alignment.Center) {
//        Box(modifier = Modifier
//            .size(50.dp)
//            .background(Color.Red)
//            // .align(Alignment.Center)
//        )
//    }
//}


