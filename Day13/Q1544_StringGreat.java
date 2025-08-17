class Q1544_StringGreat {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            int len = sb.length();
            if (len > 0) {
                char top = sb.charAt(len - 1);
                if (top != c && Character.toLowerCase(top) == Character.toLowerCase(c)) {
                    sb.deleteCharAt(len - 1);
                    continue;
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }
}