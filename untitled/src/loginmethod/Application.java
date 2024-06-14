// Application.java
package loginmethod;

import loginmethod.authprovider.GoogleAuthFactory;
import loginmethod.authprovider.KakaoAuthFactory;
import loginmethod.authprovider.NaverAuthFactory;
import loginmethod.memberDTO.MemberDTO;
import loginmethod.memberservice.MemberService;

import java.security.AuthProvider;

public class Application {
    public static void main(String[] args) {
        int choice = 1; // 사용자 선택 (예시로 1로 설정)

        // 사용자의 선택에 따라 인증 팩토리를 가져옴
        AuthProvider authProvider = createAuthProvider(choice);
        if (authProvider == null) {
            System.out.println("잘못된 선택입니다.");
            return;
        }

        // 예시로 memberDTO 객체 생성
        String userID = "사용자ID"; // 실제 사용자의 ID 값으로 대체할 것
        MemberDTO memberDTO = new MemberDTO(userID);

        // 회원 서비스에 인증 제공자를 전달하여 회원을 찾음
        MemberService memberService = new MemberService(authProvider);
        boolean result = memberService.findMember(memberDTO);

        // 회원 조회 결과를 출력
        if (result) {
            System.out.println(authProvider.getName() + " 로그인에 성공하였습니다. " + memberDTO.getUserID());
        }
    }

    // 선택된 인증 방식에 따라 해당하는 인증 제공자를 반환
    private static AuthProvider createAuthProvider(int choice) {
        AuthProvider authProvider = null;
        switch (choice) {
            case 1:
                authProvider = new GoogleAuthFactory().createAuthProvider();
                break;
            case 2:
                authProvider = new NaverAuthFactory().createAuthProvider();
                break;
            case 3:
                authProvider = new KakaoAuthFactory().createAuthProvider();
                break;
            default:
                System.out.println("잘못된 선택입니다.");
                break;
        }
        return authProvider;
    }
}
