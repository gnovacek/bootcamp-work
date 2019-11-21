# Creating APIs Exercise

In this exercise you are going to take a shopping list exercise and build your own API.  

## Building your own API

In this exercise you are going to be responsible for building an API that Postman can use to retrieve a list of groceries. You are going to be building an API that is just like this [mockAPI](http://5c53275ea659410014eeea14.mockapi.io/api/groceries).

In this directory you will find the starting code for both Java & .NET

* Java: `/shopping-api-java`
* .NET: `/shopping-api-dotnet`

Everything you need to build your API is in these projects. There is a data access layer that uses an in memory representation of a shopping list item. What you will need to do is build out the controller and that controller can use the data access layer (DAOs) to perform CRUD operations on the list of groceries. 

### Requirements

* The endpoint for your API should be /api/groceries
* You should have at least 10 items in your list of groceries when the application loads.
* UPDATE should toggle the completed status of the item.
