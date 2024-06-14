package loginmethod.authprovider;

import java.security.AuthProvider;

public class KAkaoAuthFactory implements AuthFactory {
    @Override
    public AuthProvider createAuthProvider() {
        return new KakaoAuth();
    }
}

