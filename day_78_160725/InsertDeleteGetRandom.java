// https://leetcode.com/problems/insert-delete-getrandom-o1/submissions/1699791104/?envType=study-plan-v2&envId=top-interview-150

class RandomizedSet {
    Map<Integer, Integer> map = new HashMap<>(); //value, index in list
    List<Integer> list = new ArrayList<>();

    public RandomizedSet() {
    }

    boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        } else {
            list.add(val);
            map.put(val, list.size() - 1);
            return true;
        }
    }

    boolean remove(int val) {
        if (map.containsKey(val)) {
            int indexToRemove = map.get(val);
            int lastElementInList = list.get(list.size() - 1);
            if (indexToRemove != list.size() - 1) {
                list.set(indexToRemove, lastElementInList);
            }

            map.put(lastElementInList, indexToRemove);
            list.remove(list.size() - 1);
            map.remove(val);
            return true;
        } else {
            return false;
        }
    }

    int getRandom() {
        int i = new Random().nextInt(list.size());
        return list.get(i);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
