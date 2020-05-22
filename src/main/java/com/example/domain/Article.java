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
    private Integer id;
    private String name;
    private String content;
    /** コメントリスト */
	private List<Comment> commentList;
}
