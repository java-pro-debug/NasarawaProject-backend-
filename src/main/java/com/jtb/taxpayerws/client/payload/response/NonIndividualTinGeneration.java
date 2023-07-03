package com.jtb.taxpayerws.client.payload.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NonIndividualTinGeneration {
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
        return "NonIndividualTinGeneration{" +
                "regNumber='" + regNumber + '\'' +
                ", tin='" + tin + '\'' +
                ", organizationType='" + organizationType + '\'' +
                ", taxOffice='" + taxOffice + '\'' +
                ", tinRegDate='" + tinRegDate + '\'' +
                ", taxAuthority='" + taxAuthority + '\'' +
                '}';
    }

}
