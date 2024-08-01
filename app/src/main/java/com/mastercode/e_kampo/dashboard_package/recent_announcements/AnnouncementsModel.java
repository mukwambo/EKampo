package com.mastercode.e_kampo.dashboard_package.recent_announcements;

public class AnnouncementsModel {
    private int profilePic;
    private String userName;
   private String email;

    public AnnouncementsModel(int profilePic, String userName, String email) {
        this.profilePic = profilePic;
        this.userName = userName;
        this.email = email;
    }

    public int getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(int profilePic) {
        this.profilePic = profilePic;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
