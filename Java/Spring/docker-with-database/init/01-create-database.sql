-- Create PASTRY database
IF NOT EXISTS (SELECT name FROM sys.databases WHERE name = 'PASTRY')
BEGIN
    CREATE DATABASE PASTRY;
END
GO

-- Optional: Switch to the PASTRY database
USE PASTRY;
GO