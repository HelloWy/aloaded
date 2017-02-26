package com.pumpkin.aloaded.service.manager.impl;

import java.util.List;
import org.springframework.stereotype.Service;import com.pumpkin.aloaded.service.BaseService;
import com.pumpkin.aloaded.dao.model.Femaledayi;
import com.github.pagehelper.PageHelper;
import com.pumpkin.aloaded.service.manager.IFemaledayiService;

@Service
public class FemaledayiService extends BaseService<Femaledayi> implements IFemaledayiService {

	public List<Femaledayi> findFemaledayi(Femaledayi t , int pageNum , int pageSize) { 
		try {
			PageHelper.startPage(pageNum, pageSize);
			return selectByList(t);
		} catch (Exception e) {
			return null;
		}
	}
	public boolean updateOne(Femaledayi t) {
		try {
			t.setClothesnum(t.getA155b76()+
							t.getA155b80c84()+
							t.getA155b88()+
							t.getA155b92c96()+
							t.getA160b100()+
							t.getA160b76()+
							t.getA160b80c84()+
							t.getA160b88()+
							t.getA160b92c96()+
							t.getA165b100()+
							t.getA165b80c84()+
							t.getA165b88()+
							t.getA165b92c96()+
							t.getA170b80c84()+
							t.getA170b88()+
							t.getA170b92c96()+
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
	public boolean insertOne(Femaledayi t) {

		try {
			insert(t);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public Femaledayi findOne(String id) {

		try {
			Femaledayi t = new Femaledayi();
			t.setId(Integer.parseInt(id));
			return selectByEntity(t);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	public List<Femaledayi> findAll() {
		// TODO Auto-generated method stub
		return selectByList();
	}
}