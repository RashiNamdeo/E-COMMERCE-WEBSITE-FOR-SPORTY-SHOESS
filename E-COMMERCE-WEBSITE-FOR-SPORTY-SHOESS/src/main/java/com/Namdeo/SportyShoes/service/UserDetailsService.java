package com.Namdeo.SportyShoes.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Namdeo.SportyShoes.entity.UserDetails;
import com.Namdeo.SportyShoes.jdbc.UserDetailsRepository;
@Service
public class UserDetailsService {
@Autowired
UserDetailsRepository userRepo;
public List<UserDetails> listAll(){
return userRepo.findAll();
}
public List<UserDetails> get(String username) {
return userRepo.findByusername(username);
}
/*public List<UserDetails> searchUsers(String username) {
List<UserDetails> su= new ArrayList<UserDetails>();
su= userRepo.findByusername(username);
return su;
}*/
}
