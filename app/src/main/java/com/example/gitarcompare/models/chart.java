package com.example.gitarcompare.models;

import com.google.firebase.database.Exclude;

import java.util.HashMap;
import java.util.Map;

public class chart {
    public String judul, penyanyi, gambar;

    public chart(String judul, String penyanyi, String gambar) {
        this.judul = judul;
        this.penyanyi = penyanyi;
        this.gambar = gambar;
    }

    @Exclude

    public Map<String, Object> toMap() {

        HashMap<String, Object> result = new HashMap<>();

        result.put("judul", judul);

        result.put("penyanyi", penyanyi);

        result.put("gambar", gambar);

        return result;

    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenyanyi() {
        return penyanyi;
    }

    public void setPenyanyi(String penyanyi) {
        this.penyanyi = penyanyi;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }
}
