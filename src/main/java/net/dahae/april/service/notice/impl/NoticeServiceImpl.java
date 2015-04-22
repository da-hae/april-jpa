package net.dahae.april.service.notice.impl;

import java.util.List;

import net.dahae.april.model.notice.Notice;
import net.dahae.april.repository.NoticeRepository;
import net.dahae.april.service.notice.NoticeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author yongdae
 */
@Service
public class NoticeServiceImpl implements NoticeService{
	
	@Autowired
	NoticeRepository noticeRepository;
	
//	@Override
	public List<Notice> findAll() throws DataAccessException {
		return noticeRepository.findAll();
	}

	@Transactional
	public void save(Notice notice) throws DataAccessException {	
		noticeRepository.save(notice);
	}
	
	

}
