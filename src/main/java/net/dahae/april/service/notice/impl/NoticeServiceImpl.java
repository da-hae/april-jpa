package net.dahae.april.service.notice.impl;

import java.util.List;

import javax.transaction.Transactional;

import net.dahae.april.model.notice.Notice;
import net.dahae.april.repository.NoticeRepository;
import net.dahae.april.service.notice.NoticeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

/**
 * @author yongdae
 */
@Service
public class NoticeServiceImpl implements NoticeService{
	
	@Autowired
	NoticeRepository noticeRepository;
	
	@Override
	public List<Notice> find(String title) throws DataAccessException {
		return noticeRepository.findByTitle(title);
	}
	
	@Override
	public List<Notice> findByPaging(String title, Integer page) throws DataAccessException {
		return noticeRepository.findByPaging(title, page);
	}
	
	@Transactional
	public void save(Notice notice) throws DataAccessException {	
		noticeRepository.save(notice);
	}
}
