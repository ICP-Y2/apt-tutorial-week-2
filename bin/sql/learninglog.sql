-- Create and Use Database
CREATE DATABASE IF NOT EXISTS "learning_logs";
USE "learning_logs";

-- Drop existing tables for a clean install
DROP TABLE IF EXISTS "entries";
DROP TABLE IF EXISTS "topics";

-- Topics table
CREATE TABLE "topics" (
  "id" int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  "name" varchar(100) NOT NULL,
  "created_at" timestamp DEFAULT CURRENT_TIMESTAMP,
  "updated_at" timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- Entries table
CREATE TABLE "entries" (
  "id" int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  "topic_id" int(11) NOT NULL,
  "text" text NOT NULL,
  "created_at" timestamp DEFAULT CURRENT_TIMESTAMP,
  "updated_at" timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  FOREIGN KEY ("topic_id") REFERENCES "topics"("id") ON DELETE CASCADE
);