package com.example.domain;

import lombok.Data;

/**
 * コメントのドメインクラスです.
 * 
 * @author nonaka
 *
 */
@Data
public class Comment {
	/** ID */
	private Integer id;
	/** 名前 */
	private String name;
	/** 内容 */
	private String content;
	/** 記事ID */
	private Integer articleId;
}
