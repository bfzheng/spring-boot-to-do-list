package com.thoughtworks.training.springboottodolist.repository;

import com.thoughtworks.training.springboottodolist.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long>  {

}