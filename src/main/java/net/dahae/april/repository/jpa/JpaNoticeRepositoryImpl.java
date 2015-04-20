package net.dahae.april.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.dao.DataAccessException;

import net.dahae.april.model.notice.Notice;
import net.dahae.april.repository.NoticeRepository;

public class JpaNoticeRepositoryImpl implements NoticeRepository {

	@PersistenceContext
	EntityManager em;
	
	public void save(Notice notice) throws DataAccessException {
		// TODO Auto-generated method stub

	}

	public List<Notice> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

}
