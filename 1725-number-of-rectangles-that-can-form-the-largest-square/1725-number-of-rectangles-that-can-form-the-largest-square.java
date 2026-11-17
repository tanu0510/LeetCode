class Solution {
    int count = 0;
    int maxSide = 0;
    public int countGoodRectangles(int[][] rectangles) {
        for(int[] rectangle : rectangles){
            int sqSide = Math.min(rectangle[0], rectangle[1]);
            if(sqSide > maxSide){
                maxSide = sqSide;
                count = 1;
            }
            else if(sqSide == maxSide){
                count++;
            }
        }
        return count;
    }
}