package com.example.board.controller;

import com.example.board.dto.BoardDTO;
import com.example.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
// stereotype 은 annotation 의 일종으로 주로 구성요소를 식별하기 위해 사용 된다.
// 구성요소 : @Component, @Service, @Repository, @Controller, @RestController
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // Spring MVC 에 사용되는 스테레오타입으로 웹 요청을 처리하는 컨트롤러로 사용된다.
@RequiredArgsConstructor
// final 필드 또는 @NonNull 어노테이션이 지정된 필드를 매개변수로 갖는 생성자가 자동으로 생성되고, 생성자는 초기화되지 않은 필드에 값을 할당하는 역할을 수행합니다.
@RequestMapping("/board")   // Spring framework 에서 사용되는 어노테이션 중 하나로, 웹 요청과 매핑되는 핸들러 메소드를 지정하는데 사용
public class BoardController {
    private final BoardService boardService;    // 생성자 주입 방식으로 의존성을 주입받음.

    @GetMapping("/save")
    public String saveForm() {
        return "save";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute BoardDTO boardDTO) {
        boardService.save(boardDTO);

        return "index";
    }
}
