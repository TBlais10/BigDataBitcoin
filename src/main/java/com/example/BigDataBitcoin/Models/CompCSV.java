package com.example.BigDataBitcoin.Models;

import java.time.LocalDate;

public class CompCSV {
    private Integer Unix_Timestamp;
    private LocalDate DateTime;
    private float Open;
    private float High;
    private float Low;
    private float Close;
    private float Volume_BTC;
    private float Volume_Currency;
    private float Weighted_Price;

    public CompCSV() {
    }

    public Integer getUnix_Timestamp() {
        return Unix_Timestamp;
    }

    public void setUnix_Timestamp(Integer unix_Timestamp) {
        Unix_Timestamp = unix_Timestamp;
    }

    public LocalDate getDateTime() {
        return DateTime;
    }

    public void setDateTime(LocalDate dateTime) {
        DateTime = dateTime;
    }

    public float getOpen() {
        return Open;
    }

    public void setOpen(float open) {
        Open = open;
    }

    public float getHigh() {
        return High;
    }

    public void setHigh(float high) {
        High = high;
    }

    public float getLow() {
        return Low;
    }

    public void setLow(float low) {
        Low = low;
    }

    public float getClose() {
        return Close;
    }

    public void setClose(float close) {
        Close = close;
    }

    public float getVolume_BTC() {
        return Volume_BTC;
    }

    public void setVolume_BTC(float volume_BTC) {
        Volume_BTC = volume_BTC;
    }

    public float getVolume_Currency() {
        return Volume_Currency;
    }

    public void setVolume_Currency(float volume_Currency) {
        Volume_Currency = volume_Currency;
    }

    public float getWeighted_Price() {
        return Weighted_Price;
    }

    public void setWeighted_Price(float weighted_Price) {
        Weighted_Price = weighted_Price;
    }
}
