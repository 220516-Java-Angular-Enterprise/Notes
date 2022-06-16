package com.revature.spring_xml.services;

import java.util.Random;

public class CompSciCoachService {
    private final String[] motivations = {
            "“Coding is today's language of creativity. All our children deserve a chance to become creators instead of consumers of computer science.” - Maria Klawe, president of Harvey Mudd College",
            "“Any fool can write code that a computer can understand. Good programmers write code that humans can understand.” – Martin Fowler, software engineer, object-oriented programming pioneer",
            "If carpenters made buildings the way programmers make programs, the first woodpecker to come along would destroy all of civilization. - Unknown Author"
    };

    public String getMotivation() {
        return motivations[new Random().nextInt(3)];
    }
}
