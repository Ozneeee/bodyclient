package com.enzo.bodyclient.repository;

import com.enzo.bodyclient.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}