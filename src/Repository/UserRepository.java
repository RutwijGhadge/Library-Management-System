package Repository;

import Models.User;
import Exception.UserNotPresentException;

import java.util.HashMap;

public class UserRepository {
    private final HashMap<Integer, User> userRepository;

    public UserRepository() {
        this.userRepository = new HashMap<>();
    }

    public User getUser(int id) throws UserNotPresentException {
        if(!userRepository.containsKey(id))
            throw new UserNotPresentException("User with id :" + id + " Not Registered");
        return userRepository.get(id);
    }

    public void addUser(User user){
        userRepository.put(user.getId(), user);
    }
}
