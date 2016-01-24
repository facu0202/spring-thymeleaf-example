package com.facundo.service;

import java.util.List;

import com.facundo.domain.Message;

public interface MessagesService {
	
	List<Message> findAll();

}
