package com.example.projetoX.model;
import javax.persistence.Column;
import javax.persistence.Id;

public class Customer {
    @Column
    private String name;
    @Id
    @Column
    private String ssc;
    @Column
    private int codec;
    @Column
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsc() {
        return ssc;
    }

    public void setSsc(String ssc) {
        this.ssc = ssc;
    }

    public int getCodec() {
        return codec;
    }

    public void setCodec(int codec) {
        this.codec = codec;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
