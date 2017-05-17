package com.kishan.truncatelog.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubscriptionController {

	public static final String TRUNC_TEXT = " ... (truncated) ... ";

	@RequestMapping("/subscribe")
	public String subscribe(@RequestParam String orderDetails) {
		// String orderDetails = getOrderDetails(request);
		String truncatedOrderDetails = truncate(orderDetails, 25);
		log(truncatedOrderDetails);
		return truncatedOrderDetails;
	}

	private String truncate(String orderDetails, int i) {
		int truncTextLen = TRUNC_TEXT.length();
		int orderDetailsLen = orderDetails.length();
		if ((i < truncTextLen) || i >= orderDetailsLen) {
			return orderDetails;
		}
		int leadingIndex = (i - truncTextLen) / 2;
		return orderDetails.substring(0, leadingIndex) + TRUNC_TEXT
				+ orderDetails.substring(orderDetailsLen - leadingIndex, orderDetailsLen);
	}

	private void log(String truncatedOrderDetails) {
		// TODO Auto-generated method stub

	}

	private String getOrderDetails(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * public static void main(String[] args) { SubscriptionController s = new
	 * SubscriptionController();
	 * System.out.println(s.truncate("123456789012345678901234567890", 25));
	 * System.out.println(s.truncate("1234567890", 5));
	 * System.out.println(s.truncate("123456789012345678901234567890", 31));
	 * System.out.println(s.truncate("12345678901234567890123456", 25)); }
	 */
}
