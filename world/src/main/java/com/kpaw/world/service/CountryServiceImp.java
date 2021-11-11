package com.kpaw.world.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpaw.world.dao.CountryRepository;
import com.kpaw.world.entity.Country;

@Service
public class CountryServiceImp implements CountryService {
	
	private CountryRepository countryRepository;
	
	@Autowired
	public CountryServiceImp(CountryRepository theCountryRepository) {
		countryRepository = theCountryRepository; 
	}

	@Override
	public List<Country> findAll() {
		return countryRepository.findAll();
	}


}