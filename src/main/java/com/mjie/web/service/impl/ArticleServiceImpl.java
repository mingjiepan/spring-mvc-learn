package com.mjie.web.service.impl;

import com.mjie.exception.ServiceException;
import com.mjie.web.service.ArticleService;
import org.springframework.stereotype.Service;

/**
 * @author panmingjie
 * @date 2021/4/2 10:00
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Override
    public String queryDetail(String title) {
        if ("hello".equals(title)) {
            throw new ServiceException("title出错");
        }
        return "article " + title;
    }
}
