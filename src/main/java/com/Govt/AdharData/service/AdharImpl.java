package com.Govt.AdharData.service;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Govt.AdharData.dao.AdharDao;
import com.Govt.AdharData.entity.Adhar;

@Service
public class AdharImpl implements AdharService {
	
	@Autowired
	AdharDao dao;

	@Override
	public boolean saveAdhar(Adhar adhar) {
		
		return dao.saveAdhar(adhar);
	}
	

}
