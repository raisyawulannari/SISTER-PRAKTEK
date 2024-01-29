/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raisya.matakuliah.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table
public class Matakuliah {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String kode;
    private String nama;
    private int sks;
    private int semester;

    public Matakuliah() {
    }

    public Matakuliah(Long id, String kode, String nama, int sks, int semester) {
        this.id = id;
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.semester = semester;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
    
    public int getsemester() {
        return semester;
    }
    
    public void setsemester(int semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Matakuliah{" + "id=" + id + ", kode=" + kode + ", nama=" + nama + ", sks=" + sks + ", semester=" + semester +'}';
    }

}
