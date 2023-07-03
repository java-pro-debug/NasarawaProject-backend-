package com.jtb.taxpayerws.client.payload.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TaxpayerInfo {

    @JsonProperty(value="NIN")
    private String nin;

    @JsonProperty(value="TIN")
    private String tin;
    @JsonProperty(value="BVN")
    private String bvn;
    @JsonProperty(value="Name")
    private String name;



    public TaxpayerInfo(String nin, String tin, String bvn, String name) {
        this.nin = nin;
        this.tin = tin;
        this.bvn = bvn;
        this.name = name;

    }

    public TaxpayerInfo() {
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

    public String getBvn() {
        return bvn;
    }

    public String getName() {
        return name;
    }

    public void setTin(String tin) {
        this.tin = tin;
    }

    public void setBvn(String bvn) {
        this.bvn = bvn;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NonIndividualTinGeneration{" +
                "nin='" + nin + '\'' +
                ", tin='" + tin + '\'' +
                ", bvn='" + bvn + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
