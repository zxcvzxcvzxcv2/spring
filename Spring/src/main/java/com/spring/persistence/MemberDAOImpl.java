package com.spring.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.spring.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberDAOImpl.class);
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "com.spring.mapper.MemberMapper";

	@Override
	public String getTime() {
		
		logger.info("getTime()~~~~~~~~~~~~~~~");
		return sqlSession.selectOne(namespace + ".getTime");
		// return sqlSession.selectOne("com.spring.mapper.MemberMapper.getTime");
	}

	@Override
	public void insertMember(MemberVO vo) {
		
		logger.info("insertMember(MemebrVO vo)~~~~~~~~~~~~~~~");
		logger.info(vo.getUserid() + "-" + vo.getUsername());
		sqlSession.insert(namespace + ".insertMember", vo); 

	}

}
