# Marlon Mueller-Soppart
# 20200327
# ob - Just come up with a solution quickly

def main():
    fib1 = Fibonacci()
    # check the class works
    for num in range(10):
        print(fib1.fib(num))

    currIndex = 1
    answer = 0
    while True:
        currFibVal = fib1.fib(currIndex)
        if currFibVal > 4000000:
            break
        answer += currFibVal
        currIndex += 3

    print(f"answer: {answer}")

    print(f"big fib: {fib1.fib(400)}")
    return 0


class Fibonacci:
    '''
    ob - stores fibonacci answers for long term use
    '''

    def __init__(self):
        self.mem = [1, 2]

    def fib(self, x):
        if x < len(self.mem):
            return self.mem[x]
        else:
            self.mem.append(self.fib(x - 1) + self.fib(x - 2))
            return self.mem[x]


main()
