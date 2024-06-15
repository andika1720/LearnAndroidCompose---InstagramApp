package com.example.composeinstagramapp.ui.components.home

import android.content.Context
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.ImageLoader
import coil.compose.AsyncImage
import com.example.composeinstagramapp.ui.theme.ComposeInstagramAppTheme

@Composable
fun PostItem(
    imageUrlProfile: String,
    username: String,
    datePost: String,
    imageUrlPost: String,
    description: String,
    modifier: Modifier = Modifier,
    context: Context = LocalContext.current
) {
    Column(modifier = modifier.fillMaxWidth()) {
        HeaderPost(imageUrlProfile = imageUrlProfile, username = username, datePost = datePost)
        AsyncImage(
            model = imageUrlPost,
            contentDescription = "Post dari $username",
            imageLoader = ImageLoader(context),
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth()
        )
        FooterPost()
        Row(modifier = Modifier.padding(horizontal = 16.dp)) {
            Text(text = username, fontFamily = FontFamily.Monospace, fontWeight = FontWeight.ExtraLight, modifier = modifier.padding(end = 8.dp))
            Text(text = description)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PostItemPreview() {
    ComposeInstagramAppTheme {
        PostItem(imageUrlProfile = "", username = "anya", datePost = "1 hari yang lalu", imageUrlPost = "", description = "Love it")
    }
}