package loginmethod.authprovider;

import java.security.AuthProvider;

public class NaverAuthFactory implements AuthFactory {
    @Override
    public AuthProvider createAuthProvider() {
        return new NaverAuth();
    }
}
