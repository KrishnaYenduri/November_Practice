package com.spring.boot.mini.jsp

import org.springframework.cloud.contract.spec.Contract

Contract.make {
 	
 	request {
		method 'GET'
		headers {
    		header('Content-Type': 'application/json')
  		}
		urlPath ('/mobileworld/v1/mobiles')			
	}
	
	response {
		status 200
			body([
				status:200,
				message:'Finally Contracts ran successfully'				
			   ])	
  		headers {
    		header('Content-Type': 'application/json')
  		}
	}
}