package com.multi.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.multi.hello.dto.BoardDTO;
import com.multi.hello.service.BoardService;

@Controller
public class BoardController {
	BoardService service;

	@Autowired
	public BoardController(BoardService service) {
		super();
		this.service = service;
	}

	@GetMapping("/board/insert")
	public String insert() {

		return "board/board_write";
	}

	@PostMapping("/board/insert")
	public String insert(BoardDTO board) {
		service.insert(board);
		return "index2";
	}

}
