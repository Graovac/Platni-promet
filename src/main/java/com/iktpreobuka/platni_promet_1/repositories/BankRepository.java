package com.iktpreobuka.platni_promet_1.repositories;

import org.springframework.data.repository.CrudRepository;

import com.iktpreobuka.platni_promet_1.entities.BankEntity;

public interface BankRepository extends CrudRepository<BankEntity, Integer> {

	BankEntity findFirstByNameIgnoreCase(String name);

	BankEntity findFirstByPibIgnoreCase(String pib);

}
