package com.my.hello.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.hello.vo.MemberVo;

@Repository
public class MemberDaoImpl implements MemberDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
		
	@Override
	public MemberVo login(MemberVo vo) {
		MemberVo res = null;
		try {
			res = sqlSession.selectOne(NAMESPACE + "login", vo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int register(MemberVo vo) {
		int res = 0;
		try {
			res = sqlSession.insert(NAMESPACE + "register", vo);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int memberupdate(MemberVo vo) {
		int res = 0;
		try {
			res = sqlSession.update(NAMESPACE + "memberupdate", vo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int memberdelete(int memberno) {
		int res = 0;
		try {
			res = sqlSession.delete(NAMESPACE + "memberdelete", memberno);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public MemberVo mypage(int memberno) {
		MemberVo vo = null;
		try {
			vo = sqlSession.selectOne(NAMESPACE + "mypage", vo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}

}
