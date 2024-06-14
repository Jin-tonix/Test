// MemberDTO.java
package loginmethod.memberDTO;

public class MemberDTO {
    private String userID;

    public MemberDTO(String userID) {
        this.userID = userID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}
