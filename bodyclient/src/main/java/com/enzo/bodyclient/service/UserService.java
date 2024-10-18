package com.enzo.bodyclient.service;

import com.enzo.bodyclient.model.User;
import com.enzo.bodyclient.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    // Ajouter un nouvel utilisateur
    public User createUser(User user) {
        return userRepository.save(user);
    }

    // Récupérer tous les utilisateurs
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }

    public User updateUser(String id, User user) {
    User existingUser = userRepository.findById(id).orElseThrow(() -> new RuntimeException("Utilisateur non trouvé"));

    existingUser.setFirstName(user.getFirstName());
    existingUser.setLastName(user.getLastName());
    existingUser.setType(user.getType());
    existingUser.setAbonnementType(user.getAbonnementType());
    
    return userRepository.save(existingUser);
}
}