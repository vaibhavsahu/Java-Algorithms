public static int checkStrongPassword(String s){
        int count = 0;

        Pattern patternDigit = Pattern.compile("(\\d)");
        Pattern patternUpper = Pattern.compile("([A-Z])");
        Pattern patternLower = Pattern.compile("([a-z])");
        Pattern patternSpecial = Pattern.compile("(\\W)");

        Matcher matcherDigit = patternDigit.matcher(s);
        Matcher matcherUpper = patternUpper.matcher(s);
        Matcher matcherLower = patternLower.matcher(s);
        Matcher matcherSpecial = patternSpecial.matcher(s);

        if (!matcherDigit.find()) {
            count++;
        }
        if (!matcherUpper.find()) {
            count++;
        }
        if (!matcherLower.find()) {
            count++;
        }
        if (!matcherSpecial.find()) {
            count++;
        }
        if ((count+s.length())<6) {
            count = count + 6-(count+s.length());
        }
        return count;
    }
