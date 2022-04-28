package com.example.BigDataBitcoin.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class CompCSV {
    private String Unix_Timestamp;
    private String DateTime;
    private String Open;
    private String High;
    private String Low;
    private String Close;
    private String  Volume_BTC;
    private String Volume_Currency;
    private String  Weighted_Price;

    public CompCSV() {
    }

    public CompCSV(String unix_Timestamp, String dateTime, String open, String high, String low, String close, String volume_BTC, String volume_Currency, String weighted_Price) {
        Unix_Timestamp = unix_Timestamp;
        DateTime = dateTime;
        Open = open;
        High = high;
        Low = low;
        Close = close;
        Volume_BTC = volume_BTC;
        Volume_Currency = volume_Currency;
        Weighted_Price = weighted_Price;
    }

    public String getUnix_Timestamp() {
        return Unix_Timestamp;
    }

    public void setUnix_Timestamp(String unix_Timestamp) {
        Unix_Timestamp = unix_Timestamp;
    }

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String dateTime) {
        DateTime = dateTime;
    }

    public String getOpen() {
        return Open;
    }

    public void setOpen(String open) {
        Open = open;
    }

    public String getHigh() {
        return High;
    }

    public void setHigh(String high) {
        High = high;
    }

    public String getLow() {
        return Low;
    }

    public void setLow(String low) {
        Low = low;
    }

    public String getClose() {
        return Close;
    }

    public void setClose(String close) {
        Close = close;
    }

    public String getVolume_BTC() {
        return Volume_BTC;
    }

    public void setVolume_BTC(String volume_BTC) {
        Volume_BTC = volume_BTC;
    }

    public String getVolume_Currency() {
        return Volume_Currency;
    }

    public void setVolume_Currency(String volume_Currency) {
        Volume_Currency = volume_Currency;
    }

    public String getWeighted_Price() {
        return Weighted_Price;
    }

    public void setWeighted_Price(String weighted_Price) {
        Weighted_Price = weighted_Price;
    }
}
