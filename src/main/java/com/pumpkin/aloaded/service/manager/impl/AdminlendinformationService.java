package com.pumpkin.aloaded.service.manager.impl;

import java.util.List;
import org.springframework.stereotype.Service;import com.pumpkin.aloaded.service.BaseService;
import com.pumpkin.aloaded.dao.model.Adminlendinformation;
import com.github.pagehelper.PageHelper;
import com.pumpkin.aloaded.service.manager.IAdminlendinformationService;

@Service
public class AdminlendinformationService extends BaseService<Adminlendinformation> implements IAdminlendinformationService {

	public List<Adminlendinformation> findAdminlendinformation(Adminlendinformation t , int pageNum , int pageSize) { 
		try {
			PageHelper.startPage(pageNum, pageSize);
			return selectByList(t);
		} catch (Exception e) {
			return null;
		}
	}
	public boolean updateOne(Adminlendinformation t) {
		try {
			updateByPrimaryKey(t);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean deleteOne(String id) {
		try {
			deleteByPrimaryKey(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean insertOne(Adminlendinformation t) {

		try {
			insert(t);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public Adminlendinformation findOne(String id) {

		try {
			Adminlendinformation t = new Adminlendinformation();
			t.setId(Integer.parseInt(id));
			return selectByEntity(t);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}