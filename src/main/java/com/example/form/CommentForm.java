package com.example.form;

import lombok.Data;

@Data
public class CommentForm {
	/** 記事ID */
	private String articleId;
	/** コメント投稿者名 */
	private String name;
	/** コメント内容 */
	private String content;

	/**
	 * 記事IDをString→Integer
	 * 
	 * @return
	 */
	public Integer getIntArticleId() {
		return Integer.parseInt(articleId);
	}
}
