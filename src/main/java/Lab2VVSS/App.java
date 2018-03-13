package Lab2VVSS;

import Lab2VVSS.controller.EntryController;
import Lab2VVSS.repository.EntryRepository;
import Lab2VVSS.repository.MemberRepository;
import Lab2VVSS.controller.MemberController;
import Lab2VVSS.ui.MemberUI;

public class App {
    public static void main(String[] args) {

        MemberRepository memberRepository = new MemberRepository();
        EntryRepository entryRepository = new EntryRepository();

        MemberController ctrl = new MemberController(memberRepository);
        EntryController entryController = new EntryController(entryRepository);

        MemberUI console = new MemberUI(ctrl, entryController);
        console.Run();

    }
}
