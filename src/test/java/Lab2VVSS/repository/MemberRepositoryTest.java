package Lab2VVSS.repository;

import Lab2VVSS.model.Member;
import junit.framework.TestCase;

public class MemberRepositoryTest extends TestCase {

    public void testAddMember() {
        Member m = new Member("12","Mesesan");
        MemberRepository repository= new MemberRepository();
        repository.addMember(m);
        assertEquals(repository.members.size(),1);
    }
}