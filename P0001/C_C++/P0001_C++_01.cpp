//Marlon Mueller-Soppart
//20200311
//P0001 Method 3

#include <iostream>
#include <thread>
#include <future>

const int LIMIT = 1000;

int getSum1() {
	std::cout << "start getSum1" << std::endl;
	int sum = 0;
	int currVal = 5;
	
	while (currVal < LIMIT) {
		sum += currVal;
		currVal += 15;
	}
	std::cout << "end getSum1" << std::endl;
	return sum;	
}

int getSum2() {
	std::cout << "start getSum2" << std::endl;
	int sum = 0;
	int currVal = 10;

	while (currVal < LIMIT){
		sum += currVal;
		currVal += 15;
	}
	std::cout << "end getSum2" << std::endl;
	return sum;
}

int getSum3() {
	std::cout << "start getSum3" << std::endl;
	int sum = 0;
	int currVal = 3;

	while (currVal < LIMIT) {
		sum += currVal;
		currVal += 3;
	}
	std::cout << "end getSum3" << std::endl;
	return sum;
}

int main() {

	int answer = 0;
	
	auto future1 = std::async(getSum1);
	auto future2 = std::async(getSum2);
	auto future3 = std::async(getSum3);

	answer = future1.get() + future2.get() + future3.get();

	std::cout << answer << std::endl;
		

//end of main
}
