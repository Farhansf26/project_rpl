/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.farhan.mahasiswa.controller;

import me.farhan.mahasiswa.model.MahasiswaDAO;
import me.farhan.mahasiswa.model.ModelMahasiswa;
import java.util.List;

/**
 *
 * @author farha
 */
public class MahasiswaController {
    private MahasiswaDAO mahasiswaDAO;
    
    public MahasiswaController(MahasiswaDAO mahasiswaDAO) {
        this.mahasiswaDAO = mahasiswaDAO;
    }
    
    public void displayMahasiswaList(List<ModelMahasiswa> mahasiswaList) {
        if(mahasiswaList.isEmpty()) {
            System.out.println("Tidak ada data mahasiswa");
        } else {
            System.out.println("");
            System.out.println("=========================");
            for(ModelMahasiswa m: mahasiswaList) {
                System.out.println("ID  : " + m.getId());
                System.out.println("NPM : " + m.getNpm());
                System.out.println("NAMA    : " + m.getNama());
                System.out.println("SEMESTER    : " + m.getSemester());
                System.out.println("IPK : " + m.getIpk());
                System.out.println("=========================");
            }
        }
    }
    
    public void displayMessage(String Message) {
        System.out.println(Message);
    }
    
    public void checkDatabaseConnection() {
        boolean isConnected = mahasiswaDAO.checkConnection();
        if(isConnected) {
            displayMessage("Koneksi ke db berhasil");
        } else {
            displayMessage("Koneksi DB gagal");
        }
    }
    
    public void dispayAllMahasiswa() {
        List<ModelMahasiswa> mahasiswaList = mahasiswaDAO.getAllMahasiswa();
        displayMahasiswaList(mahasiswaList);
    }
    
    public void addMahasiswa(String npm, String nama, int semester, float ipk) {
        ModelMahasiswa mahasiswaBaru = new ModelMahasiswa(0, npm, nama, semester, ipk);
        System.out.println("Controller Data : " + npm + nama + semester + ipk);
        System.out.println(mahasiswaBaru);
        mahasiswaDAO.addMahasiswa(mahasiswaBaru);
        displayMessage("Mahasiswa Berhasil Ditambahkan");
    }
    
    public void updateMahasiswa(int id, String npm, String nama, int semester, float ipk) {
        ModelMahasiswa mahasiswaBaru = new ModelMahasiswa(id, npm, nama, semester, ipk);
        mahasiswaDAO.updateMahasiswa(mahasiswaBaru);
        displayMessage("Mahasiswa Berhasil Diperbarui");
    }
    
    public void deleteMahasiswa(int id) {
        mahasiswaDAO.deleteMahasiswa(id);
        displayMessage("Mahasiswa Berhasil Dihapus");
    }
    
    public void closeConnection(){
        mahasiswaDAO.closeConnection();
    }
}