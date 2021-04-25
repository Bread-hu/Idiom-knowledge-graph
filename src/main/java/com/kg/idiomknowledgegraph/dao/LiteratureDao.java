package com.kg.idiomknowledgegraph.dao;

import com.kg.idiomknowledgegraph.domain.ChengYu;
import com.kg.idiomknowledgegraph.domain.ChengYuMini;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface LiteratureDao {

    @Select("SELECT id,idiom FROM idiom WHERE `firstPhonetic` = #{firstPhonetic}")
     List<ChengYuMini> getIdioms(String firstPhonetic);

    @Select("SELECT * FROM idiom WHERE `id` = #{id}")
     ChengYu getIdiomById(int id);

//    @Select("SELECT `content` FROM daodejing WHERE `jingbu` = #{jingbu} AND `category` = \"译文\" ORDER BY `chapter`")
//    public List<String> getTranslations(String jingbu);
//
//    @Select("SELECT `content` FROM daodejing WHERE `jingbu` = #{jingbu} AND `category` = \"注释\" ORDER BY `chapter`")
//    public List<String> getAnnotations(String jingbu);
}
