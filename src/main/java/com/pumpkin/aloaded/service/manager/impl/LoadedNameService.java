package com.pumpkin.aloaded.service.manager.impl;

import java.util.List;
import org.springframework.stereotype.Service;import com.pumpkin.aloaded.service.BaseService;
import com.pumpkin.aloaded.dao.model.LoadedName;
import com.github.pagehelper.PageHelper;
import com.pumpkin.aloaded.service.manager.ILoadedNameService;

@Service
public class LoadedNameService extends BaseService<LoadedName> implements ILoadedNameService {

	public List<LoadedName> findLoadedName(LoadedName t , int pageNum , int pageSize) { 
		try {
			PageHelper.startPage(pageNum, pageSize);
			return selectByList(t);
		} catch (Exception e) {
			return null;
		}
	}
	public boolean updateOne(LoadedName t) {
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
	public boolean insertOne(LoadedName t) {

		try {
			insert(t);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public LoadedName findOne(String id) {

		try {
			LoadedName t = new LoadedName();
			t.setId(Integer.parseInt(id));
			return selectByEntity(t);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}