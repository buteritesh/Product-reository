package com.Govt.AdharData.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.Govt.AdharData.entity.Adhar;

@Repository
public class AdharDaoImpl implements AdharDao {
	@Autowired
	SessionFactory sessionfactory;

	@Override
	public boolean saveAdhar(Adhar adhar) {
	boolean b=false;
	Session session=null;
	
	try {
		session=sessionfactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		session.save(adhar);
		transaction.commit();
		b=true;
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		session.close();
	}
	return b;
	}

}
