package com.msb.dongbao.portal.web.controller;

import com.msb.dongbao.ums.entity.dto.UmsMemberLoginParamDTO;
import com.msb.dongbao.ums.entity.dto.UmsMemberRegisterParamDTO;
import com.msb.dongbao.ums.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 马士兵教育:chaopengfei
 * @date 2020/12/29
 */
@RestController
@RequestMapping("/user-member")
public class UserMemberController {

	@Autowired
	UmsMemberService umsMemberService;

	@GetMapping("/hello")
	public String hello(){
		return "hello";
	}

	/**
	 * 注册
	 * @param umsMemberRegisterParamDTO
	 * @return
	 */
	@PostMapping("/register")
	public String register(@RequestBody UmsMemberRegisterParamDTO umsMemberRegisterParamDTO){
		umsMemberService.register(umsMemberRegisterParamDTO);
		return "register";
	}

	@PostMapping("/login")
	public String login(@RequestBody UmsMemberLoginParamDTO umsMemberLoginParamDTO){
		return umsMemberService.login(umsMemberLoginParamDTO);
	}
}