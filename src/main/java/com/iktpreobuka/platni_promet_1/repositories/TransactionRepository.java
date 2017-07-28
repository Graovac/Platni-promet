package com.iktpreobuka.platni_promet_1.repositories;

import org.springframework.data.repository.CrudRepository;

import com.iktpreobuka.platni_promet_1.entities.TransactionEntity;

public interface TransactionRepository extends CrudRepository<TransactionEntity, Long> {

}
