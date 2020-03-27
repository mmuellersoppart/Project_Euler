/*
Marlon Mueller-Soppart
20200327
0b - P0002 min memory consumption and fast.
*/
#include <stdio.h>

int nextNum(int twoPrev[]) {
	return (twoPrev[0] + twoPrev[1]);
}

int main() {
	//cheating a bit by including 2 from the start
	int totalSum = 2;
	int lastTwo[] = {1, 2};

	int nextSeqNum = nextNum(lastTwo);

	while(nextSeqNum < 4000000) {
		if(nextSeqNum % 2 == 0) {
			totalSum += nextSeqNum;
		}

		//prepare for next
		lastTwo[0] = lastTwo[1];
		lastTwo[1] = nextSeqNum;
		nextSeqNum = nextNum(lastTwo);
	}

	printf("P0002: %d", totalSum);
};
