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
	
	@Override
	@Transactional
	public void save(Notice notice) throws DataAccessException {	
		noticeRepository.save(notice);
	}
	
	@Override
	@Transactional
	public void delete(Notice notice) throws DataAccessException {
		noticeRepository.delete(notice);
	}
	
	@Override
	public Notice find(Notice notice) throws DataAccessException {
		return noticeRepository.findById(notice.getId());
	}

	@Override
	@Transactional
	public Notice findByView(Notice notice) throws DataAccessException {
		notice = noticeRepository.findById(notice.getId());
		notice.setHits(notice.getHits() + 1);
		
		/**
		 * view hits increation
		 */
		noticeRepository.save(notice);
		
		return notice;
	}
}
