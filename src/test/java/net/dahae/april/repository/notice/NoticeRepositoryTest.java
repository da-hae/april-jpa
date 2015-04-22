package net.dahae.april.repository.notice;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import net.dahae.april.model.notice.Notice;
import net.dahae.april.repository.NoticeRepository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 
 * @author yongdae
 */
@ContextConfiguration(locations = {"classpath:spring/business-config.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ActiveProfiles("jpa")
public class NoticeRepositoryTest {

	@PersistenceContext
	EntityManager em;
	
	Notice notice;
	
	@Autowired
	NoticeRepository noticeRepository;
	
	@Before
	public void init() {
		notice = new Notice();
		
		notice.setTitle("제목");
		notice.setContent("내용");
		notice.setRernm("홍길동");
	}
	
	@Test
	@Rollback
	public void testFindByTitle() throws Exception {
		
		noticeRepository.save(notice);
		
		List<Notice> result = noticeRepository.findByTitle("제목");
		List<Notice> nullResult = noticeRepository.findByTitle("제목없음");
		
		assertThat(result.size(),is(1));
		assertThat(nullResult.size(),is(0));
	}
	
	/*@Test
	public void testFindByContent() throws Exception {
		
		noticeRepository.save(notice);
		
		List<Notice> result = noticeRepository.findByContent("내용");
		List<Notice> nullResult = noticeRepository.findByContent("내용없음");
		
		assertThat(result.size(),is(1));
		assertThat(nullResult.size(),is(0));
	}
	
	@Test
	public void testFindByRernm() throws Exception {
		
		noticeRepository.save(notice);
		
		List<Notice> result = noticeRepository.findByRernm("홍길동");
		List<Notice> nullResult = noticeRepository.findByRernm("산적");
		
		assertThat(result.size(),is(1));
		assertThat(nullResult.size(),is(0));
	}
	
	@Test
	public void testFindAll() throws Exception {
		
		noticeRepository.save(notice);
		
		List<Notice> result = noticeRepository.findAll();
		
		assertThat(result.size(),is(1));
		
		init();
		noticeRepository.save(notice);
		
		result = noticeRepository.findAll();
		
		assertThat(result.size(),is(2));
	}
	
	@Test
	public void testFindById() throws Exception {
		
		noticeRepository.save(notice);
		
		List<Notice> resultList = noticeRepository.findAll();
		
		assertThat(resultList.size(),is(1));
		
		init();
		noticeRepository.save(notice);
		
		Notice result = noticeRepository.findById(notice.getId());
		
		assertEquals(result.getId(), notice.getId());
		
		resultList = noticeRepository.findAll();
		
		assertThat(resultList.size(),is(2));
	}*/
	
	@Test
	public void testSave() throws Exception {
		
		noticeRepository.save(notice);
		
		Notice result = noticeRepository.findById(notice.getId());
		
		assertEquals(result.getId(), notice.getId());
		assertSame(result, notice);
	}
	
	/*@Test
	public void testDelete() throws Exception {
		
		noticeRepository.save(notice);
		
		List<Notice> result = noticeRepository.findAll();
		
		assertThat(result.size(),is(1));
		
		noticeRepository.delete(notice);
		
		result = noticeRepository.findAll();
		
		assertThat(result.size(),is(0));
	}*/
}
