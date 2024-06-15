package com.example.composeinstagramapp.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Chat
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeinstagramapp.data.DummyData
import com.example.composeinstagramapp.model.Post
import com.example.composeinstagramapp.model.User
import com.example.composeinstagramapp.ui.components.home.PostItem
import com.example.composeinstagramapp.ui.components.home.StoryItem

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    val users = DummyData.users
    val posts = DummyData.post

    //HomeScreenPreview()
    HomeContent(
        user = users,
        posts = posts,
        modifier
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeContent(
    user: List<User>,
    posts: List<Post>,
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Instagram", style = TextStyle(fontSize = 24.sp)) },
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.FavoriteBorder,
                            contentDescription = "Icon Favorite"
                        )
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.Chat,
                            contentDescription = "Icon Chat"
                        )
                    }
                },
                modifier = Modifier.height(56.dp)
            )
        },
        modifier = modifier
    ) { paddingValues ->
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = modifier.padding(paddingValues))
        {
            item {
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    contentPadding = PaddingValues(16.dp),
                ) {
                    items(user) { users ->
                        StoryItem(username = users.username, imageUrl = users.image)
                    }
                }
            }
            items(posts) { post ->
                PostItem(
                    imageUrlProfile = post.imageUrlProfile,
                    username = post.username,
                    datePost = post.datePost,
                    imageUrlPost = post.imageUrlPost,
                    description = post.descriptionPost
                )
            }
        }
    }
}

