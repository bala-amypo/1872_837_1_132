package com.example.demo.model;

public class SkillOffer {
    private Long id;
    private Skill skill;

    public SkillOffer() {}

    public SkillOffer(Long id, Skill skill) {
        this.id = id;
        this.skill = skill;
    }

    public Long getId() { return id; }
    public Skill getSkill() { return skill; }

    public void setId(Long id) { this.id = id; }
    public void setSkill(Skill skill) { this.skill = skill; }
}
