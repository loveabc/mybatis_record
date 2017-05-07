package com.imooc.test;

import java.io.IOException;
import java.util.List;

import com.imooc.beans.Message;
import com.imooc.dao.MessageDao;
import com.imooc.dbutil.DBUtil;

public class Test {

	public static void main(String[] args) throws IOException {
		DBUtil.getSqlSeesion();
		MessageDao dao = new MessageDao();
		List<Message> messageList = dao.getMessageList();
		for (Message message : messageList) {
			System.out.println(message.getId() + " " + message.getCommand()
					+ " " + message.getContent());
		}
	}

}
