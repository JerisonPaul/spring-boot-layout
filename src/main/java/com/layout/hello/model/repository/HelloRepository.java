package com.layout.hello.model.repository;

import com.layout.hello.model.Hello;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface HelloRepository extends JpaRepository<Hello, Integer> {

    Hello findByName(@Param("name") String name);
}
