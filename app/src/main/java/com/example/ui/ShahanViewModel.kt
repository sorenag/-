package com.example.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.data.models.King
import com.example.data.models.ShahnamehCharacter
import com.example.data.models.SuperIranianHero
import com.example.data.repository.ShahanRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ShahanViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: ShahanRepository = ShahanRepository()

    private val _uiState = MutableStateFlow(
        ShahanUiState(
            dynasties = repository.getDynasties(),
            kings = repository.getKings(),
            shahnamehCharacters = repository.getShahnamehCharacters(),
            superIranianHeroes = repository.getSuperIranianHeroes(),
            timelineEvents = repository.getTimelineEvents()
        )
    )
    val uiState: StateFlow<ShahanUiState> = _uiState.asStateFlow()

    fun selectTab(tab: ShahanTab) {
        _uiState.update { it.copy(selectedTab = tab) }
    }

    fun selectDynasty(dynastyId: String?) {
        _uiState.update { it.copy(selectedDynastyId = dynastyId) }
    }

    fun selectKing(king: King?) {
        _uiState.update { it.copy(selectedKing = king) }
    }

    fun selectShahnamehCharacter(character: ShahnamehCharacter?) {
        _uiState.update { it.copy(selectedShahnamehCharacter = character) }
    }

    fun selectHero(hero: SuperIranianHero?) {
        _uiState.update { it.copy(selectedHero = hero) }
    }

    fun setThemeMode(mode: ThemeMode) {
        _uiState.update { it.copy(themeMode = mode) }
    }

    fun enterApp() {
        _uiState.update { it.copy(showIntro = false) }
    }

    fun showIntroScreen() {
        _uiState.update { it.copy(showIntro = true) }
    }
}
