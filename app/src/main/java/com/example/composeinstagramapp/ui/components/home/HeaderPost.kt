package com.example.composeinstagramapp.ui.components.home

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
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
fun HeaderPost(
    imageUrlProfile: String,
    username: String,
    datePost: String,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = modifier
    ) {
        AsyncImage(
            model = imageUrlProfile,
            contentDescription = "PhotoProfile $username",
            modifier = modifier

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
                .size(40.dp)
        )
        Spacer(modifier = modifier.width(8.dp))
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(text = username, style = MaterialTheme.typography.titleSmall, modifier = modifier)
            Spacer(modifier = Modifier.height(2.dp))
            Text(text = datePost, style = MaterialTheme.typography.bodySmall, modifier = modifier)
        }
        Icon(imageVector = Icons.Default.MoreVert, contentDescription = "MoveVert")
    }
}

@Preview(showBackground = true)
@Composable
private fun HeaderPostPreview() {
    HeaderPost(imageUrlProfile = "", username = "anya", datePost = "1 hari yang lalu")
}