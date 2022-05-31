package com.example.springauthentification.service;

import com.example.springauthentification.Entities.User;
import com.example.springauthentification.Dao.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
@Service
@Transactional
public class UserDetailServiceImpl implements UserDetailsService {

    private UserRepository userRepository;

  /**
   * Instantiates a new User detail service.
   *
   * @param userRepository the user repository
   */
  public UserDetailServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User userDetails = userRepository.findByUsername(username);  
        if(userDetails == null){
            throw new UsernameNotFoundException(username);
        }
        return new org.springframework.security.core.userdetails.User(userDetails.getUsername(),userDetails.getPassword(), new ArrayList<>());
    }
}
