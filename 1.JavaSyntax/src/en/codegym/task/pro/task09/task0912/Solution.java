package en.codegym.task.pro.task09.task0912;

/* 
URL validation
*/

public class Solution {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.us", "https://google.com",
                "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};

        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domainExtension = checkDomainExtension(url);

            System.out.println("URL address: " + url + ", network protocol - " + protocol + ", domain extension - " + domainExtension);
        }
    }

    public static String checkProtocol(String url) {
        String result = "unknown";

        if (url.startsWith("https")) {
            result = "https";
        } else if (url.startsWith("http")) {
            result = "http";
        }

        return result;
    }

    public static String checkDomainExtension(String url) {
        String result = "unknown";

        if (url.endsWith("com")) {
            result = "com";
        } else if (url.endsWith("net")) {
            result = "net";
        } else if (url.endsWith("org")) {
            result = "org";
        } else if (url.endsWith("us")) {
            result = "us";
        }

        return result;
    }
}
