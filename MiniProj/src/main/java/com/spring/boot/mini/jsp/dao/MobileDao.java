package com.spring.boot.mini.jsp.dao;

import java.util.List;

import com.spring.boot.mini.jsp.model.Mobile;

public interface MobileDao {
	
	List<Mobile> getAllMobiles();

	void saveMobile(Mobile mobile);

	boolean updateMobile(Mobile mobile);

	boolean deleteMobile(int id);

}
