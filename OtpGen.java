import java.security.SecureRandom;

public class OtpGen {
    public static void main(String[] args) {
        int otp = 100000 + new SecureRandom().nextInt(900000); // Guarantees exactly 6 digits
        System.out.println("Your One-Time Code: " + otp);
    }
}
