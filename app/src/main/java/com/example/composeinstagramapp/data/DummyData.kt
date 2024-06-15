package com.example.composeinstagramapp.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddBox
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.VideoLibrary
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.AddBox
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.VideoLibrary
import com.example.composeinstagramapp.model.Post
import com.example.composeinstagramapp.model.User
import com.example.composeinstagramapp.ui.navigation.NavigationItem
import com.example.composeinstagramapp.ui.navigation.Screen

object DummyData {
    val users = listOf(
        User(
            id = 1,
            image = "https://static.miraheze.org/hololivewiki/thumb/9/9b/Kobo_Kanaeru_-_Portrait_01.png/450px-Kobo_Kanaeru_-_Portrait_01.png",
            username = "KoboKanaeru"
        ),
        User(
            id = 2,
            image = "https://th.bing.com/th?id=OIP.7DnV5AwabxhmY2KPxzdbpQHaHa&w=249&h=249&c=8&rs=1&qlt=90&o=6&dpr=1.3&pid=3.1&rm=2",
            username = "VestiaZeta"
        ),
        User(
            id = 3,
            image = "https://th.bing.com/th?id=OIP.7DnV5AwabxhmY2KPxzdbpQHaHa&w=249&h=249&c=8&rs=1&qlt=90&o=6&dpr=1.3&pid=3.1&rm=2",
            username = "VestiaZeta"
        ),
        User(
            id = 4,
            image = "https://th.bing.com/th?id=OIP.7DnV5AwabxhmY2KPxzdbpQHaHa&w=249&h=249&c=8&rs=1&qlt=90&o=6&dpr=1.3&pid=3.1&rm=2",
            username = "VestiaZeta"
        ),
        User(
            id = 5,
            image = "https://th.bing.com/th?id=OIP.7DnV5AwabxhmY2KPxzdbpQHaHa&w=249&h=249&c=8&rs=1&qlt=90&o=6&dpr=1.3&pid=3.1&rm=2",
            username = "VestiaZeta"
        ),
        User(
            id = 6,
            image = "https://th.bing.com/th?id=OIP.7DnV5AwabxhmY2KPxzdbpQHaHa&w=249&h=249&c=8&rs=1&qlt=90&o=6&dpr=1.3&pid=3.1&rm=2",
            username = "VestiaZeta"
        )

    )

    val post = listOf(
        Post(
            id = 1,
            username = "KoboKanaeru",
            imageUrlProfile = "https://static.miraheze.org/hololivewiki/thumb/9/9b/Kobo_Kanaeru_-_Portrait_01.png/450px-Kobo_Kanaeru_-_Portrait_01.png",
            imageUrlPost = "https://images5.alphacoders.com/122/thumb-1920-1226013.jpg",
            descriptionPost = "Pacar aku",
            datePost = "2 jam yang lalu"
        ),
        Post(
            id = 2,
            username = "KoboKanaeru",
            imageUrlProfile = "https://static.miraheze.org/hololivewiki/thumb/9/9b/Kobo_Kanaeru_-_Portrait_01.png/450px-Kobo_Kanaeru_-_Portrait_01.png",
            imageUrlPost = "https://th.bing.com/th/id/OIP.ekfOEhBfu7pR5N2QmsmZ8wHaLv?w=600&h=951&rs=1&pid=ImgDetMain",
            descriptionPost = "Hehehe",
            datePost = "1 jam yang lalu"
        ),
        Post(
            id = 3,
            username = "KoboKanaeru",
            imageUrlProfile = "https://static.miraheze.org/hololivewiki/thumb/9/9b/Kobo_Kanaeru_-_Portrait_01.png/450px-Kobo_Kanaeru_-_Portrait_01.png",
            imageUrlPost = "https://www.lyrical-nonsense.com/wp-content/uploads/2023/03/Kobo-Kanaeru-Oh-Asmara.jpg",
            descriptionPost = "Lagu baru aku",
            datePost = "3 minggu yang lalu"
        ),
        Post(
            id = 4,
            username = "VestiaZeta",
            imageUrlProfile = "https://th.bing.com/th?id=OIP.7DnV5AwabxhmY2KPxzdbpQHaHa&w=249&h=249&c=8&rs=1&qlt=90&o=6&dpr=1.3&pid=3.1&rm=2",
            imageUrlPost = "https://s1.zerochan.net/Vestia.Zeta.600.3615697.jpg",
            descriptionPost = "Milk",
            datePost = "2 minggu yang lalu"
        ),
        Post(
            id = 5,
            username = "VestiaZeta",
            imageUrlProfile = "https://th.bing.com/th?id=OIP.7DnV5AwabxhmY2KPxzdbpQHaHa&w=249&h=249&c=8&rs=1&qlt=90&o=6&dpr=1.3&pid=3.1&rm=2",
            imageUrlPost = "https://th.bing.com/th/id/OIP.cVQgC8qO-f0D1mcE43k_PwHaHa?rs=1&pid=ImgDetMain",
            descriptionPost = "You're Mine udah riliss",
            datePost = "1 minggu yang lalu"
        ),
    )

    val bottomBarIcon = listOf(
        NavigationItem(title = "Home",
            unselectedIcon = Icons.Outlined.Home,
            selectedIcon = Icons.Filled.Home,
            screen = Screen.Home),
        NavigationItem(title = "Search",
            unselectedIcon = Icons.Outlined.Search,
            selectedIcon = Icons.Filled.Search,
            screen = Screen.Search),
        NavigationItem(title = "Add Post",
            unselectedIcon = Icons.Outlined.AddBox,
            selectedIcon = Icons.Filled.AddBox,
            screen = Screen.AddPosting),
        NavigationItem(title = "Reels",
            unselectedIcon = Icons.Outlined.VideoLibrary,
            selectedIcon = Icons.Filled.VideoLibrary,
            screen = Screen.Reels),
        NavigationItem(title = "Profile",
            unselectedIcon = Icons.Outlined.AccountCircle,
            selectedIcon = Icons.Filled.AccountCircle,
            screen = Screen.Profile)
    )

    val SearchPost = listOf(
        Post(
            id = 1,
            username = "KoboKanaeru",
            imageUrlProfile = "https://static.miraheze.org/hololivewiki/thumb/9/9b/Kobo_Kanaeru_-_Portrait_01.png/450px-Kobo_Kanaeru_-_Portrait_01.png",
            imageUrlPost = "https://images5.alphacoders.com/122/thumb-1920-1226013.jpg",
            descriptionPost = "Pacar aku",
            datePost = "2 jam yang lalu"
        ),
        Post(
            id = 2,
            username = "KoboKanaeru",
            imageUrlProfile = "https://static.miraheze.org/hololivewiki/thumb/9/9b/Kobo_Kanaeru_-_Portrait_01.png/450px-Kobo_Kanaeru_-_Portrait_01.png",
            imageUrlPost = "https://th.bing.com/th/id/OIP.ekfOEhBfu7pR5N2QmsmZ8wHaLv?w=600&h=951&rs=1&pid=ImgDetMain",
            descriptionPost = "Hehehe",
            datePost = "1 jam yang lalu"
        ),
        Post(
            id = 3,
            username = "KoboKanaeru",
            imageUrlProfile = "https://static.miraheze.org/hololivewiki/thumb/9/9b/Kobo_Kanaeru_-_Portrait_01.png/450px-Kobo_Kanaeru_-_Portrait_01.png",
            imageUrlPost = "https://www.lyrical-nonsense.com/wp-content/uploads/2023/03/Kobo-Kanaeru-Oh-Asmara.jpg",
            descriptionPost = "Lagu baru aku",
            datePost = "3 minggu yang lalu"
        ),
        Post(
            id = 4,
            username = "VestiaZeta",
            imageUrlProfile = "https://th.bing.com/th?id=OIP.7DnV5AwabxhmY2KPxzdbpQHaHa&w=249&h=249&c=8&rs=1&qlt=90&o=6&dpr=1.3&pid=3.1&rm=2",
            imageUrlPost = "https://s1.zerochan.net/Vestia.Zeta.600.3615697.jpg",
            descriptionPost = "Milk",
            datePost = "2 minggu yang lalu"
        ),
        Post(
            id = 5,
            username = "VestiaZeta",
            imageUrlProfile = "https://th.bing.com/th?id=OIP.7DnV5AwabxhmY2KPxzdbpQHaHa&w=249&h=249&c=8&rs=1&qlt=90&o=6&dpr=1.3&pid=3.1&rm=2",
            imageUrlPost = "https://th.bing.com/th/id/OIP.cVQgC8qO-f0D1mcE43k_PwHaHa?rs=1&pid=ImgDetMain",
            descriptionPost = "You're Mine udah riliss",
            datePost = "1 minggu yang lalu"
        ),
        Post(
            id = 6,
            username = "KaelaKovalskia",
            imageUrlProfile = "https://th.bing.com/th?id=OIP.7DnV5AwabxhmY2KPxzdbpQHaHa&w=249&h=249&c=8&rs=1&qlt=90&o=6&dpr=1.3&pid=3.1&rm=2",
            imageUrlPost = "https://th.bing.com/th/id/OIP.lsXeqUVMTKDITxqfGPssmQHaLK?w=1580&h=2380&rs=1&pid=ImgDetMain",
            descriptionPost = "Milk",
            datePost = "2 minggu yang lalu"
        ),
        Post(
            id = 7,
            username = "KaelaKovalskia",
            imageUrlProfile = "https://th.bing.com/th?id=OIP.7DnV5AwabxhmY2KPxzdbpQHaHa&w=249&h=249&c=8&rs=1&qlt=90&o=6&dpr=1.3&pid=3.1&rm=2",
            imageUrlPost = "https://th.bing.com/th/id/OIP.lsXeqUVMTKDITxqfGPssmQHaLK?w=1580&h=2380&rs=1&pid=ImgDetMain",
            descriptionPost = "You're Mine udah riliss",
            datePost = "1 minggu yang lalu"
        ),
        Post(
            id = 8,
            username = "KaelaKovalskia",
            imageUrlProfile = "https://th.bing.com/th?id=OIP.7DnV5AwabxhmY2KPxzdbpQHaHa&w=249&h=249&c=8&rs=1&qlt=90&o=6&dpr=1.3&pid=3.1&rm=2",
            imageUrlPost = "https://th.bing.com/th/id/OIP.oUxyk1At7myO93m8WZPhtgHaIj?rs=1&pid=ImgDetMain",
            descriptionPost = "Milk",
            datePost = "2 minggu yang lalu"
        ),
        Post(
            id = 9,
            username = "KaelaKovalskia",
            imageUrlProfile = "https://th.bing.com/th?id=OIP.7DnV5AwabxhmY2KPxzdbpQHaHa&w=249&h=249&c=8&rs=1&qlt=90&o=6&dpr=1.3&pid=3.1&rm=2",
            imageUrlPost = "https://th.bing.com/th/id/OIP.lsXeqUVMTKDITxqfGPssmQHaLK?w=1580&h=2380&rs=1&pid=ImgDetMain",
            descriptionPost = "You're Mine udah riliss",
            datePost = "1 minggu yang lalu"
        ),
        Post(
            id = 10,
            username = "KaelaKovalskia",
            imageUrlProfile = "https://th.bing.com/th?id=OIP.7DnV5AwabxhmY2KPxzdbpQHaHa&w=249&h=249&c=8&rs=1&qlt=90&o=6&dpr=1.3&pid=3.1&rm=2",
            imageUrlPost = "https://th.bing.com/th/id/OIP.oUxyk1At7myO93m8WZPhtgHaIj?rs=1&pid=ImgDetMain",
            descriptionPost = "Milk",
            datePost = "2 minggu yang lalu"
        ),
        Post(
            id = 11,
            username = "KaelaKovalskia",
            imageUrlProfile = "https://th.bing.com/th?id=OIP.7DnV5AwabxhmY2KPxzdbpQHaHa&w=249&h=249&c=8&rs=1&qlt=90&o=6&dpr=1.3&pid=3.1&rm=2",
            imageUrlPost = "https://th.bing.com/th/id/OIP.lsXeqUVMTKDITxqfGPssmQHaLK?w=1580&h=2380&rs=1&pid=ImgDetMain",
            descriptionPost = "You're Mine udah riliss",
            datePost = "1 minggu yang lalu"
        ),
    )
}