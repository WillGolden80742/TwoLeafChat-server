# Java Chat Server 

This is the server component of a Java swing based chat application.

## Overview

The chat server handles these primary functions:

- User account management 
- Authenticating clients
- Managing client connections
- Relaying chat messages 
- Coordinating attachments
- Interacting with MySQL database

It allows multiple chat client instances to connect and communicate in real-time.

## Features

- Multi-client architecture
- Multithreaded request handling 
- Secure password based login 
- Database integration using JDBC 
- File attachments supported
- Executes custom database operations  

## Technologies

**Server**

- Java 8
- Socket programming 
- Threading
- MySQL JDBC

**Database**  

- MySQL 8+
- Stored procedures
- InnoDB engine

## Components

**Key Java Classes**

- Server - Creates server socket, accepts connections
- TreatConnection - Handles client session 
- DAOs - Data access classes to interact with db

**Database**

- Users table - Stores account data
- Messages table - Stores chat history 
- Attachments table - Stores file metadata

## Getting Started

### Prerequisites

- Java 8+
- MySQL database

### Installation

- Setup MySQL db and import data dump
- Configure db connection parameters
- Compile and run Server.java

The chat client also needs to be running to connect with server.

## Usage

- Start chat server 
- Clients can now connect and communicate  

The server keeps running to facilitate real-time messaging between connected clients.
