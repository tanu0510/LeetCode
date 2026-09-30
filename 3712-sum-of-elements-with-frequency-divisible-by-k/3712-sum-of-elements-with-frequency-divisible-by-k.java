class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i : map.keySet()){
            int a=map.get(i);
           if(a%k==0){
              sum+=a*i;
           }
        }
        return sum;
    }
}