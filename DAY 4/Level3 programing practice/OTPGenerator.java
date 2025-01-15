import java.util.HashSet;
import java.util.Set;

public class OTPGenerator {

    
    public static int generateOTP() {
        // Generating a 6-digit number
        return (int) (Math.random() * 900000) + 100000;  
    }

    // Method to check if the OTP numbers are unique 
    public static boolean areOTPsUnique() {import java.util.*;

public class SimpleOTPGenerator {

    public static void main(String[] args) {
        int[] otpArray = new int[10];

       
        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
            System.out.println("Generated OTP " + (i + 1) + ": " + otpArray[i]);
        }

        
        if (areOTPsUnique(otpArray)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Some OTPs are not unique.");
        }
    }

    public static int generateOTP() {
        int otp = (int) (Math.random() * 900000) + 100000;  
        return otp;
    }

    // Method to check if OTPs are unique
    public static boolean areOTPsUnique(int[] otpArray) {
        for (int i = 0; i < otpArray.length; i++) {
            for (int j = i + 1; j < otpArray.length; j++) {
                if (otpArray[i] == otpArray[j]) {
                    return false;  
                }
            }
        }
        return true; 
    }
}

        Set<Integer> otpSet = new HashSet<>();  

      
        for (int i = 0; i < 10; i++) {
            int otp = generateOTP();
           
            if (!otpSet.add(otp)) {
                return false;
            }
        }
        
        return true;  
    }

    public static void main(String[] args) {
       
        boolean result = areOTPsUnique();

        if (result) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Some OTPs are not unique.");
        }
    }
}
