package com.jtb.taxpayerws.dto;



public class IndividualTinGenerationResponseDto {

    private Long id;
    private String nin;

    private String tin;
    private String bvn;

    private String name;

    private  String responseDescription;


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

    @Override
    public String toString() {
        return "IndividualTinGenerationResponseDto{" +
                "id=" + id +
                ", nin='" + nin + '\'' +
                ", tin='" + tin + '\'' +
                ", bvn='" + bvn + '\'' +
                ", name='" + name + '\'' +
                ", responseDescription='" + responseDescription + '\'' +
                '}';
    }
}
