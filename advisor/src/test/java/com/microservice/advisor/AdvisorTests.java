package com.microservice.advisor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class AdvisorTests {
    @Mock
    private AdvisorRepo repo;

    @Mock
    private Student student;

    @InjectMocks
    AdvisorService advisorService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void save() {
        Advisor advisor = new Advisor(1, "Michelle", "Lakes", "mlakes@gmail.com");
        advisorService.save(advisor);
        Mockito.verify(repo, Mockito.times(1)).save(advisor);
    }

    @Test
    void findAllAdvisors() {
        List<Advisor> advisors = new ArrayList<>();
        advisors.add( new Advisor(1, "Michelle", "Lakes", "mlakes@gmail.com"));
        advisors.add( new Advisor(2, "Harper", "Jackson", "hj214@gmail.com"));
        advisors.add( new Advisor(3, "John", "Johnson", "hj214@gmail.com"));

        when(repo.findAll()).thenReturn(advisors);
        List<Advisor> result = advisorService.findAll();
        assertEquals(3, result.size());
    }
}
