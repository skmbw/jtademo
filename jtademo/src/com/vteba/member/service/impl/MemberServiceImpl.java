package com.vteba.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vteba.member.dao.spi.MemberDao;
import com.vteba.member.model.Member;
import com.vteba.member.service.spi.MemberService;

/**
 * member serviceʵ�֡�
 * 
 * @author yinlei
 * @see
 * @since 2015��4��28�� ����10:29:06
 */
@Service
@Transactional(value = "xaTransactionManager")
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDao memberDaoImpl;

	@Override
	public Long save(Member member) {
		return memberDaoImpl.save(member);
	}
	

}
