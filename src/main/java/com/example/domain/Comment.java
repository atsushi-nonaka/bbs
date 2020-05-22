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
    private Integer id;
    private String name;
    private String content;
    private Integer articleId;

}
