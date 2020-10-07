package com.example.project1.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Pengeluaran implements Parcelable {
    String namaPengeluaran;
    int jumlahPengeluaran;

    public Pengeluaran(String namaPengeluaran, int jumlahPengeluaran) {
        this.namaPengeluaran = namaPengeluaran;
        this.jumlahPengeluaran = jumlahPengeluaran;
    }

    public String getNamaPengeluaran() {
        return namaPengeluaran;
    }

    public void setNamaPengeluaran(String namaPengeluaran) {
        this.namaPengeluaran = namaPengeluaran;
    }

    public int getJumlahPengeluaran() {
        return jumlahPengeluaran;
    }

    public void setJumlahPengeluaran(int jumlahPengeluaran) {
        this.jumlahPengeluaran = jumlahPengeluaran;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.jumlahPengeluaran);
        dest.writeString(this.namaPengeluaran);
    }

    protected Pengeluaran(Parcel in) {
        this.jumlahPengeluaran = in.readInt();
        this.namaPengeluaran = in.readString();
    }

    public static final Parcelable.Creator<Pengeluaran> CREATOR = new Parcelable.Creator<Pengeluaran>() {
        @Override
        public Pengeluaran createFromParcel(Parcel source) {
            return new Pengeluaran(source);
        }

        @Override
        public Pengeluaran[] newArray(int size) {
            return new Pengeluaran[size];
        }
    };
}
