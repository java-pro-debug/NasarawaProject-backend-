package com.jtb.taxpayerws.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NonIndividualTinGenerationRequestDto {


    @JsonProperty("OrganizationType")
    private String OrganizationType;


    @JsonProperty("RegistrationDate")
    private String RegistrationDate;


    @JsonProperty("IncorporationDate")
    private String IncorporationDate;


    @JsonProperty("LineOfBusinessName ")
    private String LineOfBusinessName;


    @JsonProperty("LineOfBusinessCode ")
    private String LineOfBusinessCode;


    @JsonProperty("CommencementDate")
    private String CommencementDate;


    @JsonProperty("DirectorName")
    private String DirectorName;


    @JsonProperty("DirectorPhone ")
    private String DirectorPhone;


    @JsonProperty("DirectorEmail")
    private String DirectorEmail;


    @JsonProperty("Email")
    private String Email;


    @JsonProperty("FinancialYearBegin")
    private String FinancialYearBegin;


    @JsonProperty("FinancialYearEnd")
    private String FinancialYearEnd;


    @JsonProperty("RegNumber")
    private String RegNumber;


    @JsonProperty("PhoneNo1")
    private String PhoneNo1;



    @JsonProperty("PhoneNo2")
    private String PhoneNo2;


    @JsonProperty("StreetName")
    private String StreetName;



    @JsonProperty("city")
    private String city;


    @JsonProperty("lga")
    private String lga;



    @JsonProperty("state")
    private String state;


    @JsonProperty("CACRegistrationName")
    private String CACRegistrationName;


    @JsonProperty("OfficeNumber")
    private String OfficeNumber;

    public NonIndividualTinGenerationRequestDto(String organizationType, String registrationDate, String incorporationDate, String lineOfBusinessName, String lineOfBusinessCode, String commencementDate, String directorName, String directorPhone, String directorEmail, String email, String financialYearBegin, String financialYearEnd, String regNumber, String phoneNo1, String phoneNo2, String streetName, String city, String lga, String state, String CACRegistrationName, String officeNumber) {
        OrganizationType = organizationType;
        RegistrationDate = registrationDate;
        IncorporationDate = incorporationDate;
        LineOfBusinessName = lineOfBusinessName;
        LineOfBusinessCode = lineOfBusinessCode;
        CommencementDate = commencementDate;
        DirectorName = directorName;
        DirectorPhone = directorPhone;
        DirectorEmail = directorEmail;
        Email = email;
        FinancialYearBegin = financialYearBegin;
        FinancialYearEnd = financialYearEnd;
        RegNumber = regNumber;
        PhoneNo1 = phoneNo1;
        PhoneNo2 = phoneNo2;
        StreetName = streetName;
        this.city = city;
        this.lga = lga;
        this.state = state;
        this.CACRegistrationName = CACRegistrationName;
        OfficeNumber = officeNumber;
    }

    public NonIndividualTinGenerationRequestDto() {
    }

    public String getOrganizationType() {
        return OrganizationType;
    }

    public void setOrganizationType(String organizationType) {
        OrganizationType = organizationType;
    }

    public String getRegistrationDate() {
        return RegistrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        RegistrationDate = registrationDate;
    }

    public String getIncorporationDate() {
        return IncorporationDate;
    }

    public void setIncorporationDate(String incorporationDate) {
        IncorporationDate = incorporationDate;
    }

    public String getLineOfBusinessName() {
        return LineOfBusinessName;
    }

    public void setLineOfBusinessName(String lineOfBusinessName) {
        LineOfBusinessName = lineOfBusinessName;
    }

    public String getLineOfBusinessCode() {
        return LineOfBusinessCode;
    }

    public void setLineOfBusinessCode(String lineOfBusinessCode) {
        LineOfBusinessCode = lineOfBusinessCode;
    }

    public String getCommencementDate() {
        return CommencementDate;
    }

    public void setCommencementDate(String commencementDate) {
        CommencementDate = commencementDate;
    }

    public String getDirectorName() {
        return DirectorName;
    }

    public void setDirectorName(String directorName) {
        DirectorName = directorName;
    }

    public String getDirectorPhone() {
        return DirectorPhone;
    }

    public void setDirectorPhone(String directorPhone) {
        DirectorPhone = directorPhone;
    }

    public String getDirectorEmail() {
        return DirectorEmail;
    }

    public void setDirectorEmail(String directorEmail) {
        DirectorEmail = directorEmail;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getFinancialYearBegin() {
        return FinancialYearBegin;
    }

    public void setFinancialYearBegin(String financialYearBegin) {
        FinancialYearBegin = financialYearBegin;
    }

    public String getFinancialYearEnd() {
        return FinancialYearEnd;
    }

    public void setFinancialYearEnd(String financialYearEnd) {
        FinancialYearEnd = financialYearEnd;
    }

    public String getRegNumber() {
        return RegNumber;
    }

    public void setRegNumber(String regNumber) {
        RegNumber = regNumber;
    }

    public String getPhoneNo1() {
        return PhoneNo1;
    }

    public void setPhoneNo1(String phoneNo1) {
        PhoneNo1 = phoneNo1;
    }

    public String getPhoneNo2() {
        return PhoneNo2;
    }

    public void setPhoneNo2(String phoneNo2) {
        PhoneNo2 = phoneNo2;
    }

    public String getStreetName() {
        return StreetName;
    }

    public void setStreetName(String streetName) {
        StreetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLga() {
        return lga;
    }

    public void setLga(String lga) {
        this.lga = lga;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCACRegistrationName() {
        return CACRegistrationName;
    }

    public void setCACRegistrationName(String CACRegistrationName) {
        this.CACRegistrationName = CACRegistrationName;
    }

    public String getOfficeNumber() {
        return OfficeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        OfficeNumber = officeNumber;
    }

    @Override
    public String toString() {
        return "NonIndividualTinGenerationRequest{" +
                "OrganizationType='" + OrganizationType + '\'' +
                ", RegistrationDate='" + RegistrationDate + '\'' +
                ", IncorporationDate='" + IncorporationDate + '\'' +
                ", LineOfBusinessName='" + LineOfBusinessName + '\'' +
                ", LineOfBusinessCode=" + LineOfBusinessCode +
                ", CommencementDate='" + CommencementDate + '\'' +
                ", DirectorName='" + DirectorName + '\'' +
                ", DirectorPhone='" + DirectorPhone + '\'' +
                ", DirectorEmail='" + DirectorEmail + '\'' +
                ", Email='" + Email + '\'' +
                ", FinancialYearBegin='" + FinancialYearBegin + '\'' +
                ", FinancialYearEnd='" + FinancialYearEnd + '\'' +
                ", RegNumber='" + RegNumber + '\'' +
                ", PhoneNo1='" + PhoneNo1 + '\'' +
                ", PhoneNo2='" + PhoneNo2 + '\'' +
                ", StreetName='" + StreetName + '\'' +
                ", city='" + city + '\'' +
                ", lga='" + lga + '\'' +
                ", state='" + state + '\'' +
                ", CACRegistrationName='" + CACRegistrationName + '\'' +
                ", OfficeNumber='" + OfficeNumber + '\'' +
                '}';
    }

}
