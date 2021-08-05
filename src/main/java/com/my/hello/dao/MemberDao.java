package com.my.hello.dao;

import com.my.hello.vo.MemberVo;

public interface MemberDao {

	String NAMESPACE = "member.";
	
	public MemberVo login(MemberVo vo);
	public MemberVo mypage(int memberno);
	public MemberVo res(String memberid);
	public int register(MemberVo vo);
	public int memberupdate(MemberVo vo);
	public int memberdelete(int memberno);
}
