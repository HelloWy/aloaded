package com.pumpkin.aloaded.service.manager.impl;

import java.util.List;
import org.springframework.stereotype.Service;import com.pumpkin.aloaded.service.BaseService;
import com.pumpkin.aloaded.dao.model.User;
import com.github.pagehelper.PageHelper;
import com.pumpkin.aloaded.service.manager.IUserService;

@Service
public class UserService extends BaseService<User> implements IUserService {

	public List<User> findUser(User t , int pageNum , int pageSize) { 
		try {
			PageHelper.startPage(pageNum, pageSize);
			return selectByList(t);
		} catch (Exception e) {
			return null;
		}
	}
	public boolean updateOne(User t) {
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
	public boolean insertOne(User t) {

		try {
			insert(t);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public User findOne(String id) {

		try {
			User t = new User();
			t.setId(Integer.parseInt(id));
			return selectByEntity(t);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}