package com.week07.week07.repository;

import com.week07.week07.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PostRepository extends JpaRepository<Post, Long> {


}