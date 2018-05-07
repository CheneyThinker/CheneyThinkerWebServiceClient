package com.cheney.webservice;

import java.util.List;

import cn.clxuanye.CheneyThinkerWebService;
import cn.clxuanye.CheneyThinkerWebServiceImpl;
import cn.clxuanye.Entry;
import cn.clxuanye.Result;
import cn.clxuanye.User;

public class CheneyWebServiceApplication {
	
	public static void main(String[] args) {
		CheneyThinkerWebServiceImpl cheneyThinkerWebServiceImpl = new CheneyThinkerWebServiceImpl();
		CheneyThinkerWebService cheneyThinkerWebService = cheneyThinkerWebServiceImpl.getCheneyThinkerWebServiceImplPort();
		System.err.println(cheneyThinkerWebService.index());
		Result result = cheneyThinkerWebService.getMap();
		List<Entry> entries = result.getEntries();
		for (Entry entry : entries) {
			System.err.println(entry.getKey());
			System.err.println(entry.getValue());
		}
		List<User> users = cheneyThinkerWebService.getAllUser();
		for (User user : users) {
			System.err.println(user.getRealName());
		}
	}

}
