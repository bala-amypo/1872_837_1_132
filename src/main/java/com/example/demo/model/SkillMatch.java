package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class SkillMatch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String matchStatus;

    @ManyToOne
    private Skill skill;

    @ManyToOne
    private SkillRequest request;

    public Long getId() { return id; }
    public String getMatchStatus() { return matchStatus; }
    public Skill getSkill() { return skill; }
    public SkillRequest getRequest() { return request; }

    public void setId(Long id) { this.id = id; }
    public void setMatchStatus(String matchStatus) { this.matchStatus = matchStatus; }
    public void setSkill(Skill skill) { this.skill = skill; }
    public void setRequest(SkillRequest request) { this.request = request; }
}
