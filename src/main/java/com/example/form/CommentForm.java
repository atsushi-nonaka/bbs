package com.example.form;

public class CommentForm {

	private String article;
	private String name;
	private String content;

	@Override
	public String toString() {
		return "CommentForm [article=" + article + ", name=" + name + ", content=" + content + "]";
	}

	public String getArticle() {
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
