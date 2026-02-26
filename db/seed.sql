USE learning_logs;

-- Insert into topics
INSERT INTO topics (name) VALUES 
('Python'),
('Web Development'),
('Data Science'),
('Machine Learning'),
('Cybersecurity');

-- Insert into entries
INSERT INTO entries (topic_id, text) VALUES 
(1, 'Python is a versatile language used for automation and web apps.'),
(1, 'Learning about list comprehensions makes code much cleaner.'),
(2, 'HTML, CSS, and JS are the holy trinity of front-end development.'),
(2, 'React is a powerful library for building interactive user interfaces.'),
(3, 'Data visualization is key to communicating complex insights.'),
(3, 'Pandas is the go-to library for data manipulation in Python.'),
(4, 'Supervised learning requires labeled datasets for training.'),
(4, 'Neural networks are inspired by the structure of the human brain.'),
(5, 'Encryption is essential for protecting sensitive user data.'),
(5, 'Always keep your software updated to patch known vulnerabilities.');