# Application: cOdin Quiz App
The platform allows running of interactive Q&A games or quizzes during live events, such as courses, presentations or labs. It consists in a distributed mobile application and a web component. It allows administration of two types of accounts, namely students and professors. 

Creational Patterns:
•	Builder – for the creation of users, as the user class has a minimum required set of attributes such as email, name and password, as well as optional attributes such as group, profile picture, educational establishment, etc. 
•	Factory – for the creation of questions, whether single/multiple choice or open answer, without exposing the creation logic to the user and referring the created objects through a common interface
•	Prototype – for the creation of tests, as they are created after costly database operations arising from REST requests, and the structure of a test may be cached and cloned

Structural Patterns:
•	Proxy – to establish which user interfaces and actions each user has access to based on their quality of student or teacher
•	Composite – to manage the storage of subjects, tests, questions and answers as a hierarchy of quiz components
•	Decorator – used for the questions, to attribute them extra points, feedback as to which answer was correct and auxiliary media such as images

Behavioral Patterns:
•	Observer – when a student finishes a test (observable), the list of tests taken by that student is updated, the teacher receives the result in a catalog and the score is sent by email to the student
•	State – the teacher decides the grading system for a test (if partial points are awarded or not) by setting the value of the scoring attribute of each test; based on the state of the test, the mark is computed taking into account partial correct answers or complete answers
•	Memento – to save and restore different versions of tests, considering teachers can change allowed time, shuffle questions, add or remove questions
