#!/usr/bin/env python3

# Marlon Mueller-Soppart
# 20200318
# Euler P1

import timeit


# method two - list comprehension
def P0001_M2():
    answer2 = sum([(i * 1) for i in range(1000) if (i % 3 == 0) or (i % 5 == 0)])
    return answer2


def main():
    print(f"method2: {P0001_M2()}")
    # print(timeit.timeit(stmt=P0001_M2(), number=100))


main()
