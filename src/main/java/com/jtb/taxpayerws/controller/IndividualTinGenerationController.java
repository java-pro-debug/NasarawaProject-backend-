package com.jtb.taxpayerws.controller;


import com.jtb.taxpayerws.dto.IndividualTinGenerationRequestDto;
import com.jtb.taxpayerws.payload.request.ApiRequest;
import com.jtb.taxpayerws.payload.request.IndividualTinGenerationRequest;
import com.jtb.taxpayerws.payload.response.ApiResponse;
import com.jtb.taxpayerws.payload.response.IndividualTinGenerationResponse;
import com.jtb.taxpayerws.service.IndividualTinGenerationService;
import com.jtb.taxpayerws.utils.ResponseUtil;
import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("individualtingeneration")
public class IndividualTinGenerationController {


    private final IndividualTinGenerationService individualTinGenerationService;

    private final ModelMapper modelMapper;



    @Autowired
    public IndividualTinGenerationController(IndividualTinGenerationService individualTinGenerationService, ModelMapper modelMapper) {
        this.individualTinGenerationService = individualTinGenerationService;
        this.modelMapper = modelMapper;
    }





    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ApiResponse<IndividualTinGenerationResponse>> createIndividualTinGeneration(@org.jetbrains.annotations.NotNull @RequestBody ApiRequest<IndividualTinGenerationRequest> individualTinGenerationRequest) {
        IndividualTinGenerationRequestDto individualTinGenerationRequestDto = modelMapper.map(individualTinGenerationRequest.getData(),IndividualTinGenerationRequestDto.class);
        IndividualTinGenerationResponse response = modelMapper.map(individualTinGenerationService.createIndividualTinGeneration(individualTinGenerationRequestDto), IndividualTinGenerationResponse.class);


        return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(ResponseUtil.buildOkResponse(response));
    }

}
