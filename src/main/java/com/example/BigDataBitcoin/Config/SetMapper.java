package com.example.BigDataBitcoin.Config;

import com.example.BigDataBitcoin.Models.CompCSV;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;

import java.net.BindException;

public class SetMapper implements FieldSetMapper<CompCSV> {
    @Override
    public CompCSV mappingFieldSets (FieldSet fieldSet) throws BindException{
        return new CompCSV(
                fieldSet.readString("unix_timestamp"),
                fieldSet.readString("date_time"),
                fieldSet.readString("open"),
                fieldSet.readString("high"),
                fieldSet.readString("low"),
                fieldSet.readString("close"),
                fieldSet.readString("volume_btc"),
                fieldSet.readString("volume_currency"),
                fieldSet.readString("weighted_price")
        );
    }

    @Override
    public CompCSV mapFieldSet(FieldSet fieldSet) throws org.springframework.validation.BindException {
        return null;
    }
}
