package com.bit.springboard.service;

import com.bit.springboard.dto.BoardDto;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.time.LocalDateTime;

public class NoticeServiceRun {
    public static void main(String[] args) {
        AbstractApplicationContext factory =
                new GenericXmlApplicationContext("root-context.xml");

        BoardService boardService = factory.getBean("noticeServiceImpl", BoardService.class);

        BoardDto boardDto = new BoardDto();
        boardDto.setTitle("공지게시글1");
        boardDto.setContent("공지게시글 1번입니다.");

        boardDto.setWRITER_ID(1);

        boardService.post(boardDto);

        // 게시글 수정
        BoardDto modifyBoardDto = new BoardDto();

        modifyBoardDto.setId(1);
        modifyBoardDto.setTitle("공지게시글1 수정");
        modifyBoardDto.setContent("공지게시글 1번입니다.-수정됨");
        modifyBoardDto.setModdate(LocalDateTime.now());

        boardService.modify(modifyBoardDto);

        // 게시글 삭제
        boardService.delete(2);

        // 게시글 목록 조회
        boardService.getBoardList().forEach(board -> {
            System.out.println(board);
        });

        // 특정 id의 게시글 하나만 조회
        System.out.println(boardService.getBoard(5));



        factory.close();
    }
}
