package com.my.hello.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.hello.dao.MemberDao;
import com.my.hello.vo.MemberVo;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	public MemberDao dao;
	
	@Override
	public MemberVo login(MemberVo vo) {
		return dao.login(vo);
	}

	@Override
	public int register(MemberVo vo) {
		return dao.register(vo);
	}

	@Override
	public int memberupdate(MemberVo vo) {
		return dao.memberupdate(vo);
	}

	@Override
	public int memberdelete(int memberno) {
		return dao.memberdelete(memberno);
	}

	@Override
	public MemberVo mypage(int memberno) {
		return dao.mypage(memberno);
	}

	@Override
	public MemberVo res(String memberid) {
		return dao.res(memberid);
	}

}
