var minMoves = function(nums) {
    const n = nums.length;
    const mx = Math.max(...nums);
    const sum = nums.reduce((a, b) => a + b, 0);
    return n * mx - sum;
};