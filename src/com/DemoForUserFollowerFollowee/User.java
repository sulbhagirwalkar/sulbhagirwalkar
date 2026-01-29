package com.DemoForUserFollowerFollowee;

import java.util.Objects;
import java.util.Set;

public class User {
    private String name;
    private Set<User> followers;
    private Set<User> following;

    public User(String username, Set<User> followers, Set<User> following) {
        this.name = username;
        this.followers = followers;
        this.following = following;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFollowers(Set<User> followers) {
        this.followers = followers;
    }

    public void setFollowing(Set<User> following) {
        this.following = following;
    }

    public String getName() {
        return name;

        //Method to get set of followers of this year

    }
}