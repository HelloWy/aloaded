package com.pumpkin.aloaded.service.manager.impl;

import java.util.List;
import org.springframework.stereotype.Service;import com.pumpkin.aloaded.service.BaseService;
import com.pumpkin.aloaded.dao.model.Hat;
import com.github.pagehelper.PageHelper;
import com.pumpkin.aloaded.service.manager.IHatService;

@Service
public class HatService extends BaseService<Hat> implements IHatService {

	public List<Hat> findHat(Hat t , int pageNum , int pageSize) { 
		try {
			PageHelper.startPage(pageNum, pageSize);
			return selectByList(t);
		} catch (Exception e) {
			return null;
		}
	}
	public boolean updateOne(Hat t) {
		try {
			t.setClothesnum(t.getA53()+
					t.getA54()+
					t.getA55()+
					t.getA56()+
					t.getA57()+
					t.getA58()+
					t.getA59()+
					t.getA60()
			);
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
	public boolean insertOne(Hat t) {

		try {
			insert(t);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public Hat findOne(String id) {

		try {
			Hat t = new Hat();
			t.setId(Integer.parseInt(id));
			return selectByEntity(t);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	public List<Hat> findAll() {
		// TODO Auto-generated method stub
		return selectByList();
	}
}