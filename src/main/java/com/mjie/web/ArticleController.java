package com.mjie.web;

import com.mjie.web.params.QueryArticleDetailParam;
import com.mjie.web.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author panmingjie
 * @date 2021/4/2 09:56
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PostMapping(value = "/queryDetail", name = "")
    public String getArticle(@RequestBody QueryArticleDetailParam param) {
        return articleService.queryDetail(param.getTitle());
    }
}
