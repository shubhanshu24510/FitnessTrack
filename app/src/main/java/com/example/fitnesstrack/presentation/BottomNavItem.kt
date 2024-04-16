package com.example.fitnesstrack.presentation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BarChart
import androidx.compose.material.icons.filled.CameraEnhance
import androidx.compose.material.icons.filled.Feed
import androidx.compose.material.icons.filled.LocalActivity
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.BarChart
import androidx.compose.material.icons.outlined.CameraEnhance
import androidx.compose.material.icons.outlined.Feed
import androidx.compose.material.icons.outlined.LocalActivity
import androidx.compose.material.icons.outlined.Person
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItem(
    val title: String,
    val selectedicon: ImageVector,
    val unselectedicon: ImageVector,

    )

val bottomNavItems = listOf(
    BottomNavItem(
        title = "Activity",
        selectedicon = Icons.Filled.LocalActivity,
        unselectedicon = Icons.Outlined.LocalActivity
    ),
    BottomNavItem(
        title = "Goals",
        selectedicon = Icons.Filled.BarChart,
        unselectedicon = Icons.Outlined.BarChart
    ),
    BottomNavItem(
        title = "Camera",
        selectedicon = Icons.Filled.CameraEnhance,
        unselectedicon = Icons.Outlined.CameraEnhance
    ),
    BottomNavItem(
        title = "Feed",
        selectedicon = Icons.Filled.Feed,
        unselectedicon = Icons.Outlined.Feed
    ), BottomNavItem(
        title = "Profile",
        selectedicon = Icons.Filled.Person,
        unselectedicon = Icons.Outlined.Person
    )
)