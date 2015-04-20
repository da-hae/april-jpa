package net.dahae.april.service.notice.impl;

import java.util.List;

import net.dahae.april.model.notice.Notice;
import net.dahae.april.repository.NoticeRepository;
import net.dahae.april.service.notice.NoticeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeServiceImpl implements NoticeService{
	
	@Autowired
	NoticeRepository noticeRepository;
	
	public List<Notice> findAll() {
		return noticeRepository.findAll();
	}

}
