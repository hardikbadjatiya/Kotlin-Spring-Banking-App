package com.amex.customerapi.controller

import com.amex.customerapi.dtos.DataWrapper
import com.amex.customerapi.models.Individual
import com.amex.customerapi.services.IndividualService
import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/customers")
class IndiviualController (private val individualService: IndividualService ){

    @PostMapping("/v1.0/")
    fun addIndiviual(@RequestBody individual: Individual) : ResponseEntity<DataWrapper<Any>> {
        return  if(this.individualService.addIndividual(individual) != null) {
            ResponseEntity.status(HttpStatus.OK).body(DataWrapper(individual))
        } else {
            ResponseEntity.status(HttpStatus.BAD_REQUEST).body(DataWrapper("Could not Add Data"))

        }
     }

    @GetMapping("/v1.0/")
    fun getAllIndiviuals() : List<Individual> {
        return this.individualService.getAllIndividuals()
    }

    @GetMapping("/v1.0/{accountNo}")
    fun getindiviualById(@PathVariable ("accountNo") accountNo : Long) : ResponseEntity<DataWrapper<Any>> {
        var ind = this.individualService.getIndividualById(accountNo)
        if(ind != null) {
            return ResponseEntity.status(HttpStatus.OK).body(DataWrapper(ind))
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(DataWrapper("No data found.."))
        }
    }
    @PutMapping("/v1.0/")
    fun updateIndiviual(@RequestBody individual: Individual) : ResponseEntity<DataWrapper<Any>> {
        return  if(this.individualService.updateIndividual(individual) != null) {
            ResponseEntity.status(HttpStatus.OK).body(DataWrapper(individual))
        } else {
            ResponseEntity.status(HttpStatus.BAD_REQUEST).body(DataWrapper("Could not find Data"))
        }
    }

    @DeleteMapping("/v1.0/{accNo}")
    fun deleteIndiviual(@PathVariable("accNo") accountNo: Long) : ResponseEntity<DataWrapper<Any>>
    {
        var status=this.individualService.deleteIndividualById(accountNo)
        return if  (status!=null){
            ResponseEntity.status(HttpStatus.OK).body(DataWrapper("Deleted"))
        }else{
            ResponseEntity.status(HttpStatus.BAD_REQUEST).body(DataWrapper("Not deleted"))
        }

    }
}