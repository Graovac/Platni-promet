package com.iktpreobuka.platni_promet_1.services;

import org.springframework.http.ResponseEntity;

public interface AccountService {

	ResponseEntity<?> addNewAccount(Long accountNumber, Double balance, Integer clientId);

}
