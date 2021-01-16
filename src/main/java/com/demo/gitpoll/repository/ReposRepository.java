package com.demo.gitpoll.repository;

import com.demo.gitpoll.domain.Repo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReposRepository extends JpaRepository<Repo, Long> {
    Page<Repo> findByOwner(Pageable pageable, String owner);
}
