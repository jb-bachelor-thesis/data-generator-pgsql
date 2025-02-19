# data-generator-pgsql

A data generation Spring Boot CLI application to generate synthetic data for performance benchmarks.

## DB-Config:

Create a `.env` file with the following contents:
```bash
DATABASE_URL=r2dbc:postgresql://localhost:5432/testdb
DATABASE_USERNAME=your_username
DATABASE_PASSWORD=your_secure_password
```
