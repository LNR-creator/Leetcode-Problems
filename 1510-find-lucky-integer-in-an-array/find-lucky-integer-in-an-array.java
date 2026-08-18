class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
            }

            else{
                hm.put(arr[i],1);
            }
        }


        for(int key : hm.keySet()){
            if(key == hm.get(key)){
                a.add(key);
            }
        }
        Collections.sort(a);
        if(a.size() > 1)
        {
            return a.get(a.size()-1);
        }
        else if(a.size() == 1){
        return a.get(0);
        }

        return -1;
    }

}