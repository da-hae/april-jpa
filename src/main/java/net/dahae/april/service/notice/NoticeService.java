package net.dahae.april.service.notice;

import java.util.List;

import org.springframework.dao.DataAccessException;

import net.dahae.april.model.notice.Notice;

/**
 * @author kyd
 */
public interface NoticeService {
	
	List<Notice> findAll() throws DataAccessException;
}
