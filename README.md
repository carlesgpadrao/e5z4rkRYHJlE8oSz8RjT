# Java 8 - Optional Challenge

A long time ago in the Java galaxy...

## Episode 1 - Optional, a new hope

Dear developer, we need your help fighting the evil Lord NullPointerException, that is messing with the Java rebel forces causing our attacks fail unpredictably. 

A new hope was born with the Java 8 release that might be the final weapon against the Empire, called the Optional. Sadly the rebel communications about how to use it were lost, so we need to provide support to our brothers.

Please, follow the instructions and help us defeat the evil that has spread through the Java galaxy and bring a new hope to our universe. Remember that the Force is very powerful, but even more powerful are tests, so write all the tests you consider necessary.

May the force be with you...

## Instructions

### Our first attack using Optional

Our first opportunity will be in the Outer rim, near the Tatooine planet, where the Empire is testing their new weapon, codename "Death Star".

Last battles ended in defeat, due to mysterious errors between our fleets. It seems that the evil Lord NullPointerException is interfering when we communicate with one of our spaceships.

Debug what are these mysterious errors and use the Optional to get us to our first victory against the Empire. You can change what you consider necessary, except the classes inside the internal package, to lead us to victory today and in the future. Make sure that these mysterious errors never happen again. 

### Exceptional, the ultimate weapon

The Optional weapon was a big step forward, but one of our Jedi Devs says that we can do it even better and we should create our own Optional (in the end we are devs ;) ), called the `Exceptional` with even more powerful features.

Create a custom implementation of the Optional class with the following features:
- The Exceptional should be a custom implementation of the optional, so it should have the same methods and behaviors, unless the next requirements specify differently or makes no sense maintaining the old Optional behavior. Check the [Optional Javadoc](https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html) for more information
- All methods with a lambda parameter should allow lambdas that may throw checked exceptions.
- A new method called `exceptionally` allows you to specify a function to recover from an exception if it was thrown in any past stage.
  ```java
  public Exceptional<T> exceptionally(Function<Throwable, ? extends T> fn) {
    ...
  }
  ```
- A new method called `handle` allows you to specify a function that receives the optional object and a possible thrown exception and return a new Optional.
  ```java
  public Exceptional<U> handle(BiFunction<? super T,Throwable,? extends U> fn) {
    ...
  }
  ```
  
### Exceptional in Action

Use the Exceptional in the Battle of the Outer Rim to see it in action. Check the advantages and disadvantages of our custom implementation. You can leave us a comment with your conclusions.

## How to run
To run the application you just have to use the Gradle Wrapper. 
With it, you could just build and run it:
```bash
./gradlew clean build run
```

Executing this command you would see a `NullPointerException` or the Rebels saving the Galaxy. 

Good luck :)

---

## How to submit your solution

* Push your code to the `devel` branch - we encourage you to commit regularly to show your thinking process was.
* **Create a new Pull Request** to `main` branch & **merge it**.

Once merged you **won't be able to change or add** anything to your solution, so double-check that everything is as
you expected!

Remember that **there is no countdown**, so take your time and implement a solution that you are proud!

TESTING

More testing
