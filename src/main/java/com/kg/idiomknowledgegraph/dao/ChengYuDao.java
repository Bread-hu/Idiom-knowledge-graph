package com.kg.idiomknowledgegraph.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ChengYuDao {

    @Select("SELECT `content` FROM daodejing WHERE `jingbu` = #{jingbu} AND `category` = \"原文\" ORDER BY `chapter`")
    public List<String> getOriginals(String jingbu);

    @Select("SELECT `content` FROM daodejing WHERE `jingbu` = #{jingbu} AND `category` = \"译文\" ORDER BY `chapter`")
    public List<String> getTranslations(String jingbu);

    @Select("SELECT `content` FROM daodejing WHERE `jingbu` = #{jingbu} AND `category` = \"注释\" ORDER BY `chapter`")
    public List<String> getAnnotations(String jingbu);
}
