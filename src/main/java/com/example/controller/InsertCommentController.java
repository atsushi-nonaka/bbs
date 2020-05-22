package com.example.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Comment;
import com.example.form.CommentForm;
import com.example.mapper.CommentMapper;

@Controller
@RequestMapping("/comment")
public class InsertCommentController {

	@Autowired
	private CommentMapper mapper;
	
	@RequestMapping("/insert")
	public String insert(CommentForm form) {
		Comment comment = new Comment();
		BeanUtils.copyProperties(form, comment);
		comment.setArticleId(form.getIntArticleId());
		mapper.insertSelective(comment);
		return "redirect:/";
	}
}
