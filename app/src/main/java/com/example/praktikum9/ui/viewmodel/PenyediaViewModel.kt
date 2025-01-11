package com.example.praktikum9.ui.viewmodel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.praktikum9.MahasiswaApp

object PenyediaViewModel{
    val Factory = viewModelFactory{
        initializer { HomeViewModel(MahasiswaApplications().containerApp.repositoryMhs) }
        initializer { InsertViewModel(MahasiswaApplications().containerApp.repositoryMhs) }


    }
}
fun CreationExtras.MahasiswaApplications(): MahasiswaApp =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY]as MahasiswaApp)