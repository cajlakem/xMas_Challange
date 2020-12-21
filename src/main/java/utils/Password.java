package utils;

public class Password {
    private String password;
    private int from = 0;
    private int to = 0;
    private char sign;


    public Password(String inputLine) {
        String[] values = inputLine.split(" ");
        String policy = values[0];
        String key = values[1];
        password = values[2];
        sign = key.replace(":", "").charAt(0);
        String[] result = policy.split("-");

        from = Integer.valueOf(result[0]);
        to = Integer.valueOf(result[1]);
    }

    public boolean isValid(){
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) == sign) {
                count++;
            }
        }

        if(this.isValidPart2()){
            System.out.println(sign+" "+password+" "+from+" "+to);
        }
        return isValidPart2();
    }

    public boolean isValidPart2(){

        char from = password.charAt(this.from -1);
        char to = password.charAt(this.to -1);
        return from == sign ^ to == sign;

    }
}
