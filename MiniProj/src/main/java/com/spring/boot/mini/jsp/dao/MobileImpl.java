package com.spring.boot.mini.jsp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.boot.mini.jsp.model.Mobile;

@Repository
public class MobileImpl implements MobileDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public MobileImpl(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void saveMobile(Mobile mobile) {
		hibernateTemplate.save(mobile);
	}

	@Override
	public boolean updateMobile(Mobile mobile) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteMobile(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Mobile> getAllMobiles() {
		// TODO Auto-generated method stub
		return null;
	}

}
