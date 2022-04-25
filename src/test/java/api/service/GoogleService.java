package api.service;

public class GoogleService {

    private GoogleService() {
    }

    public static String getToken() {
        return "/accounts:signInWithPassword?key={key}";
    }
}
