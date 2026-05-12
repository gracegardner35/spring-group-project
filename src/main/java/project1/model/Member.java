package project1.model;

import jakarta.persistence.*;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String bio;

    private boolean groupMember;

    private String funFact;   // ✅ NEW FIELD

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }
    public void setBio(String bio) {
        this.bio = bio;
    }

    public boolean isGroupMember() {
        return groupMember;
    }
    public void setGroupMember(boolean groupMember) {
        this.groupMember = groupMember;
    }

    public String getFunFact() {   // ✅ NEW GETTER
        return funFact;
    }
    public void setFunFact(String funFact) {   // ✅ NEW SETTER
        this.funFact = funFact;
    }
}
