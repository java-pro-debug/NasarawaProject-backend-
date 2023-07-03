package com.jtb.taxpayerws.payload.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class IndividualTinGenerationRequest {

    @JsonProperty("bvn")
    private String bvn;

    @JsonProperty("nin")
    private String nin;

    @JsonProperty("title")
    private String title;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("middleName")
    private String middleName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("stateOfOrigin")
    private String stateOfOrigin;

    @JsonProperty("dob")
    private String dob;

    @JsonProperty("occupation")
    private String occupation;

    @JsonProperty("nationality")
    private String nationality;

    @JsonProperty("email")
    private String email;

    @JsonProperty("phone1")
    private String phone1;

    @JsonProperty("phone2")
    private String phone2;

    @JsonProperty("photo")
    private String photo;

    @JsonProperty("houseNo")
    private String houseNo;

    @JsonProperty("streetName")
    private String streetName;

    @JsonProperty("city")
    private String city;

    @JsonProperty("lga")
    private String lga;

    @JsonProperty("state")
    private String state;

    @JsonProperty("country")
    private String country;

    public IndividualTinGenerationRequest(
            String bvn, String nin, String title, String firstName, String middleName, String lastName,
            String gender, String stateOfOrigin, String dob, String occupation, String nationality,
            String email, String phone1, String phone2, String photo, String houseNo, String streetName,
            String city, String lga, String state, String country) {

        this.bvn = bvn;
        this.nin = nin;
        this.title = title;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.stateOfOrigin = stateOfOrigin;
        this.dob = dob;
        this.occupation = occupation;
        this.nationality = nationality;
        this.email = email;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.photo = photo;
        this.houseNo = houseNo;
        this.streetName = streetName;
        this.city = city;
        this.lga = lga;
        this.state = state;
        this.country = country;
    }

    public IndividualTinGenerationRequest() {

    }

    // Add getters and setters for each property

    public String getBvn() {
        return bvn;
    }

    public void setBvn(String bvn) {
        this.bvn = bvn;
    }

    public String getNin() {
        return nin;
    }

    public void setNin(String nin) {
        this.nin = nin;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public String getStateOfOrigin() {
        return stateOfOrigin;
    }

    public String getDob() {
        return dob;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getNationality() {
        return nationality;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone1() {
        return phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public String getPhoto() {
        return photo;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCity() {
        return city;
    }

    public String getLga() {
        return lga;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setStateOfOrigin(String stateOfOrigin) {
        this.stateOfOrigin = stateOfOrigin;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setLga(String lga) {
        this.lga = lga;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }
// Add getters and setters for the rest of the properties

    @Override
    public String toString() {
        return "IndividualTinGenerationRequest{" +
                "bvn=" + bvn +
                ", nin=" + nin +
                ", title='" + title + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", stateOfOrigin='" + stateOfOrigin + '\'' +
                ", dob='" + dob + '\'' +
                ", occupation='" + occupation + '\'' +
                ", nationality='" + nationality + '\'' +
                ", email='" + email + '\'' +
                ", phone1='" + phone1 + '\'' +
                ", phone2='" + phone2 + '\'' +
                ", photo='" + photo + '\'' +
                ", houseNo='" + houseNo + '\'' +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", lga='" + lga + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

}
