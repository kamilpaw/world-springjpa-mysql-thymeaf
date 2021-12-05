package com.kpaw.world.service;

import java.util.List;

import com.kpaw.world.entity.Country;

public interface CountryService {

	public List<Country> findAll();

	public List<Country> searchBy(String theCode, String theName, String theRegion);

	public List<Country> orderByRegion();

	public List<Country> orderByName();

	public List<Country> orderBySurface();

	public List<Country> orderByCode();

	public List<Country> advancedSearch(String theName, String theRegion, String surfaceFrom, String surfaceTo,
			String indFrom, String indTo, String popFrom, String popTo, String liExFrom, String liExTo);

	public Country findById(String theCountryCode);
}
