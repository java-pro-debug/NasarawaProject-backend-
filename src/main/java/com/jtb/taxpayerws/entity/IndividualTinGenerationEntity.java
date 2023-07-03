package com.jtb.taxpayerws.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jtb.taxpayerws.entity.audit.Auditable;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "individual_tin_generation")
public class IndividualTinGenerationEntity extends Auditable implements Serializable {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nin",nullable = false, length = 200)
    private String nin;

    @Column(name = "tin",nullable = false, length = 200)
    private String tin;
    @Column(name = "bvn",nullable = false, length = 200)
    private String bvn;
    @Column(name = "name",nullable = false, length = 200)
    private String name;


    @Column(name = "response_description",nullable = false, length = 200)
    private String responseDescription;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNin() {
        return nin;
    }

    public void setNin(String nin) {
        this.nin = nin;
    }

    public String getTin() {
        return tin;
    }

    public void setTin(String tin) {
        this.tin = tin;
    }

    public String getBvn() {
        return bvn;
    }

    public String getResponseDescription() {
        return responseDescription;
    }

    public void setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
    }

    public void setBvn(String bvn) {
        this.bvn = bvn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "IndividualTinGenerationEntity{" +
                "id=" + id +
                ", nin='" + nin + '\'' +
                ", tin='" + tin + '\'' +
                ", bvn='" + bvn + '\'' +
                ", name='" + name + '\'' +
                ", responseDescription='" + responseDescription + '\'' +
                '}';
    }
}
