package com.example.praktikum9.di

import android.content.Context
import com.example.praktikum9.repository.NetworkRepositoryMhs
import com.example.praktikum9.repository.RepositoryMhs
import com.google.firebase.firestore.FirebaseFirestore

class MahasiswaContainer (private val context: Context) : InterfaceContainerApp{
    private val firestore: FirebaseFirestore = FirebaseFirestore.getInstance()
    override val repositoryMhs: RepositoryMhs by lazy {
        NetworkRepositoryMhs(firestore)
    }
}

interface InterfaceContainerApp{
    val repositoryMhs: RepositoryMhs
}
