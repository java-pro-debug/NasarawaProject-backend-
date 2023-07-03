package com.jtb.taxpayerws.service.impl;

import com.jtb.taxpayerws.client.payload.request.JTBIndividualTinGenerationTaxpayerRequest;
import com.jtb.taxpayerws.client.payload.response.JTBIndividualTinGenerationTaxpayerResponse;
import com.jtb.taxpayerws.dto.IndividualTinGenerationRequestDto;
import com.jtb.taxpayerws.dto.IndividualTinGenerationResponseDto;
import com.jtb.taxpayerws.client.proxy.JTBClientProxy;
import com.jtb.taxpayerws.entity.IndividualTinGenerationEntity;
import com.jtb.taxpayerws.repository.IndividualTinGenerationRepository;
import com.jtb.taxpayerws.service.AbstractJTBService;
import com.jtb.taxpayerws.service.IndividualTinGenerationService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndividualTinGenerationServiceImpl extends AbstractJTBService implements IndividualTinGenerationService {


    private final IndividualTinGenerationRepository individualTinGenerationRepository;

    private final ModelMapper modelMapper;

    @Autowired
    public IndividualTinGenerationServiceImpl(JTBClientProxy jtbClientProxy, IndividualTinGenerationRepository individualTinGenerationRepository, ModelMapper modelMapper) {
        super(jtbClientProxy);
        this.individualTinGenerationRepository = individualTinGenerationRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public IndividualTinGenerationResponseDto createIndividualTinGeneration(
            IndividualTinGenerationRequestDto individualTinGenerationRequestDto) {
        // Map the DTO object to the JTB request object
        JTBIndividualTinGenerationTaxpayerRequest jtbIndividualTinGenerationTaxpayerRequest =
                modelMapper.map(individualTinGenerationRequestDto, JTBIndividualTinGenerationTaxpayerRequest.class);

        System.out.println("JTBRequestTaxpayer: " + jtbIndividualTinGenerationTaxpayerRequest);

        // Call the JTB client proxy to get the response
        JTBIndividualTinGenerationTaxpayerResponse jtbIndividualTinGenerationResponse =
                jtbClientProxy.getIndividualTinGeneration(jtbIndividualTinGenerationTaxpayerRequest,
                        getLoginResponseEntity().getTokenId());
        System.out.println("JTBLoginResponse: " + getLoginResponseEntity().getTokenId());
        System.out.println("JTBResponse: " + jtbIndividualTinGenerationResponse);
        System.out.println("ResponseDescription: " + jtbIndividualTinGenerationResponse.getResponseDescription());

        // Create the response DTO object
        IndividualTinGenerationResponseDto responseDto = new IndividualTinGenerationResponseDto();

        // Check if the JTB response code indicates success
        if (jtbIndividualTinGenerationResponse.getResponseCode().equals("001")) {
            // Map the taxpayer info from the JTB response to the response DTO
            responseDto.setNin(jtbIndividualTinGenerationResponse.getTaxpayerInfo().getNin());
            responseDto.setTin(jtbIndividualTinGenerationResponse.getTaxpayerInfo().getTin());
            responseDto.setBvn(jtbIndividualTinGenerationResponse.getTaxpayerInfo().getBvn());
            responseDto.setName(jtbIndividualTinGenerationResponse.getTaxpayerInfo().getName());
        }

        // Set the response description
        responseDto.setResponseDescription(jtbIndividualTinGenerationResponse.getResponseDescription());

        // Save the entity object and return the mapped response DTO
        return modelMapper.map(individualTinGenerationRepository.save(modelMapper.map(responseDto, IndividualTinGenerationEntity.class)),
                IndividualTinGenerationResponseDto.class);
    }





}
