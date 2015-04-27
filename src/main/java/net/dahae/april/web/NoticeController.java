package net.dahae.april.web;


import javax.validation.Valid;

import net.dahae.april.model.BoardBaseEntity;
import net.dahae.april.model.BoardPaging;
//github.com/da-hae/april-jpa.gitimport net.dahae.april.model.BoardPaging;
import net.dahae.april.model.notice.Notice;
import net.dahae.april.service.notice.NoticeService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/notice")
public class NoticeController {
	
	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	NoticeService noticeService;
	
	BoardBaseEntity boardBaseEntity;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String initCreationForm(
			@RequestParam(defaultValue="1" ,required=false) Integer page,
			@RequestParam(defaultValue="" ,required=false) String title,
			Model model) {
		
		model.addAttribute("noticePaging" , new BoardPaging(page, noticeService.find(title).size()));
		model.addAttribute("noticeList"   , noticeService.findByPaging(title, page)                );
		
		return "notice/notice_list";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String processAddForm(Model model) {
		
		model.addAttribute("notice" , new Notice());
		
		return "notice/notice_add";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String processAdd(
			@Valid @ModelAttribute Notice notice,
			BindingResult bindingResult,
			Model model) {
		
		if (bindingResult.hasErrors()){
			return "notice/notice_add";
		}
		
		noticeService.save(notice);
		
		return "redirect:/notice/list";
	}
	
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public String processViewForm(@ModelAttribute Notice notice, Model model) {
		
		logger.debug(" view notice : {}", notice);
		
		model.addAttribute("notice" , noticeService.findByView(notice));
		
		return "notice/notice_view";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String processUpdateForm(@ModelAttribute Notice notice, Model model) {
		
		logger.debug(" update notice : {}", notice);
		
		model.addAttribute("notice" , noticeService.findByView(notice));
		
		return "notice/notice_update";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String processUpdate(@ModelAttribute Notice notice, Model model) {
		
		noticeService.save(notice);
		
		return "redirect:/notice/list";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String processDelete(
			@RequestParam(defaultValue="" ,required=false) long id,
			Notice notice, Model model) {
		
		noticeService.delete(notice);
		
		return "redirect:/notice/list";
	}
	
}
