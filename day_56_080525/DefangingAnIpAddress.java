// https://leetcode.com/problems/defanging-an-ip-address/submissions/1628365925/

class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
