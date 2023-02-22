package com.java.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.service.BoardService;
import com.java.vo.BoardVo;

@Controller
public class BoardController {

	@Autowired
	BoardService boardService;
	
	@GetMapping("board/fboardWrite") // 들어오는 url
	public String fboardWrite(Model model) {
		return "board/fboardWrite";	
		
//		return "board/fboardReply";		
		// return을 했다는 것이 fboardReply로의 페이지url '이동'은 아님. 
		// url은 이렇게 안바뀜. localhost/board/fboardWrite 이렇게 돼있을 것. 
		// 보여지는 것만 fboardReply.jsp 페이지가 보여짐
	}
	
	@GetMapping("board/fboardList")	// 전체게시글 가져오기
	public String fboardList(Model model) {
		// 모든 게시글 정보 model에 추가
//		List<BoardVo> list =  boardService.selectBoardList();
		Map<String, Object> map = boardService.selectBoardList();
		model.addAttribute("map", map);
		
		return "board/fboardList";
	}
	
	
	// 객체로 받아서 객체로 넘기는 방식(Model로 넘기는 것도 가능)
	@RequestMapping("board/fboardView") // 1개 게시글 가져오기    // url 	
	public String fboardView(@RequestParam int bno, 
			@RequestParam(defaultValue = "1") int page, Model model) {	// 형변환 없이도 바로 받을 수 있음. 원랜 id가 String인데도.
		
		BoardVo boardVo = boardService.selectOne(bno);
		
		model.addAttribute("boardVo", boardVo);
		model.addAttribute("page", page);
		
//		return "board/fboardView"; // 폴더. url과 전혀 다름.
//		return "index"; //  '/'나 '/index' 이렇게 하면 안됨
//		return "redirect:/?num=10&page=2";	//redirect:/ 이거만 하면 데이터 안넘어감. 왜냐면 redirect페이지로 완전 이동하는 거니까.
		return "board/fboardView";
	}
	
	
	
	
	
	
//	// @RequestParam으로 받아서 Model로 넘기는 방식
//	@PostMapping("board/fboardView")
//	public String fboardView(@RequestParam(required = false, defaultValue = "1") int id, @RequestParam String btitle, Model model) {	// 형변환 없이도 바로 받을 수 있음. 원랜 id가 String인데도.
//		model.addAttribute("id", id);	// getAttribute이런거 없이 그냥 알아서 바로 받아지니까 바로 보낼 수.
//		model.addAttribute("btitle", btitle);	
//		return "board/fboardView";
//	}
	
//	// HttpServletRequest 으로 받아와서 Model로 넘기는 방식
//	@PostMapping("board/fboardView")
//	public String fboardView(HttpServletRequest request ,Model model) {
//		int id = Integer.parseInt(request.getParameter("id")); 
//		model.addAttribute("id", id);
//		return "board/fboardView";
//	}
	
	
	
}
