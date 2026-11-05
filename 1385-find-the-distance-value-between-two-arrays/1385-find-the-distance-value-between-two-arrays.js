var findTheDistanceValue = function(arr1, arr2, d) {
    const b = Float64Array.from([...arr2, Infinity]).sort();  // typed arrays sort numerically; sentinel last
    const firstAtLeast = x => {  // binary search for the first b >= x
        let lo = 0, hi = b.length - 1;  // the sentinel guarantees b[hi] >= x
        while (lo < hi) {
            const mid = (lo + hi) >> 1;
            if (b[mid] < x) lo = mid + 1;
            else hi = mid;
        }
        return b[lo];
    };
    const far = a => firstAtLeast(a - d) > a + d;  // the first b >= a - d is already past a + d
    return arr1.filter(far).length;
};