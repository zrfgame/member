package com.zrf.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
	@Value("${server.port}")
	private String port;
	@RequestMapping("/getMember")
	public String getMember() {
		return "我是会员服务的端口号"+port;
	}
}
