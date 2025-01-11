package com.example.praktikum9

import android.app.Application
import com.example.praktikum9.di.MahasiswaContainer

class MahasiswaApp : Application() {
    //fungsinya untuk menympan instance ContainerApp
    lateinit var containerApp: MahasiswaContainer

    override fun onCreate() {
        super.onCreate()
        //membuat instance containerapp
        containerApp = MahasiswaContainer(this)
        //instance adalah object yang dibuat dari class
    }
}