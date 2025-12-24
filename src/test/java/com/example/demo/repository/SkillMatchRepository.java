package com.example.demo.repository;

import com.example.demo.model.SkillMatch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkillMatchRepository extends JpaRepository<SkillMatch, Long> {

    List<SkillMatch> findByMatchStatus(String matchStatus);
}
