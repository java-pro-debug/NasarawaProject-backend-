package com.jtb.taxpayerws.client.hystrix;


import com.jtb.taxpayerws.client.payload.request.JTBIndividualTinGenerationTaxpayerRequest;
import com.jtb.taxpayerws.client.payload.request.JTBLoginRequest;
import com.jtb.taxpayerws.client.payload.request.JTBNonIndividualTinGenerationTaxpayerRequest;
import com.jtb.taxpayerws.client.payload.request.JTBTaxpayerRequest;
import com.jtb.taxpayerws.client.payload.response.*;
import com.jtb.taxpayerws.client.proxy.JTBClientProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JTBClientFallback implements JTBClientProxy {
    Logger logger = LoggerFactory.getLogger(JTBClientFallback.class);


    @Override
    public JTBLoginResponse login(JTBLoginRequest login) {
        logger.warn("******* COULDN'T GET TOKEN, RETURNING AN EMPTY RESPONSE *******");

        return new JTBLoginResponse();
    }

    @Override
    public JTBIndividualResponse getIndividual(JTBTaxpayerRequest jtbTaxpayerRequest, String token) {
        logger.warn("******* COULDN'T GET INDIVIDUALS, RETURNING AN EMPTY RESPONSE *******");

        return new JTBIndividualResponse();
    }

    @Override
    public JTBNonIndividualResponse getNonIndividual(JTBTaxpayerRequest jtbTaxpayerRequest, String token) {
        logger.warn("******* COULDN'T GET INDIVIDUALS, RETURNING AN EMPTY RESPONSE *******");

        return new JTBNonIndividualResponse();
    }

    @Override
    public JTBNonIndividualTinGenerationTaxpayerResponse getNonIndividualTinGeneration(JTBNonIndividualTinGenerationTaxpayerRequest jtbNonIndividualTinGenerationTaxpayerRequest, String token) {
        logger.warn("******* COULDN'T GENERATE TIN, RETURNING AN EMPTY RESPONSE *******");

        return new JTBNonIndividualTinGenerationTaxpayerResponse();
    }

    @Override
    public JTBIndividualTinGenerationTaxpayerResponse getIndividualTinGeneration(JTBIndividualTinGenerationTaxpayerRequest jtbIndividualTinGenerationTaxpayerRequest, String token) {
        logger.warn("******* COULDN'T GENERATE TIN, RETURNING AN EMPTY RESPONSE *******");

        return new JTBIndividualTinGenerationTaxpayerResponse();


    }




}
