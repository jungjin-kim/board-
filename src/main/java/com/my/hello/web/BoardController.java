package com.my.hello.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.my.hello.service.BoardService;
import com.my.hello.vo.BoardVo;

@Controller
public class BoardController {

	@Autowired
	private BoardService service;
	
	@RequestMapping("/list.do")
	public String selectList(Model model) {
		model.addAttribute("list", service.selectList());
		return "list";
	}
	
	@RequestMapping("/select.do")
	public String selectOne(Model model, int myno) {
		model.addAttribute("vo", service.selectOne(myno));
		return "boardselect";
	}
	
	@RequestMapping("/insertform.do")
	public String insert() {
		return "boardinsert";
	}

	@RequestMapping("/insertres.do")
	public String insertRes(BoardVo vo) {
		if(service.insert(vo) > 0) {
			return "redirect:list.do";
		}
		return "redirect:insertform.do";
	}
}
