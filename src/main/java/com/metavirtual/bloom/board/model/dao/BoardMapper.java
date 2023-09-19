package com.metavirtual.bloom.board.model.dao;

import com.metavirtual.bloom.board.model.dto.BoardDTO;
import com.metavirtual.bloom.board.model.dto.MemberCommentDTO;
import com.metavirtual.bloom.common.paging.SelectCriteria;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface BoardMapper {

    int selectTotalCount(Map<String, String> searchMap);

    List<BoardDTO> findAllBoard(SelectCriteria selectCriteria);

    BoardDTO boardSelectOne(int boardCode);

    int boardNewPosting(BoardDTO newPosting);

    int viewCount(int boardCode);

    List<MemberCommentDTO> searchCommentList(int boardCode);

    int commentPosting(MemberCommentDTO newComment);
}


