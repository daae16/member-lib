package com.member.lib.service.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.member.lib.dao.LentDAO;
import com.member.lib.dao.LentDAO;
import com.member.lib.dao.impl.LentDAOImpl;
import com.member.lib.dao.impl.LentDAOImpl;
import com.member.lib.service.LentService;
import com.member.lib.service.LentService;

public class LentServiceImpl implements LentService {
	
	private LentDAO lentDAO = new LentDAOImpl();
	
	@Override
	public Map<String, Object> insertLent(Map<String, Object> lent) {
		Map<String,Object> rMap = new HashMap<>();
		int result = lentDAO.insertLent(lent);
		rMap.put("msg",(result==1)?"도서 입력 성공!":"도서 입력 실패");
		rMap.put("cnt", result);
		return rMap;
	}

	@Override
	public Map<String, Object> updateLent(Map<String, Object> lent) {
		Map<String,Object> rMap = new HashMap<>();
		int result = lentDAO.updateLent(lent);
		rMap.put("msg",(result==1)?"도서 수정 성공!":"도서 수정 실패");
		rMap.put("cnt", result);
		return rMap;
	}

	@Override
	public Map<String, Object> deleteLent(int lNum) {
		int result = lentDAO.deleteLent(lNum);
		Map<String,Object> rMap = new HashMap<>();
		rMap.put("msg", (result==1)?"도서 삭제 성공!":"도서 삭제 실패!");
		rMap.put("cnt", result);
		return rMap;
	}

	@Override
	public List<Map<String, Object>> selectLentList(Map<String, Object> lent) {
		return lentDAO.selectLentList(lent);
	}

	@Override
	public Map<String, Object> selectLent(int lNum) {
		return lentDAO.selectLent(lNum);
	}
	public static void main(String[] args) {
		 LentService lentService = new LentServiceImpl();
		 Map<String,Object> map = new HashMap<>();
		 List<Map<String,Object>> rMap = lentService.selectLentList(map);
	}
}
