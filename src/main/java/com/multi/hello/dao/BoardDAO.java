package com.multi.hello.dao;

import org.springframework.stereotype.Repository;

import com.multi.hello.dto.BoardDTO;


public class BoardDAO {
	public void insert(BoardDTO board) {
		System.out.println("dao boarddto : " +  board);
	}
}
