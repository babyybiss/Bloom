package com.metavirtual.bloom.myPage.memberPage.model.service;

import com.metavirtual.bloom.common.exception.myPage.DeleteException;
import com.metavirtual.bloom.common.exception.myPage.ModifyInfoException;
import com.metavirtual.bloom.myPage.memberPage.model.dao.MemberPageMapper;
import com.metavirtual.bloom.user.model.dto.MemberDTO;
import com.metavirtual.bloom.user.model.dto.UserDTO;
import org.springframework.stereotype.Service;

@Service
public class MemberPageServiceImpl implements MemberPageService{

    private final MemberPageMapper mapper;
    public MemberPageServiceImpl(MemberPageMapper mapper){
        this.mapper = mapper;
    }

    @Override
    public void modifyMemberInfo(MemberDTO member, UserDTO user) throws ModifyInfoException {
        int result = mapper.modifyMemberInfo(member, user);

        if(!(result>0)){
            throw new ModifyInfoException("❌회원 정보 수정 실패❌");
        }
    }

    @Override
    public void deleteMyPost(int boardCode) throws DeleteException {
        int result = mapper.deleteMyPost(boardCode);

        if(!(result>0)){
            throw new DeleteException("❌선택 게시글 삭제 실패❌");
        }
    }

    @Override
    public void deleteMyComment(int commentCode) throws DeleteException{
        int result = mapper.deleteMyComment(commentCode);

        if(!(result>0)){
            throw new DeleteException("❌선택 댓글 삭제 실패❌");
        }
    }

    @Override
    public void deleteMyReview(int bookingCode) throws DeleteException{
        int result = mapper.deleteMyReview(bookingCode);

        if(!(result>0)){
            throw new DeleteException("❌선택 후기 삭제 실패❌");
        }
    }
}

