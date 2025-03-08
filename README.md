# 🛍️ Product Management API - Spring Boot

Welcome to the **Product Management API**, a API built with **Spring Boot**. This API allows seamless management of products in a database, providing efficient **CRUD operations** and following best development practices.

## 📌 Overview
This API is designed to help businesses and developers manage product records with ease. With a clean and intuitive structure, it offers:
- **Product registration** with essential details.
- **Listing all products** stored in the database.
- **Searching for a specific product** using a unique identifier.
- **Updating product information** to ensure data consistency.
- **Deleting products** that are no longer needed.

## 🚀 How It Works
1. **Clients send HTTP requests** to interact with the API.
2. **The API processes the requests** using Spring Boot and JPA.
3. **The database stores and retrieves product information** as needed.
4. **The API returns responses** confirming success or failure.

## 📖 Endpoints
- `GET /api/products` → Retrieve all products.
- `POST /api/products` → Register a new product.
- `GET /api/products/{id}` → Fetch a product by ID.
- `PUT /api/products` → Update an existing product.
- `DELETE /api/products/{id}` → Remove a product.
