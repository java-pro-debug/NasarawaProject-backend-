package com.jtb.taxpayerws.controller;


import com.jtb.taxpayerws.dto.NonIndividualTinGenerationRequestDto;
import com.jtb.taxpayerws.payload.request.ApiRequest;
import com.jtb.taxpayerws.payload.request.NonIndividualTinGenerationRequest;
import com.jtb.taxpayerws.payload.response.ApiResponse;
import com.jtb.taxpayerws.payload.response.NonIndividualTinGenerationResponse;
import com.jtb.taxpayerws.service.NonIndividualTinGenerationService;
import com.jtb.taxpayerws.utils.ResponseUtil;
import org.jetbrains.annotations.NotNull;
import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("nonindividualtingeneration")
public class NonIndividualTinGenerationController {


    private final NonIndividualTinGenerationService nonIndividualTinGenerationService;

    private final ModelMapper modelMapper;

    @Autowired
    public NonIndividualTinGenerationController(NonIndividualTinGenerationService nonIndividualTinGenerationService, ModelMapper modelMapper) {
        this.nonIndividualTinGenerationService = nonIndividualTinGenerationService;
        this.modelMapper = modelMapper;
    }




    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ApiResponse<NonIndividualTinGenerationResponse>> createNonIndividualTinGeneration(@RequestBody @NotNull ApiRequest<NonIndividualTinGenerationRequest> nonIndividualTinGenerationRequest) {
        NonIndividualTinGenerationRequestDto nonIndividualTinGenerationRequestDto = modelMapper.map(nonIndividualTinGenerationRequest.getData(), NonIndividualTinGenerationRequestDto.class);
        NonIndividualTinGenerationResponse response = modelMapper.map(nonIndividualTinGenerationService.createNonIndividualTinGeneration(nonIndividualTinGenerationRequestDto), NonIndividualTinGenerationResponse.class);

        return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(ResponseUtil.buildOkResponse(response));
    }







}
