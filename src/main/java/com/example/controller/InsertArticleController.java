package com.example.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Article;
import com.example.form.ArticleForm;
import com.example.mapper.ArticleMapper;

@Controller
@RequestMapping("")
public class InsertArticleController {
	
	@Autowired
	private ArticleMapper mapper;

	@RequestMapping("/insert")
	private String insertArticle(ArticleForm form) {
		Article article = new Article();
		BeanUtils.copyProperties(form, article);
		mapper.insertSelective(article);
		return "redirect:/";
	}
}
