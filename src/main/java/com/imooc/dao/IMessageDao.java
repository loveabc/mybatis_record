package com.imooc.dao;

import java.util.List;

import com.imooc.beans.Message;

public interface IMessageDao {

	public List<Message> get(Message message);
	public void insertMessage(Message message);
}
