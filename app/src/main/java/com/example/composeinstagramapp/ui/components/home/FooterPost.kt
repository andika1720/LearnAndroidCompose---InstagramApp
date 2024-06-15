package com.example.composeinstagramapp.ui.components.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.outlined.ModeComment
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FooterPost(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = modifier.padding(16.dp).fillMaxWidth()
    ) {
        Row(horizontalArrangement = Arrangement.spacedBy(16.dp), modifier = Modifier) {
            Icon(imageVector = Icons.Default.FavoriteBorder, contentDescription = "Liked Post")
            Icon(imageVector = Icons.Outlined.ModeComment, contentDescription = "Comment Post")
            Icon(imageVector = Icons.Default.Share, contentDescription = "Share Post")
        }
        Icon(imageVector = Icons.Default.BookmarkBorder, contentDescription = "Saved Post")
    }
}