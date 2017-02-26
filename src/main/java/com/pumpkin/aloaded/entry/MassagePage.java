package com.pumpkin.aloaded.entry;

import java.util.List;

import com.pumpkin.aloaded.dao.model.Message;

public class MassagePage {
	private Message rootMessage;
	private List<Message> itemList;
	public Message getRootMessage() {
		return rootMessage;
	}
	public void setRootMessage(Message rootMessage) {
		this.rootMessage = rootMessage;
	}
	public List<Message> getItemList() {
		return itemList;
	}
	public void setItemList(List<Message> itemList) {
		this.itemList = itemList;
	}
	
	
}
