# create database in mongodb 
use spring_jwt_mongo

# insert user role in the roles collection
db.collection.insert([{name: "ADMIN"},{name: "USER"}])