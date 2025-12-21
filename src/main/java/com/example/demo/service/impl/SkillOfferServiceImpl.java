package com.example.demo.serviceimpl;

import com.example.demo.model.SkillOffer;
import com.example.demo.service.SkillOfferService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SkillOfferServiceImpl implements SkillOfferService {

    @Override
    public SkillOffer create(SkillOffer offer) {
        return offer;
    }

    @Override
    public SkillOffer get(Long id) {
        return new SkillOffer();
    }

    @Override
    public List<SkillOffer> getAll() {
        return new ArrayList<>();
    }
}
