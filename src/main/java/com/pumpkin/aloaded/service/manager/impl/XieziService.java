package com.pumpkin.aloaded.service.manager.impl;

import java.util.List;
import org.springframework.stereotype.Service;import com.pumpkin.aloaded.service.BaseService;
import com.pumpkin.aloaded.dao.model.Xiezi;
import com.github.pagehelper.PageHelper;
import com.pumpkin.aloaded.service.manager.IXieziService;

@Service
public class XieziService extends BaseService<Xiezi> implements IXieziService {

	public List<Xiezi> findXiezi(Xiezi t , int pageNum , int pageSize) { 
		try {
			PageHelper.startPage(pageNum, pageSize);
			return selectByList(t);
		} catch (Exception e) {
			return null;
		}
	}
	public boolean updateOne(Xiezi t) {
		try {
			t.setClothesnum(t.getA240()+
							t.getA245()+
							t.getA250()+
							t.getA255()+
							t.getA260()+
							t.getA265()+
							t.getA270()+
							t.getA275()+
							t.getA280()+
							t.getA285()+
							t.getA290()							
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
	public boolean insertOne(Xiezi t) {

		try {
			insert(t);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public Xiezi findOne(String id) {

		try {
			Xiezi t = new Xiezi();
			t.setId(Integer.parseInt(id));
			return selectByEntity(t);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	public List<Xiezi> findAll() {
		// TODO Auto-generated method stub
		return selectByList();
	}
}