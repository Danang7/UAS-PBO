/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author user
 */
public class modelspenerimaan {
    private int id;
    private String nama;
    private int NISN;
    private String tanggal_lahir;
    private String tempat_lahir;
    private String alamat;
    private int no_telp;
    private String email; 
    private String program_studi;
    private String agama;
    private String gender;
    
    public modelspenerimaan (int id, String nama, int NISN, String program_studi, String gender, String agama,String tanggal_lahir, String tempat_lahir, String alamat, int no_telp, String email) 
    {
        this.id = id;
        this.nama = nama;
        this.NISN = NISN;
        this.program_studi = program_studi;
        this.gender = gender;
        this.agama = agama;
        this.tanggal_lahir = tanggal_lahir;
        this.tempat_lahir = tempat_lahir;
        this.alamat = alamat;
        this.no_telp = no_telp;
        this.email = email;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @return the NISN
     */
    public int getNISN() {
        return NISN;
    }


    /**
     * @return the tanggal_lahir
     */
    public String getTanggal_lahir() {
        return tanggal_lahir;
    }



    /**
     * @return the tempat_lahir
     */
    public String getTempat_lahir() {
        return tempat_lahir;
    }



    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }



    /**
     * @return the no_telp
     */
    public int getNo_telp() {
        return no_telp;
    }


    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }


    /**
     * @return the program_studi
     */
    public String getProgram_studi() {
        return program_studi;
    }



    /**
     * @return the agama
     */
    public String getAgama() {
        return agama;
    }
    
    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }
}
