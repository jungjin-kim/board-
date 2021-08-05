package com.my.hello.web;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.reflection.SystemMetaObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.my.hello.service.MemberService;
import com.my.hello.vo.MemberVo;

@Controller
public class MemberController {

	@Autowired
	private MemberService service;
	
	@RequestMapping("/loginform.do")
	public String loginForm() {
		return "memberlogin";
	}
	
	@RequestMapping("/member.do")
	public String member(Model model, String memberid) {
		model.addAttribute("login3", service.res(memberid));
		return "member";
	}
	
	@RequestMapping("/mypage.do")
	public String mypage(Model model, int memberno) {
		model.addAttribute("login2", service.mypage(memberno));
		return "mypage";
	}
	
	@ResponseBody
	@RequestMapping(value="/ajaxlogin.do", method=RequestMethod.POST)
	public Map<String, Boolean> ajaxLogin(@RequestBody MemberVo vo, HttpSession session) {
		MemberVo vo2 = service.login(vo);
		boolean check = false;
		
		if (vo2 != null) {
			check = true;
			session.setAttribute("login", vo2);
		}
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		map.put("check", check);
		return map;
	}
	
	@RequestMapping("/register.do")
	public String register() {
		return "memberregister";
	}
	
	@RequestMapping("/registerres.do")
	public String registerRes(MemberVo vo) {
		if(service.register(vo) > 0) {
			return "redirect:member.do?memberid=" + vo.getMemberid();
		}
		return "redirect:register.do";
	}
	
	@RequestMapping("/memberupdateform.do")
	public String memberupdate(Model model, int memberno) {
		model.addAttribute("login2", service.mypage(memberno));
		return "memberupdate";
	}
	
	@RequestMapping("/memberupdateres.do")
	public String memberupdateRes(MemberVo vo) {
		if (service.memberupdate(vo) > 0) {
			return "redirect:mypage.do?memberno=" + vo.getMemberno();
		}
		return "redirect:memberupdateform.do?memberno=" + vo.getMemberno();
	}
	
	@RequestMapping("/memberdelete.do")
	public String memberdelete(int memberno) {
		if (service.memberdelete(memberno) > 0) {
			return "redirect:loginform.do";
		}
		return "redirect:mypage.do?memberno=" + memberno;
	}
}
