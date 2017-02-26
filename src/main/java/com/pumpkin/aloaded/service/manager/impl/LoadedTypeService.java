package com.pumpkin.aloaded.service.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;import com.pumpkin.aloaded.service.BaseService;
import com.pumpkin.aloaded.dao.mapper.LoadedTypeMapper;
import com.pumpkin.aloaded.dao.model.LoadedType;
import com.github.pagehelper.PageHelper;
import com.pumpkin.aloaded.service.manager.ILoadedTypeService;

@Service
public class LoadedTypeService extends BaseService<LoadedType> implements ILoadedTypeService {

	@Autowired
	LoadedTypeMapper mapper;
	
	public List<LoadedType> findLoadedType(LoadedType t , int pageNum , int pageSize) { 
		try {
			PageHelper.startPage(pageNum, pageSize);
			return selectByList(t);
		} catch (Exception e) {
			return null;
		}
	}
	public boolean updateOne(LoadedType t) {
		try {
			updateByPrimaryKey(t);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean deleteOne(String id) {
		try {
			int idi = Integer.parseInt(id);
			deleteByPrimaryKey(idi);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	public boolean insertOne(LoadedType t) {

		try {
			insert(t);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public LoadedType findOne(String id) {

		try {
			LoadedType t = new LoadedType();
			t.setId(Integer.parseInt(id));
			return selectByEntity(t);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	
	public LoadedType getTypeSizeById(int typeId) {
		// TODO Auto-generated method stub
		return mapper.getLoadedSize(typeId);
	}
}