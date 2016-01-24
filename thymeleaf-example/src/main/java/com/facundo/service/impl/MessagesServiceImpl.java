package com.facundo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.facundo.domain.Message;
import com.facundo.service.MessagesService;
@Service
public class MessagesServiceImpl implements MessagesService{

	@Override
	public List<Message> findAll() {
		
		List<Message> result = new ArrayList<Message>();
		result.add(new Message(1, "title 1", "text 1"));
		result.add(new Message(2, "title 2", "text 2"));
		result.add(new Message(3, "title 3", "text 3"));
		
		return result;
	}

}
