package com.dantalian.danoj.model.dto.postfavour;

import com.dantalian.danoj.common.PageRequest;
import com.dantalian.danoj.model.dto.post.PostQueryRequest;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 帖子收藏查询请求
 *
 * @author <a href="https://github.com/Dantalian624">Dantalian</a>
 * @from <a href="https://github.com/Dantalian624/Dan-OJ">Dan-OJ</a>
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PostFavourQueryRequest extends PageRequest implements Serializable {

    /**
     * 帖子查询请求
     */
    private PostQueryRequest postQueryRequest;

    /**
     * 用户 id
     */
    private Long userId;

    private static final long serialVersionUID = 1L;
}