package com.bit.springboard.service;

import com.bit.springboard.dto.NoticeBoardDto;

import java.util.List;

public interface NoticeBoardService {
    public void newNoticeBoard(NoticeBoardDto noticeBoardDto);

    public List<NoticeBoardDto> getNoticeBoards();

    public NoticeBoardDto getNoticeBoard(NoticeBoardDto noticeBoardDto);

    public void deleteNoticeBoard(int noticeBoardId);

    public void updateNoticeBoard(NoticeBoardDto noticeBoardDto);
}
