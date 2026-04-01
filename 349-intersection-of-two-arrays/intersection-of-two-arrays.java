class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
     HashSet<Integer> st = new HashSet<>();
     HashSet<Integer> res = new HashSet<>();
     for(int num: nums1)
     {
        st.add(num);
     }

     for(int num : nums2)
     {
        if(st.contains(num))
        {
            res.add(num);
        }
     }

     int[] a = new int[res.size()];
    int i=0;
     for(int num : res)
     {
        a[i] = num;
        i++;
     }
        return a;
    }
}