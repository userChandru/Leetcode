class Solution {
    public String findLexSmallestString(String s, int a, int b) {
        Set<String> seen = new HashSet<>();
        String min = s;
        Deque<String> que = new ArrayDeque<>();
        que.offer(s);
        seen.add(s);

        while (!que.isEmpty()) {
            String curr = que.poll();
            if (curr.compareTo(min) < 0) 
                min = curr;

            StringBuilder sb = new StringBuilder(curr);
            for (int i = 1; i < sb.length(); i += 2)
                sb.setCharAt(i, (char) ((sb.charAt(i) - '0' + a) % 10 + '0'));

            String added = sb.toString();
            if (seen.add(added)) 
                que.offer(added);

            String rotated = curr.substring(curr.length() - b) + curr.substring(0, curr.length() - b);
            if (seen.add(rotated)) 
                que.offer(rotated);
        }
        return min;
    }
}