package Lab2VVSS.repository;

import Lab2VVSS.model.Entry;
import Lab2VVSS.model.Member;
import org.junit.Test;

import java.util.List;


public class AssignmentCBigBangTest {

    /*
    Assignment A unitTest
     */
    @Test
    public void testAddMember() {
        Member m = new Member("12","Mesesan");
        MemberRepository repository= new MemberRepository();
        repository.addMember(m);
    }

    /*
    Assignment B unitTest
     */
    @Test
    public void addEntryValid() throws Exception{
        EntryRepository entryRepository= new EntryRepository();
        Entry entry= new Entry("income",100,12);
        entryRepository.addEntry(entry);

    }

    /*
    Assignemnt C bigbang
     */
    @Test
    public void testGetEntriesForMember() throws Exception {

        Member m = new Member("12","Mesesan");
        MemberRepository repository= new MemberRepository();
        repository.addMember(m);
        EntryRepository entryRepository= new EntryRepository();
        Entry entry= new Entry("income",100,12);
        entryRepository.addEntry(entry);

        List<Entry> entries = entryRepository.getEntriesForMember(12);

        assert  entries.size() == 1;

    }
}
