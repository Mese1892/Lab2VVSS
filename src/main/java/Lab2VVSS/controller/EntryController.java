package Lab2VVSS.controller;

import Lab2VVSS.exceptions.InvalidTypeException;
import Lab2VVSS.model.Entry;
import Lab2VVSS.repository.EntryRepository;

import java.util.List;

public class EntryController {
    private EntryRepository entryRepository;

    public EntryController(EntryRepository entryRepository) {
        this.entryRepository = entryRepository;
    }

    public void addEntry(String typeEntry, int value, int idMemeber) throws Exception {
        if(typeEntry.equals("cost") || typeEntry.equals("income")){
            Entry entry= new Entry(typeEntry,value,idMemeber);
            entryRepository.addEntry(entry);
        }
        else{
            throw new InvalidTypeException();
        }

    }

    public List<Entry> allEntries(int id) {
        return this.entryRepository.getEntriesForMember(id);
    }
}
