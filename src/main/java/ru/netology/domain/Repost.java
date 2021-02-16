package ru.netology.domain;

public class Repost {
    private long count;
    private boolean UserReposted;

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public boolean isUserReposter() {
        return UserReposted;
    }

    public void setUserReposter(boolean userReposter) {
        UserReposted = userReposter;
    }
}
