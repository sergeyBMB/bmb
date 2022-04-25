package api.models.response;

import api.models.response.inner.LedgerAccount;
import api.models.response.inner.RequiredBalanceRule;
import api.models.response.inner.fee.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateMerchantResponse {
    public String id;
    public String name;
    public Object defaultBankAccount;
    public ArrayList<LedgerAccount> ledgerAccounts;
    public RequiredBalanceRule requiredBalanceRule;
    public ProcessingFeesDefinition processingFeesDefinition;
    public SetUpFeesDefinition setUpFeesDefinition;
    public MonthlyFeesDefinition monthlyFeesDefinition;
    public AnnualFeesDefinition annualFeesDefinition;
    public ChargebackFee chargebackFee;
    public AchRejectFee achRejectFee;
    public VoidFee voidFee;
    public RefundFee refundFee;
    public String status;
    public String apiToken;
    public String externalClientId;
    public String cardAuthMode;
    public String minimalNonAuthorizeAmount;
    public String minimalPurchaseAmount;
    public String maximumPurchaseAmount;
    public Object supportPhoneNumber;
    public Object supportEmail;
    public Object supportUrl;
    public String reserveMinAmount;
    public String reserveMode;
    public String reservePercentage;
    public Object callBackBaseUrl;
    public String type;
    public Object channelRevenue;
    public String payoutMode;
    public String defaultCreditLimit;
    public String purchaseMode;
    public String merchantCreditMode;
    public String productType;
}
