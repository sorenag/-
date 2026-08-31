package com.example.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp

fun createTypography(fontFamily: FontFamily = FontFamily.Default): Typography {
    val defaultType = Typography()
    return Typography(
        displayLarge = defaultType.displayLarge.copy(fontFamily = fontFamily),
        displayMedium = defaultType.displayMedium.copy(fontFamily = fontFamily),
        displaySmall = defaultType.displaySmall.copy(fontFamily = fontFamily),
        headlineLarge = defaultType.headlineLarge.copy(fontFamily = fontFamily),
        headlineMedium = defaultType.headlineMedium.copy(fontFamily = fontFamily),
        headlineSmall = defaultType.headlineSmall.copy(fontFamily = fontFamily),
        titleLarge = defaultType.titleLarge.copy(fontFamily = fontFamily),
        titleMedium = defaultType.titleMedium.copy(fontFamily = fontFamily),
        titleSmall = defaultType.titleSmall.copy(fontFamily = fontFamily),
        bodyLarge = defaultType.bodyLarge.copy(fontFamily = fontFamily, fontSize = 16.sp, lineHeight = 24.sp),
        bodyMedium = defaultType.bodyMedium.copy(fontFamily = fontFamily, fontSize = 14.sp, lineHeight = 20.sp),
        bodySmall = defaultType.bodySmall.copy(fontFamily = fontFamily, fontSize = 12.sp, lineHeight = 16.sp),
        labelLarge = defaultType.labelLarge.copy(fontFamily = fontFamily),
        labelMedium = defaultType.labelMedium.copy(fontFamily = fontFamily),
        labelSmall = defaultType.labelSmall.copy(fontFamily = fontFamily)
    )
}

val Typography = createTypography(FontFamily.Default)

