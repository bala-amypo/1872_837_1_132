package com.example.demo.service;

import com.example.demo.model.SkillOffer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillOfferService {

   public SkillOffer createOffer(Object obj) {
    return (SkillOffer) obj;
}

public SkillOffer getOfferById(long id) {
    SkillOffer o = new SkillOffer();
    o.setId(id);
    return o;
}

}
