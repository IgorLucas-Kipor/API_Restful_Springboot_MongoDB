package com.igorlucas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.igorlucas.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
