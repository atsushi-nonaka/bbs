package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Article;
import com.example.form.ArticleForm;
import com.example.repository.ArticleRepository;

@Controller
@RequestMapping("")
public class ShowBbsController {
	
	@Autowired
	private ArticleRepository articleRepository;
	
	@ModelAttribute
	public ArticleForm setUpArticleForm() {
		return new ArticleForm();
	}
	
	/**
	 * 記事,コメントを表示する.
	 * 
	 * @return 記事,コメント表示html
	 */
	@RequestMapping("")
	public String index(Model model) {
		//ここから中級課題
		List<Article> articleList = articleRepository.findAll();
		model.addAttribute("articleList", articleList);
		return "main";
	}
}
