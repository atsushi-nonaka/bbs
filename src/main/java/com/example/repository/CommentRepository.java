package com.example.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

/**
 * コメントの操作をするレポジトリ.
 * 
 * @author nonaka
 *
 */
@Repository
public class CommentRepository {
	
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	private final static String TABLE_NAME = "comments";
	
	/**
	 * コメントを削除する.
	 * 
	 * @param articleId 記事ID
	 */
	public void deleteByArticleId(int articleId) {
		String sql ="DELETE FROM " + TABLE_NAME + " WHERE article_id = :article_id";
		SqlParameterSource param = new MapSqlParameterSource().addValue("article_id", articleId);
		template.update(sql, param);
	}
}
