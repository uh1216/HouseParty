package com.ssafy.board.model.service;

import java.sql.SQLException;
import java.util.List;

import com.ssafy.board.model.dto.Board;

public interface BoardService {
	
	int insert(Board board) throws SQLException;
	
	void update(Board board) throws SQLException;
	
	void delete(String articleNo) throws SQLException;
	
	Board searchById(String articleNo) throws SQLException;
	
	List<Board> selectAll() throws SQLException;
}
