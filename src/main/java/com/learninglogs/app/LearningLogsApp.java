package com.learninglogs.app;

import java.util.ArrayList;
import java.util.Scanner;

import com.learninglogs.dao.TopicDAO;
import com.learninglogs.model.Topic;

public class LearningLogsApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TopicDAO topicDAO = new TopicDAO();

        while (true) {
            System.out.println("\n=== Learning Logs (Topics) Menu ===");
            System.out.println("1. Add a new topic");
            System.out.println("2. View all topics");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Topic Name: ");
                    String name = scanner.nextLine();

                    Topic topic = new Topic(name);
                    boolean success = topicDAO.insertTopic(topic);

                    if (success) {
                        System.out.println("Topic added successfully! ID: " + topic.getId());
                    } else {
                        System.out.println("Failed to add topic.");
                    }
                    break;

                case 2:
                    ArrayList<Topic> topics = topicDAO.fetchAllTopics();

                    if (topics.isEmpty()) {
                        System.out.println("No topics found.");
                    } else {
                        System.out.println("\n--- All Topics ---");
                        for (Topic t : topics) {
                            System.out.println(
                                    "ID: " + t.getId() +
                                    ", Name: " + t.getName() +
                                    ", Created: " + t.getCreatedAt() +
                                    ", Updated: " + t.getUpdatedAt()
                            );
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting application. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}