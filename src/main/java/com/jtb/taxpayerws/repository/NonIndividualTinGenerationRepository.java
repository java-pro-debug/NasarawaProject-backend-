package com.jtb.taxpayerws.repository;

import com.jtb.taxpayerws.entity.NonIndividualTinGenerationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface NonIndividualTinGenerationRepository extends JpaRepository<NonIndividualTinGenerationEntity, Long>, JpaSpecificationExecutor<NonIndividualTinGenerationEntity>{


}
