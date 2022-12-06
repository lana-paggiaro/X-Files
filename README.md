# Customer and Product API
Made by Luanna Sachinelli Paggiaro ([Lua-da-tarde](https://github.com/Lua-da-tarde) on GitHub).

## Attributes
Aliens      | Customer
:----------:|:---------:
code        | name
type        | ssc (social security number)
price       | codec (code customer)
description | email

## Product Methods (Aliens)
* **Insert alien** - localhost:8080/apiAlien/insertAlien
* **Update alien** - localhost:8080/apiAlien/updateAlien
* **Delete alien** - localhost:8080/apiAlien/deleteAlien
* **Search all aliens** - localhost:8080/apiAlien/allAliens
* **Search aliens by code (complete)** - localhost:8080/apiAlien/searchCode/{code}
* **Search aliens by type (complete)** - localhost:8080/apiAlien/searchType/{type}
* **Search aliens by type (just the initials)** - localhost:8080/apiAlien/initialType/{type}
* **Search aliens by description (complete)** - localhost:8080/apiAlien/searchDescription/{description}
* **Search aliens by description (initials)** - localhost:8080/apiAlien/initialDescription/{description}
* **Search aliens by price (complete)** - localhost:8080/apiAlien/searchPrice/{price}
* **Search aliens by prices higher than the input** - localhost:8080/apiAlien/majorPrice/{price}
* **Search aliens by prices lower than the input** - localhost:8080/apiAlien/minorPrice/{price}
* **Search aliens by description (initials) and type (initials)** - localhost:8080/apiAlien/description/{description}/type/{type}
* **Search aliens by description (initials) and price** - localhost:8080/apiAlien/description/{description}/price/{price}

## Customer Methods
* **Insert customer** - localhost:8080/apiCustomer/insertCustomer
* **Update customer** - localhost:8080/apiCustomer/updateCustomer
* **Delete customer** - localhost:8080/apiCustomer/deleteCustomer
* **Search all customers** - localhost:8080/apiCustomer/allCustomers
* **Search customers by name (complete)** - localhost:8080/apiCustomer/searchName/{name}
* **Search customers by name (initials)** - localhost:8080/apiCustomer/initialName/{name}
* **Search customers by email (complete)** - localhost:8080/apiCustomer/searchEmail/{email}
* **Search customers by email (intials)** - localhost:8080/apiCustomer/initialEmail/{email}
* **Search customers by code (complete)** - localhost:8080/apiCustomer/searchCode/{codec}
* **Search customers by codes higher than the input** - localhost:8080/apiCustomer/majorCode/{codec}
* **Search customers by name (initials) and email (initials)** - localhost:8080/apiCustomer/name/{name}/email/{email}
