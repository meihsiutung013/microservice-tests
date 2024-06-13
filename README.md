# Spring Boot 3 Test Application: without Spring Security


## Endpoints

| Method | Route            | Access      | Description                                    |
|--------|------------------|-------------|------------------------------------------------|
| GET    | /api/tests/all   | Unprotected | Access for everyone                            |
| GET    | /api/tests/admin | Protected   | Access only for admin users                    |
| GET    | /api/tests/user  | Protected   | Access for authenticated users and admin users |