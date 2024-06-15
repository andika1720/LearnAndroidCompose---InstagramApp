package com.example.composeinstagramapp.ui.components.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun ProfileItem(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box {
                AsyncImage(
                    model = "https://th.bing.com/th/id/OIP.oUxyk1At7myO93m8WZPhtgHaIj?rs=1&pid=ImgDetMain",
                    contentDescription = "profile",
                    modifier = Modifier
                        .border(4.dp, Color.LightGray.copy(0.2f), CircleShape)
                        .padding(8.dp)
                        .size(80.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
                Icon(
                    imageVector = Icons.Filled.AddCircle,
                    contentDescription = "icon add story",
                    modifier = Modifier
                        .offset(x = 65.dp, y = 65.dp)
                        .size(24.dp)
                        .background(Color.White, shape = CircleShape),
                    tint = Color.Blue
                )
            }
            Text(text = "Kaela Kovalskia", style = TextStyle(fontWeight = FontWeight.Bold))
            Text(text = "Kreator digital", style = TextStyle(Color.Blue))


        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "0",style = TextStyle(fontWeight = FontWeight.Bold))
            Text(text = "postingan")
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "131RB", style = TextStyle(fontWeight = FontWeight.Bold))
            Text(text = "pengikut")
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "19",style = TextStyle(fontWeight = FontWeight.Bold) )
            Text(text = "mengikuti")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ProfileItemPreview() {
    ProfileItem()
}