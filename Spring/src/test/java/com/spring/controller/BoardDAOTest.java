package com.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.domain.BoardVO;
import com.spring.persistence.BoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class BoardDAOTest {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardDAOTest.class);
	
	@Inject
	private BoardDAO dao;
	
	
	//@Test
	public void testupdate() throws Exception {
		BoardVO boardVO = new BoardVO();
		boardVO.setBno(1);
		boardVO.setTitle("첫번째 제목");
		boardVO.setContent("첫번째 내용");
		dao.update(boardVO);
	}
	
	
	//@Test
	public void testRead() throws Exception {
		logger.info(dao.read(1).toString());
	}
	
	
	@Test
	public void testCreate() throws Exception {
		BoardVO boardVO = new BoardVO();
		boardVO.setTitle("네번째 제목");
		boardVO.setWriter("이희원");
		boardVO.setContent("네번째 내용");
		dao.create(boardVO);
	}
	
	
	//@Test
	public void testDelete() throws Exception {
		dao.delete(2);
	}
	
	
	@Test
	public void testlistAll() throws Exception {
		dao.listAll();
	}

}
