package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "skill_matches")
public class SkillMatch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Skill skill;

    @ManyToOne
    private SkillRequest request;

    @ManyToOne
    private UserProfile matchedBy;

    private String status;

    public SkillMatch() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public SkillRequest getRequest() {
        return request;
    }

    public void setRequest(SkillRequest request) {
        this.request = request;
    }

    public UserProfile getMatchedBy() {
        return matchedBy;
    }

    public void setMatchedBy(UserProfile matchedBy) {
        this.matchedBy = matchedBy;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getMatchStatus() {
    return status;
}

}
