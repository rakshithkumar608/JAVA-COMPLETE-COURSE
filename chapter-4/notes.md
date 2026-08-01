# Decision Making Statements in Java

Decision-making statements allow a program to make decisions based on one or more conditions. They help control the flow of execution by running different blocks of code depending on whether a condition is **true** or **false**.

Java provides four main decision-making statements:

1. `if` Statement
2. `if-else` Statement
3. `else-if` Ladder
4. `switch` Statement

---

# 1. The `if` Statement

## What is the `if` Statement?

The `if` statement is the simplest decision-making statement in Java. It executes a block of code **only when the specified condition evaluates to `true`**. If the condition is `false`, the block is skipped.

### Syntax

```java
if (condition) {
    // code to execute
}
```

### Flow

```
Condition
    |
True -----> Execute Code
    |
False ----> Skip Code
```

---

## Example 1: Voting Eligibility

```java
int age = 20;

if (age >= 18) {
    System.out.println("Eligible to Vote");
}
```

### Explanation

* `age >= 18` evaluates to `true`.
* Therefore, the message is printed.

**Output**

```
Eligible to Vote
```

---

## Example 2: Positive Number

```java
int number = 15;

if (number > 0) {
    System.out.println("Positive Number");
}
```

### Explanation

Since 15 is greater than 0, the condition is true.

**Output**

```
Positive Number
```

---

## Example 3: Discount Check

```java
double amount = 1200;

if (amount >= 1000) {
    System.out.println("Discount Applied");
}
```

### Explanation

The purchase amount is greater than ₹1000, so the discount message is displayed.

---

# 2. The `if-else` Statement

## What is the `if-else` Statement?

The `if-else` statement is used when there are **exactly two possible outcomes**.

* If the condition is `true`, the `if` block executes.
* Otherwise, the `else` block executes.

### Syntax

```java
if (condition) {
    // executes if true
} else {
    // executes if false
}
```

### Flow

```
Condition
   |
True ----------> if block
   |
False ---------> else block
```

---

## Example 1: Even or Odd

```java
int number = 9;

if (number % 2 == 0) {
    System.out.println("Even Number");
} else {
    System.out.println("Odd Number");
}
```

### Explanation

9 leaves a remainder of 1 when divided by 2.

Therefore, it is an odd number.

**Output**

```
Odd Number
```

---

## Example 2: Pass or Fail

```java
int marks = 38;

if (marks >= 40) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```

### Explanation

Since marks are less than 40, the `else` block executes.

**Output**

```
Fail
```

---

## Example 3: Login Check

```java
boolean isLoggedIn = true;

if (isLoggedIn) {
    System.out.println("Welcome User");
} else {
    System.out.println("Please Login");
}
```

### Explanation

The variable is `true`, so the welcome message is displayed.

---

# 3. The `else-if` Ladder

## What is the `else-if` Ladder?

The `else-if` ladder is used when a program needs to check **multiple conditions**.

Java checks the conditions **from top to bottom**. As soon as one condition becomes `true`, its block executes and the remaining conditions are ignored.

If none of the conditions are true, the `else` block executes.

### Syntax

```java
if (condition1) {

}
else if (condition2) {

}
else if (condition3) {

}
else {

}
```

### Flow

```
Condition 1
     |
 True --> Execute
     |
 False
     |
Condition 2
     |
 True --> Execute
     |
 False
     |
Condition 3
     |
 True --> Execute
     |
 False
     |
Else Block
```

---

## Example 1: Student Grade

```java
int marks = 82;

if (marks >= 90) {
    System.out.println("Grade A");
}
else if (marks >= 75) {
    System.out.println("Grade B");
}
else if (marks >= 60) {
    System.out.println("Grade C");
}
else {
    System.out.println("Fail");
}
```

### Explanation

* 82 is not greater than or equal to 90.
* 82 is greater than or equal to 75.

Therefore, **Grade B** is printed.

---

## Example 2: Age Category

```java
int age = 16;

if (age < 13) {
    System.out.println("Child");
}
else if (age < 20) {
    System.out.println("Teenager");
}
else if (age < 60) {
    System.out.println("Adult");
}
else {
    System.out.println("Senior Citizen");
}
```

### Explanation

Age is 16.

The second condition becomes true.

**Output**

```
Teenager
```

---

## Example 3: Traffic Signal

```java
String signal = "Green";

if (signal.equals("Red")) {
    System.out.println("Stop");
}
else if (signal.equals("Yellow")) {
    System.out.println("Ready");
}
else if (signal.equals("Green")) {
    System.out.println("Go");
}
else {
    System.out.println("Invalid Signal");
}
```

### Explanation

The signal is Green.

The third condition becomes true.

**Output**

```
Go
```

---

# 4. The `switch` Statement

## What is the `switch` Statement?

The `switch` statement is used when a variable can have **multiple fixed values**.

Instead of writing many `else-if` statements, we can use `switch` to make the code cleaner and easier to read.

### Syntax

```java
switch (expression) {

    case value1:
        // code
        break;

    case value2:
        // code
        break;

    default:
        // code
}
```

### Important Keywords

### `case`

Represents a possible value of the expression.

### `break`

Stops the execution of the switch statement after a matching case is executed.

Without `break`, execution continues to the next case. This behavior is called **fall-through**.

### `default`

Executes when none of the cases match.

---

## Example 1: Day of the Week

```java
int day = 2;

switch (day) {

    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    case 3:
        System.out.println("Wednesday");
        break;

    default:
        System.out.println("Invalid Day");
}
```

### Explanation

Since `day = 2`, Java executes **case 2**.

**Output**

```
Tuesday
```

---

## Example 2: Calculator

```java
char operator = '*';

switch (operator) {

    case '+':
        System.out.println(10 + 5);
        break;

    case '-':
        System.out.println(10 - 5);
        break;

    case '*':
        System.out.println(10 * 5);
        break;

    default:
        System.out.println("Invalid Operator");
}
```

### Explanation

The operator is `*`.

The multiplication case executes.

**Output**

```
50
```

---

## Example 3: Month to Season

```java
int month = 1;

switch (month) {

    case 12:
    case 1:
    case 2:
        System.out.println("Winter");
        break;

    case 3:
    case 4:
    case 5:
        System.out.println("Summer");
        break;

    default:
        System.out.println("Other Season");
}
```

### Explanation

Month is 1.

It matches the Winter group.

**Output**

```
Winter
```

---

# Difference Between Decision-Making Statements

| Statement        | Purpose                                     | Best Used When                                      |
| ---------------- | ------------------------------------------- | --------------------------------------------------- |
| `if`             | Executes code only when a condition is true | A single condition needs to be checked              |
| `if-else`        | Chooses between two outcomes                | There are only two possible results                 |
| `else-if` Ladder | Checks multiple conditions                  | Multiple ranges or conditions must be evaluated     |
| `switch`         | Selects one block based on a fixed value    | Comparing one variable against many constant values |

---

# Summary

* The **`if` statement** executes a block of code only when a condition is true.
* The **`if-else` statement** chooses between two possible outcomes.
* The **`else-if` ladder** evaluates multiple conditions in order and executes the first matching block.
* The **`switch` statement** selects one block of code based on the value of an expression and is often cleaner than multiple `else-if` statements for fixed values.
* The **`break` keyword** is used inside a `switch` statement to prevent fall-through, while the **`default` case** executes when no other case matches.

# Assignment 1: The `if` Statement

### Q1. Check whether a number is positive.

**Input**

```text
25
```

**Output**

```text
Positive Number
```

---

### Q2. Write a program to check whether a person is eligible to vote.

* Eligible if age is 18 or above.

---

### Q3. Write a program to check whether a student scored more than 80 marks.

If yes, print:

```text
Excellent Performance
```

---

### Q4. Write a program to check whether a number is divisible by 5.

---

### Q5. Write a program that prints:

```text
Adult
```

only if age is greater than or equal to 18.

---

# Assignment 2: The `if-else` Statement

### Q1. Check whether a number is even or odd.

**Example**

```text
Input: 9

Output:
Odd Number
```

---

### Q2. Write a program to check whether a student has passed or failed.

Passing marks = 40

---

### Q3. Check whether a number is positive or negative.

---

### Q4. Check whether a person can enter an amusement park.

Minimum height = 140 cm

---

### Q5. Compare two numbers and print the greater number.

---

# Assignment 3: The `else-if` Ladder

### Q1. Write a Java program to calculate grades.

| Marks    | Grade |
| -------- | ----- |
| 90-100   | A     |
| 75-89    | B     |
| 60-74    | C     |
| 40-59    | D     |
| Below 40 | Fail  |

---

### Q2. Create a program that classifies a person's age.

| Age   | Category       |
| ----- | -------------- |
| 0-12  | Child          |
| 13-19 | Teenager       |
| 20-59 | Adult          |
| 60+   | Senior Citizen |

---

### Q3. Create a salary bonus calculator.

| Salary        | Bonus    |
| ------------- | -------- |
| Above ₹100000 | 20%      |
| Above ₹50000  | 10%      |
| Above ₹25000  | 5%       |
| Otherwise     | No Bonus |

---

### Q4. Build a weather application.

Input temperature.

| Temperature | Output   |
| ----------- | -------- |
| >35         | Very Hot |
| 25-35       | Pleasant |
| 15-24       | Cool     |
| Below 15    | Cold     |

---

### Q5. Build a BMI category checker.

| BMI       | Category    |
| --------- | ----------- |
| <18.5     | Underweight |
| 18.5-24.9 | Normal      |
| 25-29.9   | Overweight  |
| 30+       | Obese       |

---

# Assignment 4: The `switch` Statement

### Q1. Create a program to print the day of the week.

| Input | Output  |
| ----- | ------- |
| 1     | Monday  |
| 2     | Tuesday |
| ...   | ...     |
| 7     | Sunday  |

---

### Q2. Create a simple calculator.

Operations:

* *
* *
* *
* /

Take two numbers and an operator from the user.

---

### Q3. Print the month name.

Example

```text
Input

4

Output

April
```

---

### Q4. Create a menu-driven restaurant ordering system.

Menu

```text
1. Pizza
2. Burger
3. Pasta
4. Cold Drink
```

Display the selected item.

---

### Q5. Print the season based on month number.

Example

```text
12
1
2

Winter
```

---

# Mixed Practice Questions (Interview Level)

### Q1.

Find the largest among three numbers.

---

### Q2.

Check whether a year is a leap year.

---

### Q3.

Check whether a character is:

* Vowel
* Consonant

---

### Q4.

Check whether a number is:

* Positive
* Negative
* Zero

---

### Q5.

Create a login system.

Correct credentials:

```text
Username: admin

Password: java123
```

Print:

```text
Login Successful
```

or

```text
Invalid Credentials
```

---

### Q6.

Create a simple ATM menu using `switch`.

```text
1. Check Balance

2. Withdraw

3. Deposit

4. Exit
```

Display the selected option.

---

### Q7.

Electricity Bill Calculator

| Units     | Rate |
| --------- | ---- |
| 0-100     | ₹5   |
| 101-200   | ₹7   |
| Above 200 | ₹10  |

Calculate the total bill.

---

### Q8.

Movie Ticket Pricing

| Age     | Ticket Price |
| ------- | ------------ |
| Below 5 | Free         |
| 5-17    | ₹100         |
| 18-59   | ₹200         |
| 60+     | ₹120         |

---

### Q9.

Check whether a year is:

* Century Year
* Leap Year
* Normal Year

---

### Q10.

Build a mini student grading system.

Input:

* Name
* Marks

Output:

* Grade
* Pass/Fail
* Scholarship Eligible (Marks ≥ 90)

---

# Challenge Assignment

Create a **Student Result Management System** using everything you've learned.

The program should:

* Take the student's name.
* Take marks in **5 subjects**.
* Calculate the total marks.
* Calculate the percentage.
* Assign a grade using an `else-if` ladder.
* Print **Pass** or **Fail**.
* Display a menu using a `switch` statement:

  1. View Result
  2. View Grade
  3. View Percentage
  4. Exit
