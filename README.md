# Product Management API

A RESTful API built with Spring Boot for product data management, providing CRUD operations through a standardized interface.

## Overview

The Product Management API facilitates the management of product records through REST endpoints. The system supports product data operations while maintaining data consistency.

### Functionality

- Product registration with essential details
- Listing all products stored in the database
- Searching for specific products using unique identifiers
- Updating product information
- Deleting products from the system

## System Flow

1. Clients send HTTP requests to interact with the API
2. The API processes requests using Spring Boot and JPA
3. The database stores and retrieves product information
4. The API returns responses confirming success or failure

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| `GET` | `/api/products` | Retrieve all products |
| `POST` | `/api/products` | Register a new product |
| `GET` | `/api/products/{id}` | Fetch a product by ID |
| `PUT` | `/api/products` | Update an existing product |
| `DELETE` | `/api/products/{id}` | Remove a product |
