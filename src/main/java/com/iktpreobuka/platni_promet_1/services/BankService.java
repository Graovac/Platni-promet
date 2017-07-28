package com.iktpreobuka.platni_promet_1.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.iktpreobuka.platni_promet_1.entities.BankEntity;

public interface BankService {

	List<BankEntity> getBanksInCity(String city);

	List<BankEntity> getBanksInCountry(String country);

	ResponseEntity<?> addNewBank(String name, String pib, String street, String city, String country);

	ResponseEntity<?> modifyBank(Integer id, String name, String pib, String street, String city, String country);

	BankEntity deleteBankById(Integer id);
}
