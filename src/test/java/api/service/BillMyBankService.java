package api.service;

public class BillMyBankService {

    private BillMyBankService() {
    }

    public static String createMerchant() {
        return "/merchants";
    }

    public static String updateMerchant() {
        return "/merchants/{id}";
    }

    public static String activateMerchant() {
        return "/merchants/{id}/activate";
    }

    public static String inActivateMerchant() {
        return "/merchants/{id}/inactivate";
    }
}
