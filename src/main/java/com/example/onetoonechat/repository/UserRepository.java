package com.example.onetoonechat.repository;

import com.example.onetoonechat.entity.Status;
import com.example.onetoonechat.entity.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<Users, String> {
    List<Users> findAllByStatus(Status status);
}
