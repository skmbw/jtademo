package com.vteba.member.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vteba.member.dao.spi.MemberDao;
import com.vteba.member.model.Member;

/**
 * Member Dao实现。
 * 
 * @author yinlei
 * @see
 * @since 2015年4月28日 上午10:32:07
 */
@Repository
public class MemberDaoImpl implements MemberDao {
	
	@Autowired
	private SessionFactory jta2SessionFactory;

	@Override
	public Long save(Member member) {
		return (Long) jta2SessionFactory.getCurrentSession().save(member);
	}

}
