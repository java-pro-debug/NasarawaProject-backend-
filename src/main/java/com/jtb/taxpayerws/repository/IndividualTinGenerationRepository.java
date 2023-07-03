package com.jtb.taxpayerws.repository;
import com.jtb.taxpayerws.entity.IndividualTinGenerationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface IndividualTinGenerationRepository extends JpaRepository<IndividualTinGenerationEntity, Long>, JpaSpecificationExecutor<IndividualTinGenerationEntity> {

}
