# Scala Implicit Constructor Parameter Bug

This repository demonstrates a subtle bug related to implicit constructor parameters and default values in Scala.  The issue arises when a class defines both a primary constructor with parameters and an auxiliary constructor that uses the primary constructor with default values.  Under certain circumstances, the intended default value might not be correctly applied.

## Bug Description

The `MyClass` class is designed to have a default value of 0 for the `x` parameter. However, the current implementation can lead to unexpected results due to how the implicit constructor parameter is used.

## Reproduction

1. Compile the code in `MyClass.scala`.
2. Create an instance of `MyClass` without providing an argument.  The expected value for `x` is 0.
3. Observe the behavior, the actual value for `x` might be unexpected, not 0.

## Solution

The solution involves correctly handling the default value within the auxiliary constructor to ensure the implicit parameter is correctly initialized.