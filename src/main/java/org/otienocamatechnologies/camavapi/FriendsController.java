package org.otienocamatechnologies.camavapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/FriendApi")
public class FriendsController {
    @Autowired
    private FriendsService service;

    @GetMapping("/friends")
    public List<Friend> getFriends() {
        return service.getFriends();
    }

    @PostMapping("/friends/addnew")
    public void addFriend(@RequestBody Friend friend) {
        service.addFriend(friend);
    }

    @PutMapping("/friends/{id}/edit")
    public void updateFriends(@PathVariable("id") Integer id, @RequestBody Friend friend) {
        service.updateFriends((friend));
    }

    @DeleteMapping("/friends/{id}/delete")
    public void deleteFriends(@PathVariable("id") Integer id) {
        service.deleteFriends(id);
    }

}
