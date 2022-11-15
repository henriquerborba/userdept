package com.henriqueborba.userdept.repositories;

import com.henriqueborba.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

