package com.wallee.mobile.backend;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

	@RequestMapping("/create")
	public String create() {

		return null;
	}

	@RequestMapping("/update")
	public String update() {

		return null;
	}

	@RequestMapping("/fetch-credentials")
	public String fetchCredentials() {

		return null;
	}

}
