package project.database;

import project.model.Member;

import java.util.ArrayList;

/**
 * @author Vladimir on 8/28/2017.
 */
public class MemberData {
    /**
     * New members container
     */
    private static ArrayList<Member> members = new ArrayList<>();

    /**
     * @return list of members
     */
    public static ArrayList<Member> getMembers() {
        return members;
    }

    /**
     * @param name is member's name.
     * @return {@Link Member} entity by given name.
     */
    public static Member getMemberByName(String name){
        for (Member member : members) {
            if (name.equals(member.getName())) return member;
        }
        return null;
    }

    /**
     * @param members is an ArrayList of members.
     * The method fully sets an ArrayList of members.
     */
    public static void setMembers(ArrayList<Member> members){
        MemberData.members = members;
    }

    /**
     * @param member is a member.
     * The method adds a new member to an ArrayList.
     */
    public static void addMember(Member member){
        MemberData.members.add(member);
    }

    /**
     * Clears all members in the DB.
     */
    public static void clearMembers(){
        members.clear();
    }

}
