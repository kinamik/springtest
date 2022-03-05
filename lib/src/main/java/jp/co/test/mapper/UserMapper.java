package jp.co.test.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import jp.co.test.entity.User;

@Mapper
public interface UserMapper {

    @Select("SELECT id, name, country FROM users WHERE id = #{id}")
    User findById(long id);
}