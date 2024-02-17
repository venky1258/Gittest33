package com.mypack.backendtest1;

import com.mypack.backendtest1.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
