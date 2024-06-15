package com.example.composeinstagramapp.ui.components.profile

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountBox
import androidx.compose.material.icons.outlined.GridOn
import androidx.compose.material.icons.outlined.VideoLibrary
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun PostProfileItem(modifier: Modifier = Modifier) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = modifier.fillMaxWidth()
    ) {
        Icon(
            imageVector = Icons.Outlined.GridOn,
            contentDescription = "icon posting",
            modifier = Modifier.weight(1f)
        )
        Icon(
            imageVector = Icons.Outlined.VideoLibrary,
            contentDescription = "icon reels",
            modifier = Modifier.weight(1f)
        )
        Icon(
            imageVector = Icons.Outlined.AccountBox,
            contentDescription = "icon tag",
            modifier = Modifier.weight(1f)
        )
    }
}