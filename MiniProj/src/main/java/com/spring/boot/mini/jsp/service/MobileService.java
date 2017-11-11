package com.spring.boot.mini.jsp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.mini.jsp.dao.MobileDao;
import com.spring.boot.mini.jsp.model.Mobile;

@Service
public class MobileService {

//	private List<Mobile> mobiles = new ArrayList<>(Arrays.asList(new Mobile(1,"3T", "OnePlus", "6GB", true),
//			new Mobile(3,"Galaxy On 7 Max", "Samsung", "4GB", true), new Mobile(2,"Galaxy J7 Pro", "Samsung", "4GB", true)));

	private MobileDao mobileDao;
	
	@Autowired
	public void setMobileDao(MobileDao mobileDao) {
		this.mobileDao = mobileDao;
	}

	/*public List<Mobile> getMobiles() {
		return mobileDao.getAllMobiles();
	}

	public Mobile getMobileById(int id) {
//		return mobiles.stream().filter(mobile -> mobile.getModel().equals(model)).findFirst().get();
	}
	*/
	public void addMobile(Mobile mobile){
		mobileDao.saveMobile(mobile);
	}

}
