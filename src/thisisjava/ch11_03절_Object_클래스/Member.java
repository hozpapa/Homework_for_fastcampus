package thisisjava.ch11_03절_Object_클래스;

import java.util.Objects;

public class Member {
    public String id;


    public Member(String id) {
        this.id = id;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;
            if (this.id.equals(member.id)) {
                return true;
            }
        }
        return false;
    }


//    public boolean equals(String id){
//        if(this.id == id) return true;
//        else return false;
//    }


}




