package com.jtb.taxpayerws.payload.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IndividualTinGenerationResponse {


    private Long id;

    @JsonProperty("nin")
    private String nin;

    @JsonProperty("tin")
    private String tin;
    @JsonProperty("bvn")
    private String bvn;
    @JsonProperty("name")
    private String name;

    @JsonProperty("responseDescription")
    private String responseDescription;




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

    public void setBvn(String bvn) {
        this.bvn = bvn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResponseDescription() {
        return responseDescription;
    }

    public void setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
    }

    @Override
    public String toString() {
        return "IndividualTinGenerationResponse{" +
                "id=" + id +
                ", nin='" + nin + '\'' +
                ", tin='" + tin + '\'' +
                ", bvn='" + bvn + '\'' +
                ", name='" + name + '\'' +
                ", responseDescription='" + responseDescription + '\'' +
                '}';
    }
}
