package com.example.data.models

data class Dynasty(
    val id: String,
    val namePersian: String,
    val nameEnglish: String,
    val period: String,
    val founder: String,
    val capital: String,
    val description: String,
    val colorHex: Long,
    val flagSymbol: String,
    val flagNamePersian: String,
    val era: String,
    val flagImageResId: Int? = null
)

data class King(
    val id: String,
    val namePersian: String,
    val nameEnglish: String,
    val titlePersian: String,
    val dynastyId: String,
    val dynastyNamePersian: String,
    val reignPeriod: String,
    val capital: String,
    val summary: String,
    val biography: String,
    val achievements: List<String>,
    val famousQuote: String? = null,
    val imageResId: Int? = null
)

data class ShahnamehCharacter(
    val id: String,
    val namePersian: String,
    val titlePersian: String,
    val eraPersian: String, // پیشدادیان (اساطیری)، کیانیان (حماسی)، ساسانیان/پارتیان (تاریخی)
    val shortStory: String,
    val fullBiography: String,
    val keyFeats: List<String>,
    val famousVerse: String,
    val symbolEmoji: String,
    val imageResId: Int? = null
)

data class SuperIranianHero(
    val id: String,
    val namePersian: String,
    val nameEnglish: String? = null,
    val titlePersian: String,
    val eraPersian: String,
    val rolePersian: String = "قهرمان و سردار نامدار",
    val storyPersian: String,
    val achievements: List<String>,
    val famousQuote: String,
    val symbolEmoji: String,
    val imageResId: Int? = null
)

data class TimelineEvent(
    val id: String,
    val year: String,
    val yearNumeric: Int,
    val titlePersian: String,
    val descriptionPersian: String,
    val dynastyName: String,
    val kingName: String
)

data class Quote(
    val id: String,
    val textPersian: String,
    val textEnglish: String? = null,
    val authorPersian: String,
    val dynastyPersian: String,
    val sourcePersian: String? = null
)

