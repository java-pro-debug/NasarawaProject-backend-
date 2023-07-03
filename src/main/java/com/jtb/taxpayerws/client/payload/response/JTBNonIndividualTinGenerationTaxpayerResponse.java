package com.jtb.taxpayerws.client.payload.response;

import com.fasterxml.jackson.annotation.JsonProperty;


public class JTBNonIndividualTinGenerationTaxpayerResponse {


    @JsonProperty(value = "ResponseCode")
    private String responseCode;

    @JsonProperty(value = "ResponseDescription")
    private String responseDescription;

    @JsonProperty(value = "TaxpayerInfo")
    private NonIndividualTinGeneration nonIndividualTinGeneration;

    public JTBNonIndividualTinGenerationTaxpayerResponse() {
    }


    public JTBNonIndividualTinGenerationTaxpayerResponse(String responseCode, String responseDescription, NonIndividualTinGeneration nonIndividualTinGeneration) {
        this.responseCode = responseCode;
        this.responseDescription = responseDescription;
        this. nonIndividualTinGeneration =  nonIndividualTinGeneration;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseDescription() {
        return responseDescription;
    }

    public void setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
    }

    public NonIndividualTinGeneration getNonIndividualTinGeneration() {
        return nonIndividualTinGeneration;
    }

    public void setNonIndividualTinGeneration(NonIndividualTinGeneration nonIndividualTinGeneration) {
        this.nonIndividualTinGeneration = nonIndividualTinGeneration;
    }

    @Override
    public String toString() {
        return "JTBNonIndividualTinGenerationTaxpayerResponse{" +
                "responseCode='" + responseCode + '\'' +
                ", responseDescription='" + responseDescription + '\'' +
                ", nonIndividualTinGeneration=" + nonIndividualTinGeneration +
                '}';
    }
}
