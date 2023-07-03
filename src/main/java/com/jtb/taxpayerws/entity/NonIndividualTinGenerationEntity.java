package com.jtb.taxpayerws.entity;

import com.jtb.taxpayerws.entity.audit.Auditable;

import java.io.Serializable;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;

import java.time.LocalDateTime;

@Entity(name="non_individual_tin_generation")
public class NonIndividualTinGenerationEntity extends Auditable implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tin",nullable = false, length = 200)
    private String tin;

    @Column(name = "organization_type",nullable = false, length = 200)
    private String organizationType;

    @Column(name = "reg_number",nullable = false, length = 200)
    private String regNumber;

    @Column(name = "tax_office",nullable = false,length = 200)
    private String TaxOffice;

    @Column(name = "tin_reg_date",nullable = false,length = 200)
    private String tinRegDate;


    @Column(name = "tax_authority",nullable = false,length = 200)
    private String TaxAuthority;

    @Column(name = "response_description",nullable = false, length = 500)
    private String responseDescription;



    @CreatedBy
    private Long createdBy;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedBy
    private Long modifiedBy;

    @LastModifiedDate
    private LocalDateTime modifiedAt;



    public String getResponseDescription() {
        return responseDescription;
    }

    public void setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTin() {
        return tin;
    }

    public void setTin(String tin) {
        this.tin = tin;
    }

    public String getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getTaxOffice() {
        return TaxOffice;
    }

    public void setTaxOffice(String taxOffice) {
        TaxOffice = taxOffice;
    }

    public String getTinRegDate() {
        return tinRegDate;
    }

    public void setTinRegDate(String tinRegDate) {
        this.tinRegDate = tinRegDate;
    }

    public String getTaxAuthority() {
        return TaxAuthority;
    }

    public void setTaxAuthority(String taxAuthority) {
        TaxAuthority = taxAuthority;
    }

    @Override
    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    @Override
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public Long getModifiedBy() {
        return modifiedBy;
    }

    @Override
    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Override
    public LocalDateTime getModifiedAt() {
        return modifiedAt;
    }

    @Override
    public void setModifiedAt(LocalDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }
}
