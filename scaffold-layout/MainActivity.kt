package com.example.appbardemo

import android.icu.text.CaseMap
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyScaffold()
        }
    }
}
//
//@Composable
//fun MyScaffold() {
//
//    Scaffold(
//        topBar = {
//            TopAppBar(
//                title = {
//                    Text(text = "Demo App")
//                },
//                navigationIcon = {
//                    IconButton(onClick = {})
//                    {
//                        Icon(Icons.Default.Menu, contentDescription = "Menu")
//                    }
//                })
//        },
//        bottomBar = {
//            BottomAppBar(
//                content = {
//                Row(modifier = Modifier
//                    .padding(10.dp)
//                    .fillMaxWidth(),
//                    horizontalArrangement = Arrangement.SpaceEvenly)
//                {
//                    Text(text = "A")
//                    Text(text = "B")
//                    Text(text = "C")
//                }
//            })
//        },
//        content = { paddingValues ->
//            Box(modifier = Modifier.fillMaxSize().padding(paddingValues), contentAlignment = Alignment.Center) {
//                Box{
//                    OutlinedButton(onClick = {  }) {
//                        Text(text = "Click Me Senpai")
//                    }
//                }
//            }
//        },
////        snackbarHost =
//    )
//}

@Composable
fun MyScaffold() {
    Scaffold(
        // modifier = Modifier.fillMaxSize(),
        topBar = {
            // Top app bar
            TopAppBar(
                title = { Text(text = "My App") }, // Title of the app bar
                navigationIcon = {
                    IconButton(onClick = { /*  */ }) {
                        Icon(Icons.Default.Menu, contentDescription = "Menu")
                    }
                },
                actions = {
                    IconButton(onClick = { /*  */ }) {
                        Icon(Icons.Default.Favorite, contentDescription = "Favorite")
                    }
                }
            )
        },
        bottomBar = {

            BottomAppBar(
                content = {
                    Row(
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        IconButton(onClick = { /*  */ }) {
                            Icon(Icons.Default.Home, contentDescription = "Home")
                        }
                        IconButton(onClick = { /*  */ }) {
                            Icon(Icons.Default.Favorite, contentDescription = "Favorite")
                        }
                        IconButton(onClick = { /*  */ }) {
                            Icon(Icons.Default.Settings, contentDescription = "Settings")
                        }
                    }
                }
            )
        },
        floatingActionButton = {

            FloatingActionButton(
                onClick = { /*  */ }
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },
        floatingActionButtonPosition = FabPosition.End, // Position of the FAB , end of the screen
        isFloatingActionButtonDocked = true // FAB is docked to the bottom app bar
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Jetpack Compose", fontSize = 20.sp, color = Color.Gray)
            Button(onClick = { /*  */ }) {
                Text(text = "Click me senpai!")
            }
        }
    }
}

