package net.dahae.april.repository;

import java.util.List;

import net.dahae.april.model.notice.Notice;

import org.springframework.dao.DataAccessException;

public interface NoticeRepository {

	public void save(Notice notice) throws DataAccessException;
	
	/**
	 * Retrieve all <code>Notice</code>s from the data store.
	 * 
	 * @return a <code>List</code> of <code>Notice</code>s
	 * @throws DataAccessException
	 */
	public List<Notice> findAll() throws DataAccessException;
	
}
