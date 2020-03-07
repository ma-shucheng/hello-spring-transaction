package com.shuke.hello.spring.transaction.service.impl;

import com.shuke.hello.spring.transaction.dao.TbContentCategoryDao;
import com.shuke.hello.spring.transaction.domain.TbContent;
import com.shuke.hello.spring.transaction.domain.TbContentCategory;
import com.shuke.hello.spring.transaction.service.TbContentCategoryService;
import com.shuke.hello.spring.transaction.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class TbContentCategoryServiceImpl implements TbContentCategoryService {
    @Autowired
    private TbContentCategoryDao tbContentCategoryDao;

    @Autowired
    private TbContentService tbContentService;

    @Override
    public void save(TbContentCategory tbContentCategory, TbContent tbContent) {
        tbContentCategoryDao.insert(tbContentCategory);

//        //模拟运行异常
//        if (true) {
//            throw new RuntimeException();
//        }

        tbContentService.save(tbContent);
    }
}
