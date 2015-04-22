package net.dahae.april.web;

import net.dahae.april.model.BoardBaseEntity;
import net.dahae.april.model.BoardPaging;
//github.com/da-hae/april-jpa.gitimport net.dahae.april.model.BoardPaging;
import net.dahae.april.model.notice.Notice;
import net.dahae.april.service.notice.NoticeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/notice")
public class NoticeController {
	
	@Autowired
	NoticeService noticeService;
	
	Notice notice;
	
	BoardBaseEntity boardBaseEntity;
	
	@RequestMapping(value = "/list.html", method = RequestMethod.GET)
	public String initCreationForm(
			@RequestParam(defaultValue="1" ,required=false) Integer page,
			@RequestParam(defaultValue="" ,required=false) String title,
			Model model) {
		
		model.addAttribute("noticePaging" , new BoardPaging(page, noticeService.find(title).size()));
		model.addAttribute("noticeList"   , noticeService.findByPaging(title, page)                );
		
		return "notice/notice_list";
	}
	
	@RequestMapping(value = "/list.html", method = RequestMethod.POST)
	public String initCreationForm1(
			@RequestParam(defaultValue="1" ,required=false) Integer page,
			@RequestParam(defaultValue="" ,required=false) String title,
			Model model) {
		
		model.addAttribute("noticePaging" , new BoardPaging(page, noticeService.find(title).size()));
		model.addAttribute("noticeList"   , noticeService.findByPaging(title, page)                );
		
		return "notice/notice_list";
	}
	
	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String processCreationForm(Model model) {
		
		model.addAttribute("noticeForm" , new Notice());
		return "notice/notice_form";
	}
	
	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String processUpdateForm(Notice notice, Model model) {
		
		noticeService.save(notice);
		
		return "redirect:/notice/list.html";
	}
	
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public String processCreationForm1(
			@RequestParam(defaultValue="" ,required=false) long id,
			Model model) {
		model.addAttribute("noticeView"   , noticeService.findById(id));		
		return "notice/notice_view";
	}
	
	@RequestMapping(value = "?id", method = RequestMethod.GET)
	public String processCreationForm2(
			@RequestParam(defaultValue="" ,required=false) long id,
			Model model) {
		System.out.println("333333");
		noticeService.delete(notice);		
		return "notice/notice_form";
	}
	
/*	@RequestMapping(value = "/view", method = RequestMethod.POST)
	public String processUpdateForm1(Notice notice, Model model) {
		
		noticeService.save(notice);
		
		return "redirect:/notice/list.html";
	}*/
}
