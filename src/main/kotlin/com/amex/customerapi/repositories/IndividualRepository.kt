package com.amex.customerapi.repositories

import com.amex.customerapi.models.Individual
import org.springframework.data.jpa.repository.JpaRepository

interface IndividualRepository:JpaRepository<Individual,Long> {
}