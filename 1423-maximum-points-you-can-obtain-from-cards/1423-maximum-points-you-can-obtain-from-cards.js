var maxScore = function(cardPoints, k) {
    let lSum = 0, rSum = 0, totalSum = 0;

    for (let i = 0; i < k; i++) {
        lSum += cardPoints[i];
    }

    let maxSum = lSum;
    let rightIndex = cardPoints.length - 1;

    for (let i = k - 1; i >= 0; i--) {
        lSum -= cardPoints[i];
        rSum += cardPoints[rightIndex];
        totalSum = lSum + rSum;
        maxSum = Math.max(maxSum, totalSum);
        rightIndex--;
    }

    return maxSum;
};