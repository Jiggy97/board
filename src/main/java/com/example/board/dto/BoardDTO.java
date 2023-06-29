package com.example.board.dto;

import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;

public class BoardDTO {
    private Long id;
    private String boardWriter;
    private String boardPass;
    private String boardTitle;
    private String BoardContents;
    private int boardHits;
    private LocalDateTime boardCreatedTime;
    private LocalDateTime boardUpdateTime;

    // 실제 파일을 받아줄 수 있는 타입 spring 에서 제공해줌 | save.html -> Controller 파일 담는 용도
    private MultipartFile boardFile;    // save.html -> Controller 파일 담는 용도
    private String originalFileName;    // 원본 파일 이름
    private String storedFileName;  // 서버 저장용 파일 이름
    // 두 변수를 나눠서 사용하는 이유는 똑같은 이름의 파일을 여러개 올릴 경우 서버에서는 이름으로만 구별 할 수 있다.
    private int fileAttached;   // 파일 첨부 여부(첨부 1, 미첨부 0)
    // boolean 타입으로 하면 entity 파일에서 다뤄야 할 내용이 너무 많아지기 때문에 숫자로 하는게 좋다.

    // 보통 이러한 클래스 객체를 만들면 필드를 주고 필드는 프라이빗으로 접근제한자를 둔다
    // 그러고 이 아래 보통 생성자나 게터세터를 둬서 필드값을 주고받는 형식을 많이 사용한다.

    public BoardDTO(Long id, String boardWriter, String boardTitle, int boardHits, LocalDateTime boardCreatedTime) {
        this.id = id;
        this.boardWriter = boardWriter;
        this.boardTitle = boardTitle;
        this.boardHits = boardHits;
        this.boardCreatedTime = boardCreatedTime;
    }
}
