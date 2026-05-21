class TimeMap {

    // hashmap
    // key -> list of (timestamp, value)

    HashMap<String, ArrayList<Pair>> map;

    // pair class
    class Pair{

        int timestamp;
        String value;

        Pair(int timestamp, String value){
            this.timestamp = timestamp;
            this.value = value;
        }
    }

    public TimeMap() {

        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {

        // if key not present
        if(!map.containsKey(key)){
            map.put(key, new ArrayList<>());
        }

        // add timestamp-value pair
        map.get(key).add(new Pair(timestamp, value));
    }

    public String get(String key, int timestamp) {

        // key not found
        if(!map.containsKey(key)){
            return "";
        }

        ArrayList<Pair> list = map.get(key);

        int left = 0;
        int right = list.size() - 1;

        String answer = "";

        while(left <= right){

            int mid = left + (right - left) / 2;

            // valid timestamp
            if(list.get(mid).timestamp <= timestamp){

                answer = list.get(mid).value;

                // search for larger valid timestamp
                left = mid + 1;
            }

            else{
                right = mid - 1;
            }
        }

        return answer;
    }
}