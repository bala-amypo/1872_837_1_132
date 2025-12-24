package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class SkillMatch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private SkillRequest request;

    @ManyToOne
    private Skill skill;

    private String matchStatus;

    public SkillMatch() {}

    // 🔥 REQUIRED BY TESTS 🔥
    public Long getId() { return id; }
    public SkillRequest getRequest() { return request; }
    public Skill getSkill() { return skill; }
    public String getMatchStatus() { return matchStatus; }

    public void setId(Long id) { this.id = id; }
    public void setRequest(SkillRequest request) { this.request = request; }
    public void setSkill(Skill skill) { this.skill = skill; }
    public void setMatchStatus(String matchStatus) { this.matchStatus = matchStatus; }
}
