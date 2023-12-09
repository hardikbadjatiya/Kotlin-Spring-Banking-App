package com.amex.customerapi.models

import com.amex.customerapi.models.Customer
import com.amex.customerapi.models.Gender
import jakarta.persistence.*
import lombok.EqualsAndHashCode
import lombok.experimental.SuperBuilder
import org.springframework.format.annotation.DateTimeFormat

import java.time.LocalDate


@Entity
@Table(name="Individual")
@SuperBuilder
@EqualsAndHashCode(callSuper = false)

data class Individual(@Enumerated(EnumType.STRING)  @Column(name="Gender") var gender: Gender,
                      @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @Column(name="DOB") var dob:LocalDate): Customer()