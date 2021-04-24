package com.kg.idiomknowledgegraph.service;

import com.alibaba.fastjson.JSON;
import com.kg.idiomknowledgegraph.domain.ChengYu;
import com.kg.idiomknowledgegraph.domain.ChengYuMini;

import java.util.List;
import java.util.Map;

public interface ChengYuService {

    public List<ChengYuMini> getIdiomsByFirstPhonetic(String firstPhonetic);
    public ChengYu getIdiomById(int id);
}
