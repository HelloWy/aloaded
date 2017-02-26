package com.pumpkin.aloaded.service.manager.impl;

import java.util.List;
import org.springframework.stereotype.Service;import com.pumpkin.aloaded.service.BaseService;
import com.pumpkin.aloaded.dao.model.Msgboard;
import com.github.pagehelper.PageHelper;
import com.pumpkin.aloaded.service.manager.IMsgboardService;
import com.pumpkin.aloaded.utils.GetTime;

@Service
public class MsgboardService extends BaseService<Msgboard> implements IMsgboardService {

	public List<Msgboard> findMsgboard(Msgboard t , int pageNum , int pageSize) { 
		try {
			PageHelper.startPage(pageNum, pageSize);
			return selectByList(t);
		} catch (Exception e) {
			return null;
		}
	}
	public boolean updateOne(Msgboard t) {
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
	public boolean insertOne(Msgboard t) {

		try {
			t.setCreatetime(GetTime.getCurrentDateTime());
			insert(t);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public Msgboard findOne(String id) {

		try {
			Msgboard t = new Msgboard();
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
	public List<Msgboard> findAll() {
		// TODO Auto-generated method stub
		return selectByList();
	}
}