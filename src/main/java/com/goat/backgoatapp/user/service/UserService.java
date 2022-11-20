package com.goat.backgoatapp.user.service;

import com.goat.backgoatapp.user.dao.UserRepository;
import com.goat.backgoatapp.user.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public void join(User user) {
        userRepository.save(user);
    }
}
