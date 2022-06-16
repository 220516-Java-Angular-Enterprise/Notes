package com.revature.spring_xml.models;

import com.revature.spring_xml.services.CompSciCoachService;

public class CompSciCoach implements Coach {
    private final CompSciCoachService compSciCoachService;

    public CompSciCoach(CompSciCoachService compSciCoachService) {
        this.compSciCoachService = compSciCoachService;
    }

    @Override
    public String getMotivation() {
        return compSciCoachService.getMotivation();
    }
}
