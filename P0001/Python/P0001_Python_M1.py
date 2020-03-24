#!/usr/bin/env python3

# Marlon Mueller-Soppart
# 20200318
# Euler P1

import timeit


def P0001_M1():
    # method one (set approach)
    threes = set(range(3, 1000, 3))
    fives = set(range(5, 1000, 5))
    threesNoOverLap = threes.difference(fives)
    answer1 = sum(threesNoOverLap) + sum(fives)
    # print(f"method1: {answer1}")
    return answer1


def main():
    print(f"method1: {P0001_M1()}")
    # print(timeit.timeit(stmt=P0001_M1, number=100))


main()
