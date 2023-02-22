package com.java.mapper;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import com.java.vo.BoardVo;

@Mapper //sqlSessionTemplate이 여기에 들어감(getConnection()한 것과 비슷)
public interface BoardMapper {

	public List<BoardVo> selectBoardList();

	public int selectCount();

	public BoardVo selectOne(int bno);
	
}
