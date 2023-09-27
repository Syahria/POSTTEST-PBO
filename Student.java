/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.posttest1;

public class Student {
    public String name;
    public String nim;
    public String prodi;
    public String fakultas;

    public Student(String name, String nim, String prodi, String fakultas) {
        this.name = name;
        this.nim = nim;
        this.prodi = prodi;
        this.fakultas = fakultas;
    }

    public String getName() {
        return name;   
    }
            
    public String getNim() {
        return nim;
    }
            
    public String getProdi() {
        return prodi;
    } 
    
    public String getFakultas() {
        return fakultas;   
    }
}
    