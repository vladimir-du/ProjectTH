package project.service.impl;

import project.dao.MemberDao;
import project.model.Member;
import project.service.MemberService;

import java.util.ArrayList;

/**
 * @author Vladimir on 8/28/2017.
 */
public class MemberServiceImpl implements MemberService{
    private MemberDao memberDao;

    @Override
    public ArrayList<Member> getMembers() {
        return memberDao.getMembers();
    }

    @Override
    public Member getMemberByName(String name) {
        return memberDao.getMemberByName(name);
    }

    @Override
    public void setMembers(ArrayList<Member> members) {
        memberDao.setMembers(members);
    }

    @Override
    public void addMember(Member member) {
        memberDao.addMember(member);
    }

    @Override
    public void clearMembers() {
        memberDao.clearMembers();
    }
}
