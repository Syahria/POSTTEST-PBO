/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1;

import java.util.ArrayList;
import java.util.List;

public class PostTest1 {

    public static void main(String[] args) {
        List<Student> students = new ArrayList();

        // Isikan ArrayList "students" dengan objek-objek "Student"
        students.add(new Student("Syahria","2209116060", "Sistem Informasi", "Teknik"));
        students.add(new Student("Widya indriani","2101026127", "Manajemen", "FEB"));
        students.add(new Student("Kemala winasari","2107060029", "Matematika", "FMIPA"));
        students.add(new Student("Ana safitri","2205026057", "Pendidikan kimia", "FKIP"));
        students.add(new Student("Dini","2009106053", "Informatika", "Teknik"));

        // Perulangan untuk menampilkan informasi student
        for (Student student : students) {
            System.out.println("Nama " + student.getName() + " dengan NIM " + student.getNim() + " dari program studi " + student.getProdi() + " Fakultas " + student.getFakultas() + ".");
        }
    }
}
