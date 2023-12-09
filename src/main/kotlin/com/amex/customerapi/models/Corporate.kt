package com.amex.customerapi.models

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Enumerated
import jakarta.persistence.Table
import lombok.EqualsAndHashCode
import lombok.experimental.SuperBuilder

@Entity
@Table(name="Corporate")
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
data class Corporate(@Enumerated @Column(name="Company_Type")var companyType: CompanyType): Customer()