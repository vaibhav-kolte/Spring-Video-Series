package com.springboot.Spring.Boot.Series;

import com.springboot.Spring.Boot.Series.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
