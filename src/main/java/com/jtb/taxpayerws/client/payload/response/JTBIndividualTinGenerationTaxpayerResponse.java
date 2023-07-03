package com.jtb.taxpayerws.client.payload.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class JTBIndividualTinGenerationTaxpayerResponse implements Serializable {


    @JsonProperty(value = "ResponseCode")
    private String responseCode;
    @JsonProperty(value = "ResponseDescription")
    private String responseDescription;


    @JsonProperty(value = "TaxpayerInfo")
    private TaxpayerInfo taxpayerInfo;



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

    public TaxpayerInfo getTaxpayerInfo() {
        return taxpayerInfo;
    }

    public void setTaxpayerInfo(TaxpayerInfo taxpayerInfo) {
        this.taxpayerInfo = taxpayerInfo;
    }

    @Override
    public String toString() {
        return "JTBIndividualTinGenerationTaxpayerResponse{" +
                "responseCode='" + responseCode + '\'' +
                ", responseDescription='" + responseDescription + '\'' +
                ", taxpayerInfo=" + taxpayerInfo +
                '}';
    }
}
