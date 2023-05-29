package com.example.tester

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.platform.LocalFocusManager
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val scaffoldState = rememberScaffoldState()
            var textFieldState by remember { mutableStateOf("") }
            val coroutineScope = rememberCoroutineScope()
            val focusManager = LocalFocusManager.current // Added local focus manager

            Scaffold(
                modifier = Modifier.fillMaxSize(),
                scaffoldState = scaffoldState
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 30.dp)
                ) {
                    TextField(
                        value = textFieldState,
                        label = {
                            Text(text = "Enter your Name")
                        },
                        onValueChange = {
                            textFieldState = it
                        },
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth(),
                        keyboardActions = KeyboardActions(
                            onDone = {
                                focusManager.clearFocus() // Clear focus and hide keyboard when Done button is pressed
                            }
                        )
                    )

                    Spacer(modifier = Modifier.height(16.dp))
                    Button(onClick = {
                        coroutineScope.launch {
                            scaffoldState.snackbarHostState.showSnackbar("Hello $textFieldState")
                        }
                    }) {
                        Text(text = "Greet Me")
                    }
                }
            }
        }
    }
}
