# SpringMeal_Back
Repository dedicated for the Back end part of our final project

## Descripción del proyecto
API REST completa,   con   Spring Framework, 
En ella se administran las peticiones CRUD de de los usuarios para realizar reservas de comidas.

## Tecnologias usadas
- Java 8
- Maven
- SpringBoot
- H2
- JPA


## Diagrama E-R

![Diagrama SpringMeal](https://user-images.githubusercontent.com/100615218/235084462-223dc358-41f2-4a26-99c8-3c9621b79f6e.png)

## Postman

# Project: SPRINGMEAL
# 📁 Collection: JWT_ROLES 


## End-point: UPDATE_USER_ROLE
### Method: PUT
>```
>{{springmeal_host}}/api/roles/user/5
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImlhdCI6MTY4MzczODYyNiwiZXhwIjoxNjgzODI1MDI2fQ.2aF1KRgzGB9-CaVd70gYEuWGOFHF0OodBZ21oXKyiMFulk7H5nIgIwt8TsztbfeZNyskrMVVAMq1Qw7Uyu_8hA|string|


### Response: 200
```json
User set to Admin
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_ALL
### Method: GET
>```
>{{springmeal_host}}/api/roles
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJKb2FuTCIsImlhdCI6MTY4Mzc5NzQzNiwiZXhwIjoxNjgzODgzODM2fQ.M7kq3Yvb8udbfHM5oOr_Crss-ZdVg5G5p97Whph0G11y0ZZN8qlqpAvs9l9lXKx7Ze2WCDWJWgCTNGAmfYz0EA|string|


### Response: 200
```json
[
    {
        "id": 1,
        "name": "ROLE_admin"
    },
    {
        "id": 2,
        "name": "ROLE_user"
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: CREATE
### Method: POST
>```
>{{springmeal_host}}/api/roles
>```
### Body (**raw**)

```json
    {
        "name": "ROLE_manager"
    }
```

### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJMYXVyZWxpbmRvcmVhbiIsImlhdCI6MTY4Mzg4Njg2NSwiZXhwIjoxNjgzOTczMjY1fQ.gNaVePvUW_R4oqSwj3RIuG7gQAEXSRRqRupTEO6UXZUUpFSDAOYVk4eFOPm4hona2VBkq3Nl5qNH2IiALbdtLg|string|


### Response: 200
```json
{
    "id": 3,
    "name": "ROLE_manager"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_BY_ID
### Method: GET
>```
>{{springmeal_host}}/api/roles/2
>```
### Response: 200
```json
{
    "id": 2,
    "name": "ROLE_user"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: DELETE
### Method: DELETE
>```
>{{springmeal_host}}/api/roles/3
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJMYXVyZWxpbmRvcmVhbiIsImlhdCI6MTY4Mzg4NzM0NSwiZXhwIjoxNjgzOTczNzQ1fQ.MdHaj8Sc6q0-STaUloZhSBsPzNPy0Qi2qExkC7hZrTgduYanMip9CpjhR3T78t_7DT7QxZ-6g9D_iFomP1zJTg|string|


### Response: 200
```json
Role deleted
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_ALL
### Method: GET
>```
>{{springmeal_host}}/api/users
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJMYXVyZWxpbmRvcmVhbiIsImlhdCI6MTY4Mzg4NzM0NSwiZXhwIjoxNjgzOTczNzQ1fQ.MdHaj8Sc6q0-STaUloZhSBsPzNPy0Qi2qExkC7hZrTgduYanMip9CpjhR3T78t_7DT7QxZ-6g9D_iFomP1zJTg|string|


### Response: 200
```json
[
    {
        "id": 1,
        "username": "Laurelindorean",
        "name": "Palmira",
        "surname": "Romia",
        "email": "palmira1@hotmail.com",
        "dni": "11111111C",
        "password": "$2a$10$Ueu0cqImXhXvjFSu7xbXSu9rb/Vo/sGqFbz3eQoEXZszWE63fFeyW",
        "role": {
            "id": 1,
            "name": "ROLE_admin"
        }
    },
    {
        "id": 2,
        "username": "JoanL",
        "name": "Joan",
        "surname": "Lapeyra",
        "email": "joan123@hotmail.com",
        "dni": "11111112C",
        "password": "$2a$10$DsaUto/NwKeo7QDG5o2P9O/MU8ob2r69IcDCpQcj.WXO.Y3VNjjRi",
        "role": {
            "id": 1,
            "name": "ROLE_admin"
        }
    },
    {
        "id": 3,
        "username": "AitorI",
        "name": "Aitor",
        "surname": "Iglesias",
        "email": "aitor123@hotmail.com",
        "dni": "11111113C",
        "password": "$2a$10$LIgltYMQr7ACI.s8YGvCQerrt8Iw4a7vh5w9hlCOtI9/0LvXTEaCy",
        "role": {
            "id": 2,
            "name": "ROLE_user"
        }
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: DELETE
### Method: DELETE
>```
>{{springmeal_host}}/api/users/3
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJMYXVyZWxpbmRvcmVhbiIsImlhdCI6MTY4Mzg4NzM0NSwiZXhwIjoxNjgzOTczNzQ1fQ.MdHaj8Sc6q0-STaUloZhSBsPzNPy0Qi2qExkC7hZrTgduYanMip9CpjhR3T78t_7DT7QxZ-6g9D_iFomP1zJTg|string|


### Response: 401
```json
{
    "path": "/error",
    "error": "Unauthorized",
    "message": "Full authentication is required to access this resource",
    "status": 401
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: REGISTER
### Method: POST
>```
>{{springmeal_host}}/api/auth/signup
>```
### Body (**raw**)

```json

```

### Response: 200
```json
User created!
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: LOGIN
### Method: POST
>```
>{{springmeal_host}}/api/auth/signin
>```
### Body (**raw**)

```json
{
    "username": "Laurelindorean",
    "password": "1234"
}
```

### Response: 200
```json
{
    "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJMYXVyZWxpbmRvcmVhbiIsImlhdCI6MTY4Mzg4NzM0NSwiZXhwIjoxNjgzOTczNzQ1fQ.MdHaj8Sc6q0-STaUloZhSBsPzNPy0Qi2qExkC7hZrTgduYanMip9CpjhR3T78t_7DT7QxZ-6g9D_iFomP1zJTg",
    "type": "Bearer",
    "username": "Laurelindorean"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_BY_ID
### Method: GET
>```
>{{springmeal_host}}/api/users/2
>```
### Body (**raw**)

```json

```

### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJKb2FuTCIsImlhdCI6MTY4Mzg4NzM3NSwiZXhwIjoxNjgzOTczNzc1fQ.qe1AxmqTUT5ytJ66gNfI4377Kf_UXJmtOcSdtDJrJwNfZad13J6hL8jr_h01J96fXLToMcmuO41Uaj7tqumxiA|string|


### Response: 200
```json
{
    "id": 2,
    "username": "JoanL",
    "name": "Joan",
    "surname": "Lapeyra",
    "email": "joan123@hotmail.com",
    "dni": "11111112C",
    "password": "$2a$10$faOG4IfOtvD6KQ.TOjwJYuBAwbkHRvGkDSXkbcRVPqE.bV5cmqakG",
    "role": {
        "id": 2,
        "name": "ROLE_user"
    }
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_BY_ID_ADMIN
### Method: GET
>```
>{{springmeal_host}}/api/users/admin/4
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJBaXRvckkiLCJpYXQiOjE2ODM4ODczOTgsImV4cCI6MTY4Mzk3Mzc5OH0.CuTr3dkcmw3XBAR1l77YbNPu_pl3SAAyqwRLS9SfdUK7PR9bhSDK7ToFnwtHbVyVEl58BKUDkj5n69j2szRiKQ|string|


### Response: 200
```json
{
    "id": 4,
    "username": "AitorI",
    "name": "Aitor",
    "surname": "Iglesias",
    "email": "aitor123@hotmail.com",
    "dni": "11111113C",
    "password": "$2a$10$sJTpSSQYY8PNh1HXfifc.eTFlwrrdE7fZW/oUmhNDEy55zyj8/xwu",
    "role": {
        "id": 2,
        "name": "ROLE_user"
    }
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: UPDATE_USER_by_users
### Method: PUT
>```
>{{springmeal_host}}/api/users/4
>```
### Body (**raw**)

```json
    {
        "name": "Aitor",
        "surname": "Iglesias",
        "username": "AitorI_modificado",
        "email": "aitor_modificado@hotmail.com",
        "dni": "11111113C",
        "password": "12345"
    }
```

### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJKb2FuTCIsImlhdCI6MTY4Mzg4NzM3NSwiZXhwIjoxNjgzOTczNzc1fQ.qe1AxmqTUT5ytJ66gNfI4377Kf_UXJmtOcSdtDJrJwNfZad13J6hL8jr_h01J96fXLToMcmuO41Uaj7tqumxiA|string|


### Response: 200
```json
{
    "id": 4,
    "username": "AitorI",
    "name": "Aitor",
    "surname": "Iglesias",
    "email": "aitor_modificado@hotmail.com",
    "dni": "11111113C",
    "password": "12345",
    "role": {
        "id": 2,
        "name": "ROLE_user"
    }
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: UPDATE_USERS_by_admin
### Method: PUT
>```
>{{springmeal_host}}/api/users/update/4
>```
### Body (**raw**)

```json
    {
        "name": "Aitor_modificado",
        "surname": "Iglesias",
        "username": "AitorI",
        "email": "aitor_modificado@hotmail.com",
        "dni": "11111113C",
        "password": "12345"
    }
```

### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJMYXVyZWxpbmRvcmVhbiIsImlhdCI6MTY4Mzg4NzM0NSwiZXhwIjoxNjgzOTczNzQ1fQ.MdHaj8Sc6q0-STaUloZhSBsPzNPy0Qi2qExkC7hZrTgduYanMip9CpjhR3T78t_7DT7QxZ-6g9D_iFomP1zJTg|string|


### Response: 200
```json
{
    "id": 4,
    "username": "AitorI",
    "name": "Aitor_modificado",
    "surname": "Iglesias",
    "email": "aitor_modificado@hotmail.com",
    "dni": "11111113C",
    "password": "12345",
    "role": {
        "id": 2,
        "name": "ROLE_user"
    }
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_ALL
### Method: GET
>```
>{{springmeal_host}}/api/dishes
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJMYXVyZWxpbmRvcmVhbiIsImlhdCI6MTY4Mzg4NzM0NSwiZXhwIjoxNjgzOTczNzQ1fQ.MdHaj8Sc6q0-STaUloZhSBsPzNPy0Qi2qExkC7hZrTgduYanMip9CpjhR3T78t_7DT7QxZ-6g9D_iFomP1zJTg|string|


### Response: 200
```json
[
    {
        "id": 1,
        "name": "caesar salad",
        "description": "Green salad with chesse and fried chicken",
        "price": 6.45,
        "image": "Zm90by5wbmc=",
        "category": {
            "id": 1,
            "name": "starters"
        }
    },
    {
        "id": 2,
        "name": "Paella",
        "description": "paella with chicken and vegetables",
        "price": 12.5,
        "image": "Zm90bzIucG5n",
        "category": {
            "id": 2,
            "name": "main course"
        }
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: DELETE
### Method: DELETE
>```
>{{springmeal_host}}/api/dishes/5
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJMYXVyZWxpbmRvcmVhbiIsImlhdCI6MTY4Mzg4NzM0NSwiZXhwIjoxNjgzOTczNzQ1fQ.MdHaj8Sc6q0-STaUloZhSBsPzNPy0Qi2qExkC7hZrTgduYanMip9CpjhR3T78t_7DT7QxZ-6g9D_iFomP1zJTg|string|


### Response: 200
```json
Deleted
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_BY_ID
### Method: GET
>```
>{{springmeal_host}}/api/dishes/1
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJKb2FuTCIsImlhdCI6MTY4Mzc5NzQzNiwiZXhwIjoxNjgzODgzODM2fQ.M7kq3Yvb8udbfHM5oOr_Crss-ZdVg5G5p97Whph0G11y0ZZN8qlqpAvs9l9lXKx7Ze2WCDWJWgCTNGAmfYz0EA|string|


### Response: 200
```json
{
    "id": 1,
    "name": "caesar salad",
    "description": "Green salad with chesse and fried chicken",
    "price": 6.45,
    "image": "Zm90by5wbmc=",
    "category": {
        "id": 1,
        "name": "starters"
    }
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: CREATE
### Method: POST
>```
>{{springmeal_host}}/api/dishes
>```
### Body (**raw**)

```json
    {
    "name": "Green Salad",
    "description": "Green Salad with tomatoes and tuna",
    "price": 5.3,
    "image": "Zm90by5wbmc=",
    "category": {
        "id": 1
    }
}
```

### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJMYXVyZWxpbmRvcmVhbiIsImlhdCI6MTY4Mzg4NzM0NSwiZXhwIjoxNjgzOTczNzQ1fQ.MdHaj8Sc6q0-STaUloZhSBsPzNPy0Qi2qExkC7hZrTgduYanMip9CpjhR3T78t_7DT7QxZ-6g9D_iFomP1zJTg|string|


### Response: 200
```json
{
    "id": 4,
    "name": "Grilled fish and potatoes",
    "description": "Grilled allibut with fried potatoes",
    "price": 10.54,
    "image": "Zm90by5wbmc=",
    "category": {
        "id": 2,
        "name": null
    }
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_BY_CATEGORY_SORTED
### Method: GET
>```
>{{springmeal_host}}/api/dishes/category/main course
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJBaXRvckkiLCJpYXQiOjE2ODM4ODczOTgsImV4cCI6MTY4Mzk3Mzc5OH0.CuTr3dkcmw3XBAR1l77YbNPu_pl3SAAyqwRLS9SfdUK7PR9bhSDK7ToFnwtHbVyVEl58BKUDkj5n69j2szRiKQ|string|


### Response: 200
```json
{
    "content": [
        {
            "id": 1,
            "name": "caesar salad",
            "description": "Green salad with chesse and fried chicken",
            "price": 6.45,
            "image": "Zm90by5wbmc=",
            "category": {
                "id": 1,
                "name": "starters"
            }
        },
        {
            "id": 5,
            "name": "Green Salad",
            "description": "Green Salad with tomatoes and tuna",
            "price": 5.3,
            "image": "Zm90by5wbmc=",
            "category": {
                "id": 1,
                "name": "starters"
            }
        }
    ],
    "pageable": {
        "sort": {
            "empty": false,
            "sorted": true,
            "unsorted": false
        },
        "offset": 0,
        "pageSize": 100,
        "pageNumber": 0,
        "unpaged": false,
        "paged": true
    },
    "last": true,
    "totalPages": 1,
    "totalElements": 2,
    "size": 100,
    "number": 0,
    "sort": {
        "empty": false,
        "sorted": true,
        "unsorted": false
    },
    "first": true,
    "numberOfElements": 2,
    "empty": false
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_BY_NAME
### Method: GET
>```
>{{springmeal_host}}/api/dishes/partialName/Paella
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJMYXVyZWxpbmRvcmVhbiIsImlhdCI6MTY4Mzg4NzM0NSwiZXhwIjoxNjgzOTczNzQ1fQ.MdHaj8Sc6q0-STaUloZhSBsPzNPy0Qi2qExkC7hZrTgduYanMip9CpjhR3T78t_7DT7QxZ-6g9D_iFomP1zJTg|string|


### Response: 200
```json
[
    {
        "id": 5,
        "name": "Green Salad",
        "description": "Green Salad with tomatoes and tuna",
        "price": 5.3,
        "image": "Zm90by5wbmc=",
        "category": {
            "id": 1,
            "name": "starters",
            "hibernateLazyInitializer": {}
        }
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: DELETE
### Method: DELETE
>```
>{{springmeal_host}}/api/dishes/5
>```
### Response: 401
```json
{
    "path": "/error",
    "error": "Unauthorized",
    "message": "Full authentication is required to access this resource",
    "status": 401
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_DISHES_SORTED_BY_NAME
### Method: GET
>```
>{{springmeal_host}}/api/dishes/sortByName
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJKb2FuTCIsImlhdCI6MTY4MzgzOTQ3MCwiZXhwIjoxNjgzOTI1ODcwfQ.25rEebQlHTX2o9sz5Bw8OQ_AFvS0X5pdRM-ISMrk3xc5EQlnXF4Fl9sb-3tnDMw_fyzxEHrIzQCu_n-hJnnIHw|string|


### Response: 200
```json
{
    "content": [
        {
            "id": 1,
            "name": "caesar salad",
            "description": "Green salad with chesse and fried chicken",
            "price": 6.45,
            "image": "Zm90by5wbmc=",
            "category": {
                "id": 1,
                "name": "starters"
            }
        },
        {
            "id": 2,
            "name": "Paella",
            "description": "paella with chicken and vegetables",
            "price": 12.5,
            "image": "Zm90bzIucG5n",
            "category": {
                "id": 2,
                "name": "main course"
            }
        }
    ],
    "pageable": {
        "sort": {
            "empty": false,
            "sorted": true,
            "unsorted": false
        },
        "offset": 0,
        "pageNumber": 0,
        "pageSize": 100,
        "paged": true,
        "unpaged": false
    },
    "last": true,
    "totalPages": 1,
    "totalElements": 2,
    "size": 100,
    "number": 0,
    "sort": {
        "empty": false,
        "sorted": true,
        "unsorted": false
    },
    "first": true,
    "numberOfElements": 2,
    "empty": false
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_DISHES_SORTED_BY_PRICE
### Method: GET
>```
>{{springmeal_host}}/api/dishes/sortByPrice
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJKb2FuTCIsImlhdCI6MTY4MzgzOTQ3MCwiZXhwIjoxNjgzOTI1ODcwfQ.25rEebQlHTX2o9sz5Bw8OQ_AFvS0X5pdRM-ISMrk3xc5EQlnXF4Fl9sb-3tnDMw_fyzxEHrIzQCu_n-hJnnIHw|string|


### Response: 200
```json
{
    "content": [
        {
            "id": 3,
            "name": "Coulant",
            "description": "Dulce de leche fondant, Mascarpone, Hazelnuts",
            "price": 3.25,
            "image": "Zm90by5wbmc=",
            "category": {
                "id": 3,
                "name": "dessert"
            }
        },
        {
            "id": 1,
            "name": "caesar salad",
            "description": "Green salad with chesse and fried chicken",
            "price": 6.45,
            "image": "Zm90by5wbmc=",
            "category": {
                "id": 1,
                "name": "starters"
            }
        },
        {
            "id": 2,
            "name": "Paella",
            "description": "paella with chicken and vegetables",
            "price": 12.5,
            "image": "Zm90bzIucG5n",
            "category": {
                "id": 2,
                "name": "main course"
            }
        }
    ],
    "pageable": {
        "sort": {
            "empty": false,
            "sorted": true,
            "unsorted": false
        },
        "offset": 0,
        "pageNumber": 0,
        "pageSize": 100,
        "paged": true,
        "unpaged": false
    },
    "last": true,
    "totalPages": 1,
    "totalElements": 3,
    "size": 100,
    "number": 0,
    "sort": {
        "empty": false,
        "sorted": true,
        "unsorted": false
    },
    "first": true,
    "numberOfElements": 3,
    "empty": false
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_ALL
### Method: GET
>```
>{{springmeal_host}}/api/categories
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJBaXRvckkiLCJpYXQiOjE2ODM4ODczOTgsImV4cCI6MTY4Mzk3Mzc5OH0.CuTr3dkcmw3XBAR1l77YbNPu_pl3SAAyqwRLS9SfdUK7PR9bhSDK7ToFnwtHbVyVEl58BKUDkj5n69j2szRiKQ|string|


### Response: 200
```json
[
    {
        "id": 1,
        "name": "starters"
    },
    {
        "id": 2,
        "name": "main course"
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: CREATE
### Method: POST
>```
>{{springmeal_host}}/api/categories
>```
### Body (**raw**)

```json
    {
        "name": "dessert"
    }
```

### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJMYXVyZWxpbmRvcmVhbiIsImlhdCI6MTY4Mzg4NzM0NSwiZXhwIjoxNjgzOTczNzQ1fQ.MdHaj8Sc6q0-STaUloZhSBsPzNPy0Qi2qExkC7hZrTgduYanMip9CpjhR3T78t_7DT7QxZ-6g9D_iFomP1zJTg|string|


### Response: 401
```json
{
    "path": "/error",
    "error": "Unauthorized",
    "message": "Full authentication is required to access this resource",
    "status": 401
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_BY_ID
### Method: GET
>```
>{{springmeal_host}}/api/categories/2
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJBaXRvckkiLCJpYXQiOjE2ODM4ODczOTgsImV4cCI6MTY4Mzk3Mzc5OH0.CuTr3dkcmw3XBAR1l77YbNPu_pl3SAAyqwRLS9SfdUK7PR9bhSDK7ToFnwtHbVyVEl58BKUDkj5n69j2szRiKQ|string|


### Response: 200
```json
{
    "id": 1,
    "name": "starters"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: UPDATE
### Method: PUT
>```
>{{springmeal_host}}/api/categories/2
>```
### Body (**raw**)

```json
    {
        "name": "main-course"
    }
```

### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJMYXVyZWxpbmRvcmVhbiIsImlhdCI6MTY4Mzg4NzM0NSwiZXhwIjoxNjgzOTczNzQ1fQ.MdHaj8Sc6q0-STaUloZhSBsPzNPy0Qi2qExkC7hZrTgduYanMip9CpjhR3T78t_7DT7QxZ-6g9D_iFomP1zJTg|string|


### Response: 401
```json
{
    "path": "/error",
    "error": "Unauthorized",
    "message": "Full authentication is required to access this resource",
    "status": 401
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: DELETE
### Method: DELETE
>```
>{{springmeal_host}}/api/categories/3
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJMYXVyZWxpbmRvcmVhbiIsImlhdCI6MTY4Mzg4NzM0NSwiZXhwIjoxNjgzOTczNzQ1fQ.MdHaj8Sc6q0-STaUloZhSBsPzNPy0Qi2qExkC7hZrTgduYanMip9CpjhR3T78t_7DT7QxZ-6g9D_iFomP1zJTg|string|


### Response: 401
```json
{
    "path": "/error",
    "error": "Unauthorized",
    "message": "Full authentication is required to access this resource",
    "status": 401
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_ALL
### Method: GET
>```
>{{springmeal_host}}/api/allergens
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJBaXRvckkiLCJpYXQiOjE2ODM4ODczOTgsImV4cCI6MTY4Mzk3Mzc5OH0.CuTr3dkcmw3XBAR1l77YbNPu_pl3SAAyqwRLS9SfdUK7PR9bhSDK7ToFnwtHbVyVEl58BKUDkj5n69j2szRiKQ|string|


### Response: 200
```json
[
    {
        "id": 1,
        "name": "gluten"
    },
    {
        "id": 2,
        "name": "lactose"
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: CREATE
### Method: POST
>```
>{{springmeal_host}}/api/allergens
>```
### Body (**raw**)

```json
    {
        "name": "shellfish"
    }
```

### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJMYXVyZWxpbmRvcmVhbiIsImlhdCI6MTY4Mzg4NzM0NSwiZXhwIjoxNjgzOTczNzQ1fQ.MdHaj8Sc6q0-STaUloZhSBsPzNPy0Qi2qExkC7hZrTgduYanMip9CpjhR3T78t_7DT7QxZ-6g9D_iFomP1zJTg|string|


### Response: 401
```json
{
    "path": "/error",
    "error": "Unauthorized",
    "message": "Full authentication is required to access this resource",
    "status": 401
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_BY_ID
### Method: GET
>```
>{{springmeal_host}}/api/allergens/3
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJMYXVyZWxpbmRvcmVhbiIsImlhdCI6MTY4Mzg4NzM0NSwiZXhwIjoxNjgzOTczNzQ1fQ.MdHaj8Sc6q0-STaUloZhSBsPzNPy0Qi2qExkC7hZrTgduYanMip9CpjhR3T78t_7DT7QxZ-6g9D_iFomP1zJTg|string|


### Response: 200
```json
{
    "id": 2,
    "name": "lactose"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: UPDATE
### Method: PUT
>```
>{{springmeal_host}}/api/allergens/1
>```
### Body (**raw**)

```json
    {
        "id": 1,
        "name": "gluten"
    }
```

### Response: 401
```json
{
    "path": "/error",
    "error": "Unauthorized",
    "message": "Full authentication is required to access this resource",
    "status": 401
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: DELETE
### Method: GET
>```
>undefined
>```
### Response: 401
```json
{
    "path": "/error",
    "error": "Unauthorized",
    "message": "Full authentication is required to access this resource",
    "status": 401
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_BY_NAME
### Method: GET
>```
>{{springmeal_host}}/api/allergens/name/Lacto
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJMYXVyZWxpbmRvcmVhbiIsImlhdCI6MTY4Mzg4NzM0NSwiZXhwIjoxNjgzOTczNzQ1fQ.MdHaj8Sc6q0-STaUloZhSBsPzNPy0Qi2qExkC7hZrTgduYanMip9CpjhR3T78t_7DT7QxZ-6g9D_iFomP1zJTg|string|


### Response: 200
```json
{
    "id": 2,
    "name": "lactose"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_ALL
### Method: GET
>```
>{{springmeal_host}}/api/dishallergens
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJMYXVyZWxpbmRvcmVhbiIsImlhdCI6MTY4Mzg4NzM0NSwiZXhwIjoxNjgzOTczNzQ1fQ.MdHaj8Sc6q0-STaUloZhSBsPzNPy0Qi2qExkC7hZrTgduYanMip9CpjhR3T78t_7DT7QxZ-6g9D_iFomP1zJTg|string|


### Response: 200
```json
[
    {
        "id": 1,
        "dish": {
            "id": 1,
            "name": "caesar salad",
            "description": "Green salad with chesse and fried chicken",
            "price": 6.45,
            "image": "Zm90by5wbmc=",
            "category": {
                "id": 1,
                "name": "starters"
            }
        },
        "allergens": {
            "id": 2,
            "name": "lactose"
        }
    },
    {
        "id": 2,
        "dish": {
            "id": 1,
            "name": "caesar salad",
            "description": "Green salad with chesse and fried chicken",
            "price": 6.45,
            "image": "Zm90by5wbmc=",
            "category": {
                "id": 1,
                "name": "starters"
            }
        },
        "allergens": {
            "id": 1,
            "name": "Gluten"
        }
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: CREATE
### Method: POST
>```
>{{springmeal_host}}/api/dishallergens
>```
### Body (**raw**)

```json
    {
        "dish": {
            "id": 2
        },
        "allergens": {
            "id": 4
        }
    }
```

### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJMYXVyZWxpbmRvcmVhbiIsImlhdCI6MTY4Mzg4NzM0NSwiZXhwIjoxNjgzOTczNzQ1fQ.MdHaj8Sc6q0-STaUloZhSBsPzNPy0Qi2qExkC7hZrTgduYanMip9CpjhR3T78t_7DT7QxZ-6g9D_iFomP1zJTg|string|


### Response: 401
```json
{
    "path": "/error",
    "error": "Unauthorized",
    "message": "Full authentication is required to access this resource",
    "status": 401
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_BY_ID
### Method: GET
>```
>{{springmeal_host}}/api/dishallergens/3
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJBaXRvckkiLCJpYXQiOjE2ODM4ODczOTgsImV4cCI6MTY4Mzk3Mzc5OH0.CuTr3dkcmw3XBAR1l77YbNPu_pl3SAAyqwRLS9SfdUK7PR9bhSDK7ToFnwtHbVyVEl58BKUDkj5n69j2szRiKQ|string|


### Response: 200
```json
{
    "id": 2,
    "dish": {
        "id": 1,
        "name": "caesar salad",
        "description": "Green salad with chesse and fried chicken",
        "price": 6.45,
        "image": "Zm90by5wbmc=",
        "category": {
            "id": 1,
            "name": "starters"
        }
    },
    "allergens": {
        "id": 1,
        "name": "Gluten"
    }
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: UPDATE
### Method: PUT
>```
>{{springmeal_host}}/api/dishallergens/3
>```
### Body (**raw**)

```json
{

    "dish": {
        "id": 2
    },
    "allergens": {
        "id": 1
    }
}
```

### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJMYXVyZWxpbmRvcmVhbiIsImlhdCI6MTY4Mzg4NzM0NSwiZXhwIjoxNjgzOTczNzQ1fQ.MdHaj8Sc6q0-STaUloZhSBsPzNPy0Qi2qExkC7hZrTgduYanMip9CpjhR3T78t_7DT7QxZ-6g9D_iFomP1zJTg|string|


### Response: 401
```json
{
    "path": "/error",
    "error": "Unauthorized",
    "message": "Full authentication is required to access this resource",
    "status": 401
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: DELETE
### Method: DELETE
>```
>{{springmeal_host}}/api/dishallergens/3
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJMYXVyZWxpbmRvcmVhbiIsImlhdCI6MTY4Mzg4NzM0NSwiZXhwIjoxNjgzOTczNzQ1fQ.MdHaj8Sc6q0-STaUloZhSBsPzNPy0Qi2qExkC7hZrTgduYanMip9CpjhR3T78t_7DT7QxZ-6g9D_iFomP1zJTg|string|


### Response: 401
```json
{
    "path": "/error",
    "error": "Unauthorized",
    "message": "Full authentication is required to access this resource",
    "status": 401
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_ALL
### Method: GET
>```
>{{springmeal_host}}/api/orders
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJBaXRvckkiLCJpYXQiOjE2ODM4ODczOTgsImV4cCI6MTY4Mzk3Mzc5OH0.CuTr3dkcmw3XBAR1l77YbNPu_pl3SAAyqwRLS9SfdUK7PR9bhSDK7ToFnwtHbVyVEl58BKUDkj5n69j2szRiKQ|string|


### Response: 200
```json
[
    {
        "id": 1,
        "date": "2023-05-01",
        "slot": {
            "id": 1,
            "start": "12:00:00",
            "end": "12:15:00"
        },
        "user": {
            "id": 1,
            "username": "Laurelindorean",
            "name": "Palmira",
            "surname": "Romia",
            "email": "palmira1@hotmail.com",
            "dni": "11111111C",
            "password": "$2a$10$Ueu0cqImXhXvjFSu7xbXSu9rb/Vo/sGqFbz3eQoEXZszWE63fFeyW",
            "role": {
                "id": 1,
                "name": "ROLE_admin"
            }
        }
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: CREATE
### Method: POST
>```
>{{springmeal_host}}/api/orders
>```
### Body (**raw**)

```json
    {

        "date": "2023-05-01",
        "slot": {
            "id": 1,
            "start": "12:00:00",
            "end": "12:15:00"
        }
    }
```

### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJMYXVyZWxpbmRvcmVhbiIsImlhdCI6MTY4Mzg4NzM0NSwiZXhwIjoxNjgzOTczNzQ1fQ.MdHaj8Sc6q0-STaUloZhSBsPzNPy0Qi2qExkC7hZrTgduYanMip9CpjhR3T78t_7DT7QxZ-6g9D_iFomP1zJTg|string|


### Response: 200
```json
{
    "id": 7,
    "date": "2023-05-01",
    "slot": {
        "id": 1,
        "start": "12:00:00",
        "end": "12:15:00"
    },
    "user": {
        "id": 1,
        "username": "Laurelindorean",
        "name": "Palmira",
        "surname": "Romia",
        "email": "palmira1@hotmail.com",
        "dni": "11111111C",
        "password": "$2a$10$Ueu0cqImXhXvjFSu7xbXSu9rb/Vo/sGqFbz3eQoEXZszWE63fFeyW",
        "role": {
            "id": 1,
            "name": "ROLE_admin"
        }
    }
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_BY_ID
### Method: GET
>```
>{{springmeal_host}}/api/orders/3
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJMYXVyZWxpbmRvcmVhbiIsImlhdCI6MTY4Mzg4NzM0NSwiZXhwIjoxNjgzOTczNzQ1fQ.MdHaj8Sc6q0-STaUloZhSBsPzNPy0Qi2qExkC7hZrTgduYanMip9CpjhR3T78t_7DT7QxZ-6g9D_iFomP1zJTg|string|


### Response: 401
```json
{
    "path": "/error",
    "error": "Unauthorized",
    "message": "Full authentication is required to access this resource",
    "status": 401
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: UPDATE
### Method: PUT
>```
>{{springmeal_host}}/api/orders/3
>```
### Body (**raw**)

```json
    {
        "id": 1,
        "date": "2023-05-12",
        "slot": {
            "id": 3
        },
        "user": {
            "id": 1
        }
    }
```

### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJMYXVyZWxpbmRvcmVhbiIsImlhdCI6MTY4Mzg4NzM0NSwiZXhwIjoxNjgzOTczNzQ1fQ.MdHaj8Sc6q0-STaUloZhSBsPzNPy0Qi2qExkC7hZrTgduYanMip9CpjhR3T78t_7DT7QxZ-6g9D_iFomP1zJTg|string|


### Response: 401
```json
{
    "path": "/error",
    "error": "Unauthorized",
    "message": "Full authentication is required to access this resource",
    "status": 401
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: DELETE
### Method: DELETE
>```
>{{springmeal_host}}/api/orders/4
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJMYXVyZWxpbmRvcmVhbiIsImlhdCI6MTY4Mzg4NzM0NSwiZXhwIjoxNjgzOTczNzQ1fQ.MdHaj8Sc6q0-STaUloZhSBsPzNPy0Qi2qExkC7hZrTgduYanMip9CpjhR3T78t_7DT7QxZ-6g9D_iFomP1zJTg|string|


### Response: 401
```json
{
    "path": "/error",
    "error": "Unauthorized",
    "message": "Full authentication is required to access this resource",
    "status": 401
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_BY_USER
### Method: GET
>```
>{{springmeal_host}}/api/orders/user
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJMYXVyZWxpbmRvcmVhbiIsImlhdCI6MTY4Mzg4NzM0NSwiZXhwIjoxNjgzOTczNzQ1fQ.MdHaj8Sc6q0-STaUloZhSBsPzNPy0Qi2qExkC7hZrTgduYanMip9CpjhR3T78t_7DT7QxZ-6g9D_iFomP1zJTg|string|


### Response: 200
```json
[
    {
        "id": 4,
        "date": "2023-05-01",
        "slot": {
            "id": 1,
            "start": "12:00:00",
            "end": "12:15:00"
        },
        "user": {
            "id": 4,
            "username": "AitorI",
            "name": "Aitor_modificado",
            "surname": "Iglesias",
            "email": "aitor_modificado@hotmail.com",
            "dni": "11111113C",
            "password": "12345",
            "role": {
                "id": 2,
                "name": "ROLE_user"
            }
        }
    },
    {
        "id": 5,
        "date": "2023-05-01",
        "slot": {
            "id": 1,
            "start": "12:00:00",
            "end": "12:15:00"
        },
        "user": {
            "id": 4,
            "username": "AitorI",
            "name": "Aitor_modificado",
            "surname": "Iglesias",
            "email": "aitor_modificado@hotmail.com",
            "dni": "11111113C",
            "password": "12345",
            "role": {
                "id": 2,
                "name": "ROLE_user"
            }
        }
    },
    {
        "id": 8,
        "date": "2023-05-12",
        "slot": {
            "id": 3,
            "start": "12:45:00",
            "end": "13:00:00"
        },
        "user": {
            "id": 4,
            "username": "AitorI",
            "name": "Aitor_modificado",
            "surname": "Iglesias",
            "email": "aitor_modificado@hotmail.com",
            "dni": "11111113C",
            "password": "12345",
            "role": {
                "id": 2,
                "name": "ROLE_user"
            }
        }
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_BY_DATE
### Method: GET
>```
>{{springmeal_host}}/api/orders/date/2023-05-01
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJMYXVyZWxpbmRvcmVhbiIsImlhdCI6MTY4Mzg4NzM0NSwiZXhwIjoxNjgzOTczNzQ1fQ.MdHaj8Sc6q0-STaUloZhSBsPzNPy0Qi2qExkC7hZrTgduYanMip9CpjhR3T78t_7DT7QxZ-6g9D_iFomP1zJTg|string|


### Response: 200
```json
[
    {
        "id": 1,
        "date": "2023-05-01",
        "slot": {
            "id": 1,
            "start": "12:00:00",
            "end": "12:15:00",
            "hibernateLazyInitializer": {}
        },
        "user": {
            "id": 1,
            "username": "Laurelindorean",
            "name": "Palmira",
            "surname": "Romia",
            "email": "palmira1@hotmail.com",
            "dni": "11111111C",
            "password": "$2a$10$Ueu0cqImXhXvjFSu7xbXSu9rb/Vo/sGqFbz3eQoEXZszWE63fFeyW",
            "role": {
                "id": 1,
                "name": "ROLE_admin"
            },
            "hibernateLazyInitializer": {}
        }
    },
    {
        "id": 2,
        "date": "2023-05-01",
        "slot": {
            "id": 1,
            "start": "12:00:00",
            "end": "12:15:00",
            "hibernateLazyInitializer": {}
        },
        "user": {
            "id": 1,
            "username": "Laurelindorean",
            "name": "Palmira",
            "surname": "Romia",
            "email": "palmira1@hotmail.com",
            "dni": "11111111C",
            "password": "$2a$10$Ueu0cqImXhXvjFSu7xbXSu9rb/Vo/sGqFbz3eQoEXZszWE63fFeyW",
            "role": {
                "id": 1,
                "name": "ROLE_admin"
            },
            "hibernateLazyInitializer": {}
        }
    },
    {
        "id": 5,
        "date": "2023-05-01",
        "slot": {
            "id": 1,
            "start": "12:00:00",
            "end": "12:15:00",
            "hibernateLazyInitializer": {}
        },
        "user": {
            "id": 4,
            "username": "AitorI",
            "name": "Aitor_modificado",
            "surname": "Iglesias",
            "email": "aitor_modificado@hotmail.com",
            "dni": "11111113C",
            "password": "12345",
            "role": {
                "id": 2,
                "name": "ROLE_user"
            },
            "hibernateLazyInitializer": {}
        }
    },
    {
        "id": 6,
        "date": "2023-05-01",
        "slot": {
            "id": 1,
            "start": "12:00:00",
            "end": "12:15:00",
            "hibernateLazyInitializer": {}
        },
        "user": {
            "id": 1,
            "username": "Laurelindorean",
            "name": "Palmira",
            "surname": "Romia",
            "email": "palmira1@hotmail.com",
            "dni": "11111111C",
            "password": "$2a$10$Ueu0cqImXhXvjFSu7xbXSu9rb/Vo/sGqFbz3eQoEXZszWE63fFeyW",
            "role": {
                "id": 1,
                "name": "ROLE_admin"
            },
            "hibernateLazyInitializer": {}
        }
    },
    {
        "id": 7,
        "date": "2023-05-01",
        "slot": {
            "id": 1,
            "start": "12:00:00",
            "end": "12:15:00",
            "hibernateLazyInitializer": {}
        },
        "user": {
            "id": 1,
            "username": "Laurelindorean",
            "name": "Palmira",
            "surname": "Romia",
            "email": "palmira1@hotmail.com",
            "dni": "11111111C",
            "password": "$2a$10$Ueu0cqImXhXvjFSu7xbXSu9rb/Vo/sGqFbz3eQoEXZszWE63fFeyW",
            "role": {
                "id": 1,
                "name": "ROLE_admin"
            },
            "hibernateLazyInitializer": {}
        }
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_BY_CURRENT_DATE
### Method: GET
>```
>{{springmeal_host}}/api/orders/future
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJMYXVyZWxpbmRvcmVhbiIsImlhdCI6MTY4Mzg4NzM0NSwiZXhwIjoxNjgzOTczNzQ1fQ.MdHaj8Sc6q0-STaUloZhSBsPzNPy0Qi2qExkC7hZrTgduYanMip9CpjhR3T78t_7DT7QxZ-6g9D_iFomP1zJTg|string|


### Response: 401
```json
{
    "path": "/error",
    "error": "Unauthorized",
    "message": "Full authentication is required to access this resource",
    "status": 401
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_ALL_BY_USER_DATE
### Method: GET
>```
>{{springmeal_host}}/api/orders/user/future
>```
### Body (**raw**)

```json
{
    "id": 1
}
```

### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJBaXRvckkiLCJpYXQiOjE2ODM4ODczOTgsImV4cCI6MTY4Mzk3Mzc5OH0.CuTr3dkcmw3XBAR1l77YbNPu_pl3SAAyqwRLS9SfdUK7PR9bhSDK7ToFnwtHbVyVEl58BKUDkj5n69j2szRiKQ|string|


### Response: 200
```json
[
    {
        "id": 3,
        "date": "2023-05-12",
        "slot": {
            "id": 3,
            "start": "12:45:00",
            "end": "13:00:00",
            "hibernateLazyInitializer": {}
        },
        "user": {
            "id": 1,
            "username": "Laurelindorean",
            "name": "Palmira",
            "surname": "Romia",
            "email": "palmira1@hotmail.com",
            "dni": "11111111C",
            "password": "$2a$10$Ueu0cqImXhXvjFSu7xbXSu9rb/Vo/sGqFbz3eQoEXZszWE63fFeyW",
            "role": {
                "id": 1,
                "name": "ROLE_admin"
            },
            "hibernateLazyInitializer": {}
        }
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_BY_SLOT_DATE
### Method: GET
>```
>{{springmeal_host}}/api/orders/slot/date/2023-05-01
>```
### Body (**raw**)

```json
{
    "id": 1
}
```

### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJMYXVyZWxpbmRvcmVhbiIsImlhdCI6MTY4Mzg4NzM0NSwiZXhwIjoxNjgzOTczNzQ1fQ.MdHaj8Sc6q0-STaUloZhSBsPzNPy0Qi2qExkC7hZrTgduYanMip9CpjhR3T78t_7DT7QxZ-6g9D_iFomP1zJTg|string|


### Response: 401
```json
{
    "path": "/error",
    "error": "Unauthorized",
    "message": "Full authentication is required to access this resource",
    "status": 401
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_ALL
### Method: GET
>```
>undefined
>```
### Response: 401
```json
{
    "path": "/error",
    "error": "Unauthorized",
    "message": "Full authentication is required to access this resource",
    "status": 401
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: CREATE
### Method: POST
>```
>{{springmeal_host}}/api/orderdish
>```
### Body (**raw**)

```json
    {
        "order": {
            "id": 1
        },
        "dish": {
            "id": 2
        }
    }
```

### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJMYXVyZWxpbmRvcmVhbiIsImlhdCI6MTY4Mzg4NzM0NSwiZXhwIjoxNjgzOTczNzQ1fQ.MdHaj8Sc6q0-STaUloZhSBsPzNPy0Qi2qExkC7hZrTgduYanMip9CpjhR3T78t_7DT7QxZ-6g9D_iFomP1zJTg|string|


### Response: 200
```json
{
    "id": 2,
    "order": {
        "id": 1,
        "date": null,
        "slot": null,
        "user": null
    },
    "dish": {
        "id": 2,
        "name": null,
        "description": null,
        "price": 0,
        "image": null,
        "category": null
    }
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_BY_ID
### Method: GET
>```
>{{springmeal_host}}/api/orderdish/2
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJMYXVyZWxpbmRvcmVhbiIsImlhdCI6MTY4Mzg4NzM0NSwiZXhwIjoxNjgzOTczNzQ1fQ.MdHaj8Sc6q0-STaUloZhSBsPzNPy0Qi2qExkC7hZrTgduYanMip9CpjhR3T78t_7DT7QxZ-6g9D_iFomP1zJTg|string|


### Response: 401
```json
{
    "path": "/error",
    "error": "Unauthorized",
    "message": "Full authentication is required to access this resource",
    "status": 401
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: UPDATE
### Method: PUT
>```
>{{springmeal_host}}/api/orderdish/2
>```
### Body (**raw**)

```json
    {
        "order": {
            "id": 1
        },
        "dish": {
            "id": 2
        }
    }
```

### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJMYXVyZWxpbmRvcmVhbiIsImlhdCI6MTY4Mzg4NzM0NSwiZXhwIjoxNjgzOTczNzQ1fQ.MdHaj8Sc6q0-STaUloZhSBsPzNPy0Qi2qExkC7hZrTgduYanMip9CpjhR3T78t_7DT7QxZ-6g9D_iFomP1zJTg|string|


### Response: 200
```json
{
    "id": 1,
    "order": {
        "id": 1,
        "date": null,
        "slot": null,
        "user": null
    },
    "dish": {
        "id": 2,
        "name": null,
        "description": null,
        "price": 0,
        "image": null,
        "category": null
    }
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: DELETE
### Method: DELETE
>```
>{{springmeal_host}}/api/orderdish/3
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJMYXVyZWxpbmRvcmVhbiIsImlhdCI6MTY4Mzg4NzM0NSwiZXhwIjoxNjgzOTczNzQ1fQ.MdHaj8Sc6q0-STaUloZhSBsPzNPy0Qi2qExkC7hZrTgduYanMip9CpjhR3T78t_7DT7QxZ-6g9D_iFomP1zJTg|string|


### Response: 401
```json
{
    "path": "/error",
    "error": "Unauthorized",
    "message": "Full authentication is required to access this resource",
    "status": 401
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_BY_ORDER
### Method: GET
>```
>{{springmeal_host}}/api/orderdish/order
>```
### Body (**raw**)

```json
{
    "id": 1,
    "user": {
        "id": 1
    }
}
```

### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJBaXRvckkiLCJpYXQiOjE2ODM4ODczOTgsImV4cCI6MTY4Mzk3Mzc5OH0.CuTr3dkcmw3XBAR1l77YbNPu_pl3SAAyqwRLS9SfdUK7PR9bhSDK7ToFnwtHbVyVEl58BKUDkj5n69j2szRiKQ|string|


### Response: 200
```json
[
    {
        "id": 2,
        "name": "Paella",
        "description": "paella with chicken and vegetables",
        "price": 12.5,
        "image": "Zm90bzIucG5n",
        "category": {
            "id": 2,
            "name": "main-course"
        }
    },
    {
        "id": 2,
        "name": "Paella",
        "description": "paella with chicken and vegetables",
        "price": 12.5,
        "image": "Zm90bzIucG5n",
        "category": {
            "id": 2,
            "name": "main-course"
        }
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_ALL
### Method: GET
>```
>{{springmeal_host}}/api/slot
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJMYXVyZWxpbmRvcmVhbiIsImlhdCI6MTY4Mzg4NzM0NSwiZXhwIjoxNjgzOTczNzQ1fQ.MdHaj8Sc6q0-STaUloZhSBsPzNPy0Qi2qExkC7hZrTgduYanMip9CpjhR3T78t_7DT7QxZ-6g9D_iFomP1zJTg|string|


### Response: 200
```json
[
    {
        "id": 1,
        "start": "12:00:00",
        "end": "12:15:00"
    },
    {
        "id": 2,
        "start": "12:15:00",
        "end": "12:30:00"
    },
    {
        "id": 3,
        "start": "12:45:00",
        "end": "13:00:00"
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: CREATE
### Method: POST
>```
>{{springmeal_host}}/api/slot
>```
### Body (**raw**)

```json
    {
        "start": "13:00:00",
        "end": "13:15:00"
    }
```

### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJMYXVyZWxpbmRvcmVhbiIsImlhdCI6MTY4Mzg4NzM0NSwiZXhwIjoxNjgzOTczNzQ1fQ.MdHaj8Sc6q0-STaUloZhSBsPzNPy0Qi2qExkC7hZrTgduYanMip9CpjhR3T78t_7DT7QxZ-6g9D_iFomP1zJTg|string|


### Response: 401
```json
{
    "path": "/error",
    "error": "Unauthorized",
    "message": "Full authentication is required to access this resource",
    "status": 401
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_BY_ID
### Method: GET
>```
>{{springmeal_host}}/api/slot/3
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJMYXVyZWxpbmRvcmVhbiIsImlhdCI6MTY4Mzg4NzM0NSwiZXhwIjoxNjgzOTczNzQ1fQ.MdHaj8Sc6q0-STaUloZhSBsPzNPy0Qi2qExkC7hZrTgduYanMip9CpjhR3T78t_7DT7QxZ-6g9D_iFomP1zJTg|string|


### Response: 401
```json
{
    "path": "/error",
    "error": "Unauthorized",
    "message": "Full authentication is required to access this resource",
    "status": 401
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: UPDATE
### Method: PUT
>```
>{{springmeal_host}}/api/slot/2
>```
### Body (**raw**)

```json
    {
        "start": "12:15:10",
        "end": "12:30:10"
    }
```

### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJMYXVyZWxpbmRvcmVhbiIsImlhdCI6MTY4Mzg4NzM0NSwiZXhwIjoxNjgzOTczNzQ1fQ.MdHaj8Sc6q0-STaUloZhSBsPzNPy0Qi2qExkC7hZrTgduYanMip9CpjhR3T78t_7DT7QxZ-6g9D_iFomP1zJTg|string|


### Response: 401
```json
{
    "path": "/error",
    "error": "Unauthorized",
    "message": "Full authentication is required to access this resource",
    "status": 401
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: DELETE
### Method: DELETE
>```
>{{springmeal_host}}/api/slot/4
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJMYXVyZWxpbmRvcmVhbiIsImlhdCI6MTY4Mzg4NzM0NSwiZXhwIjoxNjgzOTczNzQ1fQ.MdHaj8Sc6q0-STaUloZhSBsPzNPy0Qi2qExkC7hZrTgduYanMip9CpjhR3T78t_7DT7QxZ-6g9D_iFomP1zJTg|string|


### Response: 401
```json
{
    "path": "/error",
    "error": "Unauthorized",
    "message": "Full authentication is required to access this resource",
    "status": 401
}
```

