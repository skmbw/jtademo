package com.vteba.member.action;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vteba.member.model.Member;
import com.vteba.member.service.spi.MemberService;
import com.vteba.user.model.User;
import com.vteba.user.service.spi.UserService;

@Controller
@RequestMapping("/member")
public class MemberAction {
	
	@Autowired
	private MemberService memberServiceImpl;
	
	@Autowired
	private UserService userServiceImpl;
	
	@RequestMapping("/save")
	public String save() {
		Member member = new Member();
		member.setCreateDate(new Date());
		member.setName("memberName2");
		memberServiceImpl.save(member);
		
		User user = new User();
		user.setName("userName2");
		user.setCreateDate(new Date());
		userServiceImpl.save(user);
		
		return "member/list";
	}
}
