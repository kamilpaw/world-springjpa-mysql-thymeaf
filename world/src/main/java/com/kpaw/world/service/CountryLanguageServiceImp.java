package com.kpaw.world.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpaw.world.dao.CountryLanguageRepository;
import com.kpaw.world.entity.CountryLanguage;

@Service
public class CountryLanguageServiceImp implements CountryLanguageService {

	private final CountryLanguageRepository countryLanguageRepository;

	@Autowired
	public CountryLanguageServiceImp(CountryLanguageRepository theCountryLanguageRepository) {
		this.countryLanguageRepository = theCountryLanguageRepository;
	}

	@Override
	public List<CountryLanguage> findAll() {
		return countryLanguageRepository.findAll();
	}

	@Override
	public List<CountryLanguage> searchBy(String theLanguage, String theCountry) {
		return countryLanguageRepository.findByLanguageContainsAndCountryCodeNameContainsAllIgnoreCase(theLanguage,
				theCountry);
	}

	@Override
	public List<CountryLanguage> orderByName() {
		return countryLanguageRepository.findAllByOrderByCountryCodeNameAsc();
	}

	@Override
	public List<CountryLanguage> orderByLanguage() {
		return countryLanguageRepository.findAllByOrderByLanguageAsc();
	}

}
