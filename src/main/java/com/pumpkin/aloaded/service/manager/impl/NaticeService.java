package com.pumpkin.aloaded.service.manager.impl;

import java.util.List;
import org.springframework.stereotype.Service;import com.pumpkin.aloaded.service.BaseService;
import com.pumpkin.aloaded.dao.model.Natice;
import com.github.pagehelper.PageHelper;
import com.pumpkin.aloaded.service.manager.INaticeService;
import com.pumpkin.aloaded.utils.GetTime;

@Service
public class NaticeService extends BaseService<Natice> implements INaticeService {

	public List<Natice> findNatice(Natice t , int pageNum , int pageSize) { 
		try {
			PageHelper.startPage(pageNum, pageSize);
			return selectByList(t);
		} catch (Exception e) {
			return null;
		}
	}
	public boolean updateOne(Natice t) {
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
	public boolean insertOne(Natice t) {

		try {
			t.setCreatetime(GetTime.getCurrentDateTime());
			insert(t);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public Natice findOne(String id) {

		try {
			Natice t = new Natice();
			t.setId(Integer.parseInt(id));
			return selectByEntity(t);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	public int allSize() {
		// TODO Auto-generated method stub
		return selectByList().size();
	}
	public List<Natice> findAll() {
		// TODO Auto-generated method stub
		return selectByList();
	}
}