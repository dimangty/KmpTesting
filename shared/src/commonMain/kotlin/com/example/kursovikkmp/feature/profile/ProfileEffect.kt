package com.example.kursovikkmp.feature.profile

sealed class ProfileEffect {
    data object ShowImageSourceDialog : ProfileEffect()
}
