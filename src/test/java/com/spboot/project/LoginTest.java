/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spboot.project;

import com.spboot.project.repositories.KaryawanRepository;
import com.spboot.project.repositories.UserRepository;
import com.spboot.project.services.KaryawanService;
import com.spboot.project.services.UserService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

/**
 *
 * @author ASUS
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class LoginTest {
    @InjectMocks
    @Autowired
    UserService service;
    @Mock
    UserRepository repository;
     @Autowired
    private MockMvc mockMvc;
}
