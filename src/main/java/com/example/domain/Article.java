package com.example.domain;

import java.util.List;

import lombok.Data;

/**
 * 記事のドメインクラス.
 * 
 * @author nonaka
 *
 */
@Data
public class Article {
	/** ID */
	private Integer id;
	/** 名前 */
	private String name;
	/** 内容 */
	private String content;
	/** コメントリスト */
	private List<Comment> commentList;

}
