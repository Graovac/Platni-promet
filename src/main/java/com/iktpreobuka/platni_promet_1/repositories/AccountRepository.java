package com.iktpreobuka.platni_promet_1.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.iktpreobuka.platni_promet_1.entities.AccountEntity;
import com.iktpreobuka.platni_promet_1.entities.ClientEntity;

public interface AccountRepository extends CrudRepository<AccountEntity, Integer> {

	AccountEntity findFirstByAccountNumber(Long accountNumber);
	
	List<AccountEntity> findByClient(ClientEntity client);
	

}
