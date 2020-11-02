package com.minh.reddit.repository;

import com.minh.reddit.model.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SubRedditRepository extends JpaRepository<Subreddit, Long> {
}
