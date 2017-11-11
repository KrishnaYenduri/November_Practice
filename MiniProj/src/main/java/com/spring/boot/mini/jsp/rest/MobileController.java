package com.spring.boot.mini.jsp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.mini.jsp.model.Mobile;
import com.spring.boot.mini.jsp.service.MobileService;

@RestController
@RequestMapping(value = "/mobileworld/v1/")
@ResponseBody
public class MobileController {

	@Autowired
	private MobileService mobileService;
	
	/*@RequestMapping("/mobiles")
	public List<Mobile> getBooksList() {
		return mobileService.getMobiles();
	}
	
	@RequestMapping("/mobiles/{model}")
	public Mobile getMobileById(@PathVariable String model){
		return mobileService.getMobileById(model);
	}*/
	
	@RequestMapping(method=RequestMethod.POST,value="/mobiles")
	public void addMobile(@RequestBody Mobile mobile){
		mobileService.addMobile(mobile);
	}
	

}