package project.service.email;

import project.model.Member;

/**
 * @author Vladimir on 8/28/2017.
 */
public interface EmailMemberService {

    String sendMembershipEmail(Member member);

    String sendBirthDEmail(Member member);
}
