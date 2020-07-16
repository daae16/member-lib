package com.member.lib.service.Impl;

import java.util.List;
import java.util.Map;

import com.member.lib.dao.LentDAO;
import com.member.lib.dao.impl.LentDAOImpl;
import com.member.lib.service.LentService;

public class LentServiceImpl implements LentService {
	
	private LentDAO lentDAO = new LentDAOImpl();

	@Override
	public Map<String, Object> insertLent(Map<String, Object> lent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> updateLent(Map<String, Object> lent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> deleteLent(int lNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> selectLentList(Map<String, Object> lent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> selectLent(int lNum) {
		// TODO Auto-generated method stub
		return null;
	}

}
