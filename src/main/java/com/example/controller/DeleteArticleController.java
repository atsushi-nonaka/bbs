package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.CommentForm;
import com.example.repository.ArticleRepository;
import com.example.repository.CommentRepository;

/**
 * 記事を表示するクラス
 * 
 * @author nonaka
 *
 */
@Controller
@RequestMapping("")
public class DeleteArticleController {
	
	@Autowired
	private ArticleRepository articleRepository;
	
	@Autowired
	private CommentRepository commentRepository;
	
	/**
	 * 記事削除を行う.
	 * 
	 * @param commentForm コメントフォーム
	 * @return リダイレクト
	 */
	@RequestMapping("/delete")
	public String deleteArticle(Integer id) {
		commentRepository.deleteByArticleId(id);
	    articleRepository.deletedById(id);
	    return "redirect:/";
	}
}
