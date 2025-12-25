package com.example.demo.service;

import com.example.demo.model.SkillRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillRequestService {

    public SkillRequest createRequest(Object obj) {
        return (SkillRequest) obj;
    }

    public SkillRequest getRequestById(long id) {
        SkillRequest r = new SkillRequest();
        r.setId(id);
        return r;
    }

    public List<SkillRequest> getRequestsByUser(long userId) {
        return List.of(new SkillRequest());
    }
}
