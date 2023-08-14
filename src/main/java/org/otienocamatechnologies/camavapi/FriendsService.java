package org.otienocamatechnologies.camavapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FriendsService {
    @Autowired
    private FriendsRepository repository;
    
    public List<Friend> getFriends(){
        return repository.findAll();

    }
    public void addFriend(Friend friend){
        repository.save(friend);

    }
    public void updateFriends(Friend friend){
        repository.save(friend);
    }
    public void deleteFriends(Integer id){
        repository.deleteById(id);

    }
}
