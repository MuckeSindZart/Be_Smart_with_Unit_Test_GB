from unittest.mock import Mock

import pytest
from Tasks import Tasks


# task_1
def test_avg():
    numbers = [10, 20, 30, 40, 50]

    assert Tasks.find_average(numbers) == 30


def test_avg_null():
    assert Tasks.find_average([]) == 0


def test_avg_single_numb():
    assert Tasks.find_average([5]) == 5


# task_2
def test_new_avg_not_list():
    str_list = ["10", "20", "30", "40", "50", ]

    with pytest.raises(TypeError):
        Tasks.find_average(str_list)


# task_3
def test_check_bank():
    person = Tasks.Person(100)
    bank = Tasks.Bank()

    person.transfer_money(50, bank)

    assert person.balance == 50
    assert bank.balance == 50


def test_check_bank_fail():
    person = Tasks.Person(100)
    bank = Tasks.Bank()

    with pytest.raises(ValueError):
        person.transfer_money(200, bank)


# task_4
def test_bank_with_mock():
    person = Tasks.Person(100)
    bank_mock = Mock()
    person.transfer_money(50, bank_mock)
    bank_mock.receive_money.assert_called_with(50)


# task_5
def test_devZero_erorr():
    with pytest.raises(ZeroDivisionError):
        Tasks.divide(10, 0)


# task_6
@pytest.mark.parametrize("a, b, expected", [
    (10, 0, 0), (-1, 5, -5), (3, 3, 9), (-2, -2, 4), (0, 0, 0)])
def test_multiply(a, b, expected):
    assert Tasks.multiply(a, b) == expected


# task_7
def test_len_string():
    assert len("Geek") == 4
    assert len("") == 0
    assert len(" ") == 1
    assert len("Hello, World!") == 13


# task_8
# Задание 8
# python -m doctest Tasks.py
# @staticmethod
# def square(n):
#     """
#     This function returns the square of a number.
#     >>> Tasks.square(4)
#     16
#     >>> Tasks.square(0)
#     0
#     """
#     return n ** 2


# task_9
@pytest.mark.parametrize("test_input,expected",
                         [(2, True), (3, True),
                          (4, False), (16, False),
                          (17, True), (18, False)])
def test_is_prime(test_input, expected):
    assert Tasks.is_prime(test_input) == expected
