package com.learninglogs.dao;

import java.sql.*;
import java.util.ArrayList;

import com.learninglogs.interfaces.TopicDAOInterface;
import com.learninglogs.model.Topic;
import com.learninglogs.util.DatabaseConnection;

public class TopicDAO implements TopicDAOInterface {

    // TODO: Insert a new topic into the database
    // - Get database connection
    // - Prepare INSERT statement with name
    // - Execute update
    // - Retrieve generated ID and set it to Topic object
    // - Return true if successful
    @Override
    public boolean insertTopic(Topic topic) {
        return false;
    }

    // TODO: Fetch all topics from the database
    // - Get database connection
    // - Execute SELECT * FROM topics
    // - Convert each ResultSet row into Topic object
    // - Store in ArrayList and return
    @Override
    public ArrayList<Topic> fetchAllTopics() {
        return new ArrayList<>();
    }
}