class Solution {
    public int hammingDistance(int x, int y) {

	int ctr = 0;

	while (x > 0 && y > 0) {
		if (x % 2 != y % 2)
			ctr++;
		x >>= 1;
		y >>= 1;
	}

	while (x > 0) {
		if (x % 2 != 0)
			ctr++;
		x >>= 1;
	}

	while (y > 0) {
		if (y % 2 != 0)
			ctr++;
		y >>= 1;
	}

	return ctr;
    }
}
