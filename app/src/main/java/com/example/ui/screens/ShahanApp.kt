package com.example.ui.screens

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.MilitaryTech
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Book
import androidx.compose.material.icons.outlined.History
import androidx.compose.material.icons.outlined.MilitaryTech
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.StarBorder
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.ShahanTab
import com.example.ui.ShahanViewModel

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith

@Composable
fun ShahanApp(
    viewModel: ShahanViewModel,
    modifier: Modifier = Modifier
) {
    val uiState by viewModel.uiState.collectAsState()

    AnimatedContent(
        targetState = uiState.showIntro,
        transitionSpec = {
            fadeIn() togetherWith fadeOut()
        },
        label = "app_intro_transition"
    ) { showIntro ->
        if (showIntro) {
            IntroScreen(
                onEnterApp = { viewModel.enterApp() },
                modifier = modifier
            )
        } else {
            Scaffold(
                modifier = modifier.testTag("shahan_app_root"),
                topBar = {
                    PersianTileHeader()
                },
                bottomBar = {
                    RoyalBottomNavigationBar(
                        selectedTab = uiState.selectedTab,
                        onTabSelected = { viewModel.selectTab(it) }
                    )
                }
            ) { innerPadding ->
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(innerPadding)
                ) {
                    when (uiState.selectedTab) {
                        ShahanTab.DYNASTIES -> DynastiesScreen(
                            dynasties = uiState.dynasties,
                            kings = uiState.kings,
                            onSelectKing = { viewModel.selectKing(it) }
                        )
                        ShahanTab.SHAHNAMEH -> ShahnamehScreen(
                            characters = uiState.shahnamehCharacters,
                            selectedCharacter = uiState.selectedShahnamehCharacter,
                            onSelectCharacter = { viewModel.selectShahnamehCharacter(it) }
                        )
                        ShahanTab.SUPER_IRANIANS -> SuperIraniansScreen(
                            heroes = uiState.superIranianHeroes,
                            selectedHero = uiState.selectedHero,
                            onSelectHero = { viewModel.selectHero(it) }
                        )
                        ShahanTab.TIMELINE -> TimelineScreen(
                            events = uiState.timelineEvents
                        )
                        ShahanTab.SETTINGS -> SettingsScreen(
                            currentThemeMode = uiState.themeMode,
                            onSelectThemeMode = { viewModel.setThemeMode(it) },
                            onShowIntroAgain = { viewModel.showIntroScreen() }
                        )
                    }

                    // King Detail Overlay Dialog
                    uiState.selectedKing?.let { king ->
                        KingDetailDialog(
                            king = king,
                            onDismiss = { viewModel.selectKing(null) }
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun PersianTileHeader(
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier
            .fillMaxWidth()
            .statusBarsPadding(),
        color = Color(0xFF0C2046) // Traditional Persian Cobalt Ceramic Blue
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color(0xFF0A1B3B), // Deep Cobalt Lazuli
                            Color(0xFF0E2754), // Cobalt Blue
                            Color(0xFF0A1B3B)  // Dark Lazuli
                        )
                    )
                )
        ) {
            // Draw authentic ceramic tile seams grid (بندکشی‌های کاشی سنتی)
            Canvas(modifier = Modifier.matchParentSize()) {
                val tileSize = 24.dp.toPx()
                val gridColor = Color(0xFF051126).copy(alpha = 0.5f)

                var x = tileSize
                while (x < size.width) {
                    drawLine(gridColor, start = androidx.compose.ui.geometry.Offset(x, 0f), end = androidx.compose.ui.geometry.Offset(x, size.height), strokeWidth = 1.2f)
                    x += tileSize
                }

                var y = tileSize
                while (y < size.height) {
                    drawLine(gridColor, start = androidx.compose.ui.geometry.Offset(0f, y), end = androidx.compose.ui.geometry.Offset(size.width, y), strokeWidth = 1.2f)
                    y += tileSize
                }
            }

            // Traditional Ceramic Tile Frieze Border Frame (حاشیه کاشی سنتی ایرانی)
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp, vertical = 6.dp)
                    .border(
                        width = 1.5.dp,
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                Color(0xFF00A896), // Persian Turquoise
                                Color(0xFFFFD700), // Gold
                                Color(0xFF00A896), // Turquoise
                                Color(0xFFFFD700),
                                Color(0xFF00A896)
                            )
                        ),
                        shape = RoundedCornerShape(8.dp)
                    )
                    .padding(vertical = 8.dp, horizontal = 12.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "شاهان ایران زمین",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color(0xFFFFFFFF), // Pure White Calligraphy
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center,
                    maxLines = 1
                )
                Spacer(modifier = Modifier.height(3.dp))
                Text(
                    text = "کتیبه تاریخی شاهنشاهان، حماسه‌ها و ابرایرانیان",
                    style = MaterialTheme.typography.labelSmall,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFF80E5FF), // Persian Turquoise Accent Light
                    fontSize = 11.sp,
                    textAlign = TextAlign.Center,
                    maxLines = 1
                )
            }
        }
    }
}

@Composable
fun RoyalBottomNavigationBar(
    selectedTab: ShahanTab,
    onTabSelected: (ShahanTab) -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier
            .fillMaxWidth()
            .navigationBarsPadding()
            .padding(horizontal = 16.dp, vertical = 6.dp)
            .border(
                width = 1.dp,
                color = MaterialTheme.colorScheme.outline.copy(alpha = 0.4f),
                shape = RoundedCornerShape(22.dp)
            )
            .shadow(elevation = 6.dp, shape = RoundedCornerShape(22.dp))
            .testTag("shahan_bottom_navigation"),
        shape = RoundedCornerShape(22.dp),
        color = MaterialTheme.colorScheme.surface,
        tonalElevation = 3.dp
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 4.dp, vertical = 4.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            ShahanTab.values().forEach { tab ->
                val isSelected = selectedTab == tab
                val (selectedIcon, unselectedIcon) = getTabIcons(tab)

                val activeBackgroundColor by animateColorAsState(
                    targetValue = if (isSelected) MaterialTheme.colorScheme.primaryContainer else Color.Transparent,
                    animationSpec = spring(stiffness = Spring.StiffnessMediumLow),
                    label = "tab_bg_color"
                )

                val activeContentColor by animateColorAsState(
                    targetValue = if (isSelected) MaterialTheme.colorScheme.onPrimaryContainer else MaterialTheme.colorScheme.onSurfaceVariant,
                    animationSpec = spring(stiffness = Spring.StiffnessMediumLow),
                    label = "tab_content_color"
                )

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .clip(RoundedCornerShape(16.dp))
                        .background(activeBackgroundColor)
                        .clickable { onTabSelected(tab) }
                        .padding(vertical = 8.dp, horizontal = 2.dp)
                        .testTag("nav_tab_${tab.name.lowercase()}"),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            imageVector = if (isSelected) selectedIcon else unselectedIcon,
                            contentDescription = tab.titlePersian,
                            tint = activeContentColor,
                            modifier = Modifier.size(20.dp)
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = tab.titlePersian,
                            style = MaterialTheme.typography.labelSmall,
                            fontSize = 11.sp,
                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                            color = activeContentColor,
                            maxLines = 1
                        )
                    }
                }
            }
        }
    }
}

private fun getTabIcons(tab: ShahanTab): Pair<ImageVector, ImageVector> {
    return when (tab) {
        ShahanTab.DYNASTIES -> Pair(Icons.Default.Star, Icons.Outlined.StarBorder)
        ShahanTab.SHAHNAMEH -> Pair(Icons.Default.Book, Icons.Outlined.Book)
        ShahanTab.SUPER_IRANIANS -> Pair(Icons.Default.MilitaryTech, Icons.Outlined.MilitaryTech)
        ShahanTab.TIMELINE -> Pair(Icons.Default.History, Icons.Outlined.History)
        ShahanTab.SETTINGS -> Pair(Icons.Default.Settings, Icons.Outlined.Settings)
    }
}
