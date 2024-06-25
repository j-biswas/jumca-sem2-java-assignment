package mylibrary;
import java.util.ArrayList;
import java.util.List;
public class MemberList extends Member {
    

    List<Member> memberList;
    public MemberList(){
        memberList = new ArrayList<Member>();
    }
    /*public MemberList(int memberId, String name, String dateOfBirth) {
        super(memberId, name, dateOfBirth);
        memberList = new ArrayList<Member>();
    }*/

    public void addMember(Member member) {
        memberList.add(member);
    }
    public void printMemberList(){
        for(Member member: memberList){
            member.memberInfromation();
        }
    }
}
