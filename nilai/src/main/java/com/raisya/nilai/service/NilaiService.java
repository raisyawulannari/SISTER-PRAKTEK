/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raisya.nilai.service;

import com.raisya.nilai.entity.Nilai;
import com.raisya.nilai.repository.NilaiRepository;
import com.raisya.nilai.vo.Mahasiswa;
import com.raisya.nilai.vo.Matakuliah;
import com.raisya.nilai.vo.ResponseTemplate;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Asus
 */

@Service
public class NilaiService {
     @Autowired
    private NilaiRepository nilaiRepository;
     
    @Autowired
    private RestTemplate restTemplate;
    
    public void insert(Nilai nilai){
        Optional<Nilai> mhsOptional = nilaiRepository.findNilaiById(nilai.getId());
        if (mhsOptional.isPresent()) {
            throw new IllegalStateException("Matakuliah sudah ada");
        }
        nilaiRepository.save(nilai);
    }
    
    public List<Nilai> getAll(){
        return nilaiRepository.findAll();
    }
    
    public ResponseTemplate getNilaiById(Long id){
       ResponseTemplate vo = new ResponseTemplate();
       Nilai nilai = nilaiRepository.findById(id).get();
       Mahasiswa mahasiswa = 
       restTemplate.getForObject("http://localhost:9001/api/v1/mahasiswa/"+ 
               nilai.getIdmahasiswa(), Mahasiswa.class);
       
       Matakuliah matakuliah = 
       restTemplate.getForObject("http://localhost:9002/api/v1/matakuliah/"+ 
               nilai.getIdmatakuliah(), Matakuliah.class);
       vo.setNilai(nilai);
       vo.setMahasiswa(mahasiswa);
       vo.setMatakuliah(matakuliah);
       return vo;
              
    }
    
}
