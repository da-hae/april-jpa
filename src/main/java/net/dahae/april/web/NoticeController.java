package net.dahae.april.web;

import net.dahae.april.model.notice.Notice;
import net.dahae.april.service.notice.NoticeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/notice")
public class NoticeController {
	
	@Autowired
	NoticeService noticeService;
	
	Notice notice;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String initCreationForm(Model model) {
		
		model.addAttribute("noticeList" , noticeService.findAll());
		
		return "notice/notice_list";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public String initCreationForm1(Model model) {
		
		model.addAttribute("noticeList" , noticeService.findAll());
		
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
		
		return "redirect:/notice/list";
	}
}
