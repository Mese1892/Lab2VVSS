package Lab2VVSS.repository;

import Lab2VVSS.exceptions.InvalidBudgetException;
import Lab2VVSS.model.Entry;
import org.junit.Test;

import static org.junit.Assert.*;

public class EntryRepositoryTest {

    @Test(expected = InvalidBudgetException.class)
    public void addEntry() throws Exception {
        EntryRepository entryRepository= new EntryRepository();
        Entry entry= new Entry("smth",100,12);
        entryRepository.addEntry(entry);
    }

    @Test(expected = InvalidBudgetException.class)
    public void addEntryNegative() throws Exception {
        EntryRepository entryRepository= new EntryRepository();
        Entry entry= new Entry("income",-1100,12);
        entryRepository.addEntry(entry);
    }
}