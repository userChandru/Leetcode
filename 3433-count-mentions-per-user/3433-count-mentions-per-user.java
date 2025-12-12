class Solution {
    public int[] offline;  

    public int[] countMentions(int number_of_users, List<List<String>> events) {
        int[] mentions = new int[number_of_users];
        offline = new int[number_of_users]; 
        
        events.sort((a, b) -> {
            int timeA = Integer.parseInt(a.get(1));
            int timeB = Integer.parseInt(b.get(1));
            if (timeA != timeB) {
                return Integer.compare(timeA, timeB);
            }
  
            String typeA = a.get(0);
            String typeB = b.get(0);
            if (typeA.equals("OFFLINE") && typeB.equals("MESSAGE")) {
                return -1;
            } else if (typeA.equals("MESSAGE") && typeB.equals("OFFLINE")) {
                return 1;
            }
            return 0;
        });

        int i = 0;
        while (i < events.size()) {
            int curr_time = Integer.parseInt(events.get(i).get(1));

            update(curr_time);
        
            while (i < events.size() && 
                   Integer.parseInt(events.get(i).get(1)) == curr_time &&
                   events.get(i).get(0).equals("OFFLINE")) {
                int user_id = Integer.parseInt(events.get(i).get(2));
                setOffline(user_id, curr_time + 60);
                i++;
            }

            while (i < events.size() && 
                   Integer.parseInt(events.get(i).get(1)) == curr_time &&
                   events.get(i).get(0).equals("MESSAGE")) {
                String var = events.get(i).get(2);

                if (var.equals("ALL")) {
                    for (int id = 0; id < number_of_users; id++) {
                        mentions[id]++;
                    }
                } 
                else if (var.equals("HERE")) {
                    for (int id = 0; id < number_of_users; id++) {
                        if (is_online(id, curr_time)) {
                            mentions[id]++;
                        }
                    }
                } else {
                    String[] parts = var.split(" ");
                    for (String part : parts) {
                        int userId = Integer.parseInt(part.substring(2));
                        mentions[userId]++;
                    }
                }
                i++;
            }
        }

        return mentions;
    }

    public void update(int timestamp) {
        for (int i = 0; i < offline.length; i++) {
            if (offline[i] != 0 && offline[i] <= timestamp)
                offline[i] = 0; 
        }
    }

    public boolean is_online(int user_id, int timestamp) {
        return offline[user_id] == 0 || offline[user_id] <= timestamp;
    }

    public void setOffline(int user_id, int offline_time) {
        offline[user_id] = offline_time;
    }
}