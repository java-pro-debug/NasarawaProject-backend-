package com.jtb.taxpayerws.service;

import com.jtb.taxpayerws.dto.NonIndividualTinGenerationResponseDto;
import com.jtb.taxpayerws.dto.NonIndividualTinGenerationRequestDto;
import com.jtb.taxpayerws.payload.PageDetail;

public interface NonIndividualTinGenerationService {

    NonIndividualTinGenerationResponseDto createNonIndividualTinGeneration(NonIndividualTinGenerationRequestDto nonIndividualTinGenerationRequestDto);



}
