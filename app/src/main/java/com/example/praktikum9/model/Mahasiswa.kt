package com.example.praktikum9.model

class Mahasiswa (
    var nim:String,
    var nama:String,
    var alamat:String,
    var jenisKelamin:String,
    var kelas:String,
    var angkatan:String
){
    //tambahkan konstruktor untuk memberi nilai awal
    constructor() : this("", "", "", "", "", "")
}