package com.example.barter.model;

public class MatchRecord {

    private Long id;
    private SkillOffer offer;
    private SkillRequest request;
    private String status;
    private AppUser userA;

    public MatchRecord() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SkillOffer getOffer() {
        return offer;
    }

    public void setOffer(SkillOffer offer) {
        this.offer = offer;
    }

    public SkillRequest getRequest() {
        return request;
    }

    public void setRequest(SkillRequest request) {
        this.request = request;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AppUser getUserA() {
        return userA;
    }

    public void setUserA(AppUser userA) {
        this.userA = userA;
    }
    public void setUserB(Object u) {}
    public void setSkillOfferedByA(Object s) {}
    public void setSkillOfferedByB(Object s) {}
    public Object getBody() { return null; }
}
