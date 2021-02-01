# Delivery App

https://artur-candelori-delivery.herokuapp.com/

Backend application built in Java with Spring Boot.
RESTful API providing endpoints for a food delivery app.

## Endpoints:

- Lists all products in alphabetical order, from oldest to newest:
  - GET /products

- Lists all orders with "pending" status, from oldest to newest:
  - GET /orders

- Lists all products in alphabetical order:
  - POST /orders
  - Example body:
    - {
        "address": "Avenida Paulista, 1500",
        "latitude": "-23.56168",
        "longitude": "-46.656139",
        "products": [
          {
            "id": 1
          }
        ]
      }
  
- Changes order status to "delivered":
  - PUT /orders/{id}/delivered
