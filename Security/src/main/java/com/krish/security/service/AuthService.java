package com.krish.security.service;

import com.krish.security.config.JwtUtil;
import com.krish.security.entity.Role;
import com.krish.security.entity.User;
import com.krish.security.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository repo;
    private final PasswordEncoder encoder;
    private final AuthenticationManager authManager;
    private final JwtUtil jwtUtil;

    public void register(String username, String password, String role) {

        User user = new User();
        user.setUsername(username);
        user.setPassword(encoder.encode(password));
        user.setRole(Role.valueOf("ROLE_" + role));

        repo.save(user);
    }

    public String login(String username, String password) {

        authManager.authenticate(new UsernamePasswordAuthenticationToken(username, password)
        );

        User user = repo.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("user not found"));

        return jwtUtil.generateToken(user.getUsername(), user.getRole().name());
    }
}
