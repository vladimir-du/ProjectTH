package project.dao.impl;

import project.dao.MemberDao;
import project.database.MemberData;
import project.model.Member;

import java.util.ArrayList;

/**
 * @author Vladimir on 8/28/2017.
 */
public class MemberDaoImpl implements MemberDao {
    @Override
    public ArrayList<Member> getMembers() {
        return MemberData.getMembers();
    }

    @Override
    public Member getMemberByName(String name) {
        return MemberData.getMemberByName(name);
    }

    @Override
    public void setMembers(ArrayList<Member> members) {
        MemberData.setMembers(members);
    }

    @Override
    public void addMember(Member member) {
        MemberData.addMember(member);
    }

    @Override
    public void clearMembers() {
        MemberData.clearMembers();
    }
}
