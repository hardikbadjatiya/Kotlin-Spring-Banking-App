package com.amex.customerapi.services


import com.amex.customerapi.models.Individual
import com.amex.customerapi.repositories.IndividualRepository
import org.springframework.stereotype.Service

@Service
class IndividualService(private val individualRepository:IndividualRepository) {

    //insert
    fun addIndividual(individual: Individual): Individual {

        return individualRepository.save(individual)
    }

    //select all
    fun getAllIndividuals():List<Individual>{
        return individualRepository.findAll()
    }

    //select individual by id

    fun getIndividualById(accountNo:Long):Individual?{
        return individualRepository.findById(accountNo).orElse(null)
    }
    fun updateIndividual(individual: Individual): Individual {
        var ind = individualRepository.findById(individual.accountNumber).orElse(null)
        ind.dob = individual.dob
        ind.email = individual.email
        return individualRepository.save(ind)
    }
    fun deleteIndividualById(accountNo:Long):Boolean{
        var status:Boolean=false
        individualRepository.deleteById(accountNo)
        if(getIndividualById(accountNo)==null){
            status=true
        }
        return status
    }

}