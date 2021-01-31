# Introduction 

Have you ever gotten frustrated trying to find out what’s in your food? Counting calories can be difficult and knowing what’s in your food can be daunting. Smart Nutrition made it easy to look up nutrition facts and track your calorie intake all in one app. 

Smart Nutrition can help you: 
- Letting you quickly search for nutrition facts of a specific item 
- Get information on this item from calories, protein, carbs and more 
- Calculate calories in your food 
- Easily track all your consumptions 

 

# [Storyboard](https://nickphamrider767120.invisionapp.com/prototype/ckkkji7vo0062wu01k68l8mo5/play) 


![Storyboard](/StoryBoard.png)

# Storyboard Interaction 
- Clickable buttons to navigate menus

 

# Functional Requirements 

# Requirement 100: Search for Nutrition Facts 

**Scenario** 

As a user interested in food, I want to be able to search for food nutrition facts based on the name. 

**Dependencies** 

Food search data are available and accessible. 

**Assumptions** 

Food Names are stated in English. 

 

**Examples** 

Given a feed of food name is available 

When I search for “Granola”  

Then Nutritional information for “Granola” will show up for you to add to your calorie count 

 

# Requirement 101: Track Exercise 

**Scenario** 

As a user I want to track my exercise and keep track of my calories burned during an exercise period 

**Dependencies** 

Average calorie burns for different exercises. 

**Assumptions** 

User chooses from a list of exercises 

**Examples**  

Given: a list of exercises 

When: I select “running” and select “1 mile” 

Then: Calories burned will be calculated and added to calorie burn count for that day 

 

 

# Class Diagram 
![Class Diagram](/ClassDiagram.jpg)
 

# Class Diagram Description 

**MainActivity:** The first screen the user sees. This will have a list of food, and an option to enter a new food to search or exercise. 

**RetrofitInstance:** Bootstrap class required for Retrofit 

**SelectFoodActivity:** Screen that allows searching and selecting of food to see calorie counts and nutrition information 

**SelectExerciseActivity:** Screen the allows seaching and selecting of exercises and how long you did them to calculate calorie burn 

**Food:** Noun class that represents food 

**Exercise:** Noun class that represents different exercises 

**IFoodDAO:** Interface for Retrofit 

**IExerciseDAO:** Interface for Retrofit 



# Scrum Roles 

**Product Owner:** Ibukun Daniel 

**UI specialist:** Kris Furterer 

**Integration Specialist:** Ben Miller 

**Developer:** Tony Dang 

 

# Weekly Stand Up Meeting 

Via Teams on Thursday 2:30 pm 

Click [here](https://teams.microsoft.com/l/meetup-join/19%3ameeting_N2UyYjAzYTItMTU5OS00NTQ3LWE0OGQtMjIwZGU3MzQ5MGVk%40thread.v2/0?context=%7b%22Tid%22%3a%22f5222e6c-5fc6-48eb-8f03-73db18203b63%22%2c%22Oid%22%3a%229cee4936-3c7b-4bfa-a92c-d2e45e8db334%22%7d) for link to meeting 
