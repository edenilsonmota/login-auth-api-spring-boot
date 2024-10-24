package com.esm.login_auth_api.repository;

import com.esm.login_auth_api.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, String> {

}
