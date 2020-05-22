package com.example.form;

import lombok.Data;

/**
 * 記事のフォーム.
 * 
 * @author nonaa
 *
 */
@Data
public class ArticleForm {
	/** 記事題名 */
	private String name;
	/** 記事の内容 */
	private String content;
}
