package com.bit.springboard.dao;

import com.bit.springboard.common.JDBCUtil;
import com.bit.springboard.dto.NoticeBoardDto;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

@Repository
public class NoticeBoardDao {

    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    String createNoticeBoard = "INSERT INTO NOTICEBOARD(TITLE, CONTENT, WRITER_ID) VALUES(?, ?, ?)";

    String searchNoticeBoardList = "SELECT ID" +
            "                            , TITLE" +
            "                            , CONTENT" +
            "                            , WRITER_ID" +
            "                            , REGDATE" +
            "                            , MODDATE" +
            "                            , CNT" +
            "                         FROM NOTICEBOARD";

    String searchNoticeBoard = "SELECT ID" +
            "                        , TITLE" +
            "                        , CONTENT" +
            "                        , WRITER_ID" +
            "                        , REGDATE" +
            "                        , MODDATE" +
            "                        , CNT" +
            "                     FROM NOTICEBOARD" +
            "                    WHERE ID = ?";

    String updateNoticeBoard = "UPDATE NOTICEBOARD" +
            "                      SET TITLE = ?" +
            "                        , CONTENT = ?" +
            "                        , WRITER_ID = ?" +
            "                        , MODDATE = ?" +
            "                    WHERE ID = ?";

    String deleteNoticeBoard = "DELETE FROM NOTICEBOARD" +
            "                    WHERE ID = ?";

    public void newNoticeBoard(NoticeBoardDto noticeBoardDto) {
        System.out.println("newNoticeBoard의 newNoticeBoard 실행");
        try {
            conn = JDBCUtil.getConnection();
            pstmt = conn.prepareStatement(createNoticeBoard);

            pstmt.setString(1, noticeBoardDto.getTitle());
            pstmt.setString(2, noticeBoardDto.getContent());
            pstmt.setInt(3, noticeBoardDto.getWriter_id());

            pstmt.executeUpdate();
        } catch(Exception e){
            System.out.println(e.getMessage());
        } finally {
            JDBCUtil.close(conn, pstmt);
        }
        System.out.println("newNoticeBoard의 newNoticeBoard 실행 완료");
    }

    public List<NoticeBoardDto> getNoticeBoardList() {
        System.out.println("NoticeBoardDao의 getNoticeBoardList 실행");
        List<NoticeBoardDto> noticeBoardDtoList = new ArrayList<>();

        try {
            conn = JDBCUtil.getConnection();

            pstmt = conn.prepareStatement(searchNoticeBoardList);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                NoticeBoardDto noticeBoardDto = new NoticeBoardDto();
                noticeBoardDto.setId(rs.getInt("ID"));
                noticeBoardDto.setTitle(rs.getString("TITLE"));
                noticeBoardDto.setContent(rs.getString("CONTENT"));
                noticeBoardDto.setWriter_id(rs.getInt("WRITER_ID"));
                noticeBoardDto.setRegdate(rs.getTimestamp("REGDATE").toInstant().atZone(ZoneId.of("UTC")).toLocalDateTime());
                noticeBoardDto.setModdate(rs.getTimestamp("MODDATE").toInstant().atZone(ZoneId.of("UTC")).toLocalDateTime());
                noticeBoardDto.setCnt(rs.getInt("CNT"));

                noticeBoardDtoList.add(noticeBoardDto);
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        } finally {
            JDBCUtil.close(conn, pstmt, rs);
        }
        System.out.println("NoticeBoardDao의 getNoticeBoardList 실행 완료");
        return noticeBoardDtoList;
    }

    public NoticeBoardDto getNoticeBoard(NoticeBoardDto noticeBoardDto) {
        System.out.println("NoticeBoardDao의 getNoticeBoard 실행");
        NoticeBoardDto rtnNoticeBoardDto = new NoticeBoardDto();

        try {
            conn = JDBCUtil.getConnection();

            pstmt = conn.prepareStatement(searchNoticeBoard);
            pstmt.setInt(1, noticeBoardDto.getId());

            rs = pstmt.executeQuery();
            if(rs.next()) {
                rtnNoticeBoardDto.setId(rs.getInt("ID"));
                rtnNoticeBoardDto.setTitle(rs.getString("TITLE"));
                rtnNoticeBoardDto.setContent(rs.getString("CONTENT"));
                rtnNoticeBoardDto.setWriter_id(rs.getInt("WRITER_ID"));
                rtnNoticeBoardDto.setRegdate(rs.getTimestamp("REGDATE").toInstant().atZone(ZoneId.of("UTC")).toLocalDateTime());
                rtnNoticeBoardDto.setModdate(rs.getTimestamp("MODDATE").toInstant().atZone(ZoneId.of("UTC")).toLocalDateTime());
                rtnNoticeBoardDto.setCnt(rs.getInt("CNT"));
            }

        } catch(Exception e){
            System.out.println(e.getMessage());
        } finally {
            JDBCUtil.close(conn, pstmt, rs);
        }
        System.out.println("NoticeBoardDao의 getNoticeBoard 실행 완료");
        return rtnNoticeBoardDto;
    }

    public void updateNoticeBoard(NoticeBoardDto noticeBoardDto) {
        System.out.println("NoticeBoardDao의 updateNoticeBoard 실행");
        try {
            conn = JDBCUtil.getConnection();
            pstmt = conn.prepareStatement(updateNoticeBoard);

            pstmt.setString(1, noticeBoardDto.getTitle());
            pstmt.setString(2, noticeBoardDto.getContent());
            pstmt.setInt(3, noticeBoardDto.getWriter_id());
            pstmt.setString(4, String.valueOf(noticeBoardDto.getModdate()));
            pstmt.setInt(5, noticeBoardDto.getId());

            pstmt.executeUpdate();
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            JDBCUtil.close(conn, pstmt);
        }
        System.out.println("NoticeBoardDao의 updateNoticeBoard 실행 완료");
    }

    public void deleteNoticeBoard(int noticeBoardId) {
        System.out.println("NoticeBoardDao의 deleteNoticeBoard 실행");
        try {
            conn = JDBCUtil.getConnection();

            pstmt = conn.prepareStatement(deleteNoticeBoard);
            pstmt.setInt(1, noticeBoardId);

            pstmt.executeUpdate();
        } catch(Exception e){
            System.out.println(e.getMessage());
        } finally {
            JDBCUtil.close(conn, pstmt);
        }

        System.out.println("NoticeBoardDao의 deleteNoticeBoard 실행 완료");
    }
}
