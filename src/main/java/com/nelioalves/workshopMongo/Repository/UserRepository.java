package com.nelioalves.workshopMongo.Repository;

import com.nelioalves.workshopMongo.Domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
