package com.learninglogs.interfaces;

import java.util.ArrayList;

import com.learninglogs.model.Topic;

public interface TopicDAOInterface {
    //Enter learning entry (TODO): Insert topic into database
    boolean insertTopic(Topic topic);

    //Enter learning entry (TODO): Fetch all topics
    ArrayList<Topic> fetchAllTopics();
}
