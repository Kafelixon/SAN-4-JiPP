"""
Euler Project: Problem 17: Number letter counts
Problem Statement: If the numbers 1 to 5 are written out in words: one, two, three, four, five, 
then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, 
how many letters would be used?
"""


def number_to_words(n: int) -> str:
    """Convert a number into words in compliance with British usage."""
    units: list[str] = [
        "",
        "one",
        "two",
        "three",
        "four",
        "five",
        "six",
        "seven",
        "eight",
        "nine",
    ]
    teens: list[str] = [
        "ten",
        "eleven",
        "twelve",
        "thirteen",
        "fourteen",
        "fifteen",
        "sixteen",
        "seventeen",
        "eighteen",
        "nineteen",
    ]
    tens: list[str] = [
        "",
        "",
        "twenty",
        "thirty",
        "forty",
        "fifty",
        "sixty",
        "seventy",
        "eighty",
        "ninety",
    ]

    if n == 1000:
        return "one thousand"
    if n >= 100:
        words = units[n // 100] + " hundred"
        words += " and " if n % 100 != 0 else ""
    else:
        words = ""

    n %= 100
    if n >= 20:
        words += tens[n // 10]
        words += "-" + units[n % 10] if n % 10 != 0 else ""
    elif n >= 10:
        words += teens[n - 10]
    else:
        words += units[n]

    return words


def main() -> None:
    """
    Find the number of letters in the words representing the numbers from 1 to 1000.
    """
    total_letters: int = 0
    for number in range(1, 1001):
        words = number_to_words(number)
        words_cleaned = words.replace(" ", "").replace("-", "")
        total_letters += len(words_cleaned)

    print(total_letters)


if __name__ == "__main__":
    main()
