// MemberService.java
package loginmethod.memberservice;

import java.security.AuthProvider;
import loginmethod.memberDTO.MemberDTO;

public class MemberService {
    private AuthProvider authProvider;

    public MemberService(AuthProvider authProvider) {
        this.authProvider = authProvider;
    }

    public boolean findMember(MemberDTO memberDTO) {
        // 회원을 찾는 로직 작성
        // 여기서는 간단히 true를 반환하도록 가정
        return true;
    }
}
