# Java: Lambdas and Streams
This is the repository for the LinkedIn Learning course Java: Lambdas and Streams. The full course is available from [LinkedIn Learning][lil-course-url].

![Java: Lambdas and Streams][lil-thumbnail-url] 

In JavaScript, lambdas and streams are everywhere—near ubiquitous, it would seem. They’re two of the most commonly used examples of functional programming, which tends to be more concise and predictable than its object-oriented counterpart. In this course, instructor Bethan Palmer teaches you the skills you need to get the most out of lambdas and streams as a Java developer.

Explore the basics of lambdas and streams, what they are, why they’re so useful, and how to put them into practice in your code with hands-on exercises on GitHub. Get tips for referring to existing methods and defining new functions on the fly. Upon completing this course, you’ll be ready to find out more about how to convert sequential processing tasks into parallel computations and start using lambdas and streams in your stacks today.

## Instructions
This repository has branches for each of the videos in the course. You can use the branch pop up menu in github to switch to a specific branch and take a look at the course at that stage, or you can add `/tree/BRANCH_NAME` to the URL to go to the branch you want to access.

## Branches
The branches are structured to correspond to the videos in the course. The naming convention is `CHAPTER#_MOVIE#`. As an example, the branch named `02_03` corresponds to the second chapter and the third video in that chapter. 
Some branches will have a beginning and an end state. These are marked with the letters `b` for "beginning" and `e` for "end". The `b` branch contains the code as it is at the beginning of the movie. The `e` branch contains the code as it is at the end of the movie. The `main` branch holds the final state of the code when in the course.

When switching from one exercise files branch to the next after making changes to the files, you may get a message like this:

    error: Your local changes to the following files would be overwritten by checkout:        [files]
    Please commit your changes or stash them before you switch branches.
    Aborting

To resolve this issue:
	
    Add changes to git using this command: git add .
	Commit changes using this command: git commit -m "some message"

## Installing
1. To use these exercise files, you must have the following installed:
    - Java 8 or above
2. Clone this repository into your local machine using the terminal (Mac), CMD (Windows), or a GUI tool like SourceTree.
3. To run the tests in the exercises, either run them directly in your IDE or from terminal on Mac or CMD on Windows. 
4. If running the tests from the terminal or CMD, navigate to the directory where you checked out the code. The command to run the tests is:
   - `./mvnw clean install` on Mac
   - `./mvnw.cmd clean install` on Windows


### Instructor

Bethan Palmer 
                            
Software Developer

                            

Check out my other courses on [LinkedIn Learning](https://www.linkedin.com/learning/instructors/bethan-palmer).

[lil-course-url]: https://www.linkedin.com/learning/java-lambdas-and-streams
[lil-thumbnail-url]: https://cdn.lynda.com/course/2453107/2453107-1646414094236-16x9.jpg





