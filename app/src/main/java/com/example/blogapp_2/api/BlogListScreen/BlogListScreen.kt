package com.example.blogapp_2.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.blogapp_2.viewmodel.BlogViewModel

@Composable
fun BlogListScreen(navController: NavController, viewModel: BlogViewModel = viewModel()) {
    val blogs by viewModel.blogPosts.collectAsState()

    LazyColumn(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        items(blogs) { blog ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .clickable { navController.navigate("blogDetail/${blog.url}") },

            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = blog.title.rendered)
                }
            }
        }
    }
}
