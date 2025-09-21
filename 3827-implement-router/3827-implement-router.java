class Router {
    private final int size;
    private final Map<Long, int[]> packets = new HashMap<>();
    private final Map<Integer, ArrayList<Integer>> dests = new HashMap<>();
    private final ArrayDeque<Long> router = new ArrayDeque<>();

    public Router(int memoryLimit) {
        this.size = memoryLimit;
    }

    private long encode(int source, int destination, int timestamp) {
        return (((long) source << 40) | ((long) destination << 20) | (long) timestamp);
    }

    public boolean addPacket(int source, int destination, int timestamp) {
        long key = encode(source, destination, timestamp);
        if (packets.containsKey(key)) 
            return false;
        if (packets.size() >= size) {
            forwardPacket();
        }
        packets.put(key, new int[]{source, destination, timestamp});
        router.addLast(key);

        ArrayList<Integer> v = dests.computeIfAbsent(destination, k -> new ArrayList<>());
        int pos = lowerBound(v, timestamp);
        v.add(pos, timestamp);

        return true;
    }

    public int[] forwardPacket() {
        if (packets.isEmpty()) 
            return new int[0];
        long key = router.pollFirst();
        int[] packet = packets.remove(key);
        if (packet == null) 
            return new int[0];

        int d = packet[1], ts = packet[2];
        ArrayList<Integer> v = dests.get(d);
        if (v != null) {
            int pos = lowerBound(v, ts);
            if (pos < v.size() && v.get(pos) == ts) 
                v.remove(pos);
        }
        return packet;
    }

    public int getCount(int destination, int startTime, int endTime) {
        ArrayList<Integer> v = dests.get(destination);
        if (v == null || v.isEmpty())
            return 0;
        int L = lowerBound(v, startTime);
        int R = upperBound(v, endTime);
        return R - L;
    }

    private int lowerBound(List<Integer> a, int x) {
        int l = 0, r = a.size();
        while (l < r) {
            int m = (l + r) >>> 1;
            if (a.get(m) >= x)
                r = m;
            else 
                l = m + 1;
        }
        return l;
    }

    private int upperBound(List<Integer> a, int x) {
        int l = 0, r = a.size();
        while (l < r) {
            int m = (l + r) >>> 1;
            if (a.get(m) > x)
                r = m;
            else 
                l = m + 1;
        }
        return l;
    }
}

/**
 * Your Router object will be instantiated and called as such:
 * Router obj = new Router(memoryLimit);
 * boolean param_1 = obj.addPacket(source,destination,timestamp);
 * int[] param_2 = obj.forwardPacket();
 * int param_3 = obj.getCount(destination,startTime,endTime);
 */

/**
 * Your Router object will be instantiated and called as such:
 * Router obj = new Router(memoryLimit);
 * boolean param_1 = obj.addPacket(source,destination,timestamp);
 * int[] param_2 = obj.forwardPacket();
 * int param_3 = obj.getCount(destination,startTime,endTime);
 */