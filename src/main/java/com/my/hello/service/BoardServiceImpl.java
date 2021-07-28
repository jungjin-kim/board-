package com.my.hello.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.hello.dao.BoardDao;
import com.my.hello.vo.BoardVo;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDao dao;
	
	@Override
	public List<BoardVo> selectList() {
		return dao.selectList();
	}

	@Override
	public BoardVo selectOne(int myno) {
		return dao.selectOne(myno);
	}

	@Override
	public int insert(BoardVo vo) {
		return dao.insert(vo);
	}

	@Override
	public int update(BoardVo vo) {
		return 0;
	}

	@Override
	public int delete(int myno) {
		return 0;
	}

}
