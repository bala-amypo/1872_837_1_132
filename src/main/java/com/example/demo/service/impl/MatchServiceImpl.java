package com.example.demo.service.impl;

import com.example.demo.model.*;
import com.example.demo.repository.*;
import com.example.demo.service.MatchService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchServiceImpl implements MatchService {

    private final SkillMatchRepository matchRepository;
    private final SkillRepository skillRepository;
    private final SkillRequestRepository requestRepository;
    private final UserRepository userRepository;

    public MatchServiceImpl(SkillMatchRepository matchRepository,
                            SkillRepository skillRepository,
                            SkillRequestRepository requestRepository,
                            UserRepository userRepository) {
        this.matchRepository = matchRepository;
        this.skillRepository = skillRepository;
        this.requestRepository = requestRepository;
        this.userRepository = userRepository;
    }

    @Override
    public SkillMatch createMatch(Long skillId, Long requestId, Long adminId) {

        Skill skill = skillRepository.findById(skillId).orElse(null);
        SkillRequest request = requestRepository.findById(requestId).orElse(null);
        UserProfile admin = userRepository.findById(adminId).orElse(null);

        SkillMatch match = new SkillMatch();
        match.setSkill(skill);
        match.setRequest(request);
        match.setMatchedBy(admin);
        match.setStatus("CREATED");

        return matchRepository.save(match);
    }

    @Override
    public SkillMatch getMatch(Long id) {
        return matchRepository.findById(id).orElse(null);
    }

    @Override
    public List<SkillMatch> getAllMatches() {
        return matchRepository.findAll();
    }
    @Override
public List<SkillMatch> getMatchesByRequest(Long requestId) {
    return matchRepository.findByRequestId(requestId);
}

}
