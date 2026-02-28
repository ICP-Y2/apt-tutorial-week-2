# APT-Tutorial-Week-2  
## Learning Logs – Tutorial 2  
### (Terminal + DAO + MySQL)

In Tutorial 1, topics were stored only in Java collections (in memory).  
This means once the application was closed, all data was permanently lost.  
There was no persistence, no real database, and no proper data management structure.

Because of this limitation:

- Data did not survive application restart  
- The system could not scale  
- It did not reflect how real-world applications store data  

In Tutorial 2, we solve this problem by moving the application to a **MySQL database** and implementing the **DAO pattern**.

Now:

- Data is permanently stored  
- Topics remain available even after restarting the application  
- The project follows a more realistic software architecture  
---

## Objective

Convert the Learning Logs application to use:

- MySQL database  
- JDBC  
- DAO architecture  
- Maven for build & execution  

This tutorial focuses working on **Topics only**.



---

## Tasks to Complete

### Task 1: Setup the Database

1. Install and start Xampp. Download from [**here**](https://www.apachefriends.org/download.html) .
2. Open phpMyAdmin and import the following files in db folder.

- `sql/learnninglogs.sql`
- `sql/seed.sql`

**DATABASE SETUP:** Please read [**README.MD**](./db/README.md) in the **db** folder.
  
This will:
- Create the `topics` table
- Insert initial sample data (if provided)

---

### Task 2: Implement TopicDAO

Implement the following methods inside `TopicDAO`:

- `insertTopic(Topic topic)`
- `fetchAllTopics()`

Your application must now:

- Add topics into MySQL
- Retrieve topics from MySQL
- No longer use Java collections for storage

---

## Constraints

- Terminal-based program only  
- Must use MySQL  
- Must use JDBC  
- Must follow DAO pattern  
- No frameworks (no Spring, no Hibernate)  
- Keep code simple and readable  

---

## Some Test Cases (Topics – Database Based)

These test cases help verify that data is actually stored in the database.

| TC | Description | Input | Expected Result |
|----|------------|-------|----------------|
| 1 | Add a single topic | Programming | Topic inserted into DB and displayed when viewing |
| 2 | Add multiple topics | Java, MySQL | Both appear when fetching all topics |
| 3 | View topics after restarting app | Restart app → View Topics | Previously added topics still exist (proves DB persistence) |
| 4 | View topics when DB is empty | View Topics | Message shown: No topics available |
| 5 | Add topic with empty name | Press Enter | Topic is not inserted |
| 6 | Verify auto-generated ID | Add topic | ID is generated automatically by database |

---

## SQL Files

Inside the `sql` folder:

- `learninglogs.sql` → Creates database and `topics` table  
- `seed.sql` → Inserts sample topics (optional)

Run inside MySQL:

```sql
source db/learninglogs.sql;
source db/seed.sql;
```


---

## What You Learn in This Tutorial

- Connecting Java to MySQL  
- Using `PreparedStatement`  
- Retrieving auto-generated keys  
- Persisting data permanently  
- Implementing DAO cleanly  
- Understanding the difference between memory storage and database storage  

---
