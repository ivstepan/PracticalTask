#!/bin/bash
database=Prime
wait_time=15s
password=QWEzxc!86

# wait for SQL Server to come up
echo importing data will start in $wait_time...
sleep $wait_time
echo importing data...

# run the init script to create the DB and the tables in /table
/opt/mssql-tools/bin/sqlcmd -S localhost -U sa -P $password -i ./init.sql

for entry in "sql/table/*.sql"
do
  echo executing $entry
  /opt/mssql-tools/bin/sqlcmd -S localhost -U sa -P $password -i $entry
done

#import the data from the csv files
for entry in "sql/data/*.csv"
do
  # i.e: transform /data/MyTable.csv to MyTable
  shortname=$(echo $entry | cut -f 1 -d '.' | cut -f 2 -d '/')
  tableName=$database.dbo.$shortname
  echo importing $tableName from $entry
  /opt/mssql-tools/bin/bcp $tableName in $entry -c -t',' -F 2 -S localhost -U sa -P $password
done
