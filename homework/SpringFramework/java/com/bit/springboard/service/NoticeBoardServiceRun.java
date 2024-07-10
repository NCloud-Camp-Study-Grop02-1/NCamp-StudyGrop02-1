package com.bit.springboard.service;

import com.bit.springboard.dto.NoticeBoardDto;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class NoticeBoardServiceRun {
    public static void main(String[] args) {
        AbstractApplicationContext factory =
                new GenericXmlApplicationContext("root-context.xml");

        NoticeBoardService noticeBoardService = factory.getBean("noticeBoardServiceImpl", NoticeBoardService.class);

//        NoticeBoardDto noticeBoardDto = new NoticeBoardDto();
//
//        noticeBoardDto.setTitle("공지게시판3");
//        noticeBoardDto.setContent("공지게시판3의 내용물");
//        noticeBoardDto.setWriter_id(3);
//
//        noticeBoardService.newNoticeBoard(noticeBoardDto);

        noticeBoardService.getNoticeBoards().forEach(board -> {
            System.out.println(board);
        });

        NoticeBoardDto oneNoticeBoardDto = new NoticeBoardDto();
        oneNoticeBoardDto.setId(2);

        System.out.println(noticeBoardService.getNoticeBoard(oneNoticeBoardDto));

//        NoticeBoardDto twoNoticeBoardDto = new NoticeBoardDto();
//        twoNoticeBoardDto.setId(3);
//        twoNoticeBoardDto.setTitle("공지게시판3 수정");
//        twoNoticeBoardDto.setContent("공지게시판3 내용물 수정");
//        twoNoticeBoardDto.setModdate(LocalDateTime.now());
//        twoNoticeBoardDto.setWriter_id(1);
//
//        noticeBoardService.updateNoticeBoard(twoNoticeBoardDto);

        NoticeBoardDto deleteNoticeBoardDto = new NoticeBoardDto();

        noticeBoardService.deleteNoticeBoard(2);
    }
}
