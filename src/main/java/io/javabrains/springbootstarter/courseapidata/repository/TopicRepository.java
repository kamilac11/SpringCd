package io.javabrains.springbootstarter.courseapidata.repository;

import io.javabrains.springbootstarter.courseapidata.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends JpaRepository<Topic, String> {

}
