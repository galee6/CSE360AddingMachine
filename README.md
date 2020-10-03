# CSE360AddingMachine
Assignment #1 from cse360 for learning version control. 

## Overview
* This project is to learn basic version control with some basic java code.
* Class section: ASU Fall-20 CSE360 Th 9:00AM
* Author: Guangchi Alex Lee, ASUID: 1217462649, Email: galee6@asu.edu

## File Description
* This project contains 2 files
    1. README.md -- Detailed descriptions of this project.
    2. AddingMachine.java -- Source code for an adding machine.

## Machine Description
* The Adding machine is a basic machine for completing basic +/- operations of integers.
* It keeps track of a running total and history of operations.
* Public Methods:
    1. AddingMachine() -- constructor that creates the machine.
    2. void add(int value) -- Adds the value parameter (integer) to the total.
    3. void subtract(int value) -- Subtracts the value parameter (integer) to the total.
    4. int getTotal() -- Returns the total (integer).
    5. String toString() -- Returns the history of operations.
    6. void clear() -- Clears the total and history.
    7. static void main(String[] args) -- Main interactions with user.

## Usage
* Compilation 
    1. Change directory into cse360assignment02
    2. Use command <i> javac AddingMachine.java </i>
* Execution
    1. Compile
    2. Use command <i> java AddingMachine.java </i>
* User interaction
    * System prompts different operations with the following operations
        - 1 -- Addition
        - 2 -- Subtraction
        - 3 -- Get total
        - 4 -- Get history
        - 5 -- clear
        - 0 -- quit
    * Operations prompts the value during operations 1 and 2
        - Only integers.
        
        
