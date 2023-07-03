package com.jtb.taxpayerws.service;

import com.jtb.taxpayerws.client.payload.request.JTBIndividualTinGenerationTaxpayerRequest;
import com.jtb.taxpayerws.client.payload.request.JTBLoginRequest;
import com.jtb.taxpayerws.client.payload.request.JTBTaxpayerRequest;
import com.jtb.taxpayerws.client.payload.response.JTBLoginResponse;
import com.jtb.taxpayerws.client.proxy.JTBClientProxy;
import com.jtb.taxpayerws.dto.IndividualTinGenerationRequestDto;
import org.springframework.beans.factory.annotation.Value;

public abstract class AbstractJTBService {

    protected final JTBClientProxy jtbClientProxy;



    public AbstractJTBService(JTBClientProxy jtbClientProxy) {
        this.jtbClientProxy = jtbClientProxy;
    }

    @Value("${jtb.email}")
    protected String email;

    @Value("${jtb.password}")
    protected String password;

    @Value("${jtb.clientname}")
    protected String clientName;

    private JTBLoginRequest buildJTBLoginEntity() {
        JTBLoginRequest jtbLoginRequest = new JTBLoginRequest();
        jtbLoginRequest.setEmail(email);
        jtbLoginRequest.setPassword(password);
        jtbLoginRequest.setClientName(clientName);

        return jtbLoginRequest;
    }

    protected JTBLoginResponse getLoginResponseEntity() {
        return jtbClientProxy.login(buildJTBLoginEntity());
    }

    protected JTBTaxpayerRequest getJtbTaxpayerRequest(String tin) {
        JTBTaxpayerRequest jtbTaxpayerRequest = new JTBTaxpayerRequest();
        jtbTaxpayerRequest.setTin(tin);
        return jtbTaxpayerRequest;
    }

    protected JTBIndividualTinGenerationTaxpayerRequest getJTBIndividualTinGenerationTaxpayerRequest(IndividualTinGenerationRequestDto individualTinGenerationRequestDto){
        JTBIndividualTinGenerationTaxpayerRequest jtbIndividualTinGenerationTaxpayerRequest = new JTBIndividualTinGenerationTaxpayerRequest();

        jtbIndividualTinGenerationTaxpayerRequest.setBvn(individualTinGenerationRequestDto.getBvn());
        jtbIndividualTinGenerationTaxpayerRequest.setCity(individualTinGenerationRequestDto.getCity());
        jtbIndividualTinGenerationTaxpayerRequest.setCountry(individualTinGenerationRequestDto.getCountry());
        jtbIndividualTinGenerationTaxpayerRequest.setDob(individualTinGenerationRequestDto.getDob());
        jtbIndividualTinGenerationTaxpayerRequest.setGender(individualTinGenerationRequestDto.getGender());
        jtbIndividualTinGenerationTaxpayerRequest.setEmail(individualTinGenerationRequestDto.getEmail());
        jtbIndividualTinGenerationTaxpayerRequest.setLga(individualTinGenerationRequestDto.getLga());
        jtbIndividualTinGenerationTaxpayerRequest.setFirstName(individualTinGenerationRequestDto.getFirstName());
        jtbIndividualTinGenerationTaxpayerRequest.setHouseNo(individualTinGenerationRequestDto.getHouseNo());
        jtbIndividualTinGenerationTaxpayerRequest.setLastName(individualTinGenerationRequestDto.getLastName());
        jtbIndividualTinGenerationTaxpayerRequest.setMiddleName(individualTinGenerationRequestDto.getMiddleName());
        jtbIndividualTinGenerationTaxpayerRequest.setNationality(individualTinGenerationRequestDto.getNationality());
        jtbIndividualTinGenerationTaxpayerRequest.setNin(individualTinGenerationRequestDto.getNin());
        jtbIndividualTinGenerationTaxpayerRequest.setOccupation(individualTinGenerationRequestDto.getOccupation());
        jtbIndividualTinGenerationTaxpayerRequest.setPhone1(individualTinGenerationRequestDto.getPhone1());
        jtbIndividualTinGenerationTaxpayerRequest.setPhone2(individualTinGenerationRequestDto.getPhone2());
        jtbIndividualTinGenerationTaxpayerRequest.setPhoto(individualTinGenerationRequestDto.getPhoto());
        jtbIndividualTinGenerationTaxpayerRequest.setState(individualTinGenerationRequestDto.getState());
        jtbIndividualTinGenerationTaxpayerRequest.setStateOfOrigin(individualTinGenerationRequestDto.getStateOfOrigin());
        jtbIndividualTinGenerationTaxpayerRequest.setStreetName(individualTinGenerationRequestDto.getStreetName());
        jtbIndividualTinGenerationTaxpayerRequest.setTitle(individualTinGenerationRequestDto.getTitle());


        return jtbIndividualTinGenerationTaxpayerRequest;

    }

}