import java.util.*;

class Problem01 {

    public static String minimumBribes(List<Integer> q) {
        int bribe = 0;
        for(int i = q.size() - 1; i >= 0; i--) {
            if(q.get(i) - (i + 1) > 2) {
                return "Too chaotic";
            }
            for(int j = Math.max(0, q.get(i) - 2); j < i; j++) {
                if(q.get(j) > q.get(i)) bribe++;
            }
        }
       return ""+ bribe;
    }

    public static void main(String[] args) {
        if(args.length > 0) {
            List<Integer> queue = new ArrayList<>();
            String[] numbers = args[0].split(",");
            for(String num : numbers) {
                queue.add(Integer.parseInt(num.trim()));
            }
            System.out.println(minimumBribes(queue));
        }
    }
}
