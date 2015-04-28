package com.vteba.user.action;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vteba.member.model.Member;
import com.vteba.member.service.spi.MemberService;
import com.vteba.user.model.User;
import com.vteba.user.service.spi.UserService;

/**
 * 用户控制类
 * 
 * @author yinlei
 * @see
 * @since 2015年4月28日 上午10:20:49
 */
@Controller
@RequestMapping("/user")
public class UserAction {
	@Autowired
	private UserService userServiceImpl;
	
	@Autowired
	private MemberService memberServiceImpl;
	
	@RequestMapping("/save")
	private String save() {
		User user = new User();
		user.setName("userName1");
		user.setCreateDate(new Date());
		userServiceImpl.save(user);
		
		Member member = new Member();
		member.setCreateDate(new Date());
		member.setName("memberName1");
		memberServiceImpl.save(member);
		
		return "user/list";
	}
}
