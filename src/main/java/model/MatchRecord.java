package com.example.demo.model;

public class MatchRecord {
    private Long id;
    private SkillOffer offer;
    private SkillRequest request;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public SkillOffer getOffer() { return offer; }
    public void setOffer(SkillOffer offer) { this.offer = offer; }

    public SkillRequest getRequest() { return request; }
    public void setRequest(SkillRequest request) { this.request = request; }
}
