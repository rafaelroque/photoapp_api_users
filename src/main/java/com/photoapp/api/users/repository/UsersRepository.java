package com.photoapp.api.users.repository;

import org.springframework.data.repository.CrudRepository;

import com.photoapp.api.users.entity.User;

public interface UsersRepository extends CrudRepository<User, Long> {

}
