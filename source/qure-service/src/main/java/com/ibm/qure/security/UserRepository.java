package com.ibm.qure.security;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Users, Object> {
//	Users findBy_id(ObjectId _id);
	Users findByUsername(String username);
}
