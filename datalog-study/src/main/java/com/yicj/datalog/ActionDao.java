package com.yicj.datalog;

import com.yicj.domain.Action;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ActionDao extends MongoRepository<Action,String> {
}
