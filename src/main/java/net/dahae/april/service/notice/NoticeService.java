package net.dahae.april.service.notice;

import java.util.List;

import net.dahae.april.model.notice.Notice;

import org.springframework.dao.DataAccessException;

/**
 * @author kyd
 */
public interface NoticeService {
	
	List<Notice> find(String title) throws DataAccessException;
	
	List<Notice> findByPaging(String title, Integer page) throws DataAccessException;
}
