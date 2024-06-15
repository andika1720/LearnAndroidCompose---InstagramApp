package com.example.composeinstagramapp.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.outlined.AddBox
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Tag
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.composeinstagramapp.data.DummyData
import com.example.composeinstagramapp.model.Post
import com.example.composeinstagramapp.ui.components.profile.ButtonProfile
import com.example.composeinstagramapp.ui.components.profile.PostProfileItem
import com.example.composeinstagramapp.ui.components.profile.ProfileItem
import com.example.composeinstagramapp.ui.components.profile.StoryItem

@Composable
fun ProfileScreen(modifier: Modifier = Modifier) {
    val stories = DummyData.post

    ProfileContent(modifier = modifier, stories = stories)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileContent(
    stories: List<Post>,
    modifier: Modifier
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(imageVector = Icons.Outlined.Lock, contentDescription = "icon lock")
                        Text(text = "kaelakovaskia", style = TextStyle(fontWeight = FontWeight.Bold))
                        Icon(
                            imageVector = Icons.Default.ArrowDropDown,
                            contentDescription = "icon dropdown"
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Outlined.Tag, contentDescription = "icon threads")
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Outlined.AddBox, contentDescription = "icon add")
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Outlined.Menu, contentDescription = "icon menu")
                    }
                }
            )
        },
        modifier = modifier
    ) { paddingValues ->
        Column(
            modifier = Modifier.padding(paddingValues)
        ) {
            ProfileItem()
            ButtonProfile()
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                contentPadding = PaddingValues(16.dp)
            ) {
                items(stories) { stories ->
                    StoryItem(
                        imageUrl = stories.imageUrlPost,
                        description = stories.descriptionPost
                    )
                }
            }
            PostProfileItem()
        }
    }
}