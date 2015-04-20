package net.dahae.april.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/notice")
public class NoticeController {
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String initCreationForm() {
		return "notice/notice_list";
	}
}
