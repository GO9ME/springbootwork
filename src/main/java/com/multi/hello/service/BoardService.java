package com.multi.hello.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.hello.dao.BoardDAO;
import com.multi.hello.dto.BoardDTO;


public class BoardService {
	BoardDAO dao;

	@Autowired

	public BoardService(BoardDAO dao) {
		super();
		this.dao = dao;
	}

	public void insert(BoardDTO board) {
		dao.insert(board);
	}
}
