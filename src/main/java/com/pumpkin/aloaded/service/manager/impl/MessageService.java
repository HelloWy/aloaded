package com.pumpkin.aloaded.service.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;import com.pumpkin.aloaded.service.BaseService;
import com.pumpkin.aloaded.dao.mapper.MessageMapper;
import com.pumpkin.aloaded.dao.model.Message;
import com.github.pagehelper.PageHelper;
import com.pumpkin.aloaded.service.manager.IMessageService;
import com.pumpkin.aloaded.utils.GetTime;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

@Service
public class MessageService extends BaseService<Message> implements IMessageService {
	
	@Autowired
	MessageMapper mapper;

	public List<Message> findMessage(Message t , int pageNum , int pageSize) { 
		try {
			PageHelper.startPage(pageNum, pageSize);
			if(t.getUserid()!=null){
				return selectByDescList(t);
			}else{
				return mapper.queryForDescList();
			}
//			return selectByList(t);
		} catch (Exception e) {
			return null;
		}
	}
	public boolean updateOne(Message t) {
		try {
			updateByPrimaryKey(t);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean deleteOne(int id) {
		try {
			deleteByPrimaryKey(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean insertOne(Message t) {

		try {
			insert(t);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public Message findOne(String id) {

		try {
			Message t = new Message();
			t.setId(Integer.parseInt(id));
			return selectByEntity(t);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	
	
	//用户插入一条信息
			public boolean userInsertOne(Message message) {
				try {
					message.setCreatetime(GetTime.getCurrentDateTime());
					insertOne(message);
					return true;
				} catch (Exception e) {
					System.out.println(e);
					return false;
				}
			}
		//为管理员查询所有信息
			public List<Message> findAll(Message message, int currPage , int pageSize) {
				return findMessage(message, currPage, pageSize);
			}
			
		//管理员回复
			public boolean adminUpdateOne(Message message) {
				try {
					message.setReplytime(GetTime.getCurrentDateTime());
					updateOne(message);
					return true;
				} catch (Exception e) {
					System.err.println(e);
					return false;
				}
				
			}
		//用户发查看信息
			public List<Message> findForUser(int userid, int currPage, int pageSize) {
				Message message = new Message();
				message.setUserid(userid);
				return findMessage(message, currPage, pageSize);
			}
			//根据创建时间倒叙
			public List<Message> queryForDescList() {
				return mapper.queryForDescList();
			}
			
			/**
			 * 根据用户id创建时间倒叙
			 */
			public List<Message> selectByDescList(Message message) {
				Example example = new Example(Message.class);
				Criteria criteria = example.createCriteria();
				criteria.andEqualTo("userid", message.getUserid());
				example.setOrderByClause("createtime desc");
				return mapper.selectByExample(example);
			}
			
}