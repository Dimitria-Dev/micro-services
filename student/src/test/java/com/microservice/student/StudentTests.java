package com.microservice.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class StudentTests {
    @Mock
    private StudentRepo repo;

    @InjectMocks
    private StudentService studentService;

    @BeforeEach
    public void setUp() {

    }

    @Test
    public void testAddStudent() {
        Student student = new Student(1, "Heather", "Wright", "hw@gmail.com", "Need help fixing schedule", "Biology",1);
        studentService.save(student);
        Mockito.verify(repo, Mockito.times(1)).save(student);

    }
}
