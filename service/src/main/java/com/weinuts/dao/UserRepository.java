package com.weinuts.dao;

import com.weinuts.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 11/4/2015.
 */
public interface UserRepository extends JpaRepository<User, Integer>{
}
