package com.example.demo.models.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.entity.Pets;

@Repository
public interface IPetsRepository extends MongoRepository<Pets, String> {
	Pets findBy_id(ObjectId _id);
}
