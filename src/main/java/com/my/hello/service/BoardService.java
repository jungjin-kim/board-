package com.my.hello.service;

import java.util.List;

import com.my.hello.vo.BoardVo;

public interface BoardService {

	public List<BoardVo> selectList();
	public BoardVo selectOne(int myno);
	public int insert(BoardVo vo);
	public int update(BoardVo vo);
	public int delete(int myno);
}
