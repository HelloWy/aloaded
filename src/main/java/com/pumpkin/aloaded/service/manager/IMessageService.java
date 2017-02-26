package com.pumpkin.aloaded.service.manager;

import java.util.List;
import com.pumpkin.aloaded.dao.model.Message;

public interface IMessageService {

	public List<Message> findMessage(Message t , int currPage , int pageSize); 
	public boolean updateOne(Message t);
	public boolean deleteOne(int id);
	public boolean insertOne(Message t);
	public Message findOne(String id);
	public boolean userInsertOne(Message message);
	public List<Message> findAll(Message message, int currPage , int pageSize);
	public boolean adminUpdateOne(Message message);
	public List<Message> findForUser(int userid, int currPage, int pageSize);
	public List<Message> queryForDescList();
	public List<Message> selectByDescList(Message message);


	
}