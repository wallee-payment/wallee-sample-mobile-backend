package com.wallee.mobile.backend;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This controller is used to indicate for what this project is for and to
 * redirect to the github project. We use this controller to make sure when
 * someone is hitting the root page something is displayed.
 * 
 * @author Thomas Hunziker
 *
 */
@RestController
public class RootController {

	@RequestMapping("/")
	public String index() {
		return "This is the sample backend for the mobile app of <a href=\"https://wallee.com\">wallee.com</a>. "
				+ "See the <a href=\"https://github.com/wallee-payment/wallee-sample-mobile-backend\">Github project</a> for more details.";
	}

}
