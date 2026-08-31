package com.example.ui

import com.example.data.models.Dynasty
import com.example.data.models.King
import com.example.data.models.ShahnamehCharacter
import com.example.data.models.SuperIranianHero
import com.example.data.models.TimelineEvent

enum class ThemeMode {
    DARK, LIGHT, SYSTEM
}

enum class ShahanTab(val titlePersian: String, val titleEnglish: String) {
    DYNASTIES("دودمان‌ها", "Dynasties"),
    SHAHNAMEH("شاهنامه", "Shahnameh"),
    SUPER_IRANIANS("ابرایرانیان", "Super Iranians"),
    TIMELINE("گاه‌شمار", "Timeline"),
    SETTINGS("تنظیمات", "Settings")
}

data class ShahanUiState(
    val showIntro: Boolean = false,
    val selectedTab: ShahanTab = ShahanTab.DYNASTIES,
    val searchQuery: String = "",
    val themeMode: ThemeMode = ThemeMode.DARK,
    val dynasties: List<Dynasty> = emptyList(),
    val kings: List<King> = emptyList(),
    val shahnamehCharacters: List<ShahnamehCharacter> = emptyList(),
    val superIranianHeroes: List<SuperIranianHero> = emptyList(),
    val timelineEvents: List<TimelineEvent> = emptyList(),
    val selectedDynastyId: String? = null,
    val selectedKing: King? = null,
    val selectedShahnamehCharacter: ShahnamehCharacter? = null,
    val selectedHero: SuperIranianHero? = null
)
