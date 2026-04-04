import java.util.*;
public class Zoo {
    public static void main(String[] args) {

        int hc = 2, cc = 3, ac = 5;


        int ha = 100, ca = 80, aa = 60;


        int hMin = 2, hReq = 3;
        int cMin = 3, cReq = 4;
        int aMin = 4, aReq = 2;

        int totalLand = 200;


        int hspace = Math.max(hMin * hReq, Math.min(ha, totalLand));
        totalLand -= hspace;


        int cspace = Math.max(cMin * cReq, Math.min(ca, totalLand));
        totalLand -= cspace;


        int aspace = Math.max(aMin * aReq, Math.min(aa, totalLand));
        totalLand -= aspace;

        int totalCost = (hspace * hc) + (cspace * cc) + (aspace * ac);

        System.out.println("Herbivore space: " + hspace+", Hcount: "+hc);
        System.out.println("Carnivore space: " + cspace+", Ccount: "+cc);
        System.out.println("Aquatic space: " + aspace+", Acount: "+ac);
        System.out.println("Total cost: " + totalCost);
    }

}

class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c) return false;
        }
        return stack.isEmpty();
    }
}