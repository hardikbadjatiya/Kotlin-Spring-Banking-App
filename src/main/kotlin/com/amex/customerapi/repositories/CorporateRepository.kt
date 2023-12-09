package com.amex.customerapi.repositories

import com.amex.customerapi.models.Corporate
import org.springframework.data.jpa.repository.JpaRepository

interface CorporateRepository:JpaRepository<Corporate,Long> {
}