/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raisya.nilai.vo;

import java.time.LocalDate;

/**
 *
 * @author Asus
 */
public class Mahasiswa {
    private Long id;
    private String nama;
    private String email;
    private LocalDate tgllahir;

    public Mahasiswa() {
    }

    public Mahasiswa(Long id, String nama, String email, LocalDate tgllahir) {
        this.id = id;
        this.nama = nama;
        this.email = email;
        this.tgllahir = tgllahir;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getTgllahir() {
        return tgllahir;
    }

    public void setTgllahir(LocalDate tgllahir) {
        this.tgllahir = tgllahir;
    }
    
    
    
}
