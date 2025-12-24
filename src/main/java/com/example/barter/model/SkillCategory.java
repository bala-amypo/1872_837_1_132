package com.example.barter.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class SkillCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String categoryName;

    @OneToMany(mappedBy = "skillCategory")
    private List<SkillOffer> skillOffers;

    public SkillCategory() {}

    public Long getId() {
        return id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<SkillOffer> getSkillOffers() {
        return skillOffers;
    }
}
