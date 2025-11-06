class Solution {
    public int[] parent;
    public int[] size;
    public boolean[] online;
    public TreeSet<Integer>[] set;

    public int[] processQueries(int c, int[][] connections, int[][] queries) {
        int n = c;
        parent = new int[n + 1];
        size = new int[n + 1];
        online = new boolean[n + 1];
        set = new TreeSet[n + 1];

        for (int i = 1; i <= n; i++) {
            parent[i] = i;
            size[i] = 1;
            online[i] = true;
            set[i] = new TreeSet<>();
            set[i].add(i);
        }

        for (int[] conn : connections)
            union(conn[0], conn[1]);

        List<Integer> ans = new ArrayList<>();

        for (int[] query : queries) {
            int type = query[0];
            int x = query[1];

            if (type == 1) {
                if (online[x])
                    ans.add(x);
                else {
                    int root = find(x);
                    if (set[root].isEmpty())
                        ans.add(-1);
                    else
                        ans.add(set[root].first());
                }
            } 
            else if (online[x]) {
                    online[x] = false;
                    int root = find(x);
                    set[root].remove(x);
            }
        }
        int[] arr = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++)
            arr[i] = ans.get(i);

        return arr;
    }

    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    public void union(int u, int v) {
        int ru = find(u);
        int rv = find(v);
        if (ru == rv) return;

        if (size[ru] < size[rv]) {
            int temp = ru;
            ru = rv;
            rv = temp;
        }

        for (int station : set[rv]) {
            set[ru].add(station);
        }
        set[rv].clear();

        parent[rv] = ru;
        size[ru] += size[rv];
    }
}