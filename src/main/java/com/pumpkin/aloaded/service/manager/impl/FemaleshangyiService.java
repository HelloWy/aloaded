package com.pumpkin.aloaded.service.manager.impl;

import java.util.List;
import org.springframework.stereotype.Service;import com.pumpkin.aloaded.service.BaseService;
import com.pumpkin.aloaded.dao.model.Femaleshangyi;
import com.github.pagehelper.PageHelper;
import com.pumpkin.aloaded.service.manager.IFemaleshangyiService;

@Service
public class FemaleshangyiService extends BaseService<Femaleshangyi> implements IFemaleshangyiService {

	public List<Femaleshangyi> findFemaleshangyi(Femaleshangyi t , int pageNum , int pageSize) { 
		try {
			PageHelper.startPage(pageNum, pageSize);
			return selectByList(t);
		} catch (Exception e) {
			return null;
		}
	}
	public boolean updateOne(Femaleshangyi t) {
		try {
			t.setClothesnum(t.getA155b76()+
					t.getA155b76()+
					t.getA155b80()+
					t.getA155b84()+
					t.getA155b88()+
					t.getA155b92()+
					t.getA155b96()+
					t.getA160b100()+
					t.getA160b76()+
					t.getA160b80()+
					t.getA160b84()+
					t.getA160b88()+
					t.getA160b92()+
					t.getA160b96()+
					t.getA165b100()+
					t.getA165b80()+
					t.getA165b84()+
					t.getA165b88()+
					t.getA165b92()+
					t.getA165b96()+
					t.getA170b80()+
					t.getA170b84()+
					t.getA170b88()+
					t.getA170b92()+
					t.getA170b96()+
					t.getA175b88()
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
	public boolean insertOne(Femaleshangyi t) {

		try {
			insert(t);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public Femaleshangyi findOne(String id) {

		try {
			Femaleshangyi t = new Femaleshangyi();
			t.setId(Integer.parseInt(id));
			return selectByEntity(t);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	public List<Femaleshangyi> findAll() {
		// TODO Auto-generated method stub
		return selectByList();
	}
}