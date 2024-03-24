"""
Euler Project: Problem 14: Longest Collatz sequence
Problem Statement: The following iterative sequence is defined for the set of positive integers:
n → n/2 (n is even)
n → 3n + 1 (n is odd)
Using the rule above and starting with 13, we generate the following sequence:
13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
Although it has not been proved yet (Collatz Problem), it is thought that all starting 
numbers finish at 1. 
Which starting number, under the given limit, produces the longest chain?
"""

import timeit


def calculate_sequence_length(n: int, sequence_lengths: list[int]) -> int:
    """Returns the length of the Collatz sequence starting at n."""
    try:
        if sequence_lengths[n] == 0:
            if n % 2 == 0:
                sequence_lengths[n] = 1 + calculate_sequence_length(n // 2, sequence_lengths)
            else:
                sequence_lengths[n] = 2 + calculate_sequence_length(
                    (3 * n + 1) // 2, sequence_lengths
                )
        return sequence_lengths[n]
    except IndexError:
        if n % 2 == 0:
            return 1 + calculate_sequence_length(n // 2, sequence_lengths)
        return 2 + calculate_sequence_length((3 * n + 1) // 2, sequence_lengths)


def compute_longest_collatz_sequence(limit: int = 1000000):
    """Compute the longest Collatz sequence under a given limit"""

    sequence_lengths = [0] * (limit + 1)
    sequence_lengths[1] = 1
    max_sequence_length = 1
    starting_number_for_max_sequence = 1

    for number in range(2, limit):
        sequence_length = calculate_sequence_length(number, sequence_lengths)
        if sequence_length > max_sequence_length:
            max_sequence_length = sequence_length
            starting_number_for_max_sequence = number

    return starting_number_for_max_sequence


start = timeit.default_timer()
print(compute_longest_collatz_sequence(1000000))
end = timeit.default_timer()
print("Time taken is: ", end - start)
