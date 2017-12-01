package com.example.se77.scandemo;
import java.util.Calendar;


import com.fasterxml.jackson.annotation.JsonFormat;

public class ScanMessage {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd@HH:mm:ss.SSSZ")
    public Calendar getCreationTsp() {
        return creationTsp;
    }

    public void setCreationTsp(Calendar creationTsp) {
        this.creationTsp = creationTsp;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private Calendar creationTsp;

    private String createdBy;

    private String barcode;

    private String format;

    private String message;
}