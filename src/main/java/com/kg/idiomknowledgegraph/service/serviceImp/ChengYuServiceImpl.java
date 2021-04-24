package com.kg.idiomknowledgegraph.service.serviceImp;

import com.kg.idiomknowledgegraph.dao.ChengYuDao;
import com.kg.idiomknowledgegraph.service.ChengYuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ChengYuServiceImpl implements ChengYuService {

    @Autowired
    private ChengYuDao chengYuDao;

    @Override
    public Map<String, List<String>> getDaodejing() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("daoOriginals", chengYuDao.getOriginals("道"));
        map.put("daoTranslations", chengYuDao.getTranslations("道"));
        map.put("daoAnnotations", chengYuDao.getAnnotations("道"));
        map.put("deOriginals", chengYuDao.getOriginals("德"));
        map.put("deTranslations", chengYuDao.getTranslations("德"));
        map.put("deAnnotations", chengYuDao.getAnnotations("德"));
        return map;
    }
}
