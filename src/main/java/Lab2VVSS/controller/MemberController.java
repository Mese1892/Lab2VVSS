package Lab2VVSS.controller;

import Lab2VVSS.repository.MemberRepository;

import Lab2VVSS.model.Member;
import Lab2VVSS.model.Entry;


public class MemberController {
	
    private MemberRepository mr;
    
    public MemberController(MemberRepository newMr){    	
    	this.mr =newMr;    	
    }
    
    public void addMember(String id,String name)
    {
        Member member= new Member(id,name);
        mr.addMember(member);
    }
}