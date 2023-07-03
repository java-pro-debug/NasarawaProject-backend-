package com.jtb.taxpayerws.payload.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NonIndividualTinGenerationResponse {


    private Long id;

    @JsonProperty("RegNumber")
    private String regNumber;

    @JsonProperty("TIN")
    private String tin;

    @JsonProperty("OrganizationType")
    private String organizationType;

    @JsonProperty("TaxOffice")
    private String taxOffice;

    @JsonProperty("TinRegDate")
    private String tinRegDate;

    @JsonProperty("TaxAuthority")
    private String taxAuthority;


    @JsonProperty(value = "responseDescription")
    private String responseDescription;



    public NonIndividualTinGenerationResponse(String regNumber, String tin, String organizationType, String taxOffice, String tinRegDate, String taxAuthority, String responseDescription) {
        this.regNumber = regNumber;
        this.tin = tin;
        this.organizationType = organizationType;
        this.taxOffice = taxOffice;
        this.tinRegDate = tinRegDate;
        this.taxAuthority = taxAuthority;
        this.responseDescription = responseDescription;
    }

    public NonIndividualTinGenerationResponse() {
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


    @Override
    public String toString() {
        return "NonIndividualTinGenerationResponse{" +
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
