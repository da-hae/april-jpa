package net.dahae.april.repository;

import java.util.List;

import net.dahae.april.model.BaseEntity;
import net.dahae.april.model.notice.Notice;

import org.springframework.dao.DataAccessException;

public interface NoticeRepository {
	
	/**
	 * Retrieve a <code>Notice</code> from the data store by title.
	 *
	 * @param title the title to search for
	 * @return a <code>List</code> of <code>Notice</code>s
	 * @throws org.springframework.dao.DataRetrievalFailureException
	 *		  if not found
	 */
	List<Notice> findByTitle(String title) throws DataAccessException;
	
	/**
	 * Retrieve a <code>Notice</code> from the data store by content.
	 *
	 * @param content the content to search for
	 * @return a <code>List</code> of <code>Notice</code>s
	 * @throws org.springframework.dao.DataRetrievalFailureException
	 *		  if not found
	 */
	List<Notice> findByContent(String content) throws DataAccessException;
	
	/**
	 * Retrieve a <code>Notice</code> from the data store by rernm.
	 *
	 * @param rernm the rernm to search for
	 * @return a <code>List</code> of <code>Notice</code>s
	 * @throws org.springframework.dao.DataRetrievalFailureException
	 *		  if not found
	 */
	List<Notice> findByRernm(String rernm) throws DataAccessException;
	
	/**
	 * Retrieve all <code>Notice</code>s from the data store.
	 * 
	 * @return a <code>List</code> of <code>Notice</code>s
	 * @throws DataAccessException
	 */
	List<Notice> findAll() throws DataAccessException;
	
	/**
	 * Retrieve a <code>Notice</code> from the data store by id.
	 *
	 * @param id the id to search for
	 * @return the <code>Notice</code> if found
	 * @throws org.springframework.dao.DataRetrievalFailureException
	 *		  if not found
	 */
	Notice findById(Long id) throws DataAccessException;
	
	/**
	 * Save a <code>Notice</code> to the data store, either inserting or updating it.
	 *
	 * @param notice the <code>Notice</code> to save
	 * @see BaseEntity#isNew
	 */
	void save(Notice notice) throws DataAccessException;
	
	/**
	 * Save a <code>Notice</code> to the data store, either inserting or updating it.
	 *
	 * @param notice the <code>Notice</code> to save
	 */
	void delete(Notice notice) throws DataAccessException;
}
