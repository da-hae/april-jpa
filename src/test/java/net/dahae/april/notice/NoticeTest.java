package net.dahae.april.notice;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import net.dahae.april.model.notice.Notice;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:spring/business-config.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ActiveProfiles("jpa")
public class NoticeTest {

	@PersistenceContext
	EntityManager em;
	
	Notice notice;
	
	@Before
	public void init() {
		notice = new Notice();
		notice.setTitle("제목");
		notice.setContent("내용");
	}

	@Test
	@Rollback(value = false)
	public void testPersist() throws Exception {
		em.persist(notice);
		
		Query query = em.createQuery("select n from Notice n");
		List<Notice> Notices = (List<Notice>)query.getResultList();
		
		assertThat(Notices.size(), is(1));
	}
	
}
