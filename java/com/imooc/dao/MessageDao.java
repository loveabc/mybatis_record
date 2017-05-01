package com.imooc.dao;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.imooc.beans.Message;
import com.imooc.dbutil.DBUtil;

public class MessageDao {

	// 查询所有Message
	public List<Message> getMessageList() {
		SqlSession sqlSession = null;
		List<Message> messageList = null;
		try {
			sqlSession = DBUtil.getSqlSeesion();
			messageList = sqlSession.selectList("Message.findAll");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
		return messageList;
	}
}
