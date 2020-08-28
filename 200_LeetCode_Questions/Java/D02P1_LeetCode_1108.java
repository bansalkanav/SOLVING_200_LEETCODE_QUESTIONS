//Runtime: 2 ms, faster than 28.26% of Java online submissions for Defanging an IP Address.
//Memory Usage: 37.6 MB, less than 56.28% of Java online submissions for Defanging an IP Address.

class Solution {
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.","[.]");
    }
}
