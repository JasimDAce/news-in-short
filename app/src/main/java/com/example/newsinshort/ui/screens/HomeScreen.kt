package com.example.newsinshort.ui.screens

import android.util.Log
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.newsinshort.ui.components.Loader
import com.example.newsinshort.ui.viewmodel.NewsViewModel
import com.example.utilities.ResourceState


const val TAG = "HomeScreen"
@Composable
fun HomeScreen(
    newsViewModel: NewsViewModel = hiltViewModel()
){

    val newsRes by newsViewModel.news.collectAsState()
    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        when(newsRes){
            is ResourceState.Loading -> {
                Log.d(TAG,"inside loading")
                Loader()
            }
            is ResourceState.Success ->{
                Log.d(TAG,"inside Success")
            }
            is ResourceState.Error ->{
                Log.d(TAG,"inside Error")
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}
