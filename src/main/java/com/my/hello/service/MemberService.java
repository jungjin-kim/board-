package com.my.hello.service;

import com.my.hello.vo.MemberVo;

public interface MemberService {

	public MemberVo login(MemberVo vo);
	public MemberVo mypage(int memberno);
	public int register(MemberVo vo);
	public int memberupdate(MemberVo vo);
	public int memberdelete(int memberno);
}
