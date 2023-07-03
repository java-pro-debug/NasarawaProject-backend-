package com.jtb.taxpayerws.dto;


public class NonIndividualTinGenerationResponseDto {

    private Long id;

    private String regNumber;


    private String tin;


    private String organizationType;


    private String taxOffice;


    private String tinRegDate;


    private String taxAuthority;

    private String responseDescription;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getTin() {
        return tin;
    }

    public void setTin(String tin) {
        this.tin = tin;
    }

    public String getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType;
    }

    public String getTaxOffice() {
        return taxOffice;
    }

    public void setTaxOffice(String taxOffice) {
        this.taxOffice = taxOffice;
    }

    public String getTinRegDate() {
        return tinRegDate;
    }

    public void setTinRegDate(String tinRegDate) {
        this.tinRegDate = tinRegDate;
    }

    public String getTaxAuthority() {
        return taxAuthority;
    }

    public void setTaxAuthority(String taxAuthority) {
        this.taxAuthority = taxAuthority;
    }

    public String getResponseDescription() {
        return responseDescription;
    }

    public void setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
    }

    @Override
    public String toString() {
        return "NonIndividualTinGenerationResponseDto{" +
                "id=" + id +
                ", regNumber='" + regNumber + '\'' +
                ", tin='" + tin + '\'' +
                ", organizationType='" + organizationType + '\'' +
                ", taxOffice='" + taxOffice + '\'' +
                ", tinRegDate='" + tinRegDate + '\'' +
                ", taxAuthority='" + taxAuthority + '\'' +
                ", responseDescription='" + responseDescription + '\'' +
                '}';
    }
}
