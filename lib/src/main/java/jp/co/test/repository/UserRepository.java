package jp.co.test.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jp.co.test.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}