package com.example.composeinstagramapp.ui.components.home

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun StoryItem(
    imageUrl: String,
    username: String,
    modifier: Modifier = Modifier
) {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        AsyncImage(
            model = imageUrl,
            contentDescription = "PhotoProfile $username",
            modifier = modifier
                .size(80.dp)
                .border(
                    2.dp,
                    Brush.linearGradient(
                        colors = listOf(
                            Color(0xFFd71069),
                            Color(0xFFe25d6a),
                            Color(0xFFe9ad55)
                        ),
                        start = Offset(100.0f, 0f),
                        end = Offset(0f, 100f)
                    ),
                    CircleShape
                )
                .clip(CircleShape)

        )
        Text(text = username)
    }
}

@Preview(showBackground = true)
@Composable
private fun StoryItemPreview() {
    StoryItem(
        imageUrl = "https://static.miraheze.org/hololivewiki/thumb/9/9b/Kobo_Kanaeru_-_Portrait_01.png/450px-Kobo_Kanaeru_-_Portrait_01.png",
        username = "username"
    )

}
