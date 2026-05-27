# Unit 3 Project — ZooKeeper

For this project, you will be creating an app that is meant to help manage a zoo. There is some skeleton code attached to this assignment that you can use to get started.

The goal of this assignment is to demonstrate your understanding of Unit 3 concepts, including:

- Writing your own classes
- Using constructors
- Creating and using instance variables
- Using static (class) variables
- Writing methods that return values
- Passing objects as parameters
- Encapsulation (private variables with getters/setters)
- Writing meaningful `toString()` methods

---

# Classes You Will Create

You will be creating 3 inter-related classes called:

- `Zoo`
- `Cage`
- `Animal`

Below are descriptions of each class.

---

# 🏛️ Zoo

A `Zoo` represents an entire zoo. Each zoo contains exactly three cages.

Your `Zoo` class will:

- Store three `Cage` objects as private instance variables
- Be able to report how many `Animal` objects have been created overall
- Allow animals to be placed into cages only if the cage belongs to that zoo
- Provide a readable summary of the zoo using `toString()`

---

# 🧱 Cage

A `Cage` holds one animal at a time.

Your `Cage` class will:

- Store a single `Animal`
- Be able to create a cage with either:
  - a random animal, or
  - a specific animal passed in
- Allow the animal to be changed
- Describe itself clearly using `toString()`

---

# 🐘 Animal

An `Animal` represents a single animal in the zoo.

Your `Animal` class will:

- Store the animal’s type as a `String`
  - Example: `"Lion"`, `"Bear"`
- Keep track of how many `Animal` objects have been created using a static variable
- Be able to:
  - make a sound (`speak`)
  - return its sound backwards (`speakBackward`)
- Support both:
  - random animal creation, and
  - creation with a specified type
- Include getters, setters, and a helpful `toString()`

---

# UML Diagram

*(Insert UML diagram image here)*

---

# Grading Rubric (100 Points Total)

# 🏛️ Zoo Class (35 points total — 7 points each)

| # | Requirement | Points |
|---|---|---|
| 1 | Three private instance variables of type `Cage` declared (not instantiated inline) | 7 |
| 2 | No-argument constructor instantiates all cages; each cage starts with a random `Animal` | 7 |
| 3 | Overloaded constructor(s) demonstrating constructor overloading | 7 |
| 4 | `howManyAnimals()` correctly returns the total number of `Animal` objects ever created using class-level data | 7 |
| 5 | `putAnimalInCage(Cage, Animal)` correctly replaces the animal only if the cage belongs to this `Zoo` and returns a boolean | 7 |

---

# 🧱 Cage Class (35 points total — 7 points each)

| # | Requirement | Points |
|---|---|---|
| 6 | One private instance variable of type `Animal` | 7 |
| 7 | No-argument constructor creates a cage with a random `Animal` | 7 |
| 8 | Constructor with `Animal` parameter correctly places that animal in the cage | 7 |
| 9 | Proper getter and setter for the `Animal` field, using `this` where appropriate | 7 |
| 10 | `toString()` returns a friendly description that includes the animal’s `toString()` | 7 |

---

# 🐘 Animal Class (30 points total)

| # | Requirement | Points |
|---|---|---|
| 11 | One private instance variable `animalType` of type `String` | 5 |
| 12 | Static counter correctly tracks how many `Animal` objects have been instantiated | 5 |
| 13 | Constructors: no-arg (random type) and parameterized | 5 |
| 14 | Proper getter and setter for `animalType` | 5 |
| 15 | `speak()` returns an appropriate sound based on `animalType` | 5 |
| 16 | `speakBackward()` returns the reversed result of `speak()` | 5 |

---

# Testing Your Code

Your code should also include a `main` method in the `Zoo` class that tests all or most of the functionality described above.

This is **not part of the grade**, but it is something you should always do in order to test and debug your code.

---

# Submission Instructions

To submit this project:

1. Create a public GitHub repository named:

```text
unit-3-zookeeper
```

2. Push all of your `.java` files to the repository.

3. Submit the GitHub repository link according to your teacher’s instructions.
