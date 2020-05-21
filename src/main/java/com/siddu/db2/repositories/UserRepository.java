package com.siddu.db2.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.siddu.db2.domain.User;

@Transactional
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUserName(String userName);

}
