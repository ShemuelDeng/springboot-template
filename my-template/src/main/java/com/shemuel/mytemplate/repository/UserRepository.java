package com.shemuel.mytemplate.repository;

import com.shemuel.mytemplate.entity.UserProfile;

import java.util.Optional;


public interface UserRepository {

    UserProfile save(UserProfile userProfile);
    Optional<UserProfile> findByIdentifier(String identifier);
    Optional<UserProfile> findByPhone(String phone);
    Optional<UserProfile> findByUsername(String username);
     int update(UserProfile userProfile);
    void delete(String userId);

}
