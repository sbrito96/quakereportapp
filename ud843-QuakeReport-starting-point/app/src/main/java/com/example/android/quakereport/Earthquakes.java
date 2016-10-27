package com.example.android.quakereport;

/**
 * Created by Samuel Brito on 6/10/2016.
 */

public class Earthquakes extends EarthquakeActivity {

    private String mLugar;
    private Long mTiempoEnMilisegundos;
    private double mMagnitud;
    private String mUrl;

    public Earthquakes(double magnitud, String lugar, Long tiempoEnMilisegundos, String url) {

        mLugar = lugar;
        mTiempoEnMilisegundos = tiempoEnMilisegundos;
        mMagnitud = magnitud;
        mUrl = url;

    }

    public String getmLugar() {
        return mLugar;

    }

    public Long getmTiempoEnMilisegundos() {
        return mTiempoEnMilisegundos;
    }

    public double getmMagnitud() {
        return mMagnitud;
    }

    public String getmUrl(){ return  mUrl;}

}