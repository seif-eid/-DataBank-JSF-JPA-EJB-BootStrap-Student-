For This Project, ACME Corp. has tasked you to improve the Student Directory web application you developed back in the previous project.
Specifically, the company wants you to:
1. Use Java Persistence API (JPA) to access the database and provide the required CRUD capabilities (instead of directly using JDBC)
2. Use Bootstrap CSS framework to layout and style the Student Directory web application as a Single Page Application (SPA)  The main page of the improved web application is shown below. 

The main page shows the list of students already on the database. 
![image](https://github.com/seifeldin123/-DataBank-JSF-JPA-EJB-BootStrap-Student-/assets/133134492/f5f74ff7-fcf5-4683-a2aa-321e9fdf2ab0)

Clicking the “Add New Student” button on the main page would show the Add New Student form while staying on the same page: 
![image](https://github.com/seifeldin123/-DataBank-JSF-JPA-EJB-BootStrap-Student-/assets/133134492/aaa2e558-34ae-4495-87c3-d9c2766e3e2f)

Clicking the “Submit” button (after entering all the necessary information) or “Cancel” button will just hide the Add New Student form and add the new student to the table (if applicable).
Note that if the user didn’t provide all the necessary information in the correct format, validation error messages will be displayed as shown below: 
![image](https://github.com/seifeldin123/-DataBank-JSF-JPA-EJB-BootStrap-Student-/assets/133134492/b49eb309-e0ef-400b-a4ce-c0fa42c43a3e)

Clicking the “Edit” button on the main page should enable the fields on the corresponding row for editing as shown below: 
![image](https://github.com/seifeldin123/-DataBank-JSF-JPA-EJB-BootStrap-Student-/assets/133134492/1781ec98-16ec-4ab9-832d-f458cdad36e6)

Similar to the add scenario, if the user didn’t provide all the necessary information in the correct format, validation error message will be displayed as shown below: 
![image](https://github.com/seifeldin123/-DataBank-JSF-JPA-EJB-BootStrap-Student-/assets/133134492/4cd553d3-766c-43cc-bea2-10ea8f3e8b0d)

Clicking the “Cancel” button while editing will cancel the update operation and will just make the fields on the corresponding row back to being read-only with their original values. 

Clicking the “Delete” button on the main page should trigger a pop-up to confirm if the user wants to proceed with deleting the selected student.  Clicking OK on the pop-up should remove the selected student from the database as well as from the list of students shown on the main page.  Clicking the “Cancel” button should simply cancel the delete operation. 
![image](https://github.com/seifeldin123/-DataBank-JSF-JPA-EJB-BootStrap-Student-/assets/133134492/b9b658d7-6afd-4ce6-972a-a67a008204e3)

Finally, if the user is trying to update a student that has already been updated by another user (e.g. from a different browser accessing the same web application) OR if the user is trying to update a student that has already been deleted by another user (e.g. from a different browser accessing the same web application), userfriendly error messages should be displayed as can be seen on the 2 screen shots below: 

![image](https://github.com/seifeldin123/-DataBank-JSF-JPA-EJB-BootStrap-Student-/assets/133134492/2fc90707-0334-412a-8618-36b337d21be2)

User is trying to update a student that has already been updated by another user
![image](https://github.com/seifeldin123/-DataBank-JSF-JPA-EJB-BootStrap-Student-/assets/133134492/a46b7796-7198-41b3-9acc-c454f9fcb997)

After completing this project, 
I will have achieved the following: 
1. Use JSF in conjunction with new EE components:  EJBs and JPA
2. Create a model class for JPA with all appropriate mappings/annotations
3. Use a JSF @ViewScoped managed bean
4. Add validation to JSF views
5. Use Bootstrap CSS framework to layout and style the Student Directory application as a SPA 
