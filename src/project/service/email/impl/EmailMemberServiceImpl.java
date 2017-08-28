package project.service.email.impl;

import project.model.Member;
import project.service.email.EmailMemberService;

/**
 * @author Vladimir on 8/28/2017.
 */
public class EmailMemberServiceImpl implements EmailMemberService {

    @Override
    public String sendMembershipEmail(Member member) {
        return "Dear " + member.getName() +
                ", we are glad you have joined our company!";
    }

    @Override
    public String sendBirthDEmail(Member member) {
        return "Happy Birthday, dear " +
                member.getName();
    }
}
