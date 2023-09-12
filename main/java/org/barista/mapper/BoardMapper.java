package org.barista.mapper;

import java.util.List;

import org.barista.domain.BoardVO;

public interface BoardMapper {

	// @Select("select * from tbl_board")
	public List<BoardVO> getList();
	
	public void insert(BoardVO board);
	
	public void insertSelectKey(BoardVO board);
}
