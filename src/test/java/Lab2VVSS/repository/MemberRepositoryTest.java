package Lab2VVSS.repository;

import Lab2VVSS.exceptions.InvalidNameException;
import Lab2VVSS.model.Member;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MemberRepositoryTest {

    @Test
    public void testAddMember() {
        Member m = new Member("12","Mesesan");
        MemberRepository repository= new MemberRepository();
        repository.addMember(m);
        assertEquals(repository.members.size(), 1);
    }
    @Test
    public void testAddMemberNullId() {
        Member m = new Member(null,"Mesesan");
        MemberRepository repository= new MemberRepository();
        repository.addMember(m);
        assertEquals(repository.members.size(), 0);
    }

    @Test(expected = InvalidNameException.class)
    public void testAddMemberNullName() {
        Member m = new Member("123",null);
        MemberRepository repository= new MemberRepository();
        repository.addMember(m);

    }

    @Test
    public void testAddSameMember() {
        Member m = new Member("123", "Mesesan");
        MemberRepository repository = new MemberRepository();
        repository.addMember(m);
        repository.addMember(m);
        assertEquals(repository.members.size(), 1);
    }



}