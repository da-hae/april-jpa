package net.dahae.april.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import net.dahae.april.model.notice.Notice;
import net.dahae.april.service.notice.NoticeService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
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
public class NoticeServiceTest {

	@Autowired
	NoticeService noticeService;
	
	@PersistenceContext
	EntityManager em;
	
	@Test
	public void testFindAll() throws Exception {
		
	}
	
	@Test
	public void testPaging() throws Exception {
		
	}
	
}
