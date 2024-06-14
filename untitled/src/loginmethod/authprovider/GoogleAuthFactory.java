package loginmethod.authprovider;

import java.security.AuthProvider;

public class GoogleAuthFactory implements AuthFactory {
    @Override
    public AuthProvider createAuthProvider() {
        return new GoogleAuth();
    }
}
