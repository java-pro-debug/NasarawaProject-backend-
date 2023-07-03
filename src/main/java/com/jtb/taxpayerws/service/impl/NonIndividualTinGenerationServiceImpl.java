package com.jtb.taxpayerws.service.impl;



import com.jtb.taxpayerws.dto.NonIndividualTinGenerationResponseDto;


import com.jtb.taxpayerws.client.payload.request.JTBNonIndividualTinGenerationTaxpayerRequest;
import com.jtb.taxpayerws.client.payload.response.JTBNonIndividualTinGenerationTaxpayerResponse;
import com.jtb.taxpayerws.client.proxy.JTBClientProxy;
import com.jtb.taxpayerws.dto.NonIndividualTinGenerationRequestDto;

import com.jtb.taxpayerws.entity.NonIndividualTinGenerationEntity;
import com.jtb.taxpayerws.repository.NonIndividualTinGenerationRepository;
import com.jtb.taxpayerws.service.AbstractJTBService;
import com.jtb.taxpayerws.service.NonIndividualTinGenerationService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class NonIndividualTinGenerationServiceImpl extends AbstractJTBService implements NonIndividualTinGenerationService {

    private final NonIndividualTinGenerationRepository nonIndividualTinGenerationRepository;

    private final ModelMapper modelMapper;


    @Autowired
    public NonIndividualTinGenerationServiceImpl(JTBClientProxy jtbClientProxy, NonIndividualTinGenerationRepository nonIndividualTinGenerationRepository, ModelMapper modelMapper) {
        super(jtbClientProxy);
        this.nonIndividualTinGenerationRepository = nonIndividualTinGenerationRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public NonIndividualTinGenerationResponseDto createNonIndividualTinGeneration(
            NonIndividualTinGenerationRequestDto nonIndividualTinGenerationRequestDto) {
        // Map the DTO object to the JTB request object
        JTBNonIndividualTinGenerationTaxpayerRequest jtbNonIndividualTinGenerationTaxpayerRequest =
                modelMapper.map(nonIndividualTinGenerationRequestDto, JTBNonIndividualTinGenerationTaxpayerRequest.class);

        System.out.println("JTBRequestTaxpayer: " + jtbNonIndividualTinGenerationTaxpayerRequest);

        // Call the JTB client proxy to get the response
        JTBNonIndividualTinGenerationTaxpayerResponse jtbNonIndividualTinGenerationTaxpayerResponse =
                jtbClientProxy.getNonIndividualTinGeneration(jtbNonIndividualTinGenerationTaxpayerRequest,
                        getLoginResponseEntity().getTokenId());
        System.out.println("JTBLoginResponse: " + getLoginResponseEntity().getTokenId());
        System.out.println("JTBResponse: " + jtbNonIndividualTinGenerationTaxpayerResponse);
        System.out.println("ResponseDescription: " + jtbNonIndividualTinGenerationTaxpayerResponse.getResponseDescription());

        // Create the response DTO object
        NonIndividualTinGenerationResponseDto responseDto = new NonIndividualTinGenerationResponseDto();

        // Check if the JTB response code indicates success
        if (jtbNonIndividualTinGenerationTaxpayerResponse.getResponseCode().equals("001")) {
            // Map the taxpayer info from the JTB response to the response DTO
            responseDto.setTin(jtbNonIndividualTinGenerationTaxpayerResponse.getNonIndividualTinGeneration().getTin());
            responseDto.setOrganizationType(jtbNonIndividualTinGenerationTaxpayerResponse.getNonIndividualTinGeneration().getOrganizationType());
            responseDto.setRegNumber(jtbNonIndividualTinGenerationTaxpayerResponse.getNonIndividualTinGeneration().getRegNumber());
            responseDto.setTaxAuthority(jtbNonIndividualTinGenerationTaxpayerResponse.getNonIndividualTinGeneration().getTaxAuthority());
            responseDto.setTaxOffice(jtbNonIndividualTinGenerationTaxpayerResponse.getNonIndividualTinGeneration().getTaxOffice());
            responseDto.setTinRegDate(jtbNonIndividualTinGenerationTaxpayerResponse.getNonIndividualTinGeneration().getTinRegDate());


        }

        // Set the response description
        responseDto.setResponseDescription(jtbNonIndividualTinGenerationTaxpayerResponse.getResponseDescription());

        System.out.println(responseDto);

        // Save the entity object and return the mapped response DTO
        return modelMapper.map(nonIndividualTinGenerationRepository.save(modelMapper.map(responseDto, NonIndividualTinGenerationEntity.class)),
                NonIndividualTinGenerationResponseDto.class);
    }






}
