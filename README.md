# Hospital Management System in Java

A console-based academic project applying data structures to patient records, emergency prioritization, treatment histories and doctor lookup.

## Components

| Component | Data structure | Purpose |
| --- | --- | --- |
| Patient records | Singly linked list | Add, update, remove and display patients |
| Emergency queue | PriorityQueue | Treat the lowest numerical severity value first |
| Treatment history | Stack | Add treatments and retrieve the latest entry |
| Doctor assignments | HashMap | Store and retrieve doctors by ID |

## Run

Requires a JDK with `javac` and `java` available.

```bash
mkdir -p build
javac -d build src/*.java
java -cp build Main
```

The `Main` class demonstrates all four components. See [sample-output.txt](docs/sample-output.txt).

## Validation

The extracted sources compiled and the `Main` demonstration executed successfully with OpenJDK 21. The run exercised patient listing, severity-based treatment, latest-treatment retrieval and doctor listing.

## Scope and preparation notes

- An educational, in-memory demonstration; no database, graphical interface, authentication or clinical deployment.
- Java classes were recovered from the submitted PDF and split into individual source files.
- One missing closing brace in `EmergencyQueue.addPatient` was restored to make the extracted code compile.
- Demonstration contact numbers in the extracted source were replaced with placeholders.
- The queue orders by severity only; equal-severity FIFO ordering is not implemented. `displayQueue` does not guarantee priority-sorted display.
- The demo uses one treatment stack; it does not maintain a separate stack for every patient.

## Team and attribution

Academic group project by **Ghadi Abdullah Alqahtani**, **Joud Bashammakh**, and **Shuruq Alotaibi**. Ghadi served as team leader, coordinating work and reviewing deliverables.

## Report

See [project-report.pdf](docs/project-report.pdf). This portfolio copy omits the assignment cover and instruction pages. Demonstration contact values have been masked where present in extractable text. Original references, diagrams and report content are retained.
