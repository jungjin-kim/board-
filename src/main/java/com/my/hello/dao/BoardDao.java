package com.my.hello.dao;

import java.util.List;

import com.my.hello.vo.BoardVo;

public interface BoardDao {

	String namespace = "board.";
	
	public List<BoardVo> selectList();
	
}
