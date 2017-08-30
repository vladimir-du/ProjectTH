package project.dao;

import project.model.Member;

import java.util.ArrayList;

/**
 * @author Vladimir on 8/28/2017.
 */
public interface MemberDao {
    ArrayList<Member> getMembers();

    Member getMemberByName(String name);

    void setMembers(ArrayList<Member> members);

    void addMember(Member member);

    void clearMembers();
}
