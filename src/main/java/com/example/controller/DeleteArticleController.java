package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.mapper.ArticleMapper;
import com.example.mapper.CommentMapper;

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
	private ArticleMapper articleMapper;
	
	@Autowired
	private CommentMapper commentMapper;
	
	/**
	 * 記事削除を行う.
	 * 
	 * @param commentForm コメントフォーム
	 * @return リダイレクト
	 */
	@RequestMapping("/delete")
	public String deleteArticle(Integer id) {
		commentMapper.deleteByArticleId(id);
	    articleMapper.deleteByPrimaryKey(id);
	    return "redirect:/";
	}
}
