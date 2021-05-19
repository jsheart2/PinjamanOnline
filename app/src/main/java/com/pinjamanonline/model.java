package com.pinjamanonline;

public class model
{
    String namapemohon, alamat, telepon, KTP, duit, pinjaman;

    model(){}

    public model(String namapemohon, String alamat, String telepon, String KTP, String duit, String pinjaman) {
        this.namapemohon = namapemohon;
        this.alamat = alamat;
        this.telepon = telepon;
        this.KTP = KTP;
        this.duit = duit;
        this.pinjaman = pinjaman;
    }

    public String getNamapemohon() {
        return namapemohon;
    }

    public void setNamapemohon(String namapemohon) {
        this.namapemohon = namapemohon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getKTP() {
        return KTP;
    }

    public void setKTP(String KTP) {
        this.KTP = KTP;
    }

    public String getDuit() {
        return duit;
    }

    public void setDuit(String duit) {
        this.duit = duit;
    }

    public String getPinjaman() {
        return pinjaman;
    }

    public void setPinjaman(String pinjaman) {
        this.pinjaman = pinjaman;
    }
}
