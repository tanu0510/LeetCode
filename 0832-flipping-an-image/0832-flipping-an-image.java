class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] line : image) {
            if(line.length % 2 == 1) line[line.length / 2] ^= 1;
            for(int i = 0; i < line.length/2; i++) {
                int temp = line[i];
                line[i] = 1 ^ line[line.length-i-1];
                line[line.length-i-1] = 1 ^ temp;
            }
        }
        return image;
    }
}